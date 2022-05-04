
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for void_payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="void_payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payment_amount" type="{http://www.westernunion.com/schema/xrsi}money" minOccurs="0"/>
 *         &lt;element name="reason_code" type="{http://www.westernunion.com/schema/xrsi}cpay_reason_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "void_payment", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "paymentAmount",
    "reasonCode"
})
public class VoidPayment {

    @XmlElement(name = "payment_amount")
    protected Money paymentAmount;
    @XmlElement(name = "reason_code")
    protected String reasonCode;

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAmount(Money value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
