
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for info_lookup_key.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="info_lookup_key">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="company_name"/>
 *     &lt;enumeration value="code_city"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "info_lookup_key", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum InfoLookupKey {

    @XmlEnumValue("company_name")
    COMPANY_NAME("company_name"),
    @XmlEnumValue("code_city")
    CODE_CITY("code_city");
    private final String value;

    InfoLookupKey(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfoLookupKey fromValue(String v) {
        for (InfoLookupKey c: InfoLookupKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
