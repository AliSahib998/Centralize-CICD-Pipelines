package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.OriginatingCurrency;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class FeeInquiryRequestDto {

    @NotNull
    @Positive
    private Long amount;

    @NotNull
    private String destinationCurrency;

    @NotNull
    private OriginatingCurrency originatingCurrency;

    @NotNull
    private String destinationCountryCode;

    @NotNull
    private String referenceNumber;

    private String stateCode;

    private String city;

    private String deliveryServiceCode;

    private String routingCode;

    private String promoCode;

}
