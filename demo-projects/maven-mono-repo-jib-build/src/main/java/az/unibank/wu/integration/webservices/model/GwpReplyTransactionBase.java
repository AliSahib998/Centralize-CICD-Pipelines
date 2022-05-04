
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_reply_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gwp_reply_transaction_base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}gwp_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="informational_messages" type="{http://www.westernunion.com/schema/xrsi}informational_messages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gwp_reply_transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "informationalMessages"
})
public class GwpReplyTransactionBase
    extends GwpTransactionBase
{

    @XmlElement(name = "informational_messages")
    protected InformationalMessages informationalMessages;

    /**
     * Gets the value of the informationalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link InformationalMessages }
     *     
     */
    public InformationalMessages getInformationalMessages() {
        return informationalMessages;
    }

    /**
     * Sets the value of the informationalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationalMessages }
     *     
     */
    public void setInformationalMessages(InformationalMessages value) {
        this.informationalMessages = value;
    }

}
