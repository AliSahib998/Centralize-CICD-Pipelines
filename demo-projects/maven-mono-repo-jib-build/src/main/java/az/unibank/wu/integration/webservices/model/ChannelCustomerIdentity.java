
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer_identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_customer_identity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_base">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_type"/>
 *         &lt;element name="data" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_data"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_customer_identity", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type",
    "data"
})
public class ChannelCustomerIdentity
    extends ChannelCustomerIdentityBase
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChannelCustomerIdentityType type;
    @XmlElement(required = true)
    protected String data;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomerIdentityType }
     *     
     */
    public ChannelCustomerIdentityType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomerIdentityType }
     *     
     */
    public void setType(ChannelCustomerIdentityType value) {
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
