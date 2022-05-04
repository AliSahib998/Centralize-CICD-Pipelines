package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.service.CancelService;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.dto.CancelPaymentRequestDto;
import az.unibank.wu.integration.service.enumeration.OriginatingCurrency;
import az.unibank.wu.integration.webservices.model.CancelSendReply;
import az.unibank.wu.integration.webservices.model.CancelSendRequest;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.PaymentTransaction;
import az.unibank.wu.integration.webservices.model.YesNo;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CancelServiceImpl extends MoneyTransferUtils implements CancelService {

    public CancelServiceImpl(WebServiceTemplate webServiceTemplate, ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }

    @Override
    public CancelSendReply sendCancel(CancelPaymentRequestDto dto, String counterId) {
        CancelSendRequest cancelRequest = new CancelSendRequest();
        cancelRequest.setDevice(createDevice(GwpGbsDeviceType.AGENT));
        cancelRequest.setChannel(channel);
        cancelRequest.setReasonForRedelivery(dto.getReasonForRedelivery());
        cancelRequest.setMtcn(dto.getMtcn());
        cancelRequest.setDatabaseKey(dto.getDatabaseKey());
        cancelRequest.getCommentsData().add(dto.getComment());
        cancelRequest.setDisallowTrafficFlag(YesNo.Y);
        cancelRequest.setPaymentTransaction(
                createPaymentTransaction(dto.getOriginatingCurrency())
        );
        cancelRequest.setForeignRemoteSystem(
                createForeignRemoteSystem(dto.getReferenceCode(), counterId)
        );
        return sendAndReceive(cancelRequest, "xrsi", "", CancelSendReply.class);
    }

    private PaymentTransaction createPaymentTransaction(OriginatingCurrency currency) {
        PaymentTransaction paymentTransaction = factory.createPaymentTransaction();
        PaymentDetails paymentDetails = factory.createPaymentDetails();
        paymentDetails.setOriginatingCountryCurrency(
                createCurrencyInfo(AZERBAIJAN_CODE, currency.name())
        );
        paymentTransaction.setPaymentDetails(paymentDetails);
        return paymentTransaction;
    }

}
