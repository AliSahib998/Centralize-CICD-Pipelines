package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.domain.City;
import az.unibank.wu.integration.domain.DasCountry;
import az.unibank.wu.integration.domain.DasCurrency;
import az.unibank.wu.integration.domain.DasIsoCountry;
import az.unibank.wu.integration.domain.DasUsStateInfo;
import az.unibank.wu.integration.domain.IsoCountry;
import az.unibank.wu.integration.domain.MexicoState;
import az.unibank.wu.integration.domain.UsState;
import az.unibank.wu.integration.repository.DasCountryRepository;
import az.unibank.wu.integration.repository.DasUsStateInfoRepository;
import az.unibank.wu.integration.repository.IsoCountryRepository;
import az.unibank.wu.integration.repository.MexicoStateRepository;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.dto.IsoCountryType;
import az.unibank.wu.integration.webservices.model.DASCountryCurrency;
import az.unibank.wu.integration.webservices.model.DASISOCountry;
import az.unibank.wu.integration.webservices.model.DASMexCityStateInfo;
import az.unibank.wu.integration.webservices.model.DASReqFilters;
import az.unibank.wu.integration.webservices.model.DASUSStateInfo;
import az.unibank.wu.integration.webservices.model.XRSIDasReply;
import az.unibank.wu.integration.webservices.model.XRSIDasRequest;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.WebServiceTemplate;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


@Service
public class DasSchedule extends MoneyTransferUtils {
    private static final String ISO_COUNTRIES_SERVICE_NAME = "GetISOCountries";
    private static final String COUNTRIES_CURRENCIES_SERVICE_NAME = "GetCountriesCurrencies";
    private static final String MEXICO_CITY_STATE_SERVICE_NAME = "GetMexicoCityState";
    private static final String US_STATE_LIST_SERVICE_NAME = "GetUSStateList";
    private static final String[] LANGS = new String[]{"AZ", "EN", "RU"};
    private static final String EN = "en";
    private static final List<String> COUNTRY_CODES = Arrays.asList("TR", "UA", "RU", "GE", "CN", "DE", "PH", "KZ", "PL", "US", "GB");
    private final List<String> countryCodesForSend;
    private final List<String> countryCodesForReceive;

    private final IsoCountryRepository isoCountryRepository;
    private final MexicoStateRepository mexicoStateRepository;
    private final DasUsStateInfoRepository usStateInfoRepository;
    private final DasCountryRepository dasCountryRepository;
    private final ModelMapper modelMapper;
    private final ApplicationProperties properties;

    public DasSchedule(WebServiceTemplate webServiceTemplate,
                       ApplicationProperties properties,
                       IsoCountryRepository isoCountryRepository,
                       MexicoStateRepository mexicoStateRepository,
                       DasUsStateInfoRepository usStateInfoRepository,
                       ModelMapper modelMapper,
                       DasCountryRepository dasCountryRepository) {
        super(webServiceTemplate, properties);
        this.properties = properties;
        this.isoCountryRepository = isoCountryRepository;
        this.mexicoStateRepository = mexicoStateRepository;
        this.usStateInfoRepository = usStateInfoRepository;
        this.modelMapper = modelMapper;
        this.dasCountryRepository = dasCountryRepository;
        this.countryCodesForSend = readCountryCodesForSendFromExcel();
        this.countryCodesForReceive = readCountryCodesForReceiveFromExcel();
    }

    @SchedulerLock(name = "init",
            lockAtLeastForString = "PT15M", lockAtMostForString = "PT30M")
    @Scheduled(fixedDelay = (long) 30 * 24 * 60 * 60 * 1000, initialDelay = 2000)
    @Transactional
    public void init() {
        scheduleTaskUsingCronUSStateSave();
        scheduleTaskUsingCronIsoCountries();
        scheduleTaskUsingCronCountriesAndCurrencies();
        scheduleTaskUsingCronMexicoStateSave();
    }

