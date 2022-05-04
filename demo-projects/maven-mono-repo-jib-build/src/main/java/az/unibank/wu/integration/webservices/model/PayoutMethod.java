
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payout_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payout_method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="MOBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payout_method", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PayoutMethod {

    CASH,
    MOBILE;

    public String value() {
        return name();
    }

    public static PayoutMethod fromValue(String v) {
        return valueOf(v);
    }

}
