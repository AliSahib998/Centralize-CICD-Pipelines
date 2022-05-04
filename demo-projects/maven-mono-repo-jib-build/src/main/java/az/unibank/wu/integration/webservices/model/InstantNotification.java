
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instant_notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instant_notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addl_service_charges" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="addl_service_block" type="{http://www.westernunion.com/schema/xrsi}addl_service_block" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instant_notification", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "addlServiceCharges",
    "addlServiceBlock"
})
public class InstantNotification {

    @XmlElement(name = "addl_service_charges")
    protected String addlServiceCharges;
    @XmlElement(name = "addl_service_block")
    protected AddlServiceBlock addlServiceBlock;

    /**
     * Gets the value of the addlServiceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceCharges() {
        return addlServiceCharges;
    }

    /**
     * Sets the value of the addlServiceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceCharges(String value) {
        this.addlServiceCharges = value;
    }

    /**
     * Gets the value of the addlServiceBlock property.
     * 
     * @return
     *     possible object is
     *     {@link AddlServiceBlock }
     *     
     */
    public AddlServiceBlock getAddlServiceBlock() {
        return addlServiceBlock;
    }

    /**
     * Sets the value of the addlServiceBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlServiceBlock }
     *     
     */
    public void setAddlServiceBlock(AddlServiceBlock value) {
        this.addlServiceBlock = value;
    }

}
