
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReply</b> object contains the MTML Reply details <br>
 *             				i.e. everything between <REPLY>...</REPLY> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REPLYType", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dasDataContext"
})
public class DASReply {

    @XmlElement(name = "DATA_CONTEXT", required = true)
    protected DASDataContext dasDataContext;
    @XmlAttribute(name = "HOST")
    protected String host;
    @XmlAttribute(name = "CLIENT")
    protected String client;
    @XmlAttribute(name = "TYPE")
    protected String type;

    /**
     * Gets the value of the dasDataContext property.
     * 
     * @return
     *     possible object is
     *     {@link DASDataContext }
     *     
     */
    public DASDataContext getDASDataContext() {
        return dasDataContext;
    }

    /**
     * Sets the value of the dasDataContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASDataContext }
     *     
     */
    public void setDASDataContext(DASDataContext value) {
        this.dasDataContext = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

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

}
