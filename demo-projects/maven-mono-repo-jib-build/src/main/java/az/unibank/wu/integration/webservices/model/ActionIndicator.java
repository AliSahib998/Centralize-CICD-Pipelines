
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for action_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="action_indicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGULATORY_ENABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "action_indicator", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ActionIndicator {

    REGULATORY_ENABLED;

    public String value() {
        return name();
    }

    public static ActionIndicator fromValue(String v) {
        return valueOf(v);
    }

}
