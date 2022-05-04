
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone_identity_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mobile_phone_identity_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TMSI"/>
 *     &lt;enumeration value="IMSI"/>
 *     &lt;enumeration value="MSISDN"/>
 *     &lt;enumeration value="ESN"/>
 *     &lt;enumeration value="IMEI"/>
 *     &lt;enumeration value="MEID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mobile_phone_identity_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum MobilePhoneIdentityType {

    TMSI,
    IMSI,
    MSISDN,
    ESN,
    IMEI,
    MEID;

    public String value() {
        return name();
    }

    public static MobilePhoneIdentityType fromValue(String v) {
        return valueOf(v);
    }

}
