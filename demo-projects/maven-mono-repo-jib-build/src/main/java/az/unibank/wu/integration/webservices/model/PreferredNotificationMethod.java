
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preferred_notification_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="preferred_notification_method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="MOBILE_PHONE"/>
 *     &lt;enumeration value="MOBILE_SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "preferred_notification_method", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PreferredNotificationMethod {

    NONE,
    PHONE,
    MOBILE_PHONE,
    MOBILE_SMS,
    EMAIL;

    public String value() {
        return name();
    }

    public static PreferredNotificationMethod fromValue(String v) {
        return valueOf(v);
    }

}
