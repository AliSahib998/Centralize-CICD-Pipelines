
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mobile_phone_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="WORK"/>
 *     &lt;enumeration value="MOBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mobile_phone_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum MobilePhoneType {

    HOME,
    WORK,
    MOBILE;

    public String value() {
        return name();
    }

    public static MobilePhoneType fromValue(String v) {
        return valueOf(v);
    }

}
