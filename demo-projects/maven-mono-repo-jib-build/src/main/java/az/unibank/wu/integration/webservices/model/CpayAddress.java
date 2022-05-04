
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country_iso_code" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_address", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "countryIsoCode"
})
public class CpayAddress {

    @XmlElement(name = "country_iso_code")
    protected String countryIsoCode;

    /**
     * Gets the value of the countryIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    /**
     * Sets the value of the countryIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIsoCode(String value) {
        this.countryIsoCode = value;
    }

}
