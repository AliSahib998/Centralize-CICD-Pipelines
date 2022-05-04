
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for send-money-validation-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="send-money-validation-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="wallet_details" type="{http://www.westernunion.com/schema/xrsi}wallet_details" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="stage_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="wu_card" type="{http://www.westernunion.com/schema/xrsi}wu_card" minOccurs="0"/>
 *         &lt;element name="payer_fx_buffer" type="{http://www.westernunion.com/schema/xrsi}payer_fx_buffer" minOccurs="0"/>
 *         &lt;element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *         &lt;element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         &lt;element name="cuba" type="{http://www.westernunion.com/schema/xrsi}cuba" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="visa_flag" type="{http://www.westernunion.com/schema/xrsi}visa_flag" minOccurs="0"/>
 *         &lt;element name="visa_number" type="{http://www.westernunion.com/schema/xrsi}visa_number" minOccurs="0"/>
 *         &lt;element name="visa_date" type="{http://www.westernunion.com/schema/xrsi}visa_date" minOccurs="0"/>
 *         &lt;element name="current_fx" type="{http://www.westernunion.com/schema/xrsi}current_fx" minOccurs="0"/>
 *         &lt;element name="payment_transactions" type="{http://www.westernunion.com/schema/xrsi}payment_transactions" minOccurs="0"/>
 *         &lt;element name="filing_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         &lt;element name="filing_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         &lt;element name="Is_convenience_search_flag" type="{http://www.westernunion.com/schema/xrsi}dcc" minOccurs="0"/>
 *         &lt;element name="Is_convenience_suppress_Flag" type="{http://www.westernunion.com/schema/xrsi}dcc" minOccurs="0"/>
 *         &lt;element name="partner_info_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_info_buffer" minOccurs="0"/>
 *         &lt;element name="mtcn_digest" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "send-money-validation-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "paymentDetails",
    "financials",
    "deliveryServices",
    "walletDetails",
    "promotions",
    "mtcn",
    "newMtcn",
    "stageMtcn",
    "wuCard",
    "payerFxBuffer",
    "dfFields",
    "bankDetails",
    "cuba",
    "foreignRemoteSystem",
    "visaFlag",
    "visaNumber",
    "visaDate",
    "currentFx",
    "paymentTransactions",
    "filingDate",
    "filingTime",
    "isConvenienceSearchFlag",
    "isConvenienceSuppressFlag",
    "partnerInfoBuffer",
    "mtcnDigest"
})
public class SendMoneyValidationReply
    extends ReplyTransactionBase
{

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected Financials financials;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;
    protected Promotions promotions;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "stage_mtcn")
    protected String stageMtcn;
    @XmlElement(name = "wu_card")
    protected WuCard wuCard;
    @XmlElement(name = "payer_fx_buffer")
    protected PayerFxBuffer payerFxBuffer;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    protected Cuba cuba;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "visa_flag")
    protected String visaFlag;
    @XmlElement(name = "visa_number")
    protected String visaNumber;
    @XmlElement(name = "visa_date")
    protected String visaDate;
    @XmlElement(name = "current_fx")
    protected String currentFx;
    @XmlElement(name = "payment_transactions")
    protected PaymentTransactions paymentTransactions;
    @XmlElement(name = "filing_date")
    protected String filingDate;
    @XmlElement(name = "filing_time")
    protected String filingTime;
    @XmlElement(name = "Is_convenience_search_flag")
    protected String isConvenienceSearchFlag;
    @XmlElement(name = "Is_convenience_suppress_Flag")
    protected String isConvenienceSuppressFlag;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;
    @XmlElement(name = "mtcn_digest")
    protected String mtcnDigest;

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
     * Gets the value of the wuCard property.
     * 
     * @return
     *     possible object is
     *     {@link WuCard }
     *     
     */
    public WuCard getWuCard() {
        return wuCard;
    }

    /**
     * Sets the value of the wuCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuCard }
     *     
     */
    public void setWuCard(WuCard value) {
        this.wuCard = value;
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
     * Gets the value of the paymentTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactions }
     *     
     */
    public PaymentTransactions getPaymentTransactions() {
        return paymentTransactions;
    }

    /**
     * Sets the value of the paymentTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactions }
     *     
     */
    public void setPaymentTransactions(PaymentTransactions value) {
        this.paymentTransactions = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDate(String value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the filingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTime() {
        return filingTime;
    }

    /**
     * Sets the value of the filingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTime(String value) {
        this.filingTime = value;
    }

    /**
     * Gets the value of the isConvenienceSearchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConvenienceSearchFlag() {
        return isConvenienceSearchFlag;
    }

    /**
     * Sets the value of the isConvenienceSearchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConvenienceSearchFlag(String value) {
        this.isConvenienceSearchFlag = value;
    }

    /**
     * Gets the value of the isConvenienceSuppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConvenienceSuppressFlag() {
        return isConvenienceSuppressFlag;
    }

    /**
     * Sets the value of the isConvenienceSuppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConvenienceSuppressFlag(String value) {
        this.isConvenienceSuppressFlag = value;
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

}
