
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comment_lookup_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="comment_lookup_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMENT"/>
 *     &lt;enumeration value="CCDIRECT"/>
 *     &lt;enumeration value="CCBANK1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "comment_lookup_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CommentLookupType {

    COMMENT("COMMENT"),
    CCDIRECT("CCDIRECT"),
    @XmlEnumValue("CCBANK1")
    CCBANK_1("CCBANK1");
    private final String value;

    CommentLookupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentLookupType fromValue(String v) {
        for (CommentLookupType c: CommentLookupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
