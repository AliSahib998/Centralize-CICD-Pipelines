
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phone_with_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phone_with_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}mobile_phone">
 *       &lt;attribute name="type" type="{http://www.westernunion.com/schema/xrsi}phone_type" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phone_with_type", namespace = "http://www.westernunion.com/schema/xrsi")
public class PhoneWithType
    extends MobilePhone
{

    @XmlAttribute(name = "type")
    protected PhoneType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setType(PhoneType value) {
        this.type = value;
    }

}
