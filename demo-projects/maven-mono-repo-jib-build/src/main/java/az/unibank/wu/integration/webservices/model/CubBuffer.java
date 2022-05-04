
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cub_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cub_buffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cub_buffer" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cub_buffer", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "cubBuffer"
})
public class CubBuffer {

    @XmlElement(name = "cub_buffer")
    protected String cubBuffer;

    /**
     * Gets the value of the cubBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubBuffer() {
        return cubBuffer;
    }

    /**
     * Sets the value of the cubBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubBuffer(String value) {
        this.cubBuffer = value;
    }

}
