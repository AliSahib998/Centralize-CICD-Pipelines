
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flag_update.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="flag_update">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "flag_update", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum FlagUpdate {

    A,
    U,
    D;

    public String value() {
        return name();
    }

    public static FlagUpdate fromValue(String v) {
        return valueOf(v);
    }

}
