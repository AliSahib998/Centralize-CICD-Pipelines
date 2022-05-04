
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for name_prefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="name_prefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mr."/>
 *     &lt;enumeration value="Ms."/>
 *     &lt;enumeration value="Mrs."/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Dr."/>
 *     &lt;enumeration value="Professor"/>
 *     &lt;enumeration value="Sir"/>
 *     &lt;enumeration value="Madam"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "name_prefix", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NamePrefix {

    @XmlEnumValue("Mr.")
    MR("Mr."),
    @XmlEnumValue("Ms.")
    MS("Ms."),
    @XmlEnumValue("Mrs.")
    MRS("Mrs."),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Dr.")
    DR("Dr."),
    @XmlEnumValue("Professor")
    PROFESSOR("Professor"),
    @XmlEnumValue("Sir")
    SIR("Sir"),
    @XmlEnumValue("Madam")
    MADAM("Madam"),
    M("M"),
    S("S"),
    F("F");
    private final String value;

    NamePrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamePrefix fromValue(String v) {
        for (NamePrefix c: NamePrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
