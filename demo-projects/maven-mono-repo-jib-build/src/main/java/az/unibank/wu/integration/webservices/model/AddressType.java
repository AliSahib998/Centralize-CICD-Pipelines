
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="address_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="p"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "address_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AddressType {

    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("p")
    P("p");
    private final String value;

    AddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressType fromValue(String v) {
        for (AddressType c: AddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
