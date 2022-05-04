package az.unibank.wu.integration.service;

import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.AgentcscFlags;
import az.unibank.wu.integration.webservices.model.SearchReply;

public interface SearchService {
    SearchReply searchPayment(SearchRequestDto dto, AgentcscFlags flags, String counterId);
}
