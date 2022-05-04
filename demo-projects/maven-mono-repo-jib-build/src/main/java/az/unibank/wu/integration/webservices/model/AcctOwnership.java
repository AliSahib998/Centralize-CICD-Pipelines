
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acct_ownership.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="acct_ownership">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "acct_ownership", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AcctOwnership {

    I,
    J;

    public String value() {
        return name();
    }

    public static AcctOwnership fromValue(String v) {
        return valueOf(v);
    }

}
