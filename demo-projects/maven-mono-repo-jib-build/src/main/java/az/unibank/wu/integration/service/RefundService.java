package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.RefundRequestDto;
import az.unibank.wu.integration.webservices.model.RefundReply;

public interface RefundService {
    RefundReply refundPayment(RefundRequestDto dto, String counterId);
}
