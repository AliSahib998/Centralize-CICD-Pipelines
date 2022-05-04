
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for search-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="payment_transaction" type="{http://www.westernunion.com/schema/xrsi}payment_transaction" minOccurs="0"/>
 *         &lt;element name="wc_search_keys" type="{http://www.westernunion.com/schema/xrsi}wc_search_keys" minOccurs="0"/>
 *         &lt;element name="wcr_type" type="{http://www.westernunion.com/schema/xrsi}wcr_type" minOccurs="0"/>
 *         &lt;element name="wcr_with_lock" type="{http://www.westernunion.com/schema/xrsi}wcr_with_lock" minOccurs="0"/>
 *         &lt;element name="new_mtcn_compatible" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="recording_account_number" type="{http://www.westernunion.com/schema/xrsi}recording_account_number" minOccurs="0"/>
 *         &lt;element name="restrict_view" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="queue_type" type="{http://www.westernunion.com/schema/xrsi}queue_type" minOccurs="0"/>
 *         &lt;element name="account_nbr_type" type="{http://www.westernunion.com/schema/xrsi}account_nbr_type" minOccurs="0"/>
 *         &lt;element name="payee_pin_number" type="{http://www.westernunion.com/schema/xrsi}staged_pin_number" minOccurs="0"/>
 *         &lt;element name="confirmation_code" type="{http://www.westernunion.com/schema/xrsi}confirmation_code" minOccurs="0"/>
 *         &lt;element name="mtcn_flag" type="{http://www.westernunion.com/schema/xrsi}mtcn_flag" minOccurs="0"/>
 *         &lt;element name="payout_control_info" type="{http://www.westernunion.com/schema/xrsi}payout_control_info" minOccurs="0"/>
 *         &lt;element name="context" type="{http://www.westernunion.com/schema/xrsi}context" minOccurs="0"/>
 *         &lt;element name="wc_search_type" type="{http://www.westernunion.com/schema/xrsi}wc_search_type" minOccurs="0"/>
 *         &lt;element name="search_flag" type="{http://www.westernunion.com/schema/xrsi}agentcsc_flags" minOccurs="0"/>
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
@XmlType(name = "search-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "foreignRemoteSystem",
    "paymentTransaction",
    "wcSearchKeys",
    "wcrType",
    "wcrWithLock",
    "newMtcnCompatible",
    "recordingAccountNumber",
    "restrictView",
    "queueType",
    "accountNbrType",
    "payeePinNumber",
    "confirmationCode",
    "mtcnFlag",
    "payoutControlInfo",
    "context",
    "wcSearchType",
    "searchFlag",
    "partnerInfoBuffer"
})
@XmlRootElement(name = "search-request")
public class SearchRequest
    extends RequestTransactionBase
{

    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "payment_transaction")
    protected PaymentTransaction paymentTransaction;
    @XmlElement(name = "wc_search_keys")
    protected WcSearchKeys wcSearchKeys;
    @XmlElement(name = "wcr_type")
    @XmlSchemaType(name = "string")
    protected WcrType wcrType;
    @XmlElement(name = "wcr_with_lock")
    protected String wcrWithLock;
    @XmlElement(name = "new_mtcn_compatible")
    @XmlSchemaType(name = "string")
    protected YesNo newMtcnCompatible;
    @XmlElement(name = "recording_account_number")
    protected String recordingAccountNumber;
    @XmlElement(name = "restrict_view")
    @XmlSchemaType(name = "string")
    protected YesNo restrictView;
    @XmlElement(name = "queue_type")
    protected String queueType;
    @XmlElement(name = "account_nbr_type")
    @XmlSchemaType(name = "string")
    protected AccountNbrType accountNbrType;
    @XmlElement(name = "payee_pin_number")
    protected String payeePinNumber;
    @XmlElement(name = "confirmation_code")
    protected String confirmationCode;
    @XmlElement(name = "mtcn_flag")
    protected String mtcnFlag;
    @XmlElement(name = "payout_control_info")
    protected String payoutControlInfo;
    protected String context;
    @XmlElement(name = "wc_search_type")
    @XmlSchemaType(name = "string")
    protected WcSearchType wcSearchType;
    @XmlElement(name = "search_flag")
    @XmlSchemaType(name = "string")
    protected AgentcscFlags searchFlag;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;

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
     * Gets the value of the paymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction }
     *     
     */
    public PaymentTransaction getPaymentTransaction() {
        return paymentTransaction;
    }

    /**
     * Sets the value of the paymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction }
     *     
     */
    public void setPaymentTransaction(PaymentTransaction value) {
        this.paymentTransaction = value;
    }

    /**
     * Gets the value of the wcSearchKeys property.
     * 
     * @return
     *     possible object is
     *     {@link WcSearchKeys }
     *     
     */
    public WcSearchKeys getWcSearchKeys() {
        return wcSearchKeys;
    }

    /**
     * Sets the value of the wcSearchKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link WcSearchKeys }
     *     
     */
    public void setWcSearchKeys(WcSearchKeys value) {
        this.wcSearchKeys = value;
    }

    /**
     * Gets the value of the wcrType property.
     * 
     * @return
     *     possible object is
     *     {@link WcrType }
     *     
     */
    public WcrType getWcrType() {
        return wcrType;
    }

    /**
     * Sets the value of the wcrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WcrType }
     *     
     */
    public void setWcrType(WcrType value) {
        this.wcrType = value;
    }

    /**
     * Gets the value of the wcrWithLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWcrWithLock() {
        return wcrWithLock;
    }

    /**
     * Sets the value of the wcrWithLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWcrWithLock(String value) {
        this.wcrWithLock = value;
    }

    /**
     * Gets the value of the newMtcnCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getNewMtcnCompatible() {
        return newMtcnCompatible;
    }

    /**
     * Sets the value of the newMtcnCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setNewMtcnCompatible(YesNo value) {
        this.newMtcnCompatible = value;
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
     * Gets the value of the restrictView property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getRestrictView() {
        return restrictView;
    }

    /**
     * Sets the value of the restrictView property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setRestrictView(YesNo value) {
        this.restrictView = value;
    }

    /**
     * Gets the value of the queueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     * Sets the value of the queueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueType(String value) {
        this.queueType = value;
    }

    /**
     * Gets the value of the accountNbrType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountNbrType }
     *     
     */
    public AccountNbrType getAccountNbrType() {
        return accountNbrType;
    }

    /**
     * Sets the value of the accountNbrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountNbrType }
     *     
     */
    public void setAccountNbrType(AccountNbrType value) {
        this.accountNbrType = value;
    }

    /**
     * Gets the value of the payeePinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeePinNumber() {
        return payeePinNumber;
    }

    /**
     * Sets the value of the payeePinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeePinNumber(String value) {
        this.payeePinNumber = value;
    }

    /**
     * Gets the value of the confirmationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Sets the value of the confirmationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationCode(String value) {
        this.confirmationCode = value;
    }

    /**
     * Gets the value of the mtcnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcnFlag() {
        return mtcnFlag;
    }

    /**
     * Sets the value of the mtcnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcnFlag(String value) {
        this.mtcnFlag = value;
    }

    /**
     * Gets the value of the payoutControlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutControlInfo() {
        return payoutControlInfo;
    }

    /**
     * Sets the value of the payoutControlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutControlInfo(String value) {
        this.payoutControlInfo = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the wcSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link WcSearchType }
     *     
     */
    public WcSearchType getWcSearchType() {
        return wcSearchType;
    }

    /**
     * Sets the value of the wcSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WcSearchType }
     *     
     */
    public void setWcSearchType(WcSearchType value) {
        this.wcSearchType = value;
    }

    /**
     * Gets the value of the searchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link AgentcscFlags }
     *     
     */
    public AgentcscFlags getSearchFlag() {
        return searchFlag;
    }

    /**
     * Sets the value of the searchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentcscFlags }
     *     
     */
    public void setSearchFlag(AgentcscFlags value) {
        this.searchFlag = value;
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
