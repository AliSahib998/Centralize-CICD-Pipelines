
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country_info_messages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="country_info_messages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="country_info_message" type="{http://www.westernunion.com/schema/xrsi}message" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country_info_messages", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "countryInfoMessage"
})
public class CountryInfoMessages
    extends CollectionBase
{

    @XmlElement(name = "country_info_message")
    protected List<String> countryInfoMessage;

    /**
     * Gets the value of the countryInfoMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryInfoMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryInfoMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryInfoMessage() {
        if (countryInfoMessage == null) {
            countryInfoMessage = new ArrayList<String>();
        }
        return this.countryInfoMessage;
    }

}
