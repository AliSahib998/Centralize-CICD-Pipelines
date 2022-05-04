
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notification_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}notification_type" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.westernunion.com/schema/xrsi}notification_destination" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.westernunion.com/schema/xrsi}notification_event" minOccurs="0"/>
 *         &lt;element name="reply" type="{http://www.westernunion.com/schema/xrsi}notification_reply" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notification_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type",
    "destination",
    "event",
    "reply"
})
public class NotificationInfo {

    @XmlSchemaType(name = "string")
    protected NotificationType type;
    @XmlSchemaType(name = "string")
    protected NotificationDestination destination;
    @XmlSchemaType(name = "string")
    protected NotificationEvent event;
    protected NotificationReply reply;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setType(NotificationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationDestination }
     *     
     */
    public NotificationDestination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDestination }
     *     
     */
    public void setDestination(NotificationDestination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEvent }
     *     
     */
    public NotificationEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEvent }
     *     
     */
    public void setEvent(NotificationEvent value) {
        this.event = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationReply }
     *     
     */
    public NotificationReply getReply() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationReply }
     *     
     */
    public void setReply(NotificationReply value) {
        this.reply = value;
    }

}
