
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fee-inquiry-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fee-inquiry-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.westernunion.com/schema/xrsi}qp_company" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="agent_account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         &lt;element name="current_fx" type="{http://www.westernunion.com/schema/xrsi}current_fx" minOccurs="0"/>
 *         &lt;element name="fee_inquiry_message" type="{http://www.westernunion.com/schema/xrsi}fee_inquiry_message" minOccurs="0"/>
 *         &lt;element name="fee_inquiry_flags" type="{http://www.westernunion.com/schema/xrsi}fee_inquiry_flags" minOccurs="0"/>
 *         &lt;element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         &lt;element name="splitpay_charges_buffer" type="{http://www.westernunion.com/schema/xrsi}additional_buffer_charges_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer_details" type="{http://www.westernunion.com/schema/xrsi}misc_buffer_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fee-inquiry-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "financials",
    "company",
    "promotions",
    "deliveryServices",
    "foreignRemoteSystem",
    "paymentDetails",
    "agentAccount",
    "currentFx",
    "feeInquiryMessage",
    "feeInquiryFlags",
    "bankDetails",
    "splitpayChargesBuffer",
    "miscBufferDetails",
    "miscBuffer",
    "dfFields"
})
public class FeeInquiryReply
    extends ReplyTransactionBase
{

    protected Financials financials;
    protected QpCompany company;
    protected Promotions promotions;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "agent_account")
    protected AgentAccount agentAccount;
    @XmlElement(name = "current_fx")
    protected String currentFx;
    @XmlElement(name = "fee_inquiry_message")
    protected FeeInquiryMessage feeInquiryMessage;
    @XmlElement(name = "fee_inquiry_flags")
    protected FeeInquiryFlags feeInquiryFlags;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "splitpay_charges_buffer")
    protected AdditionalBufferChargesType splitpayChargesBuffer;
    @XmlElement(name = "misc_buffer_details")
    protected MiscBufferType miscBufferDetails;
    @XmlElement(name = "misc_buffer")
    protected String miscBuffer;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;

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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link QpCompany }
     *     
     */
    public QpCompany getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link QpCompany }
     *     
     */
    public void setCompany(QpCompany value) {
        this.company = value;
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
     * Gets the value of the agentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAgentAccount() {
        return agentAccount;
    }

    /**
     * Sets the value of the agentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAgentAccount(AgentAccount value) {
        this.agentAccount = value;
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
     * Gets the value of the feeInquiryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInquiryMessage }
     *     
     */
    public FeeInquiryMessage getFeeInquiryMessage() {
        return feeInquiryMessage;
    }

    /**
     * Sets the value of the feeInquiryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInquiryMessage }
     *     
     */
    public void setFeeInquiryMessage(FeeInquiryMessage value) {
        this.feeInquiryMessage = value;
    }

    /**
     * Gets the value of the feeInquiryFlags property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInquiryFlags }
     *     
     */
    public FeeInquiryFlags getFeeInquiryFlags() {
        return feeInquiryFlags;
    }

    /**
     * Sets the value of the feeInquiryFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInquiryFlags }
     *     
     */
    public void setFeeInquiryFlags(FeeInquiryFlags value) {
        this.feeInquiryFlags = value;
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
     * Gets the value of the dfFields property.
     * 
     * @return
     *     possible object is
     *     {@link DfFields }
     *     
     */
    public DfFields getDfFields() {
        return dfFields;
    }

    /**
     * Sets the value of the dfFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfFields }
     *     
     */
    public void setDfFields(DfFields value) {
        this.dfFields = value;
    }

}
