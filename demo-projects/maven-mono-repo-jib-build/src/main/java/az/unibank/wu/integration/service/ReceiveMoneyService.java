package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.ReceiveMoneyPayRequestDto;
import az.unibank.wu.integration.service.dto.SearchReceiveMoneyDto;
import az.unibank.wu.integration.webservices.model.ReceiveMoneyPayReply;
import az.unibank.wu.integration.webservices.model.ReceiveMoneySearchReply;

public interface ReceiveMoneyService {
    ReceiveMoneySearchReply searchReceiveMoney(SearchReceiveMoneyDto searchDto, String counterId);

    ReceiveMoneyPayReply payReceiveMoney(ReceiveMoneyPayRequestDto payDto, String counterId);
}
