package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for send-money-validation-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="send-money-validation-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}store_request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="billing_details" type="{http://www.westernunion.com/schema/xrsi}billing_details" minOccurs="0"/>
 *         &lt;element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         &lt;element name="wallet_details" type="{http://www.westernunion.com/schema/xrsi}wallet_details" minOccurs="0"/>
 *         &lt;element name="emea_ii" type="{http://www.westernunion.com/schema/xrsi}emea_ii" minOccurs="0"/>
 *         &lt;element name="encompass_status" type="{http://www.westernunion.com/schema/xrsi}encompass_status" minOccurs="0"/>
 *         &lt;element name="encompass_reason_code" type="{http://www.westernunion.com/schema/xrsi}encompass_reason_code" minOccurs="0"/>
 *         &lt;element name="acs_verification_id" type="{http://www.westernunion.com/schema/xrsi}acs_verification_id" minOccurs="0"/>
 *         &lt;element name="electronic_commerce_indicator" type="{http://www.westernunion.com/schema/xrsi}electronic_commerce_indicator" minOccurs="0"/>
 *         &lt;element name="universal_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="stage_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="customer_affidavit_number" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit_number" minOccurs="0"/>
 *         &lt;element name="customer_affidavit" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit" minOccurs="0"/>
 *         &lt;element name="client_record_key" type="{http://www.westernunion.com/schema/xrsi}client_record_key" minOccurs="0"/>
 *         &lt;element name="fusion" type="{http://www.westernunion.com/schema/xrsi}fusion" minOccurs="0"/>
 *         &lt;element name="payer_fx_buffer" type="{http://www.westernunion.com/schema/xrsi}payer_fx_buffer" minOccurs="0"/>
 *         &lt;element name="cuba" type="{http://www.westernunion.com/schema/xrsi}cuba" minOccurs="0"/>
 *         &lt;element name="consumer_fraud_prompts" type="{http://www.westernunion.com/schema/xrsi}consumer_fraud_prompts" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="host_based_taxes" type="{http://www.westernunion.com/schema/xrsi}host_based_taxes" minOccurs="0"/>
 *         &lt;element name="visa_flag" type="{http://www.westernunion.com/schema/xrsi}visa_flag" minOccurs="0"/>
 *         &lt;element name="visa_number" type="{http://www.westernunion.com/schema/xrsi}visa_number" minOccurs="0"/>
 *         &lt;element name="visa_date" type="{http://www.westernunion.com/schema/xrsi}visa_date" minOccurs="0"/>
 *         &lt;element name="receiver_in_selected_method" type="{http://www.westernunion.com/schema/xrsi}receiver_in_selected_method" minOccurs="0"/>
 *         &lt;element name="delivery_service_tag" type="{http://www.westernunion.com/schema/xrsi}delivery_service_tag" minOccurs="0"/>
 *         &lt;element name="tax_id" type="{http://www.westernunion.com/schema/xrsi}tax_id" minOccurs="0"/>
 *         &lt;element name="partner_info_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_info_buffer" minOccurs="0"/>
 *         &lt;element name="mtcn_digest" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="GDPR_enabled" type="{http://www.westernunion.com/schema/xrsi}GDPR_enabled" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "send-money-validation-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "sender",
    "receiver",
    "paymentDetails",
    "financials",
    "deliveryServices",
    "promotions",
    "billingDetails",
    "bankDetails",
    "walletDetails",
    "emeaIi",
    "encompassStatus",
    "encompassReasonCode",
    "acsVerificationId",
    "electronicCommerceIndicator",
    "universalBuffer",
    "comments",
    "mtcn",
    "newMtcn",
    "stageMtcn",
    "customerAffidavitNumber",
    "customerAffidavit",
    "clientRecordKey",
    "fusion",
    "payerFxBuffer",
    "cuba",
    "consumerFraudPrompts",
    "foreignRemoteSystem",
    "hostBasedTaxes",
    "visaFlag",
    "visaNumber",
    "visaDate",
    "receiverInSelectedMethod",
    "deliveryServiceTag",
    "taxId",
    "partnerInfoBuffer",
    "mtcnDigest",
    "gdprEnabled"
})
@XmlRootElement(name = "send-money-validation-request")
public class SendMoneyValidationRequest
    extends StoreRequestTransactionBase
{

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected Financials financials;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    protected Promotions promotions;
    @XmlElement(name = "billing_details")
    protected BillingDetails billingDetails;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;
    @XmlElement(name = "emea_ii")
    protected EmeaIi emeaIi;
    @XmlElement(name = "encompass_status")
    protected String encompassStatus;
    @XmlElement(name = "encompass_reason_code")
    protected String encompassReasonCode;
    @XmlElement(name = "acs_verification_id")
    protected String acsVerificationId;
    @XmlElement(name = "electronic_commerce_indicator")
    protected String electronicCommerceIndicator;
    @XmlElement(name = "universal_buffer")
    protected String universalBuffer;
    protected String comments;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "stage_mtcn")
    protected String stageMtcn;
    @XmlElement(name = "customer_affidavit_number")
    protected String customerAffidavitNumber;
    @XmlElement(name = "customer_affidavit")
    protected String customerAffidavit;
    @XmlElement(name = "client_record_key")
    protected String clientRecordKey;
    protected Fusion fusion;
    @XmlElement(name = "payer_fx_buffer")
    protected PayerFxBuffer payerFxBuffer;
    protected Cuba cuba;
    @XmlElement(name = "consumer_fraud_prompts")
    protected ConsumerFraudPrompts consumerFraudPrompts;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "host_based_taxes")
    protected String hostBasedTaxes;
    @XmlElement(name = "visa_flag")
    protected String visaFlag;
    @XmlElement(name = "visa_number")
    protected String visaNumber;
    @XmlElement(name = "visa_date")
    protected String visaDate;
    @XmlElement(name = "receiver_in_selected_method")
    protected String receiverInSelectedMethod;
    @XmlElement(name = "delivery_service_tag")
    protected String deliveryServiceTag;
    @XmlElement(name = "tax_id")
    protected String taxId;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;
    @XmlElement(name = "mtcn_digest")
    protected String mtcnDigest;
    @XmlElement(name = "GDPR_enabled")
    @XmlSchemaType(name = "string")
    protected GDPREnabled gdprEnabled;

    /**
     * Gets the value of the swbFlaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwbFlaInfo }
     *     
     */
    public SwbFlaInfo getSwbFlaInfo() {
        return swbFlaInfo;
    }

    /**
     * Sets the value of the swbFlaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwbFlaInfo }
     *     
     */
    public void setSwbFlaInfo(SwbFlaInfo value) {
        this.swbFlaInfo = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the financials property.
     * 
     * @return
     *     possible object is
     *     {@link Financials }
     *     
     */
    public Financials getFinancials() {
        return financials;
    }

    /**
     * Sets the value of the financials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financials }
     *     
     */
    public void setFinancials(Financials value) {
        this.financials = value;
    }

    /**
     * Gets the value of the deliveryServices property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServices }
     *     
     */
    public DeliveryServices getDeliveryServices() {
        return deliveryServices;
    }

    /**
     * Sets the value of the deliveryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServices }
     *     
     */
    public void setDeliveryServices(DeliveryServices value) {
        this.deliveryServices = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetails }
     *     
     */
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetails }
     *     
     */
    public void setBillingDetails(BillingDetails value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BankDetails }
     *     
     */
    public BankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDetails }
     *     
     */
    public void setBankDetails(BankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the walletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WalletDetails }
     *     
     */
    public WalletDetails getWalletDetails() {
        return walletDetails;
    }

    /**
     * Sets the value of the walletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletDetails }
     *     
     */
    public void setWalletDetails(WalletDetails value) {
        this.walletDetails = value;
    }

    /**
     * Gets the value of the emeaIi property.
     * 
     * @return
     *     possible object is
     *     {@link EmeaIi }
     *     
     */
    public EmeaIi getEmeaIi() {
        return emeaIi;
    }

    /**
     * Sets the value of the emeaIi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmeaIi }
     *     
     */
    public void setEmeaIi(EmeaIi value) {
        this.emeaIi = value;
    }

    /**
     * Gets the value of the encompassStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncompassStatus() {
        return encompassStatus;
    }

    /**
     * Sets the value of the encompassStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncompassStatus(String value) {
        this.encompassStatus = value;
    }

    /**
     * Gets the value of the encompassReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncompassReasonCode() {
        return encompassReasonCode;
    }

    /**
     * Sets the value of the encompassReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncompassReasonCode(String value) {
        this.encompassReasonCode = value;
    }

    /**
     * Gets the value of the acsVerificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsVerificationId() {
        return acsVerificationId;
    }

    /**
     * Sets the value of the acsVerificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsVerificationId(String value) {
        this.acsVerificationId = value;
    }

    /**
     * Gets the value of the electronicCommerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicCommerceIndicator() {
        return electronicCommerceIndicator;
    }

    /**
     * Sets the value of the electronicCommerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicCommerceIndicator(String value) {
        this.electronicCommerceIndicator = value;
    }

    /**
     * Gets the value of the universalBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalBuffer() {
        return universalBuffer;
    }

    /**
     * Sets the value of the universalBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalBuffer(String value) {
        this.universalBuffer = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
    }

    /**
     * Gets the value of the newMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMtcn() {
        return newMtcn;
    }

    /**
     * Sets the value of the newMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMtcn(String value) {
        this.newMtcn = value;
    }

    /**
     * Gets the value of the stageMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageMtcn() {
        return stageMtcn;
    }

    /**
     * Sets the value of the stageMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageMtcn(String value) {
        this.stageMtcn = value;
    }

    /**
     * Gets the value of the customerAffidavitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAffidavitNumber() {
        return customerAffidavitNumber;
    }

    /**
     * Sets the value of the customerAffidavitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAffidavitNumber(String value) {
        this.customerAffidavitNumber = value;
    }

    /**
     * Gets the value of the customerAffidavit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAffidavit() {
        return customerAffidavit;
    }

    /**
     * Sets the value of the customerAffidavit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAffidavit(String value) {
        this.customerAffidavit = value;
    }

    /**
     * Gets the value of the clientRecordKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRecordKey() {
        return clientRecordKey;
    }

    /**
     * Sets the value of the clientRecordKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRecordKey(String value) {
        this.clientRecordKey = value;
    }

    /**
     * Gets the value of the fusion property.
     * 
     * @return
     *     possible object is
     *     {@link Fusion }
     *     
     */
    public Fusion getFusion() {
        return fusion;
    }

    /**
     * Sets the value of the fusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fusion }
     *     
     */
    public void setFusion(Fusion value) {
        this.fusion = value;
    }

    /**
     * Gets the value of the payerFxBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link PayerFxBuffer }
     *     
     */
    public PayerFxBuffer getPayerFxBuffer() {
        return payerFxBuffer;
    }

    /**
     * Sets the value of the payerFxBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerFxBuffer }
     *     
     */
    public void setPayerFxBuffer(PayerFxBuffer value) {
        this.payerFxBuffer = value;
    }

    /**
     * Gets the value of the cuba property.
     * 
     * @return
     *     possible object is
     *     {@link Cuba }
     *     
     */
    public Cuba getCuba() {
        return cuba;
    }

    /**
     * Sets the value of the cuba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cuba }
     *     
     */
    public void setCuba(Cuba value) {
        this.cuba = value;
    }

    /**
     * Gets the value of the consumerFraudPrompts property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerFraudPrompts }
     *     
     */
    public ConsumerFraudPrompts getConsumerFraudPrompts() {
        return consumerFraudPrompts;
    }

    /**
     * Sets the value of the consumerFraudPrompts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerFraudPrompts }
     *     
     */
    public void setConsumerFraudPrompts(ConsumerFraudPrompts value) {
        this.consumerFraudPrompts = value;
    }

    /**
     * Gets the value of the foreignRemoteSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public ForeignRemoteSystem getForeignRemoteSystem() {
        return foreignRemoteSystem;
    }

    /**
     * Sets the value of the foreignRemoteSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public void setForeignRemoteSystem(ForeignRemoteSystem value) {
        this.foreignRemoteSystem = value;
    }

    /**
     * Gets the value of the hostBasedTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBasedTaxes() {
        return hostBasedTaxes;
    }

    /**
     * Sets the value of the hostBasedTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBasedTaxes(String value) {
        this.hostBasedTaxes = value;
    }

    /**
     * Gets the value of the visaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaFlag() {
        return visaFlag;
    }

    /**
     * Sets the value of the visaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaFlag(String value) {
        this.visaFlag = value;
    }

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the visaDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaDate() {
        return visaDate;
    }

    /**
     * Sets the value of the visaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaDate(String value) {
        this.visaDate = value;
    }

    /**
     * Gets the value of the receiverInSelectedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInSelectedMethod() {
        return receiverInSelectedMethod;
    }

    /**
     * Sets the value of the receiverInSelectedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInSelectedMethod(String value) {
        this.receiverInSelectedMethod = value;
    }

    /**
     * Gets the value of the deliveryServiceTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceTag() {
        return deliveryServiceTag;
    }

    /**
     * Sets the value of the deliveryServiceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceTag(String value) {
        this.deliveryServiceTag = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the partnerInfoBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInfoBuffer }
     *     
     */
    public PartnerInfoBuffer getPartnerInfoBuffer() {
        return partnerInfoBuffer;
    }

    /**
     * Sets the value of the partnerInfoBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInfoBuffer }
     *     
     */
    public void setPartnerInfoBuffer(PartnerInfoBuffer value) {
        this.partnerInfoBuffer = value;
    }

    /**
     * Gets the value of the mtcnDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcnDigest() {
        return mtcnDigest;
    }

    /**
     * Sets the value of the mtcnDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcnDigest(String value) {
        this.mtcnDigest = value;
    }

    /**
     * Gets the value of the gdprEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link GDPREnabled }
     *     
     */
    public GDPREnabled getGDPREnabled() {
        return gdprEnabled;
    }

    /**
     * Sets the value of the gdprEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDPREnabled }
     *     
     */
    public void setGDPREnabled(GDPREnabled value) {
        this.gdprEnabled = value;
    }

}
