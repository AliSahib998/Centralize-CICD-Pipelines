
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact_info_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contact_info_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="INSTANT NOTIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contact_info_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ContactInfoType {

    PRIMARY("PRIMARY"),
    @XmlEnumValue("INSTANT NOTIFICATION")
    INSTANT_NOTIFICATION("INSTANT NOTIFICATION");
    private final String value;

    ContactInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactInfoType fromValue(String v) {
        for (ContactInfoType c: ContactInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