    @SchedulerLock(name = "scheduleTaskUsingCronIsoCountries",
            lockAtLeastForString = "PT15M", lockAtMostForString = "PT30M")
    @Scheduled(cron = Constants.EVERY_WEEKEND)
    @Transactional
    public void scheduleTaskUsingCronIsoCountries() {
        isoCountryRepository.deleteAll();
        Arrays.stream(LANGS).forEach(lang -> {
            boolean hasMoreRecord = true;
            String countryLong = null;
            List<DASISOCountry> dasisoCountries = new ArrayList<>();
            XRSIDasRequest request = createIsoCountryRequest(lang, properties.getCounterId());
            IsoCountry isoCountrySend = IsoCountry.builder().lang(lang).type(IsoCountryType.SEND).build();
            IsoCountry isoCountryReceive = IsoCountry.builder().lang(lang).type(IsoCountryType.RECEIVE).build();
            while (hasMoreRecord) {
                XRSIDasReply deliveryReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
                dasisoCountries.addAll(deliveryReply.getMTML()
                        .getDASReply().getDASDataContext().getDASRecordSet().getDASISOCountryList());
                countryLong = dasisoCountries.get(dasisoCountries.size() - 1).getNameLong();
                request.setDASReqFilters(createFiltersForIsoCountry(lang, countryLong));
                hasMoreRecord = getMoreRecordsStatus(deliveryReply);
            }
            List<DasIsoCountry> countryListForSend = new LinkedList<>(getDasIsoContryList(dasisoCountries, isoCountrySend));
            List<DasIsoCountry> countryListForReceive = new LinkedList<>(getDasIsoContryList(dasisoCountries, isoCountryReceive));
            countryListForSend = filterCountriesForSend(countryListForSend);
            countryListForReceive = filterCountriesForReceive(countryListForReceive);
            checkCountryList(countryListForSend);
            checkCountryList(countryListForReceive);

            isoCountrySend.setDasIsoCountries(countryListForSend);
            isoCountryReceive.setDasIsoCountries(countryListForReceive);
            isoCountryRepository.save(isoCountrySend);
            isoCountryRepository.save(isoCountryReceive);
        });
    }


    @SchedulerLock(name = "scheduleTaskUsingCronMexicoStateSave",
            lockAtLeastForString = "PT15M", lockAtMostForString = "PT30M")
    @Scheduled(cron = Constants.EVERY_WEEKEND)
    @Transactional
    public void scheduleTaskUsingCronMexicoStateSave() {
        mexicoStateRepository.deleteAll();
        XRSIDasRequest request = createRequestFirstPart(getRandomReferenceNumber(), MEXICO_CITY_STATE_SERVICE_NAME, properties.getCounterId());

        List<DASMexCityStateInfo> mexStateCityList = new ArrayList<>();
        boolean hasMoreRecord = true;
        String city = null;
        String state = null;
        while (hasMoreRecord) {
            request.setDASReqFilters(createFiltersForMexicoCityState2(EN, state, city));
            XRSIDasReply response = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
            mexStateCityList.addAll(response.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASMexCityStateInfoList());

            state = mexStateCityList.get(mexStateCityList.size() - 1).getStateName();
            city = mexStateCityList.get(mexStateCityList.size() - 1).getCity();
            hasMoreRecord = getMoreRecordsStatus(response);
        }
        List<MexicoState> states = getMexicoStates(mexStateCityList);
        List<MexicoState> mexicoStates = setCitysToMexicoState(mexStateCityList, states);
        saveMexicoState(mexicoStates);
    }

    @SchedulerLock(name = "scheduleTaskUsingCronCountriesAndCurrencies",
            lockAtLeastForString = "PT15M", lockAtMostForString = "PT30M")
    @Scheduled(cron = Constants.EVERY_WEEKEND)
    @Transactional
    public void scheduleTaskUsingCronCountriesAndCurrencies() {
        dasCountryRepository.deleteAll();
        String code = "AZ USD";
        Arrays.stream(LANGS).forEach(lang -> {
            XRSIDasRequest request = createRequestFirstPart(getRandomReferenceNumber(), COUNTRIES_CURRENCIES_SERVICE_NAME, properties.getCounterId());
            List<DASCountryCurrency> dasCountryCurrencies = new LinkedList<>();
            boolean hasMoreRecord = true;
            String countryName = null;
            String currencyName = null;
            while (hasMoreRecord) {
                request.setDASReqFilters(createFiltersForCountryCurrencyAzUSD(lang, code, countryName, currencyName));
                XRSIDasReply response = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
                dasCountryCurrencies.addAll(response.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASDestinationCountriesCurrencies());
                countryName = dasCountryCurrencies.get(dasCountryCurrencies.size() - 1).getCOUNTRYLONG();
                currencyName = dasCountryCurrencies.get(dasCountryCurrencies.size() - 1).getSuffixFormat();
                hasMoreRecord = getMoreRecordsStatus(response);
            }
            List<DasCountry> countries = dasCountryCurrencyListMapperDasCountryList(dasCountryCurrencies, lang);
            setCurrencyListToDasCountry(countries, dasCountryCurrencies);
            dasCountryRepository.saveAll(countries);
        });

    }

