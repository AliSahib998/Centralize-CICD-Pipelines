
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service_option" type="{http://www.westernunion.com/schema/xrsi}service_option" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "serviceOption"
})
public class ServiceOptions {

    @XmlElement(name = "service_option")
    protected List<ServiceOption> serviceOption;

    /**
     * Gets the value of the serviceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOption }
     * 
     * 
     */
    public List<ServiceOption> getServiceOption() {
        if (serviceOption == null) {
            serviceOption = new ArrayList<ServiceOption>();
        }
        return this.serviceOption;
    }

}
