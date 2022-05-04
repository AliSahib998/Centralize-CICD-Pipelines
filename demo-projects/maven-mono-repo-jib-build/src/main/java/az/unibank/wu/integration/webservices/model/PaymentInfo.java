
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode_of_payment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cheque_account_number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "modeOfPayment",
    "chequeAccountNumber",
    "amount"
})
public class PaymentInfo {

    @XmlElement(name = "mode_of_payment")
    protected String modeOfPayment;
    @XmlElement(name = "cheque_account_number")
    protected String chequeAccountNumber;
    protected String amount;

    /**
     * Gets the value of the modeOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfPayment() {
        return modeOfPayment;
    }

    /**
     * Sets the value of the modeOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfPayment(String value) {
        this.modeOfPayment = value;
    }

    /**
     * Gets the value of the chequeAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeAccountNumber() {
        return chequeAccountNumber;
    }

    /**
     * Sets the value of the chequeAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeAccountNumber(String value) {
        this.chequeAccountNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

}
