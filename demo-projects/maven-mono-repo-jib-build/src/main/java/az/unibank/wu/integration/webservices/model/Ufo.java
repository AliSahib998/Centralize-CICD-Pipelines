
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ufo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ufo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ufo_buffer" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *         &lt;element name="ufo_fields" type="{http://www.westernunion.com/schema/xrsi}ufo_fields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufo", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "ufoBuffer",
    "ufoFields"
})
public class Ufo {

    @XmlElement(name = "ufo_buffer")
    protected String ufoBuffer;
    @XmlElement(name = "ufo_fields")
    protected UfoFields ufoFields;

    /**
     * Gets the value of the ufoBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBuffer() {
        return ufoBuffer;
    }

    /**
     * Sets the value of the ufoBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBuffer(String value) {
        this.ufoBuffer = value;
    }

    /**
     * Gets the value of the ufoFields property.
     * 
     * @return
     *     possible object is
     *     {@link UfoFields }
     *     
     */
    public UfoFields getUfoFields() {
        return ufoFields;
    }

    /**
     * Sets the value of the ufoFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UfoFields }
     *     
     */
    public void setUfoFields(UfoFields value) {
        this.ufoFields = value;
    }

}
