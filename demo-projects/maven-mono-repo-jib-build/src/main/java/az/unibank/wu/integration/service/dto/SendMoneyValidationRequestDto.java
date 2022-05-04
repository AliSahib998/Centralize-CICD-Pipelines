package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.webservices.model.Financials;
import az.unibank.wu.integration.webservices.model.Receiver;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class SendMoneyValidationRequestDto {

    @Valid
    @NotNull
    private SenderDto sender;

    @NotNull
    private Financials financials;

    @Valid
    @NotNull
    private FeeInquiryRequestDto paymentDetails;

    @NotNull
    private Receiver receiver;

}
