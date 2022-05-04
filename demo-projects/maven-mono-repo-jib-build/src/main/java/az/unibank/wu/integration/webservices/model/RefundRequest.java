
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refund-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refund-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}store_request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         &lt;element name="billing_details" type="{http://www.westernunion.com/schema/xrsi}billing_details" minOccurs="0"/>
 *         &lt;element name="emea_ii" type="{http://www.westernunion.com/schema/xrsi}emea_ii" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="recording_account_number" type="{http://www.westernunion.com/schema/xrsi}recording_account_number" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="link_share" type="{http://www.westernunion.com/schema/xrsi}link_share" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="ccscan_transaction_id" type="{http://www.westernunion.com/schema/xrsi}ccscan_transaction_id" minOccurs="0"/>
 *         &lt;element name="encompass_status" type="{http://www.westernunion.com/schema/xrsi}encompass_status" minOccurs="0"/>
 *         &lt;element name="encompass_reason_code" type="{http://www.westernunion.com/schema/xrsi}encompass_reason_code" minOccurs="0"/>
 *         &lt;element name="address_validation" type="{http://www.westernunion.com/schema/xrsi}address_validation" minOccurs="0"/>
 *         &lt;element name="universal_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         &lt;element name="cancel_reason" type="{http://www.westernunion.com/schema/xrsi}cancel_reason" minOccurs="0"/>
 *         &lt;element name="corr_error_queue_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="queue_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="money_transfer_key" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         &lt;element name="yellow_phone_label" type="{http://www.westernunion.com/schema/xrsi}yellow_phone_lable" minOccurs="0"/>
 *         &lt;element name="auto_refile_buffer" type="{http://www.westernunion.com/schema/xrsi}auto_refile_buffer" minOccurs="0"/>
 *         &lt;element name="unisys_customer_id" type="{http://www.westernunion.com/schema/xrsi}unisys_customer_id" minOccurs="0"/>
 *         &lt;element name="ips_authorization_code" type="{http://www.westernunion.com/schema/xrsi}ips_authorization_code" minOccurs="0"/>
 *         &lt;element name="first_tmt_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="fixed_flag" type="{http://www.westernunion.com/schema/xrsi}fixed_flag" minOccurs="0"/>
 *         &lt;element name="mocc_comments" type="{http://www.westernunion.com/schema/xrsi}comments" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="customer_acc_no" type="{http://www.westernunion.com/schema/xrsi}TCustomerCreditAccountNumberQQC" minOccurs="0"/>
 *         &lt;element name="csc_caution_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="current_fx" type="{http://www.westernunion.com/schema/xrsi}current_fx" minOccurs="0"/>
 *         &lt;element name="add_message" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         &lt;element name="third_party_option" type="{http://www.westernunion.com/schema/xrsi}third_party_option" minOccurs="0"/>
 *         &lt;element name="encrypted_pin" type="{http://www.westernunion.com/schema/xrsi}encrypted_pin" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="duplicate_mtcn_override_flag" type="{http://www.westernunion.com/schema/xrsi}duplicate_mtcn_override_flag" minOccurs="0"/>
 *         &lt;element name="debit_timeout_resend" type="{http://www.westernunion.com/schema/xrsi}debit_timeout_resend" minOccurs="0"/>
 *         &lt;element name="arizona_operator" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         &lt;element name="track_data" type="{http://www.westernunion.com/schema/xrsi}track_data" minOccurs="0"/>
 *         &lt;element name="security_code" type="{http://www.westernunion.com/schema/xrsi}social_security_no" minOccurs="0"/>
 *         &lt;element name="customer_affidavit_number" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit_number" minOccurs="0"/>
 *         &lt;element name="customer_affidavit" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit" minOccurs="0"/>
 *         &lt;element name="client_record_key" type="{http://www.westernunion.com/schema/xrsi}client_record_key" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="visa_flag" type="{http://www.westernunion.com/schema/xrsi}visa_flag" minOccurs="0"/>
 *         &lt;element name="visa_number" type="{http://www.westernunion.com/schema/xrsi}visa_number" minOccurs="0"/>
 *         &lt;element name="visa_date" type="{http://www.westernunion.com/schema/xrsi}visa_date" minOccurs="0"/>
 *         &lt;element name="TKeySerialNumber" type="{http://www.westernunion.com/schema/xrsi}TKeySerialNumber" minOccurs="0"/>
 *         &lt;element name="third_party_flag_send" type="{http://www.westernunion.com/schema/xrsi}third_party_flag_send" minOccurs="0"/>
 *         &lt;element name="address_verification_document" type="{http://www.westernunion.com/schema/xrsi}address_verification_document" minOccurs="0"/>
 *         &lt;element name="refund_cancel_flag" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="partner_info_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_info_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "sender",
    "receiver",
    "bankDetails",
    "billingDetails",
    "emeaIi",
    "promotions",
    "paymentDetails",
    "recordingAccountNumber",
    "financials",
    "deliveryServices",
    "linkShare",
    "mtcn",
    "newMtcn",
    "ccscanTransactionId",
    "encompassStatus",
    "encompassReasonCode",
    "addressValidation",
    "universalBuffer",
    "comments",
    "cancelReason",
    "corrErrorQueueFlag",
    "queueFlag",
    "moneyTransferKey",
    "yellowPhoneLabel",
    "autoRefileBuffer",
    "unisysCustomerId",
    "ipsAuthorizationCode",
    "firstTmtFlag",
    "fixedFlag",
    "moccComments",
    "customerAccNo",
    "cscCautionFlag",
    "currentFx",
    "addMessage",
    "thirdPartyOption",
    "encryptedPin",
    "location",
    "duplicateMtcnOverrideFlag",
    "debitTimeoutResend",
    "arizonaOperator",
    "trackData",
    "securityCode",
    "customerAffidavitNumber",
    "customerAffidavit",
    "clientRecordKey",
    "foreignRemoteSystem",
    "visaFlag",
    "visaNumber",
    "visaDate",
    "tKeySerialNumber",
    "thirdPartyFlagSend",
    "addressVerificationDocument",
    "refundCancelFlag",
    "partnerInfoBuffer"
})
@XmlRootElement(name = "refund-request")
public class RefundRequest
    extends StoreRequestTransactionBase
{

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "billing_details")
    protected BillingDetails billingDetails;
    @XmlElement(name = "emea_ii")
    protected EmeaIi emeaIi;
    protected Promotions promotions;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "recording_account_number")
    protected String recordingAccountNumber;
    protected Financials financials;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "link_share")
    protected String linkShare;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "ccscan_transaction_id")
    protected String ccscanTransactionId;
    @XmlElement(name = "encompass_status")
    protected String encompassStatus;
    @XmlElement(name = "encompass_reason_code")
    protected String encompassReasonCode;
    @XmlList
    @XmlElement(name = "address_validation")
    protected List<String> addressValidation;
    @XmlElement(name = "universal_buffer")
    protected String universalBuffer;
    protected String comments;
    @XmlElement(name = "cancel_reason")
    protected String cancelReason;
    @XmlElement(name = "corr_error_queue_flag")
    @XmlSchemaType(name = "string")
    protected YesNo corrErrorQueueFlag;
    @XmlElement(name = "queue_flag")
    @XmlSchemaType(name = "string")
    protected YesNo queueFlag;
    @XmlElement(name = "money_transfer_key")
    protected String moneyTransferKey;
    @XmlElement(name = "yellow_phone_label")
    protected String yellowPhoneLabel;
    @XmlElement(name = "auto_refile_buffer")
    protected AutoRefileBuffer autoRefileBuffer;
    @XmlElement(name = "unisys_customer_id")
    protected String unisysCustomerId;
    @XmlElement(name = "ips_authorization_code")
    protected String ipsAuthorizationCode;
    @XmlElement(name = "first_tmt_flag")
    @XmlSchemaType(name = "string")
    protected YesNo firstTmtFlag;
    @XmlElement(name = "fixed_flag")
    protected String fixedFlag;
    @XmlElement(name = "mocc_comments")
    protected List<String> moccComments;
    @XmlElement(name = "customer_acc_no")
    protected String customerAccNo;
    @XmlElement(name = "csc_caution_flag")
    @XmlSchemaType(name = "string")
    protected YesNo cscCautionFlag;
    @XmlElement(name = "current_fx")
    protected String currentFx;
    @XmlElement(name = "add_message")
    protected String addMessage;
    @XmlElement(name = "third_party_option")
    protected String thirdPartyOption;
    @XmlElement(name = "encrypted_pin")
    protected String encryptedPin;
    protected String location;
    @XmlElement(name = "duplicate_mtcn_override_flag")
    protected String duplicateMtcnOverrideFlag;
    @XmlElement(name = "debit_timeout_resend")
    protected String debitTimeoutResend;
    @XmlElement(name = "arizona_operator")
    protected GeneralName arizonaOperator;
    @XmlElement(name = "track_data")
    protected String trackData;
    @XmlElement(name = "security_code")
    protected String securityCode;
    @XmlElement(name = "customer_affidavit_number")
    protected String customerAffidavitNumber;
    @XmlElement(name = "customer_affidavit")
    protected String customerAffidavit;
    @XmlElement(name = "client_record_key")
    protected String clientRecordKey;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "visa_flag")
    protected String visaFlag;
    @XmlElement(name = "visa_number")
    protected String visaNumber;
    @XmlElement(name = "visa_date")
    protected String visaDate;
    @XmlElement(name = "TKeySerialNumber")
    protected String tKeySerialNumber;
    @XmlElement(name = "third_party_flag_send")
    protected String thirdPartyFlagSend;
    @XmlElement(name = "address_verification_document")
    protected String addressVerificationDocument;
    @XmlElement(name = "refund_cancel_flag")
    protected String refundCancelFlag;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;

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
     * Gets the value of the recordingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingAccountNumber() {
        return recordingAccountNumber;
    }

    /**
     * Sets the value of the recordingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingAccountNumber(String value) {
        this.recordingAccountNumber = value;
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
     * Gets the value of the linkShare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkShare() {
        return linkShare;
    }

    /**
     * Sets the value of the linkShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkShare(String value) {
        this.linkShare = value;
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
     * Gets the value of the ccscanTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcscanTransactionId() {
        return ccscanTransactionId;
    }

    /**
     * Sets the value of the ccscanTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcscanTransactionId(String value) {
        this.ccscanTransactionId = value;
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
     * Gets the value of the addressValidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressValidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressValidation() {
        if (addressValidation == null) {
            addressValidation = new ArrayList<String>();
        }
        return this.addressValidation;
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
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the corrErrorQueueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCorrErrorQueueFlag() {
        return corrErrorQueueFlag;
    }

    /**
     * Sets the value of the corrErrorQueueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCorrErrorQueueFlag(YesNo value) {
        this.corrErrorQueueFlag = value;
    }

    /**
     * Gets the value of the queueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getQueueFlag() {
        return queueFlag;
    }

    /**
     * Sets the value of the queueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setQueueFlag(YesNo value) {
        this.queueFlag = value;
    }

    /**
     * Gets the value of the moneyTransferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyTransferKey() {
        return moneyTransferKey;
    }

    /**
     * Sets the value of the moneyTransferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyTransferKey(String value) {
        this.moneyTransferKey = value;
    }

    /**
     * Gets the value of the yellowPhoneLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellowPhoneLabel() {
        return yellowPhoneLabel;
    }

    /**
     * Sets the value of the yellowPhoneLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowPhoneLabel(String value) {
        this.yellowPhoneLabel = value;
    }

    /**
     * Gets the value of the autoRefileBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRefileBuffer }
     *     
     */
    public AutoRefileBuffer getAutoRefileBuffer() {
        return autoRefileBuffer;
    }

    /**
     * Sets the value of the autoRefileBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRefileBuffer }
     *     
     */
    public void setAutoRefileBuffer(AutoRefileBuffer value) {
        this.autoRefileBuffer = value;
    }

    /**
     * Gets the value of the unisysCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnisysCustomerId() {
        return unisysCustomerId;
    }

    /**
     * Sets the value of the unisysCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnisysCustomerId(String value) {
        this.unisysCustomerId = value;
    }

    /**
     * Gets the value of the ipsAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsAuthorizationCode() {
        return ipsAuthorizationCode;
    }

    /**
     * Sets the value of the ipsAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsAuthorizationCode(String value) {
        this.ipsAuthorizationCode = value;
    }

    /**
     * Gets the value of the firstTmtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getFirstTmtFlag() {
        return firstTmtFlag;
    }

    /**
     * Sets the value of the firstTmtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setFirstTmtFlag(YesNo value) {
        this.firstTmtFlag = value;
    }

    /**
     * Gets the value of the fixedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedFlag() {
        return fixedFlag;
    }

    /**
     * Sets the value of the fixedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedFlag(String value) {
        this.fixedFlag = value;
    }

    /**
     * Gets the value of the moccComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moccComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoccComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoccComments() {
        if (moccComments == null) {
            moccComments = new ArrayList<String>();
        }
        return this.moccComments;
    }

    /**
     * Gets the value of the customerAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccNo() {
        return customerAccNo;
    }

    /**
     * Sets the value of the customerAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccNo(String value) {
        this.customerAccNo = value;
    }

    /**
     * Gets the value of the cscCautionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCscCautionFlag() {
        return cscCautionFlag;
    }

    /**
     * Sets the value of the cscCautionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCscCautionFlag(YesNo value) {
        this.cscCautionFlag = value;
    }

    /**
     * Gets the value of the currentFx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFx() {
        return currentFx;
    }

    /**
     * Sets the value of the currentFx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFx(String value) {
        this.currentFx = value;
    }

    /**
     * Gets the value of the addMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddMessage() {
        return addMessage;
    }

    /**
     * Sets the value of the addMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddMessage(String value) {
        this.addMessage = value;
    }

    /**
     * Gets the value of the thirdPartyOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyOption() {
        return thirdPartyOption;
    }

    /**
     * Sets the value of the thirdPartyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyOption(String value) {
        this.thirdPartyOption = value;
    }

    /**
     * Gets the value of the encryptedPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPin() {
        return encryptedPin;
    }

    /**
     * Sets the value of the encryptedPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPin(String value) {
        this.encryptedPin = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the duplicateMtcnOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateMtcnOverrideFlag() {
        return duplicateMtcnOverrideFlag;
    }

    /**
     * Sets the value of the duplicateMtcnOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateMtcnOverrideFlag(String value) {
        this.duplicateMtcnOverrideFlag = value;
    }

    /**
     * Gets the value of the debitTimeoutResend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitTimeoutResend() {
        return debitTimeoutResend;
    }

    /**
     * Sets the value of the debitTimeoutResend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitTimeoutResend(String value) {
        this.debitTimeoutResend = value;
    }

    /**
     * Gets the value of the arizonaOperator property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getArizonaOperator() {
        return arizonaOperator;
    }

    /**
     * Sets the value of the arizonaOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setArizonaOperator(GeneralName value) {
        this.arizonaOperator = value;
    }

    /**
     * Gets the value of the trackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * Sets the value of the trackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackData(String value) {
        this.trackData = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
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
     * Gets the value of the tKeySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTKeySerialNumber() {
        return tKeySerialNumber;
    }

    /**
     * Sets the value of the tKeySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTKeySerialNumber(String value) {
        this.tKeySerialNumber = value;
    }

    /**
     * Gets the value of the thirdPartyFlagSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyFlagSend() {
        return thirdPartyFlagSend;
    }

    /**
     * Sets the value of the thirdPartyFlagSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyFlagSend(String value) {
        this.thirdPartyFlagSend = value;
    }

    /**
     * Gets the value of the addressVerificationDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationDocument() {
        return addressVerificationDocument;
    }

    /**
     * Sets the value of the addressVerificationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationDocument(String value) {
        this.addressVerificationDocument = value;
    }

    /**
     * Gets the value of the refundCancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundCancelFlag() {
        return refundCancelFlag;
    }

    /**
     * Sets the value of the refundCancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundCancelFlag(String value) {
        this.refundCancelFlag = value;
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

}
