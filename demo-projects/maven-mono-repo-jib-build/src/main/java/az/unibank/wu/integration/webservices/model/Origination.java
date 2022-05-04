
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for origination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="origination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="gross_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="currency_iso_code" type="{http://www.westernunion.com/schema/xrsi}currency_iso_code" minOccurs="0"/>
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
@XmlType(name = "origination", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "principalAmount",
    "grossAmount",
    "currencyIsoCode",
    "countryIsoCode"
})
public class Origination {

    @XmlElement(name = "principal_amount")
    protected Long principalAmount;
    @XmlElement(name = "gross_amount")
    protected Long grossAmount;
    @XmlElement(name = "currency_iso_code")
    protected String currencyIsoCode;
    @XmlElement(name = "country_iso_code")
    protected String countryIsoCode;

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrincipalAmount(Long value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossAmount(Long value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * Sets the value of the currencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIsoCode(String value) {
        this.currencyIsoCode = value;
    }

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
