package az.unibank.wu.integration.service.impl;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.web.rest.errors.IllegalCustomerNameException;
import az.unibank.wu.integration.service.MoneyTransferUtils;
import az.unibank.wu.integration.service.SendMoneyService;
import az.unibank.wu.integration.service.dto.ComplianceDetailsDto;
import az.unibank.wu.integration.service.dto.FeeInquiryRequestDto;
import az.unibank.wu.integration.service.dto.SendMoneyValidationRequestDto;
import az.unibank.wu.integration.service.dto.SendStoreMoneyRequestDto;
import az.unibank.wu.integration.webservices.model.Address;
import az.unibank.wu.integration.webservices.model.BankDetails;
import az.unibank.wu.integration.webservices.model.ComplianceDetails;
import az.unibank.wu.integration.webservices.model.DeliveryServices;
import az.unibank.wu.integration.webservices.model.ExpectedPayoutLocation;
import az.unibank.wu.integration.webservices.model.FeeInquiryReply;
import az.unibank.wu.integration.webservices.model.FeeInquiryRequest;
import az.unibank.wu.integration.webservices.model.Financials;
import az.unibank.wu.integration.webservices.model.GeneralName;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.IdDetails;
import az.unibank.wu.integration.webservices.model.InstantNotification;
import az.unibank.wu.integration.webservices.model.InternationalPhoneNumber;
import az.unibank.wu.integration.webservices.model.MobilePhone;
import az.unibank.wu.integration.webservices.model.NameType;
import az.unibank.wu.integration.webservices.model.PaymentDetails;
import az.unibank.wu.integration.webservices.model.PaymentType;
import az.unibank.wu.integration.webservices.model.Promotions;
import az.unibank.wu.integration.webservices.model.SendMoneyStoreReply;
import az.unibank.wu.integration.webservices.model.SendMoneyStoreRequest;
import az.unibank.wu.integration.webservices.model.SendMoneyValidationReply;
import az.unibank.wu.integration.webservices.model.SendMoneyValidationRequest;
import az.unibank.wu.integration.webservices.model.Sender;
import az.unibank.wu.integration.webservices.model.TransactionType;
import az.unibank.wu.integration.webservices.model.YesNo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Arrays;
import java.util.Objects;

@Slf4j
@Service
public class SendMoneyServiceImpl extends MoneyTransferUtils implements SendMoneyService {

    private static final String[] ARMENIAN_NAME_PREFIXES = new String[]{"yan", "ian", "jan", "nc", "nts",
            "ntz", "yanc", "yants", "yanz", "ianc",
            "iants", "iantz", "janc", "jants", "janz"};

    public SendMoneyServiceImpl(@Qualifier("springWebServiceTemplate") WebServiceTemplate webServiceTemplate,
                                ApplicationProperties properties) {
        super(webServiceTemplate, properties);
    }

    @Override
    public FeeInquiryReply sendFeeInquiryRequest(FeeInquiryRequestDto dto, String counterId) {
        FeeInquiryRequest request = new FeeInquiryRequest();
        request.setDevice(createDevice(GwpGbsDeviceType.MOBILE));
        request.setChannel(channel);

        Financials financials = factory.createFinancials();
        financials.setOriginatorsPrincipalAmount(dto.getAmount());
        request.setFinancials(financials);

        request.setPaymentDetails(createPaymentDetails(dto));
        request.setDeliveryServices(createDeliveryServices(dto.getDeliveryServiceCode(),
                dto.getRoutingCode()));
        request.setForeignRemoteSystem(createForeignRemoteSystem(dto.getReferenceNumber(), counterId));
        request.setPromotions(createPromotion(dto.getPromoCode()));

        return sendAndReceive(request, "xrsi", null, FeeInquiryReply.class);
    }

    @Override
    public SendMoneyValidationReply sendMoneyValidation(SendMoneyValidationRequestDto dto, String counterId) {
        if (isIllegalCustomerName(dto.getReceiver().getName()))
            throw new IllegalCustomerNameException();
        SendMoneyValidationRequest validationRequest = createSendMonyValidationRequest(dto, counterId);
        return sendAndReceive(validationRequest, "ns2", "http://www.westernunion.com/schema/xrsi",
                SendMoneyValidationReply.class);
    }

