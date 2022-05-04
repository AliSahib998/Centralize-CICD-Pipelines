
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>XRSIDasReply</b> object contains the Data Reply details <br>
 *             				i.e. everything between <das-reply>...</das-reply> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "h2h-das-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "mtml"
})
public class XRSIDasReply
    extends ReplyTransactionBase
{

    @XmlElement(name = "MTML", required = true)
    protected DASMtml mtml;

    /**
     * Gets the value of the mtml property.
     * 
     * @return
     *     possible object is
     *     {@link DASMtml }
     *     
     */
    public DASMtml getMTML() {
        return mtml;
    }

    /**
     * Sets the value of the mtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASMtml }
     *     
     */
    public void setMTML(DASMtml value) {
        this.mtml = value;
    }

}
