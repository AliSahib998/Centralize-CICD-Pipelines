
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentcsc_flags.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agentcsc_flags">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="0"/>
 *     &lt;maxLength value="16"/>
 *     &lt;enumeration value="REFUND"/>
 *     &lt;enumeration value="CANCEL_SEND"/>
 *     &lt;enumeration value="CANCEL_PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agentcsc_flags", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum AgentcscFlags {

    REFUND,
    CANCEL_SEND,
    CANCEL_PAID;

    public String value() {
        return name();
    }

    public static AgentcscFlags fromValue(String v) {
        return valueOf(v);
    }

}