    @Override
    public SendMoneyStoreReply sendMoneyStore(SendStoreMoneyRequestDto dto, String counterId) {
        SendMoneyStoreRequest storeRequest = new SendMoneyStoreRequest();
        storeRequest.setDevice(createDevice(GwpGbsDeviceType.MOBILE));
        storeRequest.setChannel(channel);
        storeRequest.setInstantNotification(createInstantNotification(dto));
        storeRequest.setReceiver(dto.getReceiver());
        storeRequest.setSender(createSender(dto));
        storeRequest.setPaymentDetails(dto.getValidationPaymentDetails());
        storeRequest.setFinancials(dto.getFinancials());
        storeRequest.setDeliveryServices(createDeliveryServices(dto.getPaymentDetails().getDeliveryServiceCode(),
                dto.getPaymentDetails().getRoutingCode()));
        storeRequest.setForeignRemoteSystem(createForeignRemoteSystem(dto.getPaymentDetails().getReferenceNumber(), counterId));
        storeRequest.setMtcn(dto.getMtcn());
        storeRequest.setNewMtcn(dto.getNewMtcn());
        storeRequest.setPromotions(dto.getPromotions());
        return sendAndReceive(storeRequest, "xrsi", "http://www.westernunion.com/schema/xrsi",
                SendMoneyStoreReply.class);
    }

    private InstantNotification createInstantNotification(SendStoreMoneyRequestDto dto) {
        InstantNotification notification = factory.createInstantNotification();
        notification.setAddlServiceCharges(dto.getAddlServiceCharges());
        return notification;
    }

    private PaymentDetails createPaymentDetails(FeeInquiryRequestDto dto) {
        PaymentDetails details = factory.createPaymentDetails();
        details.setExpectedPayoutLocation(createExpectedPayoutLocation(dto));
        details.setRecordingCountryCurrency(createCurrencyInfo(AZERBAIJAN_CODE, dto.getOriginatingCurrency().name()));
        details.setDestinationCountryCurrency(
                createCurrencyInfo(dto.getDestinationCountryCode(), dto.getDestinationCurrency()));
        details.setOriginatingCountryCurrency(createCurrencyInfo(AZERBAIJAN_CODE, dto.getOriginatingCurrency().name()));
        details.setTransactionType(TransactionType.WMN);
        details.setPaymentType(PaymentType.CASH);
        details.setFixOnSend(YesNo.N);
        return details;
    }

    private ExpectedPayoutLocation createExpectedPayoutLocation(FeeInquiryRequestDto dto) {
        ExpectedPayoutLocation payoutLocation = null;
        if (dto.getStateCode() != null && !dto.getStateCode().isEmpty()) {
            payoutLocation = factory.createExpectedPayoutLocation();
            payoutLocation.setStateCode(dto.getStateCode());
            if (dto.getCity() != null && !dto.getCity().isEmpty())
                payoutLocation.setCity(dto.getCity());
        }
        return payoutLocation;
    }

    private DeliveryServices createDeliveryServices(String serviceCode, String routingCode) {
        DeliveryServices deliveryServices = factory.createDeliveryServices();
        if (serviceCode == null || serviceCode.isEmpty())
            deliveryServices.setCode("000");
        else
            deliveryServices.setCode(serviceCode);
        deliveryServices.setRoutingCode(routingCode);
        return deliveryServices;
    }

    private Promotions createPromotion(String couponCode) {
        if (couponCode == null || couponCode.isEmpty()) {
            return null;
        }
        Promotions promotions = factory.createPromotions();
        promotions.setCouponsPromotions(couponCode);
        return promotions;
    }

    private Sender createSender(SendMoneyValidationRequestDto dto) {
        Sender sender = factory.createSender();
        sender.setName(
                createGeneralName(
                        dto.getSender().getFirstName(),
                        dto.getSender().getLastName()));
        sender.setAddress(createAddress(dto));
        sender.setComplianceDetails(
                createComplianceDetails(
                        dto.getSender().getComplianceDetails())
        );
        sender.setContactPhone(
                dto.getSender().getPhoneCountryCode() + dto.getSender().getPhoneNumber());
        sender.setMobilePhone(createMobilePhone(dto));
        sender.setBankDetails(createBankDetails(dto));
        return sender;
    }

