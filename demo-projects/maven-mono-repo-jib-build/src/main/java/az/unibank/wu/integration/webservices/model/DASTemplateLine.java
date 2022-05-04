
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASTemplateLine</b> object contains one basic template line.<br>
 *             				e.g. everything between <GETPRIVACYTEMPLATE>...</GETPRIVACYTEMPLATE> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASTEMPLATELINE_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASTemplateLine {

    @XmlElement(name = "PRODUCT")
    protected String productInfo;
    @XmlElement(name = "T_INDEX", required = true)
    protected String templateIndex;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String templateLineData;

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInfo(String value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the templateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateIndex() {
        return templateIndex;
    }

    /**
     * Sets the value of the templateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateIndex(String value) {
        this.templateIndex = value;
    }

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
