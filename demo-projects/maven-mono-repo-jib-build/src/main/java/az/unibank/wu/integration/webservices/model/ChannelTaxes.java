
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_taxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_taxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tax_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="tax_rate" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="municipal_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="state_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="county_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_taxes", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "taxAmount",
    "taxRate",
    "municipalTax",
    "stateTax",
    "countyTax"
})
public class ChannelTaxes {

    @XmlElement(name = "tax_amount")
    protected Long taxAmount;
    @XmlElement(name = "tax_rate")
    protected Long taxRate;
    @XmlElement(name = "municipal_tax")
    protected Long municipalTax;
    @XmlElement(name = "state_tax")
    protected Long stateTax;
    @XmlElement(name = "county_tax")
    protected Long countyTax;

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxRate(Long value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the municipalTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMunicipalTax() {
        return municipalTax;
    }

    /**
     * Sets the value of the municipalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMunicipalTax(Long value) {
        this.municipalTax = value;
    }

    /**
     * Gets the value of the stateTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateTax() {
        return stateTax;
    }

    /**
     * Sets the value of the stateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateTax(Long value) {
        this.stateTax = value;
    }

    /**
     * Gets the value of the countyTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountyTax() {
        return countyTax;
    }

    /**
     * Sets the value of the countyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountyTax(Long value) {
        this.countyTax = value;
    }

}
