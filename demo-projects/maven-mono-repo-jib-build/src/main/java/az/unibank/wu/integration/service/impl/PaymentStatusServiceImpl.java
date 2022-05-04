package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.PaymentStatusService;
import az.unibank.wu.integration.service.dto.PaymentStatusSearchDto;
import az.unibank.wu.integration.webservices.model.PayStatusInquiryReply;
import az.unibank.wu.integration.webservices.model.PayStatusInquiryRequestData;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class PaymentStatusServiceImpl extends MoneyTransferUtils implements PaymentStatusService {

    public PaymentStatusServiceImpl(WebServiceTemplate webServiceTemplate,
                                    ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }


    @Override
    public PayStatusInquiryReply payStatusInquiry(PaymentStatusSearchDto searchDto, String counterId) {
        PayStatusInquiryRequestData payStatusRequest = new PayStatusInquiryRequestData();
        payStatusRequest.setChannel(channel);

        PaymentDetails paymentDetails = factory.createPaymentDetails();
        paymentDetails
                .setOriginatingCountryCurrency(
                        createCurrencyInfo(
                                AZERBAIJAN_CODE,
                                searchDto.getOriginatingCurrency()));

        payStatusRequest.setPaymentDetails(paymentDetails);
        payStatusRequest.setMtcn(searchDto.getMtcn());
        payStatusRequest.setForeignRemoteSystem(createForeignRemoteSystem(searchDto.getReferenceNumber(), counterId));
        return sendAndReceive(payStatusRequest, "xrsi", "http://www.westernunion.com/schema/xrsi", PayStatusInquiryReply.class);
    }
}
