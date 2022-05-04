
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReqResp</b> object contains the request or response from DAS <br>
 *             				i.e. everything between <MTML>...</MTML> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTMLType", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dasRequest",
    "dasReply"
})
public class DASMtml {

    @XmlElement(name = "REQUEST")
    protected DASRequest dasRequest;
    @XmlElement(name = "REPLY")
    protected DASReply dasReply;

    /**
     * Gets the value of the dasRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DASRequest }
     *     
     */
    public DASRequest getDASRequest() {
        return dasRequest;
    }

    /**
     * Sets the value of the dasRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASRequest }
     *     
     */
    public void setDASRequest(DASRequest value) {
        this.dasRequest = value;
    }

    /**
     * Gets the value of the dasReply property.
     * 
     * @return
     *     possible object is
     *     {@link DASReply }
     *     
     */
    public DASReply getDASReply() {
        return dasReply;
    }

    /**
     * Sets the value of the dasReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASReply }
     *     
     */
    public void setDASReply(DASReply value) {
        this.dasReply = value;
    }

}
