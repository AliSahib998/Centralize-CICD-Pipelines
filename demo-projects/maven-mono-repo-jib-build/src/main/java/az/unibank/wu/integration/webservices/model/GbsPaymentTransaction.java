
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_payment_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gbs_payment_transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}channel_customer" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}channel_customer" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}gbs_payment_details" minOccurs="0"/>
 *         &lt;element name="transaction_id" type="{http://www.westernunion.com/schema/xrsi}gbs_transaction_id" minOccurs="0"/>
 *         &lt;element name="money_transfer_control" type="{http://www.westernunion.com/schema/xrsi}money_transfer_control"/>
 *         &lt;element name="status" type="{http://www.westernunion.com/schema/xrsi}paid_status" minOccurs="0"/>
 *         &lt;element name="reference_key" type="{http://www.westernunion.com/schema/xrsi}reference_key" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_payment_transaction", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "paymentDetails",
    "transactionId",
    "moneyTransferControl",
    "status",
    "referenceKey"
})
public class GbsPaymentTransaction {

    protected ChannelCustomer sender;
    protected ChannelCustomer receiver;
    @XmlElement(name = "payment_details")
    protected GbsPaymentDetails paymentDetails;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "money_transfer_control", required = true)
    protected MoneyTransferControl moneyTransferControl;
    @XmlSchemaType(name = "string")
    protected PaidStatus status;
    @XmlElement(name = "reference_key")
    protected String referenceKey;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomer }
     *     
     */
    public ChannelCustomer getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomer }
     *     
     */
    public void setSender(ChannelCustomer value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomer }
     *     
     */
    public ChannelCustomer getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomer }
     *     
     */
    public void setReceiver(ChannelCustomer value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public GbsPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public void setPaymentDetails(GbsPaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the moneyTransferControl property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyTransferControl }
     *     
     */
    public MoneyTransferControl getMoneyTransferControl() {
        return moneyTransferControl;
    }

    /**
     * Sets the value of the moneyTransferControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyTransferControl }
     *     
     */
    public void setMoneyTransferControl(MoneyTransferControl value) {
        this.moneyTransferControl = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaidStatus }
     *     
     */
    public PaidStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidStatus }
     *     
     */
    public void setStatus(PaidStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the referenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceKey() {
        return referenceKey;
    }

    /**
     * Sets the value of the referenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceKey(String value) {
        this.referenceKey = value;
    }

}
