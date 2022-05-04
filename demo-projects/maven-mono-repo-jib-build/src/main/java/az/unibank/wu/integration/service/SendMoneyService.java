package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.FeeInquiryRequestDto;
import az.unibank.wu.integration.service.dto.SendMoneyValidationRequestDto;
import az.unibank.wu.integration.service.dto.SendStoreMoneyRequestDto;
import az.unibank.wu.integration.webservices.model.FeeInquiryReply;
import az.unibank.wu.integration.webservices.model.SendMoneyStoreReply;
import az.unibank.wu.integration.webservices.model.SendMoneyValidationReply;

public interface SendMoneyService {

    FeeInquiryReply sendFeeInquiryRequest(FeeInquiryRequestDto dto, String counterId);

    SendMoneyValidationReply sendMoneyValidation(SendMoneyValidationRequestDto dto, String counterId);

    SendMoneyStoreReply sendMoneyStore(SendStoreMoneyRequestDto dto, String counterId);
}
