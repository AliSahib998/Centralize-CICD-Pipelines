
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curr_conversions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="curr_conversions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="curr_conversion" type="{http://www.westernunion.com/schema/xrsi}curr_conversion" maxOccurs="8"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curr_conversions", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "currConversion"
})
public class CurrConversions
    extends CollectionBase
{

    @XmlElement(name = "curr_conversion", required = true)
    protected List<CurrConversion> currConversion;

    /**
     * Gets the value of the currConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrConversion }
     * 
     * 
     */
    public List<CurrConversion> getCurrConversion() {
        if (currConversion == null) {
            currConversion = new ArrayList<CurrConversion>();
        }
        return this.currConversion;
    }

}
