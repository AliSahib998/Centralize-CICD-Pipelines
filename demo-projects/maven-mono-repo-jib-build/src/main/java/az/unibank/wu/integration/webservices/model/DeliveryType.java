
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="delivery_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WORK"/>
 *     &lt;enumeration value="RESIDENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "delivery_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum DeliveryType {

    WORK,
    RESIDENTIAL;

    public String value() {
        return name();
    }

    public static DeliveryType fromValue(String v) {
        return valueOf(v);
    }

}
