
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_phones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additional_phones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.westernunion.com/schema/xrsi}phone_with_type" maxOccurs="6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_phones", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "phone"
})
public class AdditionalPhones {

    @XmlElement(required = true)
    protected List<PhoneWithType> phone;

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneWithType }
     * 
     * 
     */
    public List<PhoneWithType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneWithType>();
        }
        return this.phone;
    }

}
