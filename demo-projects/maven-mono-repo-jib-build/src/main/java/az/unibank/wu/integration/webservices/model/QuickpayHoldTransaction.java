
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quickpay_hold_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quickpay_hold_transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="qp_company" type="{http://www.westernunion.com/schema/xrsi}qp_company" minOccurs="0"/>
 *         &lt;element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         &lt;element name="wallet_details" type="{http://www.westernunion.com/schema/xrsi}wallet_details" minOccurs="0"/>
 *         &lt;element name="billing_details" type="{http://www.westernunion.com/schema/xrsi}billing_details" minOccurs="0"/>
 *         &lt;element name="emea_ii" type="{http://www.westernunion.com/schema/xrsi}emea_ii" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="link_share" type="{http://www.westernunion.com/schema/xrsi}link_share" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="ccscan_transaction_id" type="{http://www.westernunion.com/schema/xrsi}ccscan_transaction_id" minOccurs="0"/>
 *         &lt;element name="encompass_status" type="{http://www.westernunion.com/schema/xrsi}encompass_status" minOccurs="0"/>
 *         &lt;element name="encompass_reason_code" type="{http://www.westernunion.com/schema/xrsi}encompass_reason_code" minOccurs="0"/>
 *         &lt;element name="universal_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         &lt;element name="unisys_customer_id" type="{http://www.westernunion.com/schema/xrsi}unisys_customer_id" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="stage_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="first_tmt_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="fixed_flag" type="{http://www.westernunion.com/schema/xrsi}fixed_flag" minOccurs="0"/>
 *         &lt;element name="cust_acct_no" type="{http://www.westernunion.com/schema/xrsi}pcp_qqc_account_number" minOccurs="0"/>
 *         &lt;element name="cancel_reason" type="{http://www.westernunion.com/schema/xrsi}cancel_reason" minOccurs="0"/>
 *         &lt;element name="mocc_comments" type="{http://www.westernunion.com/schema/xrsi}comments" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="yellow_phone_label" type="{http://www.westernunion.com/schema/xrsi}yellow_phone_lable" minOccurs="0"/>
 *         &lt;element name="money_transfer_key" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         &lt;element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *         &lt;element name="auto_refile_buffer" type="{http://www.westernunion.com/schema/xrsi}auto_refile_buffer" minOccurs="0"/>
 *         &lt;element name="corr_error_queue_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="queue_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="filing_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         &lt;element name="filing_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quickpay_hold_transaction", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "qpCompany",
    "bankDetails",
    "walletDetails",
    "billingDetails",
    "emeaIi",
    "promotions",
    "financials",
    "paymentDetails",
    "deliveryServices",
    "linkShare",
    "mtcn",
    "ccscanTransactionId",
    "encompassStatus",
    "encompassReasonCode",
    "universalBuffer",
    "comments",
    "unisysCustomerId",
    "newMtcn",
    "stageMtcn",
    "firstTmtFlag",
    "fixedFlag",
    "custAcctNo",
    "cancelReason",
    "moccComments",
    "yellowPhoneLabel",
    "moneyTransferKey",
    "dfFields",
    "autoRefileBuffer",
    "corrErrorQueueFlag",
    "queueFlag",
    "filingDate",
    "filingTime"
})
public class QuickpayHoldTransaction {

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "qp_company")
    protected QpCompany qpCompany;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;
    @XmlElement(name = "billing_details")
    protected BillingDetails billingDetails;
    @XmlElement(name = "emea_ii")
    protected EmeaIi emeaIi;
    protected Promotions promotions;
    protected Financials financials;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "link_share")
    protected String linkShare;
    protected String mtcn;
    @XmlElement(name = "ccscan_transaction_id")
    protected String ccscanTransactionId;
    @XmlElement(name = "encompass_status")
    protected String encompassStatus;
    @XmlElement(name = "encompass_reason_code")
    protected String encompassReasonCode;
    @XmlElement(name = "universal_buffer")
    protected String universalBuffer;
    protected String comments;
    @XmlElement(name = "unisys_customer_id")
    protected String unisysCustomerId;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "stage_mtcn")
    protected String stageMtcn;
    @XmlElement(name = "first_tmt_flag")
    @XmlSchemaType(name = "string")
    protected YesNo firstTmtFlag;
    @XmlElement(name = "fixed_flag")
    protected String fixedFlag;
    @XmlElement(name = "cust_acct_no")
    protected String custAcctNo;
    @XmlElement(name = "cancel_reason")
    protected String cancelReason;
    @XmlElement(name = "mocc_comments")
    protected List<String> moccComments;
    @XmlElement(name = "yellow_phone_label")
    protected String yellowPhoneLabel;
    @XmlElement(name = "money_transfer_key")
    protected String moneyTransferKey;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;
    @XmlElement(name = "auto_refile_buffer")
    protected AutoRefileBuffer autoRefileBuffer;
    @XmlElement(name = "corr_error_queue_flag")
    @XmlSchemaType(name = "string")
    protected YesNo corrErrorQueueFlag;
    @XmlElement(name = "queue_flag")
    @XmlSchemaType(name = "string")
    protected YesNo queueFlag;
    @XmlElement(name = "filing_date")
    protected String filingDate;
    @XmlElement(name = "filing_time")
    protected String filingTime;

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
     * Gets the value of the custAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctNo() {
        return custAcctNo;
    }

    /**
     * Sets the value of the custAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctNo(String value) {
        this.custAcctNo = value;
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

}
