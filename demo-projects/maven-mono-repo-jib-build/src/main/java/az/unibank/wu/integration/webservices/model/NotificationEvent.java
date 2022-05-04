
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_event.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="notification_event">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONEY_AVAILABLE"/>
 *     &lt;enumeration value="MONEY_PAID"/>
 *     &lt;enumeration value="CASH_IN_ACCEPTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notification_event", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NotificationEvent {

    MONEY_AVAILABLE,
    MONEY_PAID,
    CASH_IN_ACCEPTED;

    public String value() {
        return name();
    }

    public static NotificationEvent fromValue(String v) {
        return valueOf(v);
    }

}
