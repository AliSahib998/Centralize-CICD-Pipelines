
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yes_no.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="yes_no">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value=""/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "yes_no", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum YesNo {

    Y("Y"),
    N("N"),
    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("1")
    ONE("1"),
    @XmlEnumValue("")
    EMPTY("");
    private final String value;

    YesNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNo fromValue(String v) {
        for (YesNo c: YesNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
