
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phonevalidation_status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phonevalidation_status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response_data" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="buffer" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.westernunion.com/schema/xrsi}status" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.westernunion.com/schema/xrsi}message" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phonevalidation_status", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "responseData",
    "buffer",
    "code",
    "message"
})
public class PhonevalidationStatus {

    @XmlElement(name = "response_data")
    protected String responseData;
    protected String buffer;
    protected String code;
    protected String message;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseData(String value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the buffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffer() {
        return buffer;
    }

    /**
     * Sets the value of the buffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffer(String value) {
        this.buffer = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
