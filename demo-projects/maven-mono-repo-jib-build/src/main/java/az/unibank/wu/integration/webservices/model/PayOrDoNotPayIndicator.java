
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pay_or_do_not_pay_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pay_or_do_not_pay_indicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="0"/>
 *     &lt;maxLength value="11"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="DO NOT PAY"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pay_or_do_not_pay_indicator", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PayOrDoNotPayIndicator {

    PAY("PAY"),
    @XmlEnumValue("DO NOT PAY")
    DO_NOT_PAY("DO NOT PAY"),
    P("P"),
    D("D");
    private final String value;

    PayOrDoNotPayIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayOrDoNotPayIndicator fromValue(String v) {
        for (PayOrDoNotPayIndicator c: PayOrDoNotPayIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
