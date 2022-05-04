
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiverType" type="{http://www.westernunion.com/schema/xrsi}ReceiverType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverTypes", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "receiverType"
})
public class ReceiverTypes {

    @XmlElement(name = "ReceiverType")
    protected List<ReceiverType> receiverType;

    /**
     * Gets the value of the receiverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverType }
     * 
     * 
     */
    public List<ReceiverType> getReceiverType() {
        if (receiverType == null) {
            receiverType = new ArrayList<ReceiverType>();
        }
        return this.receiverType;
    }

}
