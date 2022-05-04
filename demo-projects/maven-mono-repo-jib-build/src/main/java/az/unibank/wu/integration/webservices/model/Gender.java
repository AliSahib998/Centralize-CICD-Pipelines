
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="0"/>
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value=" "/>
 *     &lt;enumeration value=""/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gender", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum Gender {

    M("M"),
    F("F"),
    S("S"),
    @XmlEnumValue(" ")
    SPACE(" "),
    @XmlEnumValue("")
    EMPTY(""),
    O("O");
    private final String value;

    Gender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Gender fromValue(String v) {
        for (Gender c: Gender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
