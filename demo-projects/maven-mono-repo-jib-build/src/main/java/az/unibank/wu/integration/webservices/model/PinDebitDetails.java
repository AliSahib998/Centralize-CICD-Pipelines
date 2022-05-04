
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pin_debit_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pin_debit_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://www.westernunion.com/schema/xrsi}pin_debit_flag" minOccurs="0"/>
 *         &lt;element name="pinpad_params" type="{http://www.westernunion.com/schema/xrsi}pinpad_params" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pin_debit_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "available",
    "pinpadParams"
})
public class PinDebitDetails {

    protected String available;
    @XmlElement(name = "pinpad_params")
    protected PinpadParams pinpadParams;

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailable(String value) {
        this.available = value;
    }

    /**
     * Gets the value of the pinpadParams property.
     * 
     * @return
     *     possible object is
     *     {@link PinpadParams }
     *     
     */
    public PinpadParams getPinpadParams() {
        return pinpadParams;
    }

    /**
     * Sets the value of the pinpadParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinpadParams }
     *     
     */
    public void setPinpadParams(PinpadParams value) {
        this.pinpadParams = value;
    }

}
