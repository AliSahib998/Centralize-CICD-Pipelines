package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.RefundService;
import az.unibank.wu.integration.service.dto.RefundRequestDto;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.RefundReply;
import az.unibank.wu.integration.webservices.model.RefundRequest;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class RefundServiceImpl extends MoneyTransferUtils implements RefundService {

    public RefundServiceImpl(WebServiceTemplate webServiceTemplate,
                             ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }

    @Override
    public RefundReply refundPayment(RefundRequestDto dto, String counterId) {
        RefundRequest request = new RefundRequest();
        request.setDevice(createDevice(GwpGbsDeviceType.AGENT));
        request.setChannel(channel);
        request.setSender(dto.getSender());
        request.setReceiver(dto.getReceiver());
        request.setPaymentDetails(dto.getPaymentDetails());
        request.setFinancials(dto.getFinancials());
        request.setMtcn(dto.getMtcn());
        request.setNewMtcn(dto.getNewMtcn());
        request.setEncompassReasonCode(dto.getEncompassReasonCode());
        request.setComments(dto.getComments());
        request.setMoneyTransferKey(dto.getMoneyTransferKey());
        request.setForeignRemoteSystem(createForeignRemoteSystem(dto.getReferenceCode(), counterId));
        return sendAndReceive(request, "ns2", "http://www.westernunion.com/schema/xrsi", RefundReply.class);
    }

}
