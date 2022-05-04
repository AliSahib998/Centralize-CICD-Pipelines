
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for informational_messages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informational_messages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informational_message" type="{http://www.westernunion.com/schema/xrsi}message" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informational_messages", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "informationalMessage"
})
public class InformationalMessages {

    @XmlElement(name = "informational_message", required = true)
    protected List<String> informationalMessage;

    /**
     * Gets the value of the informationalMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationalMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationalMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInformationalMessage() {
        if (informationalMessage == null) {
            informationalMessage = new ArrayList<String>();
        }
        return this.informationalMessage;
    }

}
