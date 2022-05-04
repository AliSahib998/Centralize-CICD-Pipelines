
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_branded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partner_branded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="fx_spread" type="{http://www.westernunion.com/schema/xrsi}fx_spread" minOccurs="0"/>
 *         &lt;element name="partner_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_branded", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "principalAmount",
    "exchangeRate",
    "fxSpread",
    "partnerBuffer"
})
public class PartnerBranded {

    @XmlElement(name = "principal_amount")
    protected Double principalAmount;
    @XmlElement(name = "exchange_rate")
    protected Double exchangeRate;
    @XmlElement(name = "fx_spread")
    protected String fxSpread;
    @XmlElement(name = "partner_buffer")
    protected String partnerBuffer;

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrincipalAmount(Double value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the fxSpread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxSpread() {
        return fxSpread;
    }

    /**
     * Sets the value of the fxSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxSpread(String value) {
        this.fxSpread = value;
    }

    /**
     * Gets the value of the partnerBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerBuffer() {
        return partnerBuffer;
    }

    /**
     * Sets the value of the partnerBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerBuffer(String value) {
        this.partnerBuffer = value;
    }

}
