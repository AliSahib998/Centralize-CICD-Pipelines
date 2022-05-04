
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="destination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expected_payout_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="actual_payout_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="currency_iso_code" type="{http://www.westernunion.com/schema/xrsi}currency_iso_code" minOccurs="0"/>
 *         &lt;element name="country_iso_code" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *         &lt;element name="state_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         &lt;element name="expected_payout_method" type="{http://www.westernunion.com/schema/xrsi}payout_method" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destination", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "expectedPayoutAmount",
    "actualPayoutAmount",
    "currencyIsoCode",
    "countryIsoCode",
    "stateCode",
    "city",
    "expectedPayoutMethod"
})
public class Destination {

    @XmlElement(name = "expected_payout_amount")
    protected Long expectedPayoutAmount;
    @XmlElement(name = "actual_payout_amount")
    protected Long actualPayoutAmount;
    @XmlElement(name = "currency_iso_code")
    protected String currencyIsoCode;
    @XmlElement(name = "country_iso_code")
    protected String countryIsoCode;
    @XmlElement(name = "state_code")
    protected String stateCode;
    protected String city;
    @XmlElement(name = "expected_payout_method")
    @XmlSchemaType(name = "string")
    protected PayoutMethod expectedPayoutMethod;

    /**
     * Gets the value of the expectedPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpectedPayoutAmount() {
        return expectedPayoutAmount;
    }

    /**
     * Sets the value of the expectedPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpectedPayoutAmount(Long value) {
        this.expectedPayoutAmount = value;
    }

    /**
     * Gets the value of the actualPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualPayoutAmount() {
        return actualPayoutAmount;
    }

    /**
     * Sets the value of the actualPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualPayoutAmount(Long value) {
        this.actualPayoutAmount = value;
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

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the expectedPayoutMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutMethod }
     *     
     */
    public PayoutMethod getExpectedPayoutMethod() {
        return expectedPayoutMethod;
    }

    /**
     * Sets the value of the expectedPayoutMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutMethod }
     *     
     */
    public void setExpectedPayoutMethod(PayoutMethod value) {
        this.expectedPayoutMethod = value;
    }

}
