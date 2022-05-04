
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for holdtxn_search_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="holdtxn_search_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EDIT"/>
 *     &lt;enumeration value="SELECT"/>
 *     &lt;enumeration value="RELEASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "holdtxn_search_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum HoldtxnSearchType {

    EDIT,
    SELECT,
    RELEASE;

    public String value() {
        return name();
    }

    public static HoldtxnSearchType fromValue(String v) {
        return valueOf(v);
    }

}
