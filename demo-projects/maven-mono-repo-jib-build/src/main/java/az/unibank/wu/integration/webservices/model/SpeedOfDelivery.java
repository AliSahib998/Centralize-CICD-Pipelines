
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speed_of_delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="speed_of_delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxes" type="{http://www.westernunion.com/schema/xrsi}taxes" minOccurs="0"/>
 *         &lt;element name="originators_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="destination_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="gross_total_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="speed_of_delivery_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         &lt;element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="payment_type" type="{http://www.westernunion.com/schema/xrsi}payment_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "speed_of_delivery", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "taxes",
    "originatorsPrincipalAmount",
    "destinationPrincipalAmount",
    "grossTotalAmount",
    "charges",
    "speedOfDeliveryCode",
    "exchangeRate",
    "paymentType"
})
public class SpeedOfDelivery {

    protected Taxes taxes;
    @XmlElement(name = "originators_principal_amount")
    protected Long originatorsPrincipalAmount;
    @XmlElement(name = "destination_principal_amount")
    protected Long destinationPrincipalAmount;
    @XmlElement(name = "gross_total_amount")
    protected Long grossTotalAmount;
    protected Long charges;
    @XmlElement(name = "speed_of_delivery_code")
    protected String speedOfDeliveryCode;
    @XmlElement(name = "exchange_rate")
    protected Double exchangeRate;
    @XmlElement(name = "payment_type")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the originatorsPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginatorsPrincipalAmount() {
        return originatorsPrincipalAmount;
    }

    /**
     * Sets the value of the originatorsPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginatorsPrincipalAmount(Long value) {
        this.originatorsPrincipalAmount = value;
    }

    /**
     * Gets the value of the destinationPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationPrincipalAmount() {
        return destinationPrincipalAmount;
    }

    /**
     * Sets the value of the destinationPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationPrincipalAmount(Long value) {
        this.destinationPrincipalAmount = value;
    }

    /**
     * Gets the value of the grossTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossTotalAmount() {
        return grossTotalAmount;
    }

    /**
     * Sets the value of the grossTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossTotalAmount(Long value) {
        this.grossTotalAmount = value;
    }

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
     * Gets the value of the speedOfDeliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedOfDeliveryCode() {
        return speedOfDeliveryCode;
    }

    /**
     * Sets the value of the speedOfDeliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedOfDeliveryCode(String value) {
        this.speedOfDeliveryCode = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

}
