
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for node_id.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="node_id">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "node_id", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum NodeId {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J;

    public String value() {
        return name();
    }

    public static NodeId fromValue(String v) {
        return valueOf(v);
    }

}
