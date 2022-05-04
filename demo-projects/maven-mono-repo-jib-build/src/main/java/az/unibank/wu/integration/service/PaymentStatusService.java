package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.PaymentStatusSearchDto;
import az.unibank.wu.integration.webservices.model.PayStatusInquiryReply;

public interface PaymentStatusService {

    PayStatusInquiryReply payStatusInquiry(PaymentStatusSearchDto searchDto, String counterId);
}
