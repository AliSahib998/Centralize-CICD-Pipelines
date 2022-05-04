
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GETREASONCODELIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GETREASONCODELIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="REASON_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REASON_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADJ_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADJ_SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DF_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETREASONCODELIST_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class GETREASONCODELISTType {

    @XmlElement(name = "REASON_CODE", required = true)
    protected String reasonCode;
    @XmlElement(name = "REASON_DESC")
    protected String reasonDescription;
    @XmlElement(name = "ADJ_TYPE")
    protected String adjustmentTypeDescription;
    @XmlElement(name = "ADJ_SUBTYPE")
    protected String adjustmentSubTypeDescription;
    @XmlElement(name = "DF_IND")
    protected String dfIndicatorDescription;

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

    /**
     * Gets the value of the adjustmentTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentTypeDescription() {
        return adjustmentTypeDescription;
    }

    /**
     * Sets the value of the adjustmentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentTypeDescription(String value) {
        this.adjustmentTypeDescription = value;
    }

    /**
     * Gets the value of the adjustmentSubTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentSubTypeDescription() {
        return adjustmentSubTypeDescription;
    }

    /**
     * Sets the value of the adjustmentSubTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentSubTypeDescription(String value) {
        this.adjustmentSubTypeDescription = value;
    }

    /**
     * Gets the value of the dfIndicatorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFIndicatorDescription() {
        return dfIndicatorDescription;
    }

    /**
     * Sets the value of the dfIndicatorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFIndicatorDescription(String value) {
        this.dfIndicatorDescription = value;
    }

}
