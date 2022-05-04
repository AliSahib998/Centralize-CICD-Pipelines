
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for name_suffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="name_suffix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Jr."/>
 *     &lt;enumeration value="Sr."/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="Esq."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "name_suffix", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NameSuffix {

    @XmlEnumValue("Jr.")
    JR("Jr."),
    @XmlEnumValue("Sr.")
    SR("Sr."),
    I("I"),
    II("II"),
    III("III"),
    @XmlEnumValue("Esq.")
    ESQ("Esq.");
    private final String value;

    NameSuffix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSuffix fromValue(String v) {
        for (NameSuffix c: NameSuffix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