    @SchedulerLock(name = "scheduleTaskUsingCronUSStateSave",
            lockAtLeastForString = "PT15M", lockAtMostForString = "PT30M")
    @Scheduled(cron = Constants.EVERY_WEEKEND)
    @Transactional
    public void scheduleTaskUsingCronUSStateSave() {
        usStateInfoRepository.deleteAll();
        Arrays.stream(LANGS).forEach(lang -> {
            List<DASUSStateInfo> dasusStateInfos = getUSRequest(lang, properties.getCounterId());
            DasUsStateInfo usStateInfo = getDasUSStateInfoEntity(lang, dasusStateInfos);
            saveDasUSStateInfo(usStateInfo);
        });

    }

    private List<String> readCountryCodesForSendFromExcel() {
        try (InputStream inputStream = getClass().getResourceAsStream("/sendlist.xlsx");
             Workbook workbook = new XSSFWorkbook(inputStream)) {
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();
            Stream<Row> stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
            return stream.filter(cells -> cells.cellIterator().next().getCellType().equals(CellType.STRING))
                    .map(cells -> cells.cellIterator().next().getStringCellValue())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private List<String> readCountryCodesForReceiveFromExcel() {
        try (InputStream inputStream = getClass().getResourceAsStream("/receivelist.xlsx");
             Workbook workbook = new XSSFWorkbook(inputStream)) {
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();
            Stream<Row> stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
            return stream.filter(cells -> cells.cellIterator().next().getCellType().equals(CellType.STRING))
                    .map(cells -> cells.cellIterator().next().getStringCellValue())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private List<DasIsoCountry> filterCountriesForSend(List<DasIsoCountry> dasIsoCountries) {
        return dasIsoCountries
                .stream()
                .filter(country -> countryCodesForSend.contains(country.getIsoCountryCode()))
                .collect(Collectors.toList());
    }

    private List<DasIsoCountry> filterCountriesForReceive(List<DasIsoCountry> dasIsoCountries) {
        return dasIsoCountries
                .stream()
                .filter(country -> countryCodesForReceive.contains(country.getIsoCountryCode()))
                .collect(Collectors.toList());
    }

    private void checkCountryList(List<DasIsoCountry> countries) {
        if (countries.size() > COUNTRY_CODES.size())
            for (int i = COUNTRY_CODES.size() - 1; i >= 0; i--)
                for (int j = 0; j < countries.size(); j++)
                    if (COUNTRY_CODES.get(i).equals(countries.get(j).getIsoCountryCode())) {
                        countries.add(0, countries.get(j));
                        countries.remove(j + 1);
                    }
    }

    private List<MexicoState> setCitysToMexicoState(List<DASMexCityStateInfo> mexStateCityList, List<MexicoState> mexicoStates) {
        return mexicoStates
                .stream()
                .map(mexicoState -> {
                    mexicoState.setCities(mexStateCityList.stream()
                            .filter(stateInfo -> stateInfo.getStateName().equalsIgnoreCase(mexicoState.getName()))
                            .map(stateInfo -> City.builder()
                                    .name(stateInfo.getCity())
                                    .mexicoState(mexicoState)
                                    .build())
                            .collect(Collectors.toList()));
                    return mexicoState;
                }).collect(Collectors.toList());
    }

    private List<DasIsoCountry> getDasIsoContryList(List<DASISOCountry> dasisoCountryList, IsoCountry isoCountry) {
        return dasisoCountryList
                .stream()
                .map(dasisoCountry ->
                {
                    DasIsoCountry dasIsoCountry = modelMapper.map(dasisoCountry, DasIsoCountry.class);
                    dasIsoCountry.setNameLong(StringEscapeUtils.unescapeJava(dasisoCountry.getNameLong()));
                    dasIsoCountry.setIsoCountry(isoCountry);
                    return dasIsoCountry;
                })
                .collect(Collectors.toList());
    }

    private List<DasCountry> dasCountryCurrencyListMapperDasCountryList(List<DASCountryCurrency> dasCountryCurrencies, String lang) {
        return dasCountryCurrencies.stream().map(dasCountryCurrency ->
                DasCountry.builder()
                        .countryName(StringEscapeUtils.unescapeJava(dasCountryCurrency.getCOUNTRYLONG()))
                        .equivalanceEnglish(dasCountryCurrency.getEquivalanceEnglish())
                        .lang(lang)
                        .isoCountryNumCd(dasCountryCurrency.getISOCOUNTRYNUMCD())
                        .build())
                .distinct()
                .collect(Collectors.toList());
    }

    private void setCurrencyListToDasCountry(List<DasCountry> countries, List<DASCountryCurrency> dasCountryCurrencies) {
        countries
                .forEach(country -> {
                    country.setDasCurrencies(dasCountryCurrencies.stream()
                            .filter(c -> StringEscapeUtils.unescapeJava(c.getCOUNTRYLONG()).equalsIgnoreCase(country.getCountryName()))
                            .map(c -> DasCurrency.builder()
                                    .dasCountry(country)
                                    .displayCurrency(c.getDisplayCurrency())
                                    .prefixFormat(c.getPrefixFormat())
                                    .suffixFormat(StringEscapeUtils.unescapeJava(c.getSuffixFormat()))
                                    .format(c.getFormat()).build())
                            .collect(Collectors.toList()));
                });
    }

    private DasUsStateInfo getDasUSStateInfoEntity(String lang, List<DASUSStateInfo> dasusStateInfos) {
        DasUsStateInfo usStateInfo = new DasUsStateInfo();
        usStateInfo.setLang(lang);
        usStateInfo.setUsStates(dasusStateInfos
                .stream()
                .map(dasusStateInfo -> {
                    UsState map = UsState.builder()
                            .stateName(StringEscapeUtils.unescapeJava(dasusStateInfo.getStateName()))
                            .stateCode(dasusStateInfo.getStateCode()).build();
                    map.setDasUsStateInfo(usStateInfo);
                    return map;
                })
                .collect(Collectors.toList()));
        return usStateInfo;
    }

    private XRSIDasRequest createIsoCountryRequest(String lang, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(getRandomReferenceNumber(), counterId));
        request.setDASQueryName(ISO_COUNTRIES_SERVICE_NAME);
        request.setDASReqFilters(createFiltersForIsoCountry(lang));
        return request;
    }

    private List<DASUSStateInfo> getUSRequest(String lang, String counterId) {
        XRSIDasRequest request = createRequestFirstPart(getRandomReferenceNumber(), US_STATE_LIST_SERVICE_NAME, counterId);
        request.setDASReqFilters(createFiltersForUs(lang));
        XRSIDasReply countryInfosReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        return countryInfosReply.getMTML()
                .getDASReply().getDASDataContext().getDASRecordSet().getDASUSStateInfoList();
    }

    private List<MexicoState> getMexicoStates(List<DASMexCityStateInfo> mexStateCityList) {
        return mexStateCityList
                .stream()
                .map(stateInfo -> MexicoState.builder()
                        .name(stateInfo.getStateName())
                        .stateCode(stateInfo.getStateCode())
                        .build())
                .distinct()
                .collect(Collectors.toList());
    }

    private String getRandomReferenceNumber() {
        Random random = new Random();
        StringBuilder referanceNumber = new StringBuilder("RSCSDAS");
        for (int i = 0; i < 9; i++) {
            referanceNumber.append(random.nextInt(10));
        }
        return referanceNumber.toString();
    }

    private DASReqFilters createFiltersForIsoCountry(String lang) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter1(lang);
        return filters;
    }

    private DASReqFilters createFiltersForUs(String lang) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter1(lang);
        return filters;
    }

    private DASReqFilters createFiltersForIsoCountry(String lang, String countryLong) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter1(lang);
        filters.setDASQueryFilter3(countryLong);
        return filters;
    }

