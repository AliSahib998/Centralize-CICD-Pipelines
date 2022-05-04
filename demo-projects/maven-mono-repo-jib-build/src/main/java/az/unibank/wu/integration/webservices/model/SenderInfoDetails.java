
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sender_info_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sender_info_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="sender_info" type="{http://www.westernunion.com/schema/xrsi}sender_info" maxOccurs="15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sender_info_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "senderInfo"
})
public class SenderInfoDetails
    extends CollectionBase
{

    @XmlElement(name = "sender_info")
    protected List<SenderInfo> senderInfo;

    /**
     * Gets the value of the senderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SenderInfo }
     * 
     * 
     */
    public List<SenderInfo> getSenderInfo() {
        if (senderInfo == null) {
            senderInfo = new ArrayList<SenderInfo>();
        }
        return this.senderInfo;
    }

}
