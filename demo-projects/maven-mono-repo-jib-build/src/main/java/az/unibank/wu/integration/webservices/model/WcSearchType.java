
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wc_search_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wc_search_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mtcn"/>
 *     &lt;enumeration value="sender"/>
 *     &lt;enumeration value="receiver"/>
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wc_search_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum WcSearchType {

    @XmlEnumValue("mtcn")
    MTCN("mtcn"),
    @XmlEnumValue("sender")
    SENDER("sender"),
    @XmlEnumValue("receiver")
    RECEIVER("receiver"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    WcSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WcSearchType fromValue(String v) {
        for (WcSearchType c: WcSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
