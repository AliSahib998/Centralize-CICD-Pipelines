package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.CancelService;
import az.unibank.wu.integration.service.SearchService;
import az.unibank.wu.integration.service.dto.CancelPaymentRequestDto;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.AgentcscFlags;
import az.unibank.wu.integration.webservices.model.CancelSendReply;
import az.unibank.wu.integration.webservices.model.SearchReply;
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
public class CancelController {

    private final SearchService searchService;
    private final CancelService cancelService;

    @PostMapping("/cancel/search")
    public ResponseEntity<SearchReply> searchPaymentForCancel(@RequestBody @Valid SearchRequestDto dto,
                                                              @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.debug("REST request to search payment for cancel: {}", dto);
        return ResponseEntity.ok(searchService.searchPayment(dto, AgentcscFlags.CANCEL_SEND,counterId));
    }

    @PostMapping("/cancel/payment")
    public ResponseEntity<CancelSendReply> cancelPayment(@RequestBody @Valid CancelPaymentRequestDto dto,
                                                         @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.debug("REST request to cancel payment: {}", dto);
        return ResponseEntity.ok(cancelService.sendCancel(dto,counterId));
    }

}
