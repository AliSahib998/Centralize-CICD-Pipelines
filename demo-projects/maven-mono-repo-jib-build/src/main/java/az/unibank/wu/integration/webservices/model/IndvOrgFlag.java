
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indv_org_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="indv_org_flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "indv_org_flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum IndvOrgFlag {

    Y("Y"),
    N("N"),
    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("1")
    ONE("1"),
    I("I"),
    O("O");
    private final String value;

    IndvOrgFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndvOrgFlag fromValue(String v) {
        for (IndvOrgFlag c: IndvOrgFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
