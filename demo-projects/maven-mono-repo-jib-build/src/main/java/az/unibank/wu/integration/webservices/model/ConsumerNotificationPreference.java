
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumer_notification_preference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="consumer_notification_preference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="AUTOMATED_PHONE_CALL"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "consumer_notification_preference", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ConsumerNotificationPreference {

    NONE,
    EMAIL,
    AUTOMATED_PHONE_CALL,
    SMS;

    public String value() {
        return name();
    }

    public static ConsumerNotificationPreference fromValue(String v) {
        return valueOf(v);
    }

}
