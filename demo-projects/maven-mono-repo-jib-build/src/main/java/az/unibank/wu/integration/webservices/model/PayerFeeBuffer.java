
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payer_fee_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payer_fee_buffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="network_id" type="{http://www.westernunion.com/schema/xrsi}network_id" minOccurs="0"/>
 *         &lt;element name="delivery_service_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payer_fee_buffer", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "networkId",
    "deliveryServiceCode",
    "charges"
})
public class PayerFeeBuffer {

    @XmlElement(name = "network_id")
    protected String networkId;
    @XmlElement(name = "delivery_service_code")
    protected String deliveryServiceCode;
    protected Long charges;

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
     * Gets the value of the deliveryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceCode() {
        return deliveryServiceCode;
    }

    /**
     * Sets the value of the deliveryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceCode(String value) {
        this.deliveryServiceCode = value;
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

}
