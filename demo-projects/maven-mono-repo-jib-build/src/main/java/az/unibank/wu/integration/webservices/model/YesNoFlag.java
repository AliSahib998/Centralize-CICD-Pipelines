
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yes_no_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="yes_no_flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "yes_no_flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum YesNoFlag {

    Y("Y"),
    N("N"),
    R("R"),
    NR("NR"),
    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("1")
    ONE("1"),
    P("P");
    private final String value;

    YesNoFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoFlag fromValue(String v) {
        for (YesNoFlag c: YesNoFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
