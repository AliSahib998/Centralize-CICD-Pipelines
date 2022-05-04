
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASBannerMsg</b> object contains one banner message<br>
 *             				and is currently used for WU (Global)and WU Agent Specific
 *             				banner messages.
 *             				e.g. everything between <GETWUBANNERMSGS>...</GETWUBANNERMSGS> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BANNERMESSAGE_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASBannerMsg {

    @XmlElement(name = "ERR_CODE")
    protected String templateIndex;
    @XmlElement(name = "ERR_MESSAGE")
    protected String bannerMessage;

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
     * Gets the value of the bannerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerMessage() {
        return bannerMessage;
    }

    /**
     * Sets the value of the bannerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerMessage(String value) {
        this.bannerMessage = value;
    }

}
