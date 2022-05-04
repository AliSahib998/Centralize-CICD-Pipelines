
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_reply_notification_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_reply_notification_base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}mobile_notification_base">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.westernunion.com/schema/xrsi}mobile_notification_reply_status"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_reply_notification_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "status"
})
public class MobileReplyNotificationBase
    extends MobileNotificationBase
{

    @XmlElement(required = true)
    protected MobileNotificationReplyStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MobileNotificationReplyStatus }
     *     
     */
    public MobileNotificationReplyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileNotificationReplyStatus }
     *     
     */
    public void setStatus(MobileNotificationReplyStatus value) {
        this.status = value;
    }

}
