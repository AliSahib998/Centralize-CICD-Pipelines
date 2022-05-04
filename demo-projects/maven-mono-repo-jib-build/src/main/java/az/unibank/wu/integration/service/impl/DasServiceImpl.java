package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.domain.City;
import az.unibank.wu.integration.domain.DASDelivery;
import az.unibank.wu.integration.domain.DasCountry;
import az.unibank.wu.integration.domain.Delivery;
import az.unibank.wu.integration.domain.MexicoState;
import az.unibank.wu.integration.repository.DasCountryRepository;
import az.unibank.wu.integration.repository.DasUsStateInfoRepository;
import az.unibank.wu.integration.repository.DeliveryRepository;
import az.unibank.wu.integration.repository.IsoCountryRepository;
import az.unibank.wu.integration.repository.MexicoStateRepository;
import az.unibank.wu.integration.service.DasService;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.dto.CountryInfoDto;
import az.unibank.wu.integration.service.dto.DasCountryCurrencyDto;
import az.unibank.wu.integration.service.dto.DasCurrencyDto;
import az.unibank.wu.integration.service.dto.DeliveryServiceRequestDto;
import az.unibank.wu.integration.service.dto.DlvrOptTmpDto;
import az.unibank.wu.integration.service.dto.IsoCountryType;
import az.unibank.wu.integration.service.dto.MexicoStateDto;
import az.unibank.wu.integration.web.rest.errors.IsoCountryNotFound;
import az.unibank.wu.integration.web.rest.errors.USStateNotFoundException;
import az.unibank.wu.integration.web.rest.errors.WesternUnionResponseFaultException;
import az.unibank.wu.integration.webservices.model.DASCountryInfo;
import az.unibank.wu.integration.webservices.model.DASDelivOptTemplate;
import az.unibank.wu.integration.webservices.model.DASDeliverySvc;
import az.unibank.wu.integration.webservices.model.DASErrorInfo;
import az.unibank.wu.integration.webservices.model.DASISOCountry;
import az.unibank.wu.integration.webservices.model.DASISOCurrency;
import az.unibank.wu.integration.webservices.model.DASReasonList;
import az.unibank.wu.integration.webservices.model.DASRecord;
import az.unibank.wu.integration.webservices.model.DASReqFilters;
import az.unibank.wu.integration.webservices.model.DASUSStateInfo;
import az.unibank.wu.integration.webservices.model.XRSIDasReply;
import az.unibank.wu.integration.webservices.model.XRSIDasRequest;
import org.apache.commons.text.StringEscapeUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DasServiceImpl extends MoneyTransferUtils implements DasService {

    private static final String DELIVERY_SERVICES_NAME = "GetDeliveryServices";
    private static final String REASON_LIST_SERVICE_NAME = "GetReasonList";
    private static final String DESTINATION_CURRENCIES_SERVICE_NAME = "GetDestinationCurrencies";
    private static final String DESTINATION_COUNTRIES_SERVICE_NAME = "GetDestinationCountries";
    private static final String DESTINATION_COUNTRY_INFO_SERVICE_NAME = "GetCountryInfo";
    private static final String ERROR_MESSAGES_INFO_SERVICE_NAME = "GetErrorMessagesInfo";
    private static final String DELIVERY_OPTION_TEMPLATE_SERVICE_NAME = "GetDeliveryOptionTemplate";

    private final DeliveryRepository deliveryRepository;
    private final IsoCountryRepository isoCountryRepository;
    private final MexicoStateRepository mexicoStateRepository;
    private final DasUsStateInfoRepository usStateInfoRepository;
    private final DasCountryRepository dasCountryRepository;
    private final ModelMapper modelMapper;

    public DasServiceImpl(WebServiceTemplate webServiceTemplate,
                          DeliveryRepository deliveryRepository,
                          ApplicationProperties properties,
                          IsoCountryRepository isoCountryRepository,
                          MexicoStateRepository mexicoStateRepository,
                          DasUsStateInfoRepository usStateInfoRepository,
                          ModelMapper modelMapper,
                          DasCountryRepository dasCountryRepository) {
        super(webServiceTemplate, properties);
        this.deliveryRepository = deliveryRepository;
        this.isoCountryRepository = isoCountryRepository;
        this.mexicoStateRepository = mexicoStateRepository;
        this.usStateInfoRepository = usStateInfoRepository;
        this.modelMapper = modelMapper;
        this.dasCountryRepository = dasCountryRepository;
    }

    @Override
    @Transactional
    public List<DASDeliverySvc> getDeliveryServices(DeliveryServiceRequestDto dto, String counterId) {
        Optional<Delivery> delivery = deliveryRepository
                .findFirstByDesCountryAndDesCurrencyAndOrgCurrencyAndCreateDateBetween(dto.getDestinationCountryCode(),
                        dto.getDestinationCurrency(), dto.getOriginatingCurrency(),
                        LocalDateTime.now().minusDays(1), LocalDateTime.now());
        if (delivery.isPresent()) {
            List<DASDeliverySvc> deliverySvcList = getDasDeliverySvcList(delivery.get());
            fixDeliveryServiceUnicodes(deliverySvcList);
            return deliverySvcList;
        } else {
            List<DASDeliverySvc> dasDeliverySvcs = sendRequestToDeliveryService(dto, counterId);
            deliveryRepository.save(dasSvcParseDelivery(dasDeliverySvcs, dto));
            return dasDeliverySvcs;
        }
    }

    @Override
    @Transactional
    public List<DASISOCountry> getIsoCountries(String lang, IsoCountryType type) { //todo add optional filter country name
        return isoCountryRepository.findByLangAndType(lang.toUpperCase(), type)
                .orElseThrow(IsoCountryNotFound::new)
                .getDasIsoCountries()
                .stream()
                .map(dasIsoCountry1 -> modelMapper.map(dasIsoCountry1, DASISOCountry.class))
                .collect(Collectors.toList());
    }


    @Override
    @Transactional
    public List<MexicoStateDto> getMexicoCityState() {
        return mexicoStateRepository.findAll()
                .stream()
                .map(this::mexicoStateMapperDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<DASReasonList> getReasonList(String referenceNumber, String purpose, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(referenceNumber, counterId));
        request.setDASQueryName(REASON_LIST_SERVICE_NAME);
        request.setDASReqFilters(createFiltersForReasonList(purpose));
        XRSIDasReply deliveryReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        List<DASReasonList> dasReasonList = deliveryReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASReasonList();
        fixReasonDescriptionUnicodeProblem(dasReasonList);
        return dasReasonList;
    }

    @Override
    @Transactional
    public List<DasCountryCurrencyDto> getCountriesAndCurrencies(String lang, String countryCode) { //todo add optional currency name
        List<DasCountry> dasCountry = dasCountryRepository.findAllByLangAndEquivalanceEnglish(lang, countryCode);
        return dasCountry.stream().map(country -> DasCountryCurrencyDto.builder()
                .countryName(country.getCountryName())
                .isoCountryNumCd(country.getIsoCountryNumCd())
                .equivalanceEnglish(country.getEquivalanceEnglish())
                .dasCurrencyDtos(country.getDasCurrencies().stream().map(dasCurrency ->
                        DasCurrencyDto.builder()
                                .displayCurrency(dasCurrency.getDisplayCurrency())
                                .format(dasCurrency.getFormat())
                                .prefixFormat(dasCurrency.getPrefixFormat())
                                .suffixFormat(dasCurrency.getSuffixFormat())
                                .build()
                ).collect(Collectors.toList()))
                .build()).collect(Collectors.toList());
    }

    @Override
    public List<DASISOCurrency> getDestinationCurrencies(String referenceNumber, String countryCode, String counterId) {
        return sendCurrencyRelatedDasRequest(referenceNumber, countryCode, DESTINATION_CURRENCIES_SERVICE_NAME, counterId)
                .getDASDestCurrencyList();
    }

    @Override
    public List<DASISOCountry> getDestinationCountries(String referenceNumber, String countryName, String counterId) {
        return sendCurrencyRelatedDasRequest(referenceNumber, countryName, DESTINATION_COUNTRIES_SERVICE_NAME, counterId)
                .getDASDestCountryList();
    }

    @Override
    public List<DASCountryInfo> getCountryInfo(CountryInfoDto dto, String counterId) {
        XRSIDasRequest request = createRequestFirstPart(dto.getReferenceNumber(), DESTINATION_COUNTRY_INFO_SERVICE_NAME, counterId);
        request.setDASReqFilters(createFiltersForCountryInfo(dto));
        XRSIDasReply countryInfosReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        List<DASCountryInfo> countryInfSvcList = countryInfosReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASCountryInfoList();
        fixCountryInfoUnicodeProblem(countryInfSvcList);
        return countryInfSvcList;
    }

    @Override
    public List<DASErrorInfo> getErrorMessageInfo(String referenceNumber, String errorCode, String counterId) {
        XRSIDasRequest request = createRequestFirstPart(referenceNumber, ERROR_MESSAGES_INFO_SERVICE_NAME, counterId);
        request.setDASReqFilters(createFiltersForErrMsg(errorCode));
        XRSIDasReply countryInfosReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        List<DASErrorInfo> errMsgInfSvcList = countryInfosReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASErrorInfoList();
        fixErrMsgUnicodeProblem(errMsgInfSvcList);
        return errMsgInfSvcList;
    }

    @Override
    public List<DASUSStateInfo> getUSStateList(String lang) {
        return usStateInfoRepository.findByLang(lang.toUpperCase())
                .orElseThrow(() -> new USStateNotFoundException(lang)).getUsStates()
                .stream()
                .map(usState -> modelMapper.map(usState, DASUSStateInfo.class))
                .collect(Collectors.toList());
    }


    @Override
    public List<DASDelivOptTemplate> getDeliveryOptionTemplate(DlvrOptTmpDto dto, String counterId) {
        XRSIDasRequest request = createRequestFirstPart(dto.getReferenceNumber(), DELIVERY_OPTION_TEMPLATE_SERVICE_NAME, counterId);
        request.setDASReqFilters(createFiltersForDlvrOptTmp(dto));
        XRSIDasReply countryInfosReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        return countryInfosReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASDelivOptTemplate();

    }

    private List<DASDeliverySvc> getDasDeliverySvcList(Delivery delivery) {
        return delivery.getDasDeliveries()
                .stream()
                .map(dasDelivery ->
                        modelMapper.map(dasDelivery, DASDeliverySvc.class))
                .collect(Collectors.toList());
    }

    private MexicoStateDto mexicoStateMapperDto(MexicoState state) {
        return MexicoStateDto.builder()
                .stateName(state.getName())
                .stateCode(state.getStateCode())
                .cities(state.getCities().stream()
                        .map(City::getName)
                        .collect(Collectors.toList()))
                .build();
    }

    private List<DASDeliverySvc> sendRequestToDeliveryService(DeliveryServiceRequestDto dto, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(dto.getReferenceNumber(), counterId));
        request.setDASQueryName(DELIVERY_SERVICES_NAME);
        request.setDASReqFilters(createFiltersForDeliveryService(dto));
        XRSIDasReply deliveryReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        List<DASDeliverySvc> deliverySvcList = deliveryReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet().getDASDeliverySvcList();
        fixDeliveryServiceUnicodes(deliverySvcList);
        return deliverySvcList;
    }

    private XRSIDasRequest createRequestFirstPart(String referenceNumber, String serviceName, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(referenceNumber, counterId));
        request.setDASQueryName(serviceName);
        return request;

    }

    private DASRecord sendCurrencyRelatedDasRequest(String referenceNumber, String countryCode, String destinationCurrenciesServiceName, String counterId) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(referenceNumber, counterId));
        request.setDASQueryName(destinationCurrenciesServiceName);

        DASReqFilters dasFilter = createDasFilterAzUsd();
        dasFilter.setDASQueryFilter3(countryCode);
        request.setDASReqFilters(dasFilter);
        XRSIDasReply deliveryReply = sendAndReceive(request, "xrsi", "", XRSIDasReply.class);
        DASRecord dasRecordSet = deliveryReply.getMTML().getDASReply().getDASDataContext().getDASRecordSet();
        if (dasRecordSet == null) {
            throw new WesternUnionResponseFaultException("Wrong country name!", "Wrong country name!");
        }
        return dasRecordSet;
    }

    private DASReqFilters createDasFilterAzUsd() {
        DASReqFilters dasFilter = createDasFilter();
        dasFilter.setDASQueryFilter2("AZ USD");
        return dasFilter;
    }

    private DASReqFilters createFiltersForDeliveryService(DeliveryServiceRequestDto dto) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter2("AZ " + dto.getOriginatingCurrency());
        filters.setDASQueryFilter3(
                String.format("%s %s",
                        dto.getDestinationCountryCode(),
                        dto.getDestinationCurrency())
        );
        filters.setDASQueryFilter4(dto.getD2b());
        return filters;
    }

    private DASReqFilters createFiltersForReasonList(String reason) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter2(reason);
        return filters;
    }

    private DASReqFilters createDasFilter() {
        DASReqFilters filters = factory.createDASReqFilters();
        filters.setDASQueryFilter1("en");
        return filters;
    }

    private void fixDeliveryServiceUnicodes(List<DASDeliverySvc> deliverySvcList) {
        deliverySvcList.forEach(service -> {
            service.setServiceName(StringEscapeUtils.unescapeJava(service.getServiceName()));
            service.setDescription(StringEscapeUtils.unescapeJava(service.getDescription()));
        });
    }

    private void fixReasonDescriptionUnicodeProblem(List<DASReasonList> dasReasonList) {
        dasReasonList
                .forEach(
                        dasReason -> dasReason.setReasonDescription(
                                StringEscapeUtils.unescapeJava(
                                        dasReason.getReasonDescription()
                                )
                        )
                );
    }

    private void fixCountryInfoUnicodeProblem(List<DASCountryInfo> dasCountryInfList) {
        dasCountryInfList
                .forEach(
                        countryInfo -> countryInfo.setCountryInfoLine(
                                StringEscapeUtils.unescapeJava(
                                        countryInfo.getCountryInfoLine()
                                )
                        )
                );
    }


    private void fixErrMsgUnicodeProblem(List<DASErrorInfo> dasErrMsgInfList) {
        dasErrMsgInfList
                .forEach(
                        errMsgInf -> errMsgInf.setErrorDescription(
                                StringEscapeUtils.unescapeJava(
                                        errMsgInf.getErrorDescription()
                                )
                        )
                );
    }


    private DASReqFilters
    createFiltersForCountryInfo(CountryInfoDto dto) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter2(dto.getCountryCode() + " " + dto.getCurrencyCode());

        return filters;
    }


    private DASReqFilters
    createFiltersForErrMsg(String code) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter2(code);

        return filters;
    }

    private DASReqFilters
    createFiltersForDlvrOptTmp(DlvrOptTmpDto dto) {
        DASReqFilters filters = createDasFilter();
        filters.setDASQueryFilter2(dto.getOriginatingCountryCode() + " " + dto.getOriginatingCurrency());
        filters.setDASQueryFilter3(dto.getTemplateCode());
        filters.setDASQueryFilter8("XPath");
        return filters;
    }

    private Delivery dasSvcParseDelivery(List<DASDeliverySvc> svc, DeliveryServiceRequestDto dto) {
        return Delivery.builder().createDate(LocalDateTime.now())
                .desCountry(dto.getDestinationCountryCode())
                .desCurrency(dto.getDestinationCurrency())
                .orgCurrency(dto.getOriginatingCurrency())
                .dasDeliveries(svc.stream().map(dasDeliverySvc ->
                        modelMapper.map(dasDeliverySvc, DASDelivery.class))
                        .collect(Collectors.toList())).build();

    }


}
