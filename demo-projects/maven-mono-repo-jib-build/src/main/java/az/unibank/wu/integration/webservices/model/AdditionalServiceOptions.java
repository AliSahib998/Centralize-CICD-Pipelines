
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additional_service_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additional_service_option" type="{http://www.westernunion.com/schema/xrsi}additional_service_option" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_service_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "additionalServiceOption"
})
public class AdditionalServiceOptions {

    @XmlElement(name = "additional_service_option")
    protected List<AdditionalServiceOption> additionalServiceOption;

    /**
     * Gets the value of the additionalServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServiceOption }
     * 
     * 
     */
    public List<AdditionalServiceOption> getAdditionalServiceOption() {
        if (additionalServiceOption == null) {
            additionalServiceOption = new ArrayList<AdditionalServiceOption>();
        }
        return this.additionalServiceOption;
    }

}
