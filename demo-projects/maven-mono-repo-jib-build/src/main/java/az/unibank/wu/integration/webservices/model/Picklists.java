
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="picklists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobile_sender_names" type="{http://www.westernunion.com/schema/xrsi}picklist_mobile_sender_names" minOccurs="0"/>
 *         &lt;element name="origination" type="{http://www.westernunion.com/schema/xrsi}picklist_origination" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.westernunion.com/schema/xrsi}picklist_destination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklists", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "mobileSenderNames",
    "origination",
    "destination"
})
public class Picklists {

    @XmlElement(name = "mobile_sender_names")
    protected PicklistMobileSenderNames mobileSenderNames;
    protected PicklistOrigination origination;
    protected PicklistDestination destination;

    /**
     * Gets the value of the mobileSenderNames property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistMobileSenderNames }
     *     
     */
    public PicklistMobileSenderNames getMobileSenderNames() {
        return mobileSenderNames;
    }

    /**
     * Sets the value of the mobileSenderNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistMobileSenderNames }
     *     
     */
    public void setMobileSenderNames(PicklistMobileSenderNames value) {
        this.mobileSenderNames = value;
    }

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistOrigination }
     *     
     */
    public PicklistOrigination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistOrigination }
     *     
     */
    public void setOrigination(PicklistOrigination value) {
        this.origination = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistDestination }
     *     
     */
    public PicklistDestination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistDestination }
     *     
     */
    public void setDestination(PicklistDestination value) {
        this.destination = value;
    }

}
