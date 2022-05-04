
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device_id.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="device_id">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="0"/>
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="XP"/>
 *     &lt;enumeration value="IP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "device_id", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum DeviceId {

    PC,
    XP,
    IP;

    public String value() {
        return name();
    }

    public static DeviceId fromValue(String v) {
        return valueOf(v);
    }

}
