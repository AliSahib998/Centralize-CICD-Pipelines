
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cust_entry_device.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cust_entry_device">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="PARTNERCSC"/>
 *     &lt;enumeration value="RETAILPARTNER"/>
 *     &lt;enumeration value="PARTNERMOBILE"/>
 *     &lt;enumeration value="KIOSKPROFILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cust_entry_device", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CustEntryDevice {

    AGENT,
    PARTNERCSC,
    RETAILPARTNER,
    PARTNERMOBILE,
    KIOSKPROFILE;

    public String value() {
        return name();
    }

    public static CustEntryDevice fromValue(String v) {
        return valueOf(v);
    }

}
