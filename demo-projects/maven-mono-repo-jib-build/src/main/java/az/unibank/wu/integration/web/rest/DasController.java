package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.domain.Language;
import az.unibank.wu.integration.service.DasService;
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
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DasController {

    private static final String CANCEL_CODE = "RCAN";
    private static final String REFUND_CODE = "RREF";
    private final DasService dasService;

    @GetMapping("/das/delivery-service")
    public ResponseEntity<List<DASDeliverySvc>> getDeliveryService(@Valid DeliveryServiceRequestDto dto,
                                                                   @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get delivery services: {}", dto);
        return ResponseEntity.ok(dasService.getDeliveryServices(dto,counterId));
    }

    @GetMapping("/das/cancel/reason-list")
    public ResponseEntity<List<DASReasonList>> getCancelReasonList(@RequestParam String referenceNumber,
                                                                   @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get cancel reason list: {}", referenceNumber);
        return ResponseEntity.ok(dasService.getReasonList(referenceNumber, CANCEL_CODE,counterId));
    }

    @GetMapping("/das/refund/reason-list")
    public ResponseEntity<List<DASReasonList>> getRefundReasonList(@RequestParam String referenceNumber,
                                                                   @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get refund reason list: {}", referenceNumber);
        return ResponseEntity.ok(dasService.getReasonList(referenceNumber, REFUND_CODE,counterId));
    }

    @GetMapping("/das/iso-countries")
    public ResponseEntity<List<DASISOCountry>> getIsoCountryList(@RequestParam Language lang,
                                                                 @RequestParam IsoCountryType type) {
        log.trace("REST request to get ISO code of countries list: {}", lang);
        return ResponseEntity.ok(dasService.getIsoCountries(lang.name(),type));
    }

    @GetMapping("/das/country-currency")
    public ResponseEntity<List<DasCountryCurrencyDto>> getCountriesCurrencies(@RequestParam Language lang,
                                                                              @RequestParam String countryCode) {
        log.trace("REST request to get countries & currencies: {}", countryCode);
        return ResponseEntity.ok(dasService.getCountriesAndCurrencies(lang.name(), countryCode));
    }

    @GetMapping("/das/destination-countries")
    public ResponseEntity<List<DASISOCountry>> getDestinationCountries(@RequestParam String referenceNumber,
                                                                       @RequestParam(required = false) String countryName,
                                                                       @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get destination countries: {} {}", referenceNumber, countryName);
        return ResponseEntity.ok(dasService.getDestinationCountries(referenceNumber, countryName,counterId));
    }

    @GetMapping("/das/destination-currencies")
    public ResponseEntity<List<DASISOCurrency>> getDestinationCurrencies(@RequestParam String referenceNumber,
                                                                         @RequestParam @Size(max = 2, min = 2) String destinationCountryCode,
                                                                         @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get destination currencies: {}", referenceNumber);
        return ResponseEntity.ok(dasService.getDestinationCurrencies(referenceNumber, destinationCountryCode,counterId));
    }


    @GetMapping("/das/country-info")
    public ResponseEntity<List<DASCountryInfo>> getCountryInfo(@Valid CountryInfoDto dto,
                                                               @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get country info: {}", dto);
        return ResponseEntity.ok(dasService.getCountryInfo(dto,counterId));
    }

    @GetMapping("/das/error-message-info")
    public ResponseEntity<List<DASErrorInfo>> getErrorMessageInfo(@RequestParam String referenceNumber,
                                                                  @RequestParam (required = false) String errorCode,
                                                                  @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get error message info: {}", referenceNumber);
        return ResponseEntity.ok(dasService.getErrorMessageInfo(referenceNumber, errorCode,counterId));
    }


    @GetMapping("/das/mexico-city-state")
    public ResponseEntity<List<MexicoStateDto>> getMexicoCityState() {
        log.trace("REST request to get mexico city state info: {}");
        return ResponseEntity.ok(dasService.getMexicoCityState());
    }

    @GetMapping("/das/us-state-info") 
    public ResponseEntity<List<DASUSStateInfo>> getUSStateList(@RequestParam Language lang) {
        log.trace("REST request to get us state info: {}", lang);
        return ResponseEntity.ok(dasService.getUSStateList(lang.name()));
    }

    @GetMapping("/das/delivery-option-template")
    public ResponseEntity<List<DASDelivOptTemplate>> getDeliveryOptionTemplate(@Valid DlvrOptTmpDto dto,
                                                                               @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to get delivery option template info: {}", dto);
        return ResponseEntity.ok(dasService.getDeliveryOptionTemplate(dto, counterId));
    }


}
