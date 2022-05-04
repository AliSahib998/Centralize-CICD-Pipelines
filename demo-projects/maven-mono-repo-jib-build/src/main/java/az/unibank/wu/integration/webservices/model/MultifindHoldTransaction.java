
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multifind_hold_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multifind_hold_transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="qp_company" type="{http://www.westernunion.com/schema/xrsi}qp_company" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="money_transfer_key" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         &lt;element name="pay_status_description" type="{http://www.westernunion.com/schema/xrsi}pay_status_description1" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multifind_hold_transaction", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "qpCompany",
    "financials",
    "paymentDetails",
    "moneyTransferKey",
    "payStatusDescription",
    "newMtcn"
})
public class MultifindHoldTransaction {

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "qp_company")
    protected QpCompany qpCompany;
    protected Financials financials;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "money_transfer_key")
    protected String moneyTransferKey;
    @XmlElement(name = "pay_status_description")
    protected String payStatusDescription;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;

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

}
