package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.CountryInfoDto;
import az.unibank.wu.integration.service.dto.DasCountryCurrencyDto;
import az.unibank.wu.integration.service.dto.DeliveryServiceRequestDto;
import az.unibank.wu.integration.service.dto.DlvrOptTmpDto;
import az.unibank.wu.integration.service.dto.IsoCountryType;
import az.unibank.wu.integration.service.dto.MexicoStateDto;
import az.unibank.wu.integration.webservices.model.DASCountryInfo;
import az.unibank.wu.integration.webservices.model.DASDelivOptTemplate;
import az.unibank.wu.integration.webservices.model.DASDeliverySvc;
import az.unibank.wu.integration.webservices.model.DASErrorInfo;
import az.unibank.wu.integration.webservices.model.DASISOCountry;
import az.unibank.wu.integration.webservices.model.DASISOCurrency;
import az.unibank.wu.integration.webservices.model.DASReasonList;
import az.unibank.wu.integration.webservices.model.DASUSStateInfo;

import java.util.List;

public interface DasService {
    List<DASDeliverySvc> getDeliveryServices(DeliveryServiceRequestDto dto, String counterId);

    List<DASReasonList> getReasonList(String referenceNumber, String purpose, String counterId);

    List<DASISOCountry> getIsoCountries(String lang, IsoCountryType type);

    List<DasCountryCurrencyDto> getCountriesAndCurrencies(String lang, String countryCode);

    List<DASISOCurrency> getDestinationCurrencies(String referenceNumber, String countryCode, String counterId);

    List<DASISOCountry> getDestinationCountries(String referenceNumber, String countryName, String counterId);

    List<DASCountryInfo> getCountryInfo(CountryInfoDto dto, String counterId);

    List<DASErrorInfo> getErrorMessageInfo(String referenceNumber, String errorCode, String counterId);

    List<MexicoStateDto> getMexicoCityState();

    List<DASUSStateInfo> getUSStateList(String lang);

    List<DASDelivOptTemplate> getDeliveryOptionTemplate(DlvrOptTmpDto dto, String counterId);
}
