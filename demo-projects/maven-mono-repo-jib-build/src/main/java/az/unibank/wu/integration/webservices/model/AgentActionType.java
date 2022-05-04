
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_action_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agent_action_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recorded"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Retrived"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agent_action_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AgentActionType {

    @XmlEnumValue("Recorded")
    RECORDED("Recorded"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Retrived")
    RETRIVED("Retrived");
    private final String value;

    AgentActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentActionType fromValue(String v) {
        for (AgentActionType c: AgentActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
