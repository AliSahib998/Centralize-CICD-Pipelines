package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.domain.Modify;
import az.unibank.wu.integration.web.rest.errors.ModifyTransactionResponseNotFound;
import az.unibank.wu.integration.repository.ModifyRepository;
import az.unibank.wu.integration.service.ModifyService;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.dto.ModifyRequestDto;
import az.unibank.wu.integration.service.dto.SearchRequestDto;
import az.unibank.wu.integration.web.rest.errors.WesternUnionResponseFaultException;
import az.unibank.wu.integration.webservices.model.GeneralName;
import az.unibank.wu.integration.webservices.model.ModifySendMoneyReply;
import az.unibank.wu.integration.webservices.model.ModifySendMoneyRequest;
import az.unibank.wu.integration.webservices.model.ModifySendMoneySearchReply;
import az.unibank.wu.integration.webservices.model.ModifySendMoneySearchRequest;
import az.unibank.wu.integration.webservices.model.NameType;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.PaymentTransaction;
import az.unibank.wu.integration.webservices.model.Receiver;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ModifyServiceImpl extends MoneyTransferUtils implements ModifyService {

    private final ObjectMapper objectMapper;
    private final ModifyRepository modifyRepository;

    public ModifyServiceImpl(WebServiceTemplate webServiceTemplate,
                             ApplicationProperties properties,
                             ObjectMapper objectMapper,
                             ModifyRepository modifyRepository) {
        super(webServiceTemplate, properties);
        this.objectMapper = objectMapper;
        this.modifyRepository = modifyRepository;
    }

    @SneakyThrows
    @Override
    public ModifySendMoneySearchReply searchPaymentForModify(SearchRequestDto dto, String counterId) {
        Optional<Modify> modify = getModifyByReferanceNumber(dto.getReferenceNumber());
        if (modify.isPresent()) {
            return objectMapper.readValue(modify.get().getData(), ModifySendMoneySearchReply.class);
        } else {
            ModifySendMoneySearchRequest request = createModifySendMoneySearchRequest(dto, counterId);
            ModifySendMoneySearchReply response = sendAndReceive(request, "ns2", "http://www.westernunion.com/schema/xrsi",
                    ModifySendMoneySearchReply.class);
            String date = objectMapper.writeValueAsString(response);
            saveModifyToDb(date, dto.getReferenceNumber());
            return response;
        }
    }

    @Override
    public ModifySendMoneyReply modifySendMoney(ModifyRequestDto dto) {
        ModifySendMoneySearchReply searchReply = getModifySearchReplyByReferanseNumber(dto.getDetails().getReferenceNumber());
        if (searchReply.getPaymentTransactions().getPaymentTransaction().isEmpty()) {
            throw new WesternUnionResponseFaultException("Payment transaction is empty!", "EMPTY transaction");
        }
        PaymentTransaction paymentTransaction = searchReply.getPaymentTransactions().getPaymentTransaction().get(0);

        ModifySendMoneyRequest modifyRequest = new ModifySendMoneyRequest();
        modifyRequest.setChannel(channel);
        modifyRequest.setSender(paymentTransaction.getSender());
        modifyRequest.setReceiver(modifyReceiverName(paymentTransaction.getReceiver(), dto));
        modifyRequest.setPaymentDetails(paymentTransaction.getPaymentDetails());
        modifyRequest.setFinancials(paymentTransaction.getFinancials());
        modifyRequest.setMtcn(paymentTransaction.getMtcn());
        modifyRequest.setNewMtcn(paymentTransaction.getNewMtcn());
        modifyRequest.setMoneyTransferKey(paymentTransaction.getMoneyTransferKey());
        modifyRequest.setForeignRemoteSystem(searchReply.getForeignRemoteSystem());
        modifyRequest.setConfirmedId("Y");
        return sendAndReceive(modifyRequest, "ns2", "http://www.westernunion.com/schema/xrsi",
                ModifySendMoneyReply.class);
    }

    private PaymentTransaction createPaymentTransaction(SearchRequestDto dto) {
        PaymentTransaction paymentTransaction = factory.createPaymentTransaction();
        PaymentDetails paymentDetails = factory.createPaymentDetails();
        paymentDetails.setOriginatingCountryCurrency(
                createCurrencyInfo(AZERBAIJAN_CODE, dto.getOriginatingCurrency().name())
        );
        paymentTransaction.setPaymentDetails(paymentDetails);
        paymentTransaction.setMtcn(dto.getMtcn());
        return paymentTransaction;
    }

    private Receiver modifyReceiverName(Receiver receiver, ModifyRequestDto dto) {
        GeneralName name = receiver.getName();
        if (name.getNameType() == NameType.C || name.getNameType() == NameType.D) {
            if (isTextExist(dto.getReceiverFirstname()))
                name.setFirstName(dto.getReceiverFirstname());
            if (isTextExist(dto.getReceiverLastname()))
                name.setLastName(dto.getReceiverLastname());
            if (isTextExist(dto.getReceiverMiddlename()))
                name.setMiddleName(dto.getReceiverMiddlename());
        } else if (name.getNameType() == NameType.M) {
            if (isTextExist(dto.getReceiverFirstname()))
                name.setGivenName(dto.getReceiverFirstname());
            if (isTextExist(dto.getReceiverLastname()))
                name.setPaternalName(dto.getReceiverLastname());
            if (isTextExist(dto.getReceiverMiddlename()))
                name.setMaternalName(dto.getReceiverMiddlename());
        }
        return receiver;
    }

    private boolean isTextExist(String text) {
        return text != null && !text.isEmpty();
    }

    private ModifySendMoneySearchRequest createModifySendMoneySearchRequest(SearchRequestDto dto, String counterId) {
        ModifySendMoneySearchRequest request = new ModifySendMoneySearchRequest();
        request.setChannel(channel);
        request.setForeignRemoteSystem(createForeignRemoteSystem(dto.getReferenceNumber(), counterId));
        request.setPaymentTransaction(createPaymentTransaction(dto));
        return request;
    }

    private void saveModifyToDb(String data, String referanceNumber) {
        Modify modify = Modify.builder()
                .data(data)
                .referanceNumber(referanceNumber)
                .build();
        modifyRepository.save(modify);
    }

    @SneakyThrows
    private ModifySendMoneySearchReply getModifySearchReplyByReferanseNumber(String referanceNumber) {
        Modify modify = getModifyByReferanceNumber(referanceNumber)
                .orElseThrow(ModifyTransactionResponseNotFound::new);
        modifyRepository.deleteById(modify.getId());
        return objectMapper.readValue(modify.getData(), ModifySendMoneySearchReply.class);
    }

    private Optional<Modify> getModifyByReferanceNumber(String referanceNumber) {
        return modifyRepository.findByReferanceNumberAndCreateDateIsAfter(referanceNumber, LocalDateTime.now().minusMinutes(30));
    }

}
