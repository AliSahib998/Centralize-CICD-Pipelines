
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASFlag</b> object contains one basic description line.<br>
 *             				e.g. everything between <GETWUCARDPERCHANGES>...</GETWUCARDPERCHANGES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRIPTION_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASFlag {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String templateLineData;

    /**
     * Gets the value of the templateLineData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateLineData() {
        return templateLineData;
    }

    /**
     * Sets the value of the templateLineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateLineData(String value) {
        this.templateLineData = value;
    }

}
