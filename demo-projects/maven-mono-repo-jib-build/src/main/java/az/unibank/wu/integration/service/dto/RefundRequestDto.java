package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.webservices.model.Financials;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.Receiver;
import az.unibank.wu.integration.webservices.model.Sender;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RefundRequestDto {

    @NotNull
    private Sender sender;

    @NotNull
    private Receiver receiver;

    @NotNull
    private Financials financials;

    @NotNull
    private PaymentDetails paymentDetails;

    @NotNull
    private String mtcn;

    @NotNull
    private String newMtcn;

    /**
     * You will get this reason code from get reason list service from DAS services
     */
    @NotNull
    private String encompassReasonCode;

    @NotNull
    private String comments;

    private String moneyTransferKey;

    private String referenceCode;

}
