
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_transaction_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_transaction_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobile_sender" type="{http://www.westernunion.com/schema/xrsi}mobile_customer" minOccurs="0"/>
 *         &lt;element name="mobile_receiver" type="{http://www.westernunion.com/schema/xrsi}mobile_customer" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}mobile_payment_details" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.westernunion.com/schema/xrsi}comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_transaction_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "mobileSender",
    "mobileReceiver",
    "paymentDetails",
    "comment"
})
public class MobileTransactionInfo {

    @XmlElement(name = "mobile_sender")
    protected MobileCustomer mobileSender;
    @XmlElement(name = "mobile_receiver")
    protected MobileCustomer mobileReceiver;
    @XmlElement(name = "payment_details")
    protected MobilePaymentDetails paymentDetails;
    protected Comment comment;

    /**
     * Gets the value of the mobileSender property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCustomer }
     *     
     */
    public MobileCustomer getMobileSender() {
        return mobileSender;
    }

    /**
     * Sets the value of the mobileSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCustomer }
     *     
     */
    public void setMobileSender(MobileCustomer value) {
        this.mobileSender = value;
    }

    /**
     * Gets the value of the mobileReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCustomer }
     *     
     */
    public MobileCustomer getMobileReceiver() {
        return mobileReceiver;
    }

    /**
     * Sets the value of the mobileReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCustomer }
     *     
     */
    public void setMobileReceiver(MobileCustomer value) {
        this.mobileReceiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePaymentDetails }
     *     
     */
    public MobilePaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePaymentDetails }
     *     
     */
    public void setPaymentDetails(MobilePaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

}
