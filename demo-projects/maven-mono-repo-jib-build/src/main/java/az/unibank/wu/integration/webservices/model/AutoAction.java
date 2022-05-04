
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auto_action.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="auto_action">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="ACCEPT"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="REVIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "auto_action", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AutoAction {

    APPROVE,
    ACCEPT,
    REJECT,
    REVIEW;

    public String value() {
        return name();
    }

    public static AutoAction fromValue(String v) {
        return valueOf(v);
    }

}
