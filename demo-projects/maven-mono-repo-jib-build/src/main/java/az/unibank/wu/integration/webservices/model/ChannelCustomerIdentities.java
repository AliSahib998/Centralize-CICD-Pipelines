
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer_identities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_customer_identities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identity" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_customer_identities", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "identity"
})
public class ChannelCustomerIdentities {

    @XmlElement(required = true)
    protected List<ChannelCustomerIdentity> identity;

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelCustomerIdentity }
     * 
     * 
     */
    public List<ChannelCustomerIdentity> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<ChannelCustomerIdentity>();
        }
        return this.identity;
    }

}
