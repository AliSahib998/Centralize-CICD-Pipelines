
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for action_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="action_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delay_to_action" type="{http://www.westernunion.com/schema/xrsi}delay_to_action" minOccurs="0"/>
 *         &lt;element name="auto_action" type="{http://www.westernunion.com/schema/xrsi}auto_action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "action_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "delayToAction",
    "autoAction"
})
public class ActionInfo {

    @XmlElement(name = "delay_to_action")
    protected String delayToAction;
    @XmlElement(name = "auto_action")
    @XmlSchemaType(name = "string")
    protected AutoAction autoAction;

    /**
     * Gets the value of the delayToAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayToAction() {
        return delayToAction;
    }

    /**
     * Sets the value of the delayToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayToAction(String value) {
        this.delayToAction = value;
    }

    /**
     * Gets the value of the autoAction property.
     * 
     * @return
     *     possible object is
     *     {@link AutoAction }
     *     
     */
    public AutoAction getAutoAction() {
        return autoAction;
    }

    /**
     * Sets the value of the autoAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoAction }
     *     
     */
    public void setAutoAction(AutoAction value) {
        this.autoAction = value;
    }

}
