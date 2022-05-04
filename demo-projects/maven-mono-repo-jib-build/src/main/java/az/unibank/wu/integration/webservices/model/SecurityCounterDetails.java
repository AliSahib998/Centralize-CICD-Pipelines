
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_counter_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security_counter_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security_counter" type="{http://www.westernunion.com/schema/xrsi}security_counter" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_counter_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "securityCounter"
})
public class SecurityCounterDetails {

    @XmlElement(name = "security_counter", required = true)
    protected List<SecurityCounter> securityCounter;

    /**
     * Gets the value of the securityCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCounter }
     * 
     * 
     */
    public List<SecurityCounter> getSecurityCounter() {
        if (securityCounter == null) {
            securityCounter = new ArrayList<SecurityCounter>();
        }
        return this.securityCounter;
    }

}
