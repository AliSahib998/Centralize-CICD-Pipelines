
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_channel_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gwp_gbs_channel_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GBS"/>
 *     &lt;enumeration value="OHD"/>
 *     &lt;enumeration value="MMT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gwp_gbs_channel_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum GwpGbsChannelType {

    GBS,
    OHD,
    MMT;

    public String value() {
        return name();
    }

    public static GwpGbsChannelType fromValue(String v) {
        return valueOf(v);
    }

}
