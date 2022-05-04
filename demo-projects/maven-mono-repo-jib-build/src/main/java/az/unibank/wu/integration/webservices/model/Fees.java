
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="tolls" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="exchange_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="conversion_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="second_exchange_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fees", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "charges",
    "tolls",
    "exchangeFee",
    "conversionFee",
    "secondExchangeFee"
})
public class Fees {

    protected Long charges;
    protected Long tolls;
    @XmlElement(name = "exchange_fee")
    protected Long exchangeFee;
    @XmlElement(name = "conversion_fee")
    protected Long conversionFee;
    @XmlElement(name = "second_exchange_fee")
    protected Long secondExchangeFee;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharges(Long value) {
        this.charges = value;
    }

    /**
     * Gets the value of the tolls property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTolls() {
        return tolls;
    }

    /**
     * Sets the value of the tolls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTolls(Long value) {
        this.tolls = value;
    }

    /**
     * Gets the value of the exchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeFee() {
        return exchangeFee;
    }

    /**
     * Sets the value of the exchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeFee(Long value) {
        this.exchangeFee = value;
    }

    /**
     * Gets the value of the conversionFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionFee() {
        return conversionFee;
    }

    /**
     * Sets the value of the conversionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionFee(Long value) {
        this.conversionFee = value;
    }

    /**
     * Gets the value of the secondExchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondExchangeFee() {
        return secondExchangeFee;
    }

    /**
     * Sets the value of the secondExchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondExchangeFee(Long value) {
        this.secondExchangeFee = value;
    }

}
