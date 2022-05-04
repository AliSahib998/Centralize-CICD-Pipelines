
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country_currency_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="country_currency_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpc_code" type="{http://www.westernunion.com/schema/xrsi}country_unisys_code" minOccurs="0"/>
 *         &lt;element name="iso_code" type="{http://www.westernunion.com/schema/xrsi}iso_code" minOccurs="0"/>
 *         &lt;element name="country_name" type="{http://www.westernunion.com/schema/xrsi}country_name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country_currency_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "cpcCode",
    "isoCode",
    "countryName"
})
public class CountryCurrencyInfo {

    @XmlElement(name = "cpc_code")
    protected String cpcCode;
    @XmlElement(name = "iso_code")
    protected IsoCode isoCode;
    @XmlElement(name = "country_name")
    protected String countryName;

    /**
     * Gets the value of the cpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpcCode() {
        return cpcCode;
    }

    /**
     * Sets the value of the cpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpcCode(String value) {
        this.cpcCode = value;
    }

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCode }
     *     
     */
    public IsoCode getIsoCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCode }
     *     
     */
    public void setIsoCode(IsoCode value) {
        this.isoCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

}
