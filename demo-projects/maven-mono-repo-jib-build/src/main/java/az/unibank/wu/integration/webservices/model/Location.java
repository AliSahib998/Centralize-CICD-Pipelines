
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.westernunion.com/schema/xrsi}cpay_address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "address"
})
public class Location {

    @XmlElement(required = true)
    protected CpayAddress address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CpayAddress }
     *     
     */
    public CpayAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayAddress }
     *     
     */
    public void setAddress(CpayAddress value) {
        this.address = value;
    }

}
