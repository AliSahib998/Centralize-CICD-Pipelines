
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receive-money-search-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receive-money-search-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="payment_transactions" type="{http://www.westernunion.com/schema/xrsi}payment_transactions" minOccurs="0"/>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="current_page_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="last_page_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="number_of_entries" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="first_entry_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="messages_on_queue" type="{http://www.westernunion.com/schema/xrsi}messages_on_queue" minOccurs="0"/>
 *         &lt;element name="name_searched_for" type="{http://www.westernunion.com/schema/xrsi}name_searched_for" minOccurs="0"/>
 *         &lt;element name="misc_buffer_details" type="{http://www.westernunion.com/schema/xrsi}misc_buffer_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="number_matches" type="{http://www.westernunion.com/schema/xrsi}number_matches" minOccurs="0"/>
 *         &lt;element name="agent_location_identifier" type="{http://www.westernunion.com/schema/xrsi}agent_location_identifier" minOccurs="0"/>
 *         &lt;element name="multicurrency_reason_code" type="{http://www.westernunion.com/schema/xrsi}multicurrency_reason_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receive-money-search-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "paymentTransactions",
    "deliveryServices",
    "promotions",
    "currentPageNumber",
    "lastPageNumber",
    "numberOfEntries",
    "firstEntryNumber",
    "messagesOnQueue",
    "nameSearchedFor",
    "miscBufferDetails",
    "miscBuffer",
    "foreignRemoteSystem",
    "numberMatches",
    "agentLocationIdentifier",
    "multicurrencyReasonCode"
})
public class ReceiveMoneySearchReply
    extends ReplyTransactionBase
{

    @XmlElement(name = "payment_transactions")
    protected PaymentTransactions paymentTransactions;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    protected Promotions promotions;
    @XmlElement(name = "current_page_number")
    protected BigInteger currentPageNumber;
    @XmlElement(name = "last_page_number")
    protected BigInteger lastPageNumber;
    @XmlElement(name = "number_of_entries")
    protected BigInteger numberOfEntries;
    @XmlElement(name = "first_entry_number")
    protected BigInteger firstEntryNumber;
    @XmlElement(name = "messages_on_queue")
    protected String messagesOnQueue;
    @XmlElement(name = "name_searched_for")
    protected String nameSearchedFor;
    @XmlElement(name = "misc_buffer_details")
    protected MiscBufferType miscBufferDetails;
    @XmlElement(name = "misc_buffer")
    protected String miscBuffer;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "number_matches")
    protected BigInteger numberMatches;
    @XmlElement(name = "agent_location_identifier")
    protected String agentLocationIdentifier;
    @XmlElement(name = "multicurrency_reason_code")
    protected String multicurrencyReasonCode;

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
     * Gets the value of the currentPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentPageNumber() {
        return currentPageNumber;
    }

    /**
     * Sets the value of the currentPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentPageNumber(BigInteger value) {
        this.currentPageNumber = value;
    }

    /**
     * Gets the value of the lastPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastPageNumber() {
        return lastPageNumber;
    }

    /**
     * Sets the value of the lastPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastPageNumber(BigInteger value) {
        this.lastPageNumber = value;
    }

    /**
     * Gets the value of the numberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Sets the value of the numberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEntries(BigInteger value) {
        this.numberOfEntries = value;
    }

    /**
     * Gets the value of the firstEntryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstEntryNumber() {
        return firstEntryNumber;
    }

    /**
     * Sets the value of the firstEntryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstEntryNumber(BigInteger value) {
        this.firstEntryNumber = value;
    }

    /**
     * Gets the value of the messagesOnQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagesOnQueue() {
        return messagesOnQueue;
    }

    /**
     * Sets the value of the messagesOnQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagesOnQueue(String value) {
        this.messagesOnQueue = value;
    }

    /**
     * Gets the value of the nameSearchedFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSearchedFor() {
        return nameSearchedFor;
    }

    /**
     * Sets the value of the nameSearchedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSearchedFor(String value) {
        this.nameSearchedFor = value;
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
     * Gets the value of the numberMatches property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberMatches() {
        return numberMatches;
    }

    /**
     * Sets the value of the numberMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberMatches(BigInteger value) {
        this.numberMatches = value;
    }

    /**
     * Gets the value of the agentLocationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentLocationIdentifier() {
        return agentLocationIdentifier;
    }

    /**
     * Sets the value of the agentLocationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentLocationIdentifier(String value) {
        this.agentLocationIdentifier = value;
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

}
