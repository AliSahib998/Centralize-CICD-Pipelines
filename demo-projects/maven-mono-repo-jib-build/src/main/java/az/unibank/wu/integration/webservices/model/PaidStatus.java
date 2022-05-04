
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paid_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paid_status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="NOT PAID"/>
 *     &lt;enumeration value="ON HOLD"/>
 *     &lt;enumeration value="NOT AVAILABLE"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="PAID_OTHER"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PURGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paid_status", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PaidStatus {

    PAID("PAID"),
    @XmlEnumValue("NOT PAID")
    NOT_PAID("NOT PAID"),
    @XmlEnumValue("ON HOLD")
    ON_HOLD("ON HOLD"),
    @XmlEnumValue("NOT AVAILABLE")
    NOT_AVAILABLE("NOT AVAILABLE"),
    AVAILABLE("AVAILABLE"),
    PAID_OTHER("PAID_OTHER"),
    QUEUED("QUEUED"),
    CANCELLED("CANCELLED"),
    SUSPENDED("SUSPENDED"),
    UNKNOWN("UNKNOWN"),
    PURGED("PURGED");
    private final String value;

    PaidStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatus fromValue(String v) {
        for (PaidStatus c: PaidStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
