
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routing_params" type="{http://www.westernunion.com/schema/xrsi}routing_params" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routing", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "routingParams"
})
public class Routing {

    @XmlElement(name = "routing_params")
    protected List<RoutingParams> routingParams;

    /**
     * Gets the value of the routingParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingParams }
     * 
     * 
     */
    public List<RoutingParams> getRoutingParams() {
        if (routingParams == null) {
            routingParams = new ArrayList<RoutingParams>();
        }
        return this.routingParams;
    }

}
