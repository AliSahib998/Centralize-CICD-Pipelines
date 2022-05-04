
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetMessageList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETMESSAGELIST>...</GETMESSAGELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETMESSAGELIST_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASGetMessageList {

    @XmlElement(name = "MESSAGE_NAME")
    protected String msgname;
    @XmlElement(name = "MESSAGE_TEXT")
    protected String messagetext;

    /**
     * Gets the value of the msgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGNAME() {
        return msgname;
    }

    /**
     * Sets the value of the msgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGNAME(String value) {
        this.msgname = value;
    }

    /**
     * Gets the value of the messagetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGETEXT() {
        return messagetext;
    }

    /**
     * Sets the value of the messagetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGETEXT(String value) {
        this.messagetext = value;
    }

}
