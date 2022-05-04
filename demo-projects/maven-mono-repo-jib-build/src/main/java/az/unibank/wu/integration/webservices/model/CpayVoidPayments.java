
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_void_payments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_void_payments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="void_payment" type="{http://www.westernunion.com/schema/xrsi}void_payment" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_void_payments", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "voidPayment"
})
public class CpayVoidPayments {

    @XmlElement(name = "void_payment")
    protected VoidPayment voidPayment;

    /**
     * Gets the value of the voidPayment property.
     * 
     * @return
     *     possible object is
     *     {@link VoidPayment }
     *     
     */
    public VoidPayment getVoidPayment() {
        return voidPayment;
    }

    /**
     * Sets the value of the voidPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidPayment }
     *     
     */
    public void setVoidPayment(VoidPayment value) {
        this.voidPayment = value;
    }

}
