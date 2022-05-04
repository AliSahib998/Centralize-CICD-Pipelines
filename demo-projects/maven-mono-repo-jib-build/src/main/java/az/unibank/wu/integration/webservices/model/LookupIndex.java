
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookup_index.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lookup_index">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lookup_index", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum LookupIndex {

    S,
    P;

    public String value() {
        return name();
    }

    public static LookupIndex fromValue(String v) {
        return valueOf(v);
    }

}
