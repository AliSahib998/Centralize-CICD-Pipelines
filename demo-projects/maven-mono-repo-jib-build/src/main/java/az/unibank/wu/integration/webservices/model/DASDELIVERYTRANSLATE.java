
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASDELIVERYTRANSLATE_Type</b> object contains the DASDELIVERYTRANSLATE_Type details 
 *             				for one City/State combination.<br>
 *             				e.g. everything between <GETCITYSTATELIST>...</GETCITYSTATELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASDELIVERYTRANSLATE_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASDELIVERYTRANSLATE {

    @XmlElement(name = "ENGLISH_MESSAGE", required = true)
    protected String englishmessage;
    @XmlElement(name = "TRANSL_MESSAGE", required = true)
    protected String translmessage;

    /**
     * Gets the value of the englishmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENGLISHMESSAGE() {
        return englishmessage;
    }

    /**
     * Sets the value of the englishmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENGLISHMESSAGE(String value) {
        this.englishmessage = value;
    }

    /**
     * Gets the value of the translmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSLMESSAGE() {
        return translmessage;
    }

    /**
     * Sets the value of the translmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSLMESSAGE(String value) {
        this.translmessage = value;
    }

}
