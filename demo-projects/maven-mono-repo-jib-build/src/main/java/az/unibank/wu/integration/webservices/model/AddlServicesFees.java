
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addl_services_fees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addl_services_fees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addl_service_fee" type="{http://www.westernunion.com/schema/xrsi}addl_service_fee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addl_services_fees", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "addlServiceFee"
})
public class AddlServicesFees {

    @XmlElement(name = "addl_service_fee")
    protected List<AddlServiceFee> addlServiceFee;

    /**
     * Gets the value of the addlServiceFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addlServiceFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddlServiceFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlServiceFee }
     * 
     * 
     */
    public List<AddlServiceFee> getAddlServiceFee() {
        if (addlServiceFee == null) {
            addlServiceFee = new ArrayList<AddlServiceFee>();
        }
        return this.addlServiceFee;
    }

}
