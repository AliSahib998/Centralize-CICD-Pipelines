package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.OriginatingCurrency;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CancelPaymentRequestDto {

    @NotNull
    private String mtcn;

    /**
     * You will get this reason code from get cancel reason list service from DAS services
     */
    @NotNull
    private String reasonForRedelivery;

    @NotNull
    private String databaseKey;

    @NotNull
    private String comment;

    @NotNull
    private OriginatingCurrency originatingCurrency;

    @NotNull
    private String referenceCode;

}
