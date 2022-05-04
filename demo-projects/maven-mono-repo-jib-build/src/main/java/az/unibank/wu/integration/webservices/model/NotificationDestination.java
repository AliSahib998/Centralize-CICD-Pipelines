
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_destination.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="notification_destination">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECORDING_PARTNER"/>
 *     &lt;enumeration value="PAYING_PARTNER"/>
 *     &lt;enumeration value="SENDER_MOBILE"/>
 *     &lt;enumeration value="RECEIVER_MOBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notification_destination", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NotificationDestination {

    RECORDING_PARTNER,
    PAYING_PARTNER,
    SENDER_MOBILE,
    RECEIVER_MOBILE;

    public String value() {
        return name();
    }

    public static NotificationDestination fromValue(String v) {
        return valueOf(v);
    }

}
