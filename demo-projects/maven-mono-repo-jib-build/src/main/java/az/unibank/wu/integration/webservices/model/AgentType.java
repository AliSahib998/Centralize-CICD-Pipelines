
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agent_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recording Agent"/>
 *     &lt;enumeration value="Paying Agent"/>
 *     &lt;enumeration value="Ancillary Information"/>
 *     &lt;enumeration value="Sender"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agent_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AgentType {

    @XmlEnumValue("Recording Agent")
    RECORDING_AGENT("Recording Agent"),
    @XmlEnumValue("Paying Agent")
    PAYING_AGENT("Paying Agent"),
    @XmlEnumValue("Ancillary Information")
    ANCILLARY_INFORMATION("Ancillary Information"),
    @XmlEnumValue("Sender")
    SENDER("Sender");
    private final String value;

    AgentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentType fromValue(String v) {
        for (AgentType c: AgentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
