
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gbs_service_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service_option" type="{http://www.westernunion.com/schema/xrsi}gbs_service_option" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_service_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "serviceOption"
})
public class GbsServiceOptions {

    @XmlElement(name = "service_option", required = true)
    protected List<GbsServiceOption> serviceOption;

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
     * {@link GbsServiceOption }
     * 
     * 
     */
    public List<GbsServiceOption> getServiceOption() {
        if (serviceOption == null) {
            serviceOption = new ArrayList<GbsServiceOption>();
        }
        return this.serviceOption;
    }

}
