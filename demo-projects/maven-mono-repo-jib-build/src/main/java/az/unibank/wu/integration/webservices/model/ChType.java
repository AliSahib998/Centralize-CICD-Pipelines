
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ch_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ch_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="CSC"/>
 *     &lt;enumeration value="AGT"/>
 *     &lt;enumeration value="SMARTPHONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ch_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ChType {

    WEB,
    IVR,
    CSC,
    AGT,
    SMARTPHONE;

    public String value() {
        return name();
    }

    public static ChType fromValue(String v) {
        return valueOf(v);
    }

}
