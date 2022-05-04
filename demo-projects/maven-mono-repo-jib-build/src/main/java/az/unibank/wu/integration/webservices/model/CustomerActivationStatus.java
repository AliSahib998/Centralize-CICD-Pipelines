
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer_activation_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customer_activation_status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="NOT_ACTIVE"/>
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customer_activation_status", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CustomerActivationStatus {

    ACTIVE,
    NOT_ACTIVE,
    BLOCKED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomerActivationStatus fromValue(String v) {
        return valueOf(v);
    }

}
