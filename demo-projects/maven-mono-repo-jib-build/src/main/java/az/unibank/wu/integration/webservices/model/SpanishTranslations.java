
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spanish_translations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spanish_translations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delivery_service_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination_country_name" type="{http://www.westernunion.com/schema/xrsi}country_name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spanish_translations", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "deliveryServiceName",
    "destinationCountryName"
})
public class SpanishTranslations {

    @XmlElement(name = "delivery_service_name")
    protected String deliveryServiceName;
    @XmlElement(name = "destination_country_name")
    protected String destinationCountryName;

    /**
     * Gets the value of the deliveryServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    /**
     * Sets the value of the deliveryServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceName(String value) {
        this.deliveryServiceName = value;
    }

    /**
     * Gets the value of the destinationCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /**
     * Sets the value of the destinationCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryName(String value) {
        this.destinationCountryName = value;
    }

}
