
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reminder_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reminder_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST_REMINDER"/>
 *     &lt;enumeration value="SECOND_REMINDER"/>
 *     &lt;enumeration value="THIRD_REMINDER"/>
 *     &lt;enumeration value="FOURTH_REMINDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reminder_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ReminderType {

    FIRST_REMINDER,
    SECOND_REMINDER,
    THIRD_REMINDER,
    FOURTH_REMINDER;

    public String value() {
        return name();
    }

    public static ReminderType fromValue(String v) {
        return valueOf(v);
    }

}
