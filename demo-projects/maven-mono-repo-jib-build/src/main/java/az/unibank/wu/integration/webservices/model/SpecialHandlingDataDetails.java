
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for special_handling_data_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="special_handling_data_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="special_handling_data" type="{http://www.westernunion.com/schema/xrsi}special_handling_data" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "special_handling_data_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "specialHandlingData"
})
public class SpecialHandlingDataDetails
    extends CollectionBase
{

    @XmlElement(name = "special_handling_data")
    protected List<SpecialHandlingData> specialHandlingData;

    /**
     * Gets the value of the specialHandlingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingData }
     * 
     * 
     */
    public List<SpecialHandlingData> getSpecialHandlingData() {
        if (specialHandlingData == null) {
            specialHandlingData = new ArrayList<SpecialHandlingData>();
        }
        return this.specialHandlingData;
    }

}
