package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.web.rest.errors.IllegalCustomerNameException;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.ReceiveMoneyService;
import az.unibank.wu.integration.service.dto.ComplianceDetailsDto;
import az.unibank.wu.integration.service.dto.ReceiveMoneyPayRequestDto;
import az.unibank.wu.integration.service.dto.ReceiverDto;
import az.unibank.wu.integration.service.dto.SearchReceiveMoneyDto;
import az.unibank.wu.integration.webservices.model.Address;
import az.unibank.wu.integration.webservices.model.BankDetails;
import az.unibank.wu.integration.webservices.model.ComplianceAddress;
import az.unibank.wu.integration.webservices.model.ComplianceDetails;
import az.unibank.wu.integration.webservices.model.GeneralName;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.IdDetails;
import az.unibank.wu.integration.webservices.model.InternationalPhoneNumber;
import az.unibank.wu.integration.webservices.model.MobilePhone;
import az.unibank.wu.integration.webservices.model.PayOrDoNotPayIndicator;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.PaymentTransaction;
import az.unibank.wu.integration.webservices.model.ReceiveMoneyPayReply;
import az.unibank.wu.integration.webservices.model.ReceiveMoneyPayRequest;
import az.unibank.wu.integration.webservices.model.ReceiveMoneySearchReply;
import az.unibank.wu.integration.webservices.model.ReceiveMoneySearchRequest;
import az.unibank.wu.integration.webservices.model.Receiver;
import az.unibank.wu.integration.webservices.model.YesNoFlag;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ReceiveMoneyServiceImpl extends MoneyTransferUtils implements ReceiveMoneyService {

    private static final String[] ARMENIAN_NAME_PREFIXES = new String[]{"yan", "ian", "jan", "nc", "nts",
            "ntz", "yanc", "yants", "yanz", "ianc",
            "iants", "iantz", "janc", "jants", "janz"};


    public ReceiveMoneyServiceImpl(WebServiceTemplate webServiceTemplate,
                                   ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }

    @Override
    public ReceiveMoneySearchReply searchReceiveMoney(SearchReceiveMoneyDto searchDto, String counterId) {
        ReceiveMoneySearchRequest searchRequest = createReceiveMoneySearchRequest(searchDto, counterId);
        ReceiveMoneySearchReply searchReply = sendAndReceive(searchRequest, "ns2", "http://www.westernunion.com/schema/xrsi", ReceiveMoneySearchReply.class);
        List<PaymentTransaction> transactions = searchReply
                .getPaymentTransactions()
                .getPaymentTransaction()
                .stream()
                .filter(transaction -> !isIllegalCustomerName(transaction.getSender().getName()))
                .collect(Collectors.toList());
        if (transactions.isEmpty())
            throw new IllegalCustomerNameException();
        return searchReply;
    }

    private ReceiveMoneySearchRequest createReceiveMoneySearchRequest(SearchReceiveMoneyDto searchDto, String counterId) {
        ReceiveMoneySearchRequest searchRequest = new ReceiveMoneySearchRequest();
        searchRequest.setDevice(createDevice(GwpGbsDeviceType.MOBILE));
        searchRequest.setChannel(channel);
        searchRequest.setForeignRemoteSystem(createForeignRemoteSystem(searchDto.getReferenceNumber(), counterId));
        searchRequest.setPaymentTransaction(createPaymentTransaction(searchDto));
        return searchRequest;
    }

    @Override
    public ReceiveMoneyPayReply payReceiveMoney(ReceiveMoneyPayRequestDto payDto, String counterId) {
        ReceiveMoneyPayRequest receivePayRequest = createReceiveMoneyRequest(payDto, counterId);
        return sendAndReceive(receivePayRequest, "ns2", "http://www.westernunion.com/schema/xrsi", ReceiveMoneyPayReply.class);
    }

    private ReceiveMoneyPayRequest createReceiveMoneyRequest(ReceiveMoneyPayRequestDto payDto, String counterId) {
        ReceiveMoneyPayRequest receivePayRequest = new ReceiveMoneyPayRequest();
        receivePayRequest.setDevice(createDevice(GwpGbsDeviceType.MOBILE));
        receivePayRequest.setChannel(channel);
        receivePayRequest.setForeignRemoteSystem(createForeignRemoteSystem(payDto.getReferenceNumber(), counterId));
        receivePayRequest.setFinancials(payDto.getFinancials());
        receivePayRequest.setPaymentDetails(payDto.getPaymentDetails());
        receivePayRequest.setReceiver(createReceiver(payDto.getReceiver()));
        receivePayRequest.setMtcn(payDto.getMtcn());
        receivePayRequest.setNewMtcn(payDto.getNewMtcn());
        receivePayRequest.setMoneyTransferKey(payDto.getMoneyTransferKey());
        receivePayRequest.setPayOrDoNotPayIndicator(PayOrDoNotPayIndicator.PAY);
        return receivePayRequest;
    }

    private boolean isIllegalCustomerName(GeneralName generalName) {
        return Arrays.stream(ARMENIAN_NAME_PREFIXES)
                .anyMatch(prefix -> isNameEndWith(generalName.getFirstName(), prefix)
                        || isNameEndWith(generalName.getLastName(), prefix)
                        || isNameEndWith(generalName.getMiddleName(), prefix)
                        || isNameEndWith(generalName.getMaternalName(), prefix)
                        || isNameEndWith(generalName.getPaternalName(), prefix)
                        || isNameEndWith(generalName.getGivenName(), prefix));
    }

    private boolean isNameEndWith(String name, String prefix) {
        return Objects.nonNull(name) && name.toLowerCase().endsWith(prefix.toLowerCase());
    }

    public Receiver createReceiver(ReceiverDto dto) {
        Receiver receiver = factory.createReceiver();
        receiver.setName(dto.getName());
        receiver.setAddress(createAddress(dto));
        receiver.setComplianceDetails(
                createComplianceDetails(dto));
        receiver.setContactPhone(
                dto.getPhoneCountryCode() + dto.getPhoneNumber());
        receiver.setMobilePhone(createMobilePhone(dto));
        receiver.setBankDetails(createBankDetails(dto));
        return receiver;
    }

    private Address createAddress(ReceiverDto dto) {
        Address address = factory.createAddress();
        address.setAddrLine1(dto.getAddressLine1());
        address.setAddrLine2(dto.getAddressLine2());
        address.setCity(dto.getCity());
        address.setPostalCode(dto.getPostalCode());
        address.setCountryCode(createAzerbaijanCurrencyInfo());
        return address;
    }

    private ComplianceDetails createComplianceDetails(ReceiverDto receiverDto) {
        ComplianceDetails complianceDetails = factory.createComplianceDetails();
        complianceDetails.setTemplateId("INT_06_P");
        complianceDetails.setIdIssueDate(receiverDto.getComplianceDetails().getIdIssueDate() == null ?
                null : receiverDto.getComplianceDetails().getIdIssueDate().format(formatter));
        complianceDetails.setIdExpirationDate(receiverDto.getComplianceDetails().getIdExpirationDate() ==
                null ? null : receiverDto.getComplianceDetails().getIdExpirationDate().format(formatter));
        complianceDetails.setDateOfBirth(receiverDto.getComplianceDetails().getDateOfBirth() ==
                null ? null : receiverDto.getComplianceDetails().getDateOfBirth().format(formatter));
        complianceDetails.setCurrentAddress(createComplianceAddress(receiverDto));
        complianceDetails.setCountryOfBirth(receiverDto.getComplianceDetails().getCountryOfBirth());
        complianceDetails.setIsAResident(receiverDto.getIsaResident());
        complianceDetails.setDoesTheIDHaveAnExpirationDate(receiverDto.getComplianceDetails().getDoesTheIdHaveAnExpirationDate());
        if (Objects.isNull(receiverDto.getPhoneNumber()) || receiverDto.getPhoneNumber().isEmpty())
            complianceDetails.setDoesReceiverHaveAPhoneNumber(YesNoFlag.N);
        else {
            complianceDetails.setDoesReceiverHaveAPhoneNumber(YesNoFlag.Y);
            complianceDetails.setContactPhone(receiverDto.getPhoneNumber());
        }
        complianceDetails.setAckFlag("X");
        complianceDetails.setIdDetails(createIdDetails(receiverDto.getComplianceDetails()));
        return complianceDetails;
    }

    private IdDetails createIdDetails(ComplianceDetailsDto detailsDto) {
        IdDetails idDetails = factory.createIdDetails();
        idDetails.setIdType(detailsDto.getIdType().getCode());
        idDetails.setIdCountryOfIssue(detailsDto.getIdCountryOfIssue());
        idDetails.setIdPlaceOfIssue(detailsDto.getIdPlaceOfIssue());
        idDetails.setIdNumber(detailsDto.getIdNumber());
        return idDetails;
    }

    private ComplianceAddress createComplianceAddress(ReceiverDto receiverDto) {
        ComplianceAddress complianceAddress = factory.createComplianceAddress();
        complianceAddress.setAddrLine1(receiverDto.getAddressLine1());
        complianceAddress.setCity(receiverDto.getCity());
        complianceAddress.setPostalCode(receiverDto.getPostalCode());
        complianceAddress.setCountry(AZERBAIJAN_NAME);
        return complianceAddress;
    }

    private MobilePhone createMobilePhone(ReceiverDto dto) {
        MobilePhone mobilePhone = factory.createMobilePhone();
        InternationalPhoneNumber internationalPhoneNumber = factory.createInternationalPhoneNumber();
        internationalPhoneNumber.setCountryCode(dto.getPhoneCountryCode());
        internationalPhoneNumber.setNationalNumber(dto.getPhoneNumber());
        mobilePhone.setPhoneNumber(internationalPhoneNumber);
        return mobilePhone;
    }

    private BankDetails createBankDetails(ReceiverDto dto) {
        BankDetails bankDetails = factory.createBankDetails();
        bankDetails.setAccountNumber(dto.getAccountNumber());
        bankDetails.setRoutingNumber(dto.getRoutingNumber());
        return bankDetails;
    }

    private PaymentTransaction createPaymentTransaction(SearchReceiveMoneyDto dto) {
        PaymentTransaction paymentTransaction = factory.createPaymentTransaction();
        PaymentDetails paymentDetails = factory.createPaymentDetails();
        paymentDetails.setDestinationCountryCurrency(createCurrencyInfo(AZERBAIJAN_CODE, dto.getCurrency().name()));
        paymentTransaction.setPaymentDetails(paymentDetails);
        paymentTransaction.setMtcn(dto.getMtcn());
        return paymentTransaction;
    }

}
