
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASDataContext</b> object contains the Data Context details <br>
 *             				i.e. everything between <DATA_CONTEXT>...</DATA_CONTEXT> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATA_CONTEXT_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dasHeader",
    "dasRecordSet"
})
public class DASDataContext {

    @XmlElement(name = "HEADER", required = true)
    protected DASHeader dasHeader;
    @XmlElement(name = "RECORDSET")
    protected DASRecord dasRecordSet;

    /**
     * Gets the value of the dasHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DASHeader }
     *     
     */
    public DASHeader getDASHeader() {
        return dasHeader;
    }

    /**
     * Sets the value of the dasHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASHeader }
     *     
     */
    public void setDASHeader(DASHeader value) {
        this.dasHeader = value;
    }

    /**
     * Gets the value of the dasRecordSet property.
     * 
     * @return
     *     possible object is
     *     {@link DASRecord }
     *     
     */
    public DASRecord getDASRecordSet() {
        return dasRecordSet;
    }

    /**
     * Sets the value of the dasRecordSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASRecord }
     *     
     */
    public void setDASRecordSet(DASRecord value) {
        this.dasRecordSet = value;
    }

}