    private BankDetails createBankDetails(SendMoneyValidationRequestDto dto) {
        BankDetails bankDetails = factory.createBankDetails();
        bankDetails.setAccountNumber(dto.getSender().getAccountNumber());
        bankDetails.setRoutingNumber(dto.getSender().getRoutingNumber());
        return bankDetails;
    }

    private GeneralName createGeneralName(String firstName, String lastName) {
        GeneralName generalName = factory.createGeneralName();
        generalName.setNameType(NameType.D);
        generalName.setFirstName(firstName);
        generalName.setLastName(lastName);
        return generalName;
    }

    private Address createAddress(SendMoneyValidationRequestDto dto) {
        Address address = factory.createAddress();
        address.setAddrLine1(dto.getSender().getAddressLine1());
        address.setAddrLine2(dto.getSender().getAddressLine2());
        address.setCity(dto.getSender().getCity());
        address.setPostalCode(dto.getSender().getPostalCode());
        address.setCountryCode(createAzerbaijanCurrencyInfo());
        return address;
    }

    private ComplianceDetails createComplianceDetails(ComplianceDetailsDto detailsDto) {
        ComplianceDetails complianceDetails = factory.createComplianceDetails();
        complianceDetails.setTemplateId("INT_06_S");
        complianceDetails.setIdIssueDate(detailsDto.getIdIssueDate() == null ?
                null : detailsDto.getIdIssueDate().format(formatter));
        complianceDetails.setIdExpirationDate(detailsDto.getIdExpirationDate() ==
                null ? null : detailsDto.getIdExpirationDate().format(formatter));
        complianceDetails.setDateOfBirth(detailsDto.getDateOfBirth() ==
                null ? null : detailsDto.getDateOfBirth().format(formatter));
        complianceDetails.setCountryOfBirth(detailsDto.getCountryOfBirth());
        complianceDetails.setDoesTheIDHaveAnExpirationDate(detailsDto.getDoesTheIdHaveAnExpirationDate());
        complianceDetails.setDoesTheSenderHaveID(detailsDto.getDoesTheSenderHaveID());
        complianceDetails.setAckFlag("Y");
        complianceDetails.setIdDetails(createIdDetails(detailsDto));
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

    private MobilePhone createMobilePhone(SendMoneyValidationRequestDto dto) {
        MobilePhone mobilePhone = factory.createMobilePhone();
        InternationalPhoneNumber internationalPhoneNumber = factory.createInternationalPhoneNumber();
        internationalPhoneNumber.setCountryCode(dto.getSender().getPhoneCountryCode());
        internationalPhoneNumber.setNationalNumber(dto.getSender().getPhoneNumber());
        mobilePhone.setPhoneNumber(internationalPhoneNumber);
        return mobilePhone;
    }

    private SendMoneyValidationRequest createSendMonyValidationRequest(SendMoneyValidationRequestDto dto, String counterId) {
        SendMoneyValidationRequest validationRequest = new SendMoneyValidationRequest();
        validationRequest.setDevice(createDevice(GwpGbsDeviceType.MOBILE));
        validationRequest.setChannel(channel);
        validationRequest.setSender(createSender(dto));
        validationRequest.setReceiver(dto.getReceiver());
        validationRequest.setPaymentDetails(createPaymentDetails(dto.getPaymentDetails()));
        validationRequest.setFinancials(dto.getFinancials());
        validationRequest.setDeliveryServices(createDeliveryServices(dto.getPaymentDetails().getDeliveryServiceCode(),
                dto.getPaymentDetails().getRoutingCode()));
        validationRequest.setForeignRemoteSystem(createForeignRemoteSystem(dto.getPaymentDetails().getReferenceNumber(), counterId));
        validationRequest.setPromotions(createPromotion(dto.getPaymentDetails().getPromoCode()));
        return validationRequest;
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

}
