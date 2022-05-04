
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city_code" type="{http://www.westernunion.com/schema/xrsi}city_code" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.westernunion.com/schema/xrsi}mobile_number" minOccurs="0"/>
 *         &lt;element name="sms_flag" type="{http://www.westernunion.com/schema/xrsi}sms_flag" minOccurs="0"/>
 *         &lt;element name="override_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "cityCode",
    "number",
    "smsFlag",
    "overrideFlag"
})
public class MobileDetails {

    @XmlElement(name = "city_code")
    protected String cityCode;
    protected String number;
    @XmlElement(name = "sms_flag")
    protected String smsFlag;
    @XmlElement(name = "override_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag overrideFlag;

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the smsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsFlag() {
        return smsFlag;
    }

    /**
     * Sets the value of the smsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsFlag(String value) {
        this.smsFlag = value;
    }

    /**
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setOverrideFlag(YesNoFlag value) {
        this.overrideFlag = value;
    }

}
