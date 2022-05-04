
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for search_stopper.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="search_stopper">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approximate"/>
 *     &lt;enumeration value="exact"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "search_stopper", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum SearchStopper {

    @XmlEnumValue("approximate")
    APPROXIMATE("approximate"),
    @XmlEnumValue("exact")
    EXACT("exact");
    private final String value;

    SearchStopper(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchStopper fromValue(String v) {
        for (SearchStopper c: SearchStopper.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
