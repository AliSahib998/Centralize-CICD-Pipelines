
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_phone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_number" type="{http://www.westernunion.com/schema/xrsi}international_phone_number"/>
 *         &lt;element name="identity" type="{http://www.westernunion.com/schema/xrsi}mobile_phone_identity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_phone", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "phoneNumber",
    "identity"
})
@XmlSeeAlso({
    PhoneWithType.class
})
public class MobilePhone {

    @XmlElement(name = "phone_number", required = true)
    protected InternationalPhoneNumber phoneNumber;
    protected MobilePhoneIdentity identity;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setPhoneNumber(InternationalPhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhoneIdentity }
     *     
     */
    public MobilePhoneIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhoneIdentity }
     *     
     */
    public void setIdentity(MobilePhoneIdentity value) {
        this.identity = value;
    }

}
