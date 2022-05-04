
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txn_corridor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="txn_corridor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN-COUNTRY"/>
 *     &lt;enumeration value="CROSS-BORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "txn_corridor", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum TxnCorridor {

    @XmlEnumValue("IN-COUNTRY")
    IN_COUNTRY("IN-COUNTRY"),
    @XmlEnumValue("CROSS-BORDER")
    CROSS_BORDER("CROSS-BORDER");
    private final String value;

    TxnCorridor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TxnCorridor fromValue(String v) {
        for (TxnCorridor c: TxnCorridor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
