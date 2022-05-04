
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verification_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="verification_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE_PHONE"/>
 *     &lt;enumeration value="BANK_ACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "verification_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum VerificationType {

    MOBILE_PHONE,
    BANK_ACCOUNT;

    public String value() {
        return name();
    }

    public static VerificationType fromValue(String v) {
        return valueOf(v);
    }

}
