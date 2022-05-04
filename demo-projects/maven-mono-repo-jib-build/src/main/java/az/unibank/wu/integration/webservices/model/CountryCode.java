
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country_code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="country_code">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iso_code" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *         &lt;element name="unisys_code" type="{http://www.westernunion.com/schema/xrsi}country_unisys_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country_code", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "isoCode",
    "unisysCode"
})
public class CountryCode {

    @XmlElement(name = "iso_code")
    protected String isoCode;
    @XmlElement(name = "unisys_code")
    protected String unisysCode;

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCode(String value) {
        this.isoCode = value;
    }

    /**
     * Gets the value of the unisysCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnisysCode() {
        return unisysCode;
    }

    /**
     * Sets the value of the unisysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnisysCode(String value) {
        this.unisysCode = value;
    }

}
