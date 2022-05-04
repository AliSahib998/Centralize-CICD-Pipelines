package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.CancelPaymentRequestDto;
import az.unibank.wu.integration.webservices.model.CancelSendReply;

public interface CancelService {
    CancelSendReply sendCancel(CancelPaymentRequestDto dto, String counterId);
}
