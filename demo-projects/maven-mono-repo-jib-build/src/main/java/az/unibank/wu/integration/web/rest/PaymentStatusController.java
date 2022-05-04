package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.PaymentStatusService;
import az.unibank.wu.integration.service.dto.PaymentStatusSearchDto;
import az.unibank.wu.integration.webservices.model.PayStatusInquiryReply;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PaymentStatusController {

    private final PaymentStatusService payService;

    @PostMapping("/payment-status")
    public ResponseEntity<PayStatusInquiryReply> payStatus(@RequestBody @Valid PaymentStatusSearchDto searchDto,
                                                           @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("Request to pay received money for: {}", searchDto.getReferenceNumber());
        return ResponseEntity.ok(payService.payStatusInquiry(searchDto, counterId));
    }

}
