
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_void_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_void_payment_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origination" type="{http://www.westernunion.com/schema/xrsi}cpay_void_origination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_void_payment_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "origination"
})
public class CpayVoidPaymentDetails {

    protected CpayVoidOrigination origination;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link CpayVoidOrigination }
     *     
     */
    public CpayVoidOrigination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayVoidOrigination }
     *     
     */
    public void setOrigination(CpayVoidOrigination value) {
        this.origination = value;
    }

}
