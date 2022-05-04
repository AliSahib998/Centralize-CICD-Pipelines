
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partner_equipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender_equipment" type="{http://www.westernunion.com/schema/xrsi}mobile_gwp_gbs_device" minOccurs="0"/>
 *         &lt;element name="receiver_equipment" type="{http://www.westernunion.com/schema/xrsi}mobile_gwp_gbs_device" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_equipment", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "senderEquipment",
    "receiverEquipment"
})
public class PartnerEquipment {

    @XmlElement(name = "sender_equipment")
    protected MobileGwpGbsDevice senderEquipment;
    @XmlElement(name = "receiver_equipment")
    protected MobileGwpGbsDevice receiverEquipment;

    /**
     * Gets the value of the senderEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public MobileGwpGbsDevice getSenderEquipment() {
        return senderEquipment;
    }

    /**
     * Sets the value of the senderEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public void setSenderEquipment(MobileGwpGbsDevice value) {
        this.senderEquipment = value;
    }

    /**
     * Gets the value of the receiverEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public MobileGwpGbsDevice getReceiverEquipment() {
        return receiverEquipment;
    }

    /**
     * Sets the value of the receiverEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public void setReceiverEquipment(MobileGwpGbsDevice value) {
        this.receiverEquipment = value;
    }

}
