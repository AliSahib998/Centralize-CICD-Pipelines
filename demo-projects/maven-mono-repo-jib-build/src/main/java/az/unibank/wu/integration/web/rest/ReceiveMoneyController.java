package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.ReceiveMoneyService;
import az.unibank.wu.integration.service.dto.ReceiveMoneyPayRequestDto;
import az.unibank.wu.integration.service.dto.SearchReceiveMoneyDto;
import az.unibank.wu.integration.webservices.model.ReceiveMoneyPayReply;
import az.unibank.wu.integration.webservices.model.ReceiveMoneySearchReply;
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
public class ReceiveMoneyController {

    private final ReceiveMoneyService receiveService;

    @PostMapping("/receive-money/search")
    public ResponseEntity<ReceiveMoneySearchReply> searchReceiveMoney(@RequestBody @Valid SearchReceiveMoneyDto dto,
                                                                      @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("Request to search received money: {}", dto.getReferenceNumber());
        return ResponseEntity.ok(receiveService.searchReceiveMoney(dto, counterId));
    }

    @PostMapping("/receive-money/pay")
    public ResponseEntity<ReceiveMoneyPayReply> payReceivedMoney(@RequestBody @Valid ReceiveMoneyPayRequestDto dto,
                                                                 @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("Request to pay received money for: {}", dto.getReferenceNumber());
        return ResponseEntity.ok(receiveService.payReceiveMoney(dto, counterId));
    }

}
