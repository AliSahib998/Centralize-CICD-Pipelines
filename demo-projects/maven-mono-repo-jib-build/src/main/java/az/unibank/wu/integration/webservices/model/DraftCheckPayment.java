
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for draft_check_payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draft_check_payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="check_details" type="{http://www.westernunion.com/schema/xrsi}check_details" minOccurs="0"/>
 *         &lt;element name="payment_amount" type="{http://www.westernunion.com/schema/xrsi}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "draft_check_payment", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "checkDetails",
    "paymentAmount"
})
public class DraftCheckPayment {

    @XmlElement(name = "check_details")
    protected CheckDetails checkDetails;
    @XmlElement(name = "payment_amount")
    protected Money paymentAmount;

    /**
     * Gets the value of the checkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDetails }
     *     
     */
    public CheckDetails getCheckDetails() {
        return checkDetails;
    }

    /**
     * Sets the value of the checkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDetails }
     *     
     */
    public void setCheckDetails(CheckDetails value) {
        this.checkDetails = value;
    }

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

}
