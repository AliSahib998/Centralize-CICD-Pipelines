
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiver_search_key.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="receiver_search_key">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D2B"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "receiver_search_key", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ReceiverSearchKey {

    @XmlEnumValue("D2B")
    D_2_B("D2B"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ReceiverSearchKey(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverSearchKey fromValue(String v) {
        for (ReceiverSearchKey c: ReceiverSearchKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
