
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_operation_hours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qqc_operation_hours">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opening" type="{http://www.westernunion.com/schema/xrsi}qqc_hours" minOccurs="0"/>
 *         &lt;element name="closing" type="{http://www.westernunion.com/schema/xrsi}qqc_hours" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_operation_hours", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "opening",
    "closing"
})
public class QqcOperationHours {

    protected String opening;
    protected String closing;

    /**
     * Gets the value of the opening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpening(String value) {
        this.opening = value;
    }

    /**
     * Gets the value of the closing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosing() {
        return closing;
    }

    /**
     * Sets the value of the closing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosing(String value) {
        this.closing = value;
    }

}
