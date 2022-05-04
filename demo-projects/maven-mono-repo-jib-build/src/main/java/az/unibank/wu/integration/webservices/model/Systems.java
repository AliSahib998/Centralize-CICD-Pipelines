
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systems">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="system_info" type="{http://www.westernunion.com/schema/xrsi}info" maxOccurs="8"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systems", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "systemInfo"
})
public class Systems
    extends CollectionBase
{

    @XmlElement(name = "system_info", required = true)
    protected List<String> systemInfo;

    /**
     * Gets the value of the systemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystemInfo() {
        if (systemInfo == null) {
            systemInfo = new ArrayList<String>();
        }
        return this.systemInfo;
    }

}
