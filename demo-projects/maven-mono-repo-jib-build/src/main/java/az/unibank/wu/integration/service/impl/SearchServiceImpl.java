package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.SearchService;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.webservices.model.AgentcscFlags;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.PaymentTransaction;
import az.unibank.wu.integration.webservices.model.SearchReply;
import az.unibank.wu.integration.webservices.model.SearchRequest;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SearchServiceImpl extends MoneyTransferUtils implements SearchService {

    public SearchServiceImpl(WebServiceTemplate webServiceTemplate,
                             ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }

    @Override
    public SearchReply searchPayment(SearchRequestDto dto, AgentcscFlags flags, String counterId) {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setDevice(createDevice(GwpGbsDeviceType.AGENT));
        searchRequest.setChannel(channel);
        searchRequest.setForeignRemoteSystem(createForeignRemoteSystem(dto.getReferenceNumber(), counterId));
        searchRequest.setPaymentTransaction(createPaymentTransaction(dto));
        searchRequest.setSearchFlag(flags);
        return sendAndReceive(searchRequest, "ns2", "http://www.westernunion.com/schema/xrsi", SearchReply.class);
    }

    private PaymentTransaction createPaymentTransaction(SearchRequestDto dto) {
        PaymentTransaction paymentTransaction = factory.createPaymentTransaction();
        PaymentDetails paymentDetails = factory.createPaymentDetails();
        paymentDetails.setOriginatingCountryCurrency(
                createCurrencyInfo(AZERBAIJAN_CODE, dto.getOriginatingCurrency().name()));
        paymentTransaction.setPaymentDetails(paymentDetails);
        paymentTransaction.setMtcn(dto.getMtcn());
        return paymentTransaction;
    }

}
