
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convenience_search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convenience_search">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}convenience_search_type" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.westernunion.com/schema/xrsi}convenience_search_key" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="suppress_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="conv_session_cookie" type="{http://www.westernunion.com/schema/xrsi}convenience_cookie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convenience_search", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type",
    "key",
    "flag",
    "suppressFlag",
    "convSessionCookie"
})
public class ConvenienceSearch {

    protected String type;
    protected String key;
    protected String flag;
    @XmlElement(name = "suppress_flag")
    protected String suppressFlag;
    @XmlElement(name = "conv_session_cookie")
    protected String convSessionCookie;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the suppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressFlag() {
        return suppressFlag;
    }

    /**
     * Sets the value of the suppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressFlag(String value) {
        this.suppressFlag = value;
    }

    /**
     * Gets the value of the convSessionCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSessionCookie() {
        return convSessionCookie;
    }

    /**
     * Sets the value of the convSessionCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSessionCookie(String value) {
        this.convSessionCookie = value;
    }

}