    private DASReqFilters createFiltersForCountryCurrencyAzUSD(String lang, String code, String countryName, String currencyName) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter1(lang);
        filters.setDASQueryFilter2(code);
        filters.setDASQueryFilter3(countryName);
        filters.setDASQueryFilter4(currencyName);
        return filters;
    }

    private DASReqFilters createFiltersForMexicoCityState2(String lang, String state, String city) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter1(lang);
        filters.setDASQueryFilter2(city);
        filters.setDASQueryFilter3(state);
        return filters;
    }

    private DASReqFilters createDasFilter() {
        return factory.createDASReqFilters();
    }

    private XRSIDasRequest createRequestFirstPart(String referenceNumber, String serviceName, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(referenceNumber, counterId));
        request.setDASQueryName(serviceName);
        return request;

    }

    private void saveDasUSStateInfo(DasUsStateInfo stateInfo) {
        usStateInfoRepository.save(stateInfo);
    }


    private boolean getMoreRecordsStatus(XRSIDasReply countryInfosReply) {
        return countryInfosReply.getMTML().getDASReply()
                .getDASDataContext().getDASHeader().getAnyMoreRecords().equalsIgnoreCase("Y");
    }

    private void saveMexicoState(List<MexicoState> mexicoStates) {
        mexicoStateRepository.saveAll(mexicoStates);
    }


}
