
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_device_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gwp_gbs_device_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="RETAIL"/>
 *     &lt;enumeration value="CSR"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="AGENTCSC"/>
 *     &lt;enumeration value="WALLET"/>
 *     &lt;enumeration value="DMAWEB"/>
 *     &lt;enumeration value="DMAMOB"/>
 *     &lt;enumeration value="PARTNERCSC"/>
 *     &lt;enumeration value="RETAILPARTNER"/>
 *     &lt;enumeration value="PARTNERMOBILE"/>
 *     &lt;enumeration value="KIOSKPROFILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gwp_gbs_device_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum GwpGbsDeviceType {

    ATM,
    WEB,
    AGENT,
    KIOSK,
    RETAIL,
    CSR,
    IVR,
    MOBILE,
    OTHER,
    SYSTEM,
    AGENTCSC,
    WALLET,
    DMAWEB,
    DMAMOB,
    PARTNERCSC,
    RETAILPARTNER,
    PARTNERMOBILE,
    KIOSKPROFILE;

    public String value() {
        return name();
    }

    public static GwpGbsDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
