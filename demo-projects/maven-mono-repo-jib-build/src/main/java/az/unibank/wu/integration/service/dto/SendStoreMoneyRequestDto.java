package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.Promotions;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SendStoreMoneyRequestDto extends SendMoneyValidationRequestDto {

    @NotNull
    private String addlServiceCharges;

    @NotNull
    private String mtcn;

    @NotNull
    private String newMtcn;

    @NotNull
    private PaymentDetails validationPaymentDetails;
    
    private Promotions promotions;
}
