
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ch_type" type="{http://www.westernunion.com/schema/xrsi}ch_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channels", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "chType"
})
public class Channels {

    @XmlElement(name = "ch_type")
    @XmlSchemaType(name = "string")
    protected List<ChType> chType;

    /**
     * Gets the value of the chType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChType }
     * 
     * 
     */
    public List<ChType> getChType() {
        if (chType == null) {
            chType = new ArrayList<ChType>();
        }
        return this.chType;
    }

}
