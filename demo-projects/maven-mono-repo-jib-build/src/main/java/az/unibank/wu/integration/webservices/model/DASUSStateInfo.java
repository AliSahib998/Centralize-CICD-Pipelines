
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASUSStateInfo</b> object contains the US State Code and Name 
 *             				for one US State<br>
 *             				e.g. everything between <GETUSSTATELIST>...</GETUSSTATELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USSTATEINFO_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASUSStateInfo {

    @XmlElement(name = "STATE_CODE", required = true)
    protected String stateCode;
    @XmlElement(name = "STATE_NAME", required = true)
    protected String stateName;

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

}
