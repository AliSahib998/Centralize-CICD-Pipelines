
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for is_debit_capable_account.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="is_debit_capable_account">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "is_debit_capable_account", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum IsDebitCapableAccount {

    Y,
    N;

    public String value() {
        return name();
    }

    public static IsDebitCapableAccount fromValue(String v) {
        return valueOf(v);
    }

}
