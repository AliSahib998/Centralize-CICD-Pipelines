
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for heartbeat_reply_status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_reply_status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.westernunion.com/schema/xrsi}heartbeat_status_code" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.westernunion.com/schema/xrsi}message" minOccurs="0"/>
 *         &lt;element name="reference_no" type="{http://www.westernunion.com/schema/xrsi}external_reference_no" minOccurs="0"/>
 *         &lt;element name="response_data" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="buffer" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_reply_status", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "code",
    "message",
    "referenceNo",
    "responseData",
    "buffer"
})
public class HeartbeatReplyStatus {

    protected BigInteger code;
    protected String message;
    @XmlElement(name = "reference_no")
    protected String referenceNo;
    @XmlElement(name = "response_data")
    protected String responseData;
    protected String buffer;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
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

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

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

}
