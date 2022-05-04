
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routing_params complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routing_params">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routing_type" type="{http://www.westernunion.com/schema/xrsi}routing_type" minOccurs="0"/>
 *         &lt;element name="routing_param" type="{http://www.westernunion.com/schema/xrsi}Routing_code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routing_params", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "routingType",
    "routingParam"
})
public class RoutingParams {

    @XmlElement(name = "routing_type")
    protected String routingType;
    @XmlElement(name = "routing_param")
    protected List<String> routingParam;

    /**
     * Gets the value of the routingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingType() {
        return routingType;
    }

    /**
     * Sets the value of the routingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingType(String value) {
        this.routingType = value;
    }

    /**
     * Gets the value of the routingParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoutingParam() {
        if (routingParam == null) {
            routingParam = new ArrayList<String>();
        }
        return this.routingParam;
    }

}
