
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listing_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listing_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Listed"/>
 *     &lt;enumeration value="Not Listed"/>
 *     &lt;enumeration value="UnPublished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listing_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ListingType {

    @XmlEnumValue("Listed")
    LISTED("Listed"),
    @XmlEnumValue("Not Listed")
    NOT_LISTED("Not Listed"),
    @XmlEnumValue("UnPublished")
    UN_PUBLISHED("UnPublished");
    private final String value;

    ListingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingType fromValue(String v) {
        for (ListingType c: ListingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
