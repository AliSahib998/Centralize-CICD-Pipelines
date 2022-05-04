
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for account_nbr_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="account_nbr_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "account_nbr_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AccountNbrType {

    Q,
    P;

    public String value() {
        return name();
    }

    public static AccountNbrType fromValue(String v) {
        return valueOf(v);
    }

}
