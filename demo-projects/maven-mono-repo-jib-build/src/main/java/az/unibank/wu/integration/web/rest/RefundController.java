package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.RefundService;
import az.unibank.wu.integration.service.SearchService;
import az.unibank.wu.integration.service.dto.RefundRequestDto;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.AgentcscFlags;
import az.unibank.wu.integration.webservices.model.RefundReply;
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
public class RefundController {

    private final SearchService searchService;
    private final RefundService refundService;

    @PostMapping("/refund/search")
    public ResponseEntity<SearchReply> searchPaymentForRefund(@RequestBody @Valid SearchRequestDto dto,
                                                              @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.debug("REST request to search payment for refund: {}", dto);
        return ResponseEntity.ok(searchService.searchPayment(dto, AgentcscFlags.REFUND, counterId));
    }

    /**
     * This method could be change to save to database by reference code and then retrieve data from there
     *
     * @param dto
     * @return Result of refund request
     */
    @PostMapping("/refund")
    public ResponseEntity<RefundReply> refundPayment(@RequestBody @Valid RefundRequestDto dto,
                                                     @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request for refund payment referenceNo: {}, mtcn: {}",
                dto.getReferenceCode(), dto.getMtcn());
        return ResponseEntity.ok(refundService.refundPayment(dto, counterId));
    }

}
