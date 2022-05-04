
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reprint_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reprint_flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rep"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reprint_flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ReprintFlag {

    @XmlEnumValue("rep")
    REP("rep");
    private final String value;

    ReprintFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReprintFlag fromValue(String v) {
        for (ReprintFlag c: ReprintFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
