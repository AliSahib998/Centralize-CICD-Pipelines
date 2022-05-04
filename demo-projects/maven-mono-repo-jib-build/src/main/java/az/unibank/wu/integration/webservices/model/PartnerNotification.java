
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partner_notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notification_requested" type="{http://www.westernunion.com/schema/xrsi}notification_requested" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_notification", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "notificationRequested"
})
public class PartnerNotification {

    @XmlElement(name = "notification_requested")
    @XmlSchemaType(name = "string")
    protected NotificationRequested notificationRequested;

    /**
     * Gets the value of the notificationRequested property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationRequested }
     *     
     */
    public NotificationRequested getNotificationRequested() {
        return notificationRequested;
    }

    /**
     * Sets the value of the notificationRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationRequested }
     *     
     */
    public void setNotificationRequested(NotificationRequested value) {
        this.notificationRequested = value;
    }

}
