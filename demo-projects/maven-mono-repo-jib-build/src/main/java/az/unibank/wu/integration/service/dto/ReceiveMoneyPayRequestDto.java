package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.webservices.model.Financials;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class ReceiveMoneyPayRequestDto {

    @NotNull
    private String referenceNumber;

    @NotNull
    private String moneyTransferKey;

    @NotNull
    private String mtcn;

    @NotNull
    private String newMtcn;

    @NotNull
    private Financials financials;

    @Valid
    @NotNull
    private ReceiverDto receiver;

    @NotNull
    private PaymentDetails paymentDetails;
}
