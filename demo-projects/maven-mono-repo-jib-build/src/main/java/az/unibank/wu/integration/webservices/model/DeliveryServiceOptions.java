
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery_service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delivery_service_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delivery_service_record" type="{http://www.westernunion.com/schema/xrsi}delivery_service_record" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery_service_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "deliveryServiceRecord"
})
public class DeliveryServiceOptions {

    @XmlElement(name = "delivery_service_record")
    protected List<DeliveryServiceRecord> deliveryServiceRecord;

    /**
     * Gets the value of the deliveryServiceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryServiceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryServiceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryServiceRecord }
     * 
     * 
     */
    public List<DeliveryServiceRecord> getDeliveryServiceRecord() {
        if (deliveryServiceRecord == null) {
            deliveryServiceRecord = new ArrayList<DeliveryServiceRecord>();
        }
        return this.deliveryServiceRecord;
    }

}
