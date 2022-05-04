
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payer_fx_delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payer_fx_delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="network_id" type="{http://www.westernunion.com/schema/xrsi}network_id" minOccurs="0"/>
 *         &lt;element name="originators_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="destination_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="fx_rate1" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="fx_rate2" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="settlement_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="delivery_service_options" type="{http://www.westernunion.com/schema/xrsi}delivery_service_options" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payer_fx_delivery", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "networkId",
    "originatorsPrincipalAmount",
    "destinationPrincipalAmount",
    "exchangeRate",
    "fxRate1",
    "fxRate2",
    "fee",
    "settlementRate",
    "deliveryServiceOptions"
})
public class PayerFxDelivery {

    @XmlElement(name = "network_id")
    protected String networkId;
    @XmlElement(name = "originators_principal_amount")
    protected Long originatorsPrincipalAmount;
    @XmlElement(name = "destination_principal_amount")
    protected Long destinationPrincipalAmount;
    @XmlElement(name = "exchange_rate")
    protected Double exchangeRate;
    @XmlElement(name = "fx_rate1")
    protected Double fxRate1;
    @XmlElement(name = "fx_rate2")
    protected Double fxRate2;
    protected Double fee;
    @XmlElement(name = "settlement_rate")
    protected Double settlementRate;
    @XmlElement(name = "delivery_service_options")
    protected DeliveryServiceOptions deliveryServiceOptions;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
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
     * Gets the value of the fxRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFxRate1() {
        return fxRate1;
    }

    /**
     * Sets the value of the fxRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFxRate1(Double value) {
        this.fxRate1 = value;
    }

    /**
     * Gets the value of the fxRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFxRate2() {
        return fxRate2;
    }

    /**
     * Sets the value of the fxRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFxRate2(Double value) {
        this.fxRate2 = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFee(Double value) {
        this.fee = value;
    }

    /**
     * Gets the value of the settlementRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSettlementRate() {
        return settlementRate;
    }

    /**
     * Sets the value of the settlementRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSettlementRate(Double value) {
        this.settlementRate = value;
    }

    /**
     * Gets the value of the deliveryServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServiceOptions }
     *     
     */
    public DeliveryServiceOptions getDeliveryServiceOptions() {
        return deliveryServiceOptions;
    }

    /**
     * Sets the value of the deliveryServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServiceOptions }
     *     
     */
    public void setDeliveryServiceOptions(DeliveryServiceOptions value) {
        this.deliveryServiceOptions = value;
    }

}
