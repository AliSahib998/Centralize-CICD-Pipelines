
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tax_action.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tax_action">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINT"/>
 *     &lt;enumeration value="DISPLAY"/>
 *     &lt;enumeration value="PRINT AND DISPLAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tax_action", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum TaxAction {

    PRINT("PRINT"),
    DISPLAY("DISPLAY"),
    @XmlEnumValue("PRINT AND DISPLAY")
    PRINT_AND_DISPLAY("PRINT AND DISPLAY");
    private final String value;

    TaxAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxAction fromValue(String v) {
        for (TaxAction c: TaxAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
