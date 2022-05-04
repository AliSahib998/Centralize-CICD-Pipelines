
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data_prompts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data_prompts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data_prompt" type="{http://www.westernunion.com/schema/xrsi}data_prompt" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_prompts", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dataPrompt"
})
public class DataPrompts {

    @XmlElement(name = "data_prompt")
    protected List<DataPrompt> dataPrompt;

    /**
     * Gets the value of the dataPrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPrompt }
     * 
     * 
     */
    public List<DataPrompt> getDataPrompt() {
        if (dataPrompt == null) {
            dataPrompt = new ArrayList<DataPrompt>();
        }
        return this.dataPrompt;
    }

}
