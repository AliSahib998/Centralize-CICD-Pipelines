
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funds_out_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="funds_out_method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=""/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="Cash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "funds_out_method", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum FundsOutMethod {

    @XmlEnumValue("")
    EMPTY(""),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Cash")
    CASH("Cash");
    private final String value;

    FundsOutMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundsOutMethod fromValue(String v) {
        for (FundsOutMethod c: FundsOutMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
