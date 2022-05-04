
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curr_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="curr_data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curr_info" type="{http://www.westernunion.com/schema/xrsi}curr_info" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curr_data", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "currInfo"
})
public class CurrData {

    @XmlElement(name = "curr_info")
    protected List<CurrInfo> currInfo;

    /**
     * Gets the value of the currInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrInfo }
     * 
     * 
     */
    public List<CurrInfo> getCurrInfo() {
        if (currInfo == null) {
            currInfo = new ArrayList<CurrInfo>();
        }
        return this.currInfo;
    }

}
