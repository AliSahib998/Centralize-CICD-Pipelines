
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone_identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_phone_identity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}mobile_phone_identity_type"/>
 *         &lt;element name="data" type="{http://www.westernunion.com/schema/xrsi}mobile_phone_identity_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_phone_identity", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type",
    "data"
})
public class MobilePhoneIdentity {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MobilePhoneIdentityType type;
    @XmlElement(required = true)
    protected String data;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhoneIdentityType }
     *     
     */
    public MobilePhoneIdentityType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhoneIdentityType }
     *     
     */
    public void setType(MobilePhoneIdentityType value) {
        this.type = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
