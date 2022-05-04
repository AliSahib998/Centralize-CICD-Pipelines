
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency_change_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currency_change_flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currency_change_flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CurrencyChangeFlag {

    Y,
    N;

    public String value() {
        return name();
    }

    public static CurrencyChangeFlag fromValue(String v) {
        return valueOf(v);
    }

}
