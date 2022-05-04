
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for is_current_and_permanent_addr_same.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="is_current_and_permanent_addr_same">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "is_current_and_permanent_addr_same", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum IsCurrentAndPermanentAddrSame {

    Y,
    N;

    public String value() {
        return name();
    }

    public static IsCurrentAndPermanentAddrSame fromValue(String v) {
        return valueOf(v);
    }

}
