
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="notification_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARTNER"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notification_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NotificationType {

    PARTNER,
    SMS;

    public String value() {
        return name();
    }

    public static NotificationType fromValue(String v) {
        return valueOf(v);
    }

}
