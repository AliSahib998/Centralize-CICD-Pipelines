package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.SendMoneyService;
import az.unibank.wu.integration.service.dto.FeeInquiryRequestDto;
import az.unibank.wu.integration.service.dto.SendMoneyValidationRequestDto;
import az.unibank.wu.integration.service.dto.SendStoreMoneyRequestDto;
import az.unibank.wu.integration.webservices.model.FeeInquiryReply;
import az.unibank.wu.integration.webservices.model.SendMoneyStoreReply;
import az.unibank.wu.integration.webservices.model.SendMoneyValidationReply;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SendMoneyController {

    private final SendMoneyService sendMoneyService;

    @PostMapping("/fee-inquiry")
    public FeeInquiryReply calculateFee(@RequestBody @Valid FeeInquiryRequestDto dto,
                                        @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        return sendMoneyService.sendFeeInquiryRequest(dto, counterId);
    }

    @PostMapping("/send/validate")
    public ResponseEntity<SendMoneyValidationReply> validateSendMoney(@RequestBody @Valid SendMoneyValidationRequestDto dto,
                                                                      @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        return ResponseEntity.ok(sendMoneyService.sendMoneyValidation(dto, counterId));
    }

    @PostMapping("/send/store")
    public ResponseEntity<SendMoneyStoreReply> sendMoneyStore(@RequestBody @Valid SendStoreMoneyRequestDto request,
                                                              @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        return ResponseEntity.ok(sendMoneyService.sendMoneyStore(request, counterId));
    }
}
