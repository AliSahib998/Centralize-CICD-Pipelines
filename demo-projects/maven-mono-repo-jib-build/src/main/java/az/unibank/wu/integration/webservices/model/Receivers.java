
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivers", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "receiver"
})
public class Receivers
    extends CollectionBase
{

    protected List<Receiver> receiver;

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Receiver }
     * 
     * 
     */
    public List<Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<Receiver>();
        }
        return this.receiver;
    }

}
