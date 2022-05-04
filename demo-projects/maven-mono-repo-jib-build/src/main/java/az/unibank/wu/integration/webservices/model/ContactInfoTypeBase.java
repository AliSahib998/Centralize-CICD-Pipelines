
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact_info_type_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact_info_type_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="contact_info_type" type="{http://www.westernunion.com/schema/xrsi}contact_info_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact_info_type_base", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlSeeAlso({
    ContactInfo.class
})
public class ContactInfoTypeBase {

    @XmlAttribute(name = "contact_info_type")
    protected ContactInfoType contactInfoType;

    /**
     * Gets the value of the contactInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfoType() {
        return contactInfoType;
    }

    /**
     * Sets the value of the contactInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfoType(ContactInfoType value) {
        this.contactInfoType = value;
    }

}
