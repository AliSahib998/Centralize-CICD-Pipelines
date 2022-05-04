
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum Flag {

    Y,
    N,
    X;

    public String value() {
        return name();
    }

    public static Flag fromValue(String v) {
        return valueOf(v);
    }

}
