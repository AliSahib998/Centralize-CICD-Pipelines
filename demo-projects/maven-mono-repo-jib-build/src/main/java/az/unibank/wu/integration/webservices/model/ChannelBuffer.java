
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_buffer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="channel_buffer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="KIOSK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "channel_buffer", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ChannelBuffer {

    POS,
    WEB,
    KIOSK;

    public String value() {
        return name();
    }

    public static ChannelBuffer fromValue(String v) {
        return valueOf(v);
    }

}
