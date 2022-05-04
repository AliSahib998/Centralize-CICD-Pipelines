package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.ModifyRequestDto;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.ModifySendMoneyReply;
import az.unibank.wu.integration.webservices.model.ModifySendMoneySearchReply;

public interface ModifyService {
    ModifySendMoneySearchReply searchPaymentForModify(SearchRequestDto dto, String counterId);

    ModifySendMoneyReply modifySendMoney(ModifyRequestDto dto);
}
