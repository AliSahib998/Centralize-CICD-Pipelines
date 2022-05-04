
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
 * <p>Java class for receive-money-pay-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receive-money-pay-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}store_request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="money_transfer_key" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         &lt;element name="address_validation" type="{http://www.westernunion.com/schema/xrsi}address_validation" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         &lt;element name="pay_status_description" type="{http://www.westernunion.com/schema/xrsi}pay_status_description" minOccurs="0"/>
 *         &lt;element name="pay_or_do_not_pay_indicator" type="{http://www.westernunion.com/schema/xrsi}pay_or_do_not_pay_indicator"/>
 *         &lt;element name="universal_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.westernunion.com/schema/xrsi}pay_comments" minOccurs="0"/>
 *         &lt;element name="comment_flag" type="{http://www.westernunion.com/schema/xrsi}comment_record_flag" minOccurs="0"/>
 *         &lt;element name="queue_name" type="{http://www.westernunion.com/schema/xrsi}queue_name" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="Partner_data" type="{http://www.westernunion.com/schema/xrsi}partner_data" minOccurs="0"/>
 *         &lt;element name="host_based_taxes" type="{http://www.westernunion.com/schema/xrsi}host_based_taxes" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.westernunion.com/schema/xrsi}message" minOccurs="0"/>
 *         &lt;element name="paper_check_payment" type="{http://www.westernunion.com/schema/xrsi}paper_check_payment" minOccurs="0"/>
 *         &lt;element name="address_verification_document" type="{http://www.westernunion.com/schema/xrsi}address_verification_document" minOccurs="0"/>
 *         &lt;element name="second_id" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         &lt;element name="arizona_operator" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         &lt;element name="additional_pay_info_buffer" type="{http://www.westernunion.com/schema/xrsi}additional_pay_info_buffer" minOccurs="0"/>
 *         &lt;element name="misc_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="partner_security_token" type="{http://www.westernunion.com/schema/xrsi}partner_security_token" minOccurs="0"/>
 *         &lt;element name="partner_info_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_info_buffer" minOccurs="0"/>
 *         &lt;element name="currency_change_flag" type="{http://www.westernunion.com/schema/xrsi}currency_change_flag" minOccurs="0"/>
 *         &lt;element name="multicurrency_reason_code" type="{http://www.westernunion.com/schema/xrsi}multicurrency_reason_code" minOccurs="0"/>
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
@XmlType(name = "receive-money-pay-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "receiver",
    "paymentDetails",
    "financials",
    "deliveryServices",
    "moneyTransferKey",
    "addressValidation",
    "newMtcn",
    "mtcn",
    "payStatusDescription",
    "payOrDoNotPayIndicator",
    "universalBuffer",
    "comments",
    "commentFlag",
    "queueName",
    "foreignRemoteSystem",
    "partnerData",
    "hostBasedTaxes",
    "message",
    "paperCheckPayment",
    "addressVerificationDocument",
    "secondId",
    "arizonaOperator",
    "additionalPayInfoBuffer",
    "miscBuffer",
    "partnerSecurityToken",
    "partnerInfoBuffer",
    "currencyChangeFlag",
    "multicurrencyReasonCode",
    "gdprEnabled"
})
@XmlRootElement(name = "receive-money-pay-request")
public class ReceiveMoneyPayRequest
    extends StoreRequestTransactionBase
{

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected Financials financials;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "money_transfer_key")
    protected String moneyTransferKey;
    @XmlList
    @XmlElement(name = "address_validation")
    protected List<String> addressValidation;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    protected String mtcn;
    @XmlElement(name = "pay_status_description")
    protected String payStatusDescription;
    @XmlElement(name = "pay_or_do_not_pay_indicator", required = true)
    @XmlSchemaType(name = "string")
    protected PayOrDoNotPayIndicator payOrDoNotPayIndicator;
    @XmlElement(name = "universal_buffer")
    protected String universalBuffer;
    protected PayComments comments;
    @XmlElement(name = "comment_flag")
    protected String commentFlag;
    @XmlElement(name = "queue_name")
    protected String queueName;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "Partner_data")
    protected String partnerData;
    @XmlElement(name = "host_based_taxes")
    protected String hostBasedTaxes;
    protected String message;
    @XmlElement(name = "paper_check_payment")
    protected PaperCheckPayment paperCheckPayment;
    @XmlElement(name = "address_verification_document")
    protected String addressVerificationDocument;
    @XmlElement(name = "second_id")
    protected IdDetails secondId;
    @XmlElement(name = "arizona_operator")
    protected GeneralName arizonaOperator;
    @XmlElement(name = "additional_pay_info_buffer")
    protected AdditionalPayInfoBuffer additionalPayInfoBuffer;
    @XmlElement(name = "misc_buffer")
    protected String miscBuffer;
    @XmlElement(name = "partner_security_token")
    protected String partnerSecurityToken;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;
    @XmlElement(name = "currency_change_flag")
    @XmlSchemaType(name = "string")
    protected CurrencyChangeFlag currencyChangeFlag;
    @XmlElement(name = "multicurrency_reason_code")
    protected String multicurrencyReasonCode;
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
     * Gets the value of the payStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayStatusDescription() {
        return payStatusDescription;
    }

    /**
     * Sets the value of the payStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayStatusDescription(String value) {
        this.payStatusDescription = value;
    }

    /**
     * Gets the value of the payOrDoNotPayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PayOrDoNotPayIndicator }
     *     
     */
    public PayOrDoNotPayIndicator getPayOrDoNotPayIndicator() {
        return payOrDoNotPayIndicator;
    }

    /**
     * Sets the value of the payOrDoNotPayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayOrDoNotPayIndicator }
     *     
     */
    public void setPayOrDoNotPayIndicator(PayOrDoNotPayIndicator value) {
        this.payOrDoNotPayIndicator = value;
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
     *     {@link PayComments }
     *     
     */
    public PayComments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayComments }
     *     
     */
    public void setComments(PayComments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the commentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentFlag() {
        return commentFlag;
    }

    /**
     * Sets the value of the commentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentFlag(String value) {
        this.commentFlag = value;
    }

    /**
     * Gets the value of the queueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * Sets the value of the queueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueName(String value) {
        this.queueName = value;
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
     * Gets the value of the partnerData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerData() {
        return partnerData;
    }

    /**
     * Sets the value of the partnerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerData(String value) {
        this.partnerData = value;
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
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the paperCheckPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCheckPayment }
     *     
     */
    public PaperCheckPayment getPaperCheckPayment() {
        return paperCheckPayment;
    }

    /**
     * Sets the value of the paperCheckPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCheckPayment }
     *     
     */
    public void setPaperCheckPayment(PaperCheckPayment value) {
        this.paperCheckPayment = value;
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
     * Gets the value of the secondId property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getSecondId() {
        return secondId;
    }

    /**
     * Sets the value of the secondId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setSecondId(IdDetails value) {
        this.secondId = value;
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
     * Gets the value of the additionalPayInfoBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPayInfoBuffer }
     *     
     */
    public AdditionalPayInfoBuffer getAdditionalPayInfoBuffer() {
        return additionalPayInfoBuffer;
    }

    /**
     * Sets the value of the additionalPayInfoBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPayInfoBuffer }
     *     
     */
    public void setAdditionalPayInfoBuffer(AdditionalPayInfoBuffer value) {
        this.additionalPayInfoBuffer = value;
    }

    /**
     * Gets the value of the miscBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscBuffer() {
        return miscBuffer;
    }

    /**
     * Sets the value of the miscBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscBuffer(String value) {
        this.miscBuffer = value;
    }

    /**
     * Gets the value of the partnerSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSecurityToken() {
        return partnerSecurityToken;
    }

    /**
     * Sets the value of the partnerSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSecurityToken(String value) {
        this.partnerSecurityToken = value;
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
     * Gets the value of the currencyChangeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyChangeFlag }
     *     
     */
    public CurrencyChangeFlag getCurrencyChangeFlag() {
        return currencyChangeFlag;
    }

    /**
     * Sets the value of the currencyChangeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyChangeFlag }
     *     
     */
    public void setCurrencyChangeFlag(CurrencyChangeFlag value) {
        this.currencyChangeFlag = value;
    }

    /**
     * Gets the value of the multicurrencyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticurrencyReasonCode() {
        return multicurrencyReasonCode;
    }

    /**
     * Sets the value of the multicurrencyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticurrencyReasonCode(String value) {
        this.multicurrencyReasonCode = value;
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
