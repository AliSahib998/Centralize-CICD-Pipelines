
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_TC_notification_preference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PS_TC_notification_preference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="PRINT"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PS_TC_notification_preference", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PSTCNotificationPreference {

    EMAIL,
    SMS,
    PRINT,
    NONE;

    public String value() {
        return name();
    }

    public static PSTCNotificationPreference fromValue(String v) {
        return valueOf(v);
    }

}
