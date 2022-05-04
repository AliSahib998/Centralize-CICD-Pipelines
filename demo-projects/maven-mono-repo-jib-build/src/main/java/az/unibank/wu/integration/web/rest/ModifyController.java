package az.unibank.wu.integration.web.rest;

import az.unibank.wu.integration.configuration.Constants;
import az.unibank.wu.integration.service.ModifyService;
import az.unibank.wu.integration.service.dto.ModifyRequestDto;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.ModifySendMoneyReply;
import az.unibank.wu.integration.webservices.model.ModifySendMoneySearchReply;
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
public class ModifyController {

    private final ModifyService modifyService;

    @PostMapping("/modify/search")
    public ResponseEntity<ModifySendMoneySearchReply> searchPaymentForModify(@RequestBody @Valid SearchRequestDto dto,
                                                                             @RequestHeader(Constants.HEADER_COUNTER_ID) String counterId) {
        log.trace("REST request to search payment for modify: {}", dto);
        return ResponseEntity.ok(modifyService.searchPaymentForModify(dto, counterId));
    }

    @PostMapping("/modify/payment")
    public ResponseEntity<ModifySendMoneyReply> modifyPayment(@RequestBody @Valid ModifyRequestDto dto) {
        log.trace("REST request to modify payment: {}", dto);
        return ResponseEntity.ok(modifyService.modifySendMoney(dto));
    }

}
