
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer_identity_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_customer_identity_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="primary" type="{http://www.westernunion.com/schema/xrsi}yes_no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_customer_identity_base", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlSeeAlso({
    ChannelCustomerIdentity.class
})
public class ChannelCustomerIdentityBase {

    @XmlAttribute(name = "primary")
    protected YesNo primary;

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrimary(YesNo value) {
        this.primary = value;
    }

}
