
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addl_service_block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addl_service_block">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addl_service_length" type="{http://www.westernunion.com/schema/xrsi}addl_service_length" minOccurs="0"/>
 *         &lt;element name="addl_service_data_buffer" type="{http://www.westernunion.com/schema/xrsi}addl_service_data_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addl_service_block", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "addlServiceLength",
    "addlServiceDataBuffer"
})
public class AddlServiceBlock {

    @XmlElement(name = "addl_service_length")
    protected Short addlServiceLength;
    @XmlElement(name = "addl_service_data_buffer")
    protected String addlServiceDataBuffer;

    /**
     * Gets the value of the addlServiceLength property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAddlServiceLength() {
        return addlServiceLength;
    }

    /**
     * Sets the value of the addlServiceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAddlServiceLength(Short value) {
        this.addlServiceLength = value;
    }

    /**
     * Gets the value of the addlServiceDataBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceDataBuffer() {
        return addlServiceDataBuffer;
    }

    /**
     * Sets the value of the addlServiceDataBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceDataBuffer(String value) {
        this.addlServiceDataBuffer = value;
    }

}
