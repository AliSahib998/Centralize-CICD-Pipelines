
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReasonList</b> object contains Reason List for Refund and Cancel transactions.<br>
 *             				e.g. everything between <GETREASONLIST>...</GETREASONLIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REASONLIST_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASReasonList {

    @XmlElement(name = "REASON_CODE", required = true)
    protected String reasonCode;
    @XmlElement(name = "REASON_DESC")
    protected String reasonDescription;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Sets the value of the reasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

}
