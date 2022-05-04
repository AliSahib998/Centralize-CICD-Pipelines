
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compliance_mobile_phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compliance_mobile_phone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country_code" type="{http://www.westernunion.com/schema/xrsi}compliance_mobile_country_code" minOccurs="0"/>
 *         &lt;element name="phone_number" type="{http://www.westernunion.com/schema/xrsi}compliance_mobile_number" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compliance_mobile_phone", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "countryCode",
    "phoneNumber"
})
public class ComplianceMobilePhone {

    @XmlElement(name = "country_code")
    protected String countryCode;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
