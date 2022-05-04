
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fee-inquiry-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fee-inquiry-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}store_request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="qp_company" type="{http://www.westernunion.com/schema/xrsi}qp_company" minOccurs="0"/>
 *         &lt;element name="wu_card_number" type="{http://www.westernunion.com/schema/xrsi}wu_card_number" minOccurs="0"/>
 *         &lt;element name="level_code" type="{http://www.westernunion.com/schema/xrsi}level_code" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="sender_name_type" type="{http://www.westernunion.com/schema/xrsi}name_type" minOccurs="0"/>
 *         &lt;element name="receiver_name_type" type="{http://www.westernunion.com/schema/xrsi}name_type" minOccurs="0"/>
 *         &lt;element name="proxy_request" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="poo_conversion" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="julian_date" type="{http://www.westernunion.com/schema/xrsi}julian_date" minOccurs="0"/>
 *         &lt;element name="yellow_phone_label" type="{http://www.westernunion.com/schema/xrsi}yellow_phone_lable" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="host_based_taxes" type="{http://www.westernunion.com/schema/xrsi}host_based_taxes" minOccurs="0"/>
 *         &lt;element name="money_tranfer_type" type="{http://www.westernunion.com/schema/xrsi}money_tranfer_type" minOccurs="0"/>
 *         &lt;element name="add_message" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         &lt;element name="preferred_customer_no" type="{http://www.westernunion.com/schema/xrsi}pref_cust_account_number" minOccurs="0"/>
 *         &lt;element name="mywu_number" type="{http://www.westernunion.com/schema/xrsi}pref_cust_account_number" minOccurs="0"/>
 *         &lt;element name="splitpay_charges_buffer" type="{http://www.westernunion.com/schema/xrsi}additional_buffer_charges_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer_details" type="{http://www.westernunion.com/schema/xrsi}misc_buffer_type" minOccurs="0"/>
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
@XmlType(name = "fee-inquiry-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "sender",
    "receiver",
    "financials",
    "paymentDetails",
    "promotions",
    "deliveryServices",
    "qpCompany",
    "wuCardNumber",
    "levelCode",
    "mtcn",
    "newMtcn",
    "senderNameType",
    "receiverNameType",
    "proxyRequest",
    "pooConversion",
    "julianDate",
    "yellowPhoneLabel",
    "foreignRemoteSystem",
    "hostBasedTaxes",
    "moneyTranferType",
    "addMessage",
    "preferredCustomerNo",
    "mywuNumber",
    "splitpayChargesBuffer",
    "miscBufferDetails",
    "partnerInfoBuffer"
})
@XmlRootElement(name = "fee-inquiry-request")
public class FeeInquiryRequest
    extends StoreRequestTransactionBase
{

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    protected Sender sender;
    protected Receiver receiver;
    protected Financials financials;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected Promotions promotions;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "qp_company")
    protected QpCompany qpCompany;
    @XmlElement(name = "wu_card_number")
    protected String wuCardNumber;
    @XmlElement(name = "level_code")
    protected String levelCode;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "sender_name_type")
    @XmlSchemaType(name = "string")
    protected NameType senderNameType;
    @XmlElement(name = "receiver_name_type")
    @XmlSchemaType(name = "string")
    protected NameType receiverNameType;
    @XmlElement(name = "proxy_request")
    @XmlSchemaType(name = "string")
    protected YesNo proxyRequest;
    @XmlElement(name = "poo_conversion")
    @XmlSchemaType(name = "string")
    protected YesNo pooConversion;
    @XmlElement(name = "julian_date")
    protected String julianDate;
    @XmlElement(name = "yellow_phone_label")
    protected String yellowPhoneLabel;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "host_based_taxes")
    protected String hostBasedTaxes;
    @XmlElement(name = "money_tranfer_type")
    protected String moneyTranferType;
    @XmlElement(name = "add_message")
    protected String addMessage;
    @XmlElement(name = "preferred_customer_no")
    protected String preferredCustomerNo;
    @XmlElement(name = "mywu_number")
    protected String mywuNumber;
    @XmlElement(name = "splitpay_charges_buffer")
    protected AdditionalBufferChargesType splitpayChargesBuffer;
    @XmlElement(name = "misc_buffer_details")
    protected MiscBufferType miscBufferDetails;
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
     * Gets the value of the qpCompany property.
     * 
     * @return
     *     possible object is
     *     {@link QpCompany }
     *     
     */
    public QpCompany getQpCompany() {
        return qpCompany;
    }

    /**
     * Sets the value of the qpCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link QpCompany }
     *     
     */
    public void setQpCompany(QpCompany value) {
        this.qpCompany = value;
    }

    /**
     * Gets the value of the wuCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuCardNumber() {
        return wuCardNumber;
    }

    /**
     * Sets the value of the wuCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuCardNumber(String value) {
        this.wuCardNumber = value;
    }

    /**
     * Gets the value of the levelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCode() {
        return levelCode;
    }

    /**
     * Sets the value of the levelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCode(String value) {
        this.levelCode = value;
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
     * Gets the value of the senderNameType property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getSenderNameType() {
        return senderNameType;
    }

    /**
     * Sets the value of the senderNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setSenderNameType(NameType value) {
        this.senderNameType = value;
    }

    /**
     * Gets the value of the receiverNameType property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getReceiverNameType() {
        return receiverNameType;
    }

    /**
     * Sets the value of the receiverNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setReceiverNameType(NameType value) {
        this.receiverNameType = value;
    }

    /**
     * Gets the value of the proxyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getProxyRequest() {
        return proxyRequest;
    }

    /**
     * Sets the value of the proxyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setProxyRequest(YesNo value) {
        this.proxyRequest = value;
    }

    /**
     * Gets the value of the pooConversion property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPooConversion() {
        return pooConversion;
    }

    /**
     * Sets the value of the pooConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPooConversion(YesNo value) {
        this.pooConversion = value;
    }

    /**
     * Gets the value of the julianDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJulianDate() {
        return julianDate;
    }

    /**
     * Sets the value of the julianDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJulianDate(String value) {
        this.julianDate = value;
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
     * Gets the value of the moneyTranferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyTranferType() {
        return moneyTranferType;
    }

    /**
     * Sets the value of the moneyTranferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyTranferType(String value) {
        this.moneyTranferType = value;
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
     * Gets the value of the preferredCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCustomerNo() {
        return preferredCustomerNo;
    }

    /**
     * Sets the value of the preferredCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCustomerNo(String value) {
        this.preferredCustomerNo = value;
    }

    /**
     * Gets the value of the mywuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMywuNumber() {
        return mywuNumber;
    }

    /**
     * Sets the value of the mywuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMywuNumber(String value) {
        this.mywuNumber = value;
    }

    /**
     * Gets the value of the splitpayChargesBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBufferChargesType }
     *     
     */
    public AdditionalBufferChargesType getSplitpayChargesBuffer() {
        return splitpayChargesBuffer;
    }

    /**
     * Sets the value of the splitpayChargesBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBufferChargesType }
     *     
     */
    public void setSplitpayChargesBuffer(AdditionalBufferChargesType value) {
        this.splitpayChargesBuffer = value;
    }

    /**
     * Gets the value of the miscBufferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscBufferType }
     *     
     */
    public MiscBufferType getMiscBufferDetails() {
        return miscBufferDetails;
    }

    /**
     * Sets the value of the miscBufferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscBufferType }
     *     
     */
    public void setMiscBufferDetails(MiscBufferType value) {
        this.miscBufferDetails = value;
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
