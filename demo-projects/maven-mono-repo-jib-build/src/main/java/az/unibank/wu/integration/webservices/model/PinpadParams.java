
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pinpad_params complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pinpad_params">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trans_id" type="{http://www.westernunion.com/schema/xrsi}acculynk_trans_id" minOccurs="0"/>
 *         &lt;element name="guid" type="{http://www.westernunion.com/schema/xrsi}acculynk_guid" minOccurs="0"/>
 *         &lt;element name="modulus" type="{http://www.westernunion.com/schema/xrsi}acculynk_modulus" minOccurs="0"/>
 *         &lt;element name="exponent" type="{http://www.westernunion.com/schema/xrsi}acculynk_exponent" minOccurs="0"/>
 *         &lt;element name="entry_result" type="{http://www.westernunion.com/schema/xrsi}acculynk_error_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pinpad_params", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "transId",
    "guid",
    "modulus",
    "exponent",
    "entryResult"
})
public class PinpadParams {

    @XmlElement(name = "trans_id")
    protected String transId;
    protected String guid;
    protected String modulus;
    protected String exponent;
    @XmlElement(name = "entry_result")
    protected String entryResult;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulus(String value) {
        this.modulus = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExponent(String value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the entryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryResult() {
        return entryResult;
    }

    /**
     * Sets the value of the entryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryResult(String value) {
        this.entryResult = value;
    }

}
