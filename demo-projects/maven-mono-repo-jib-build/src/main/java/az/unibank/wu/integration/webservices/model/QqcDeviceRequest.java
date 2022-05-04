
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_request.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="qqc_device_request">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "qqc_device_request", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum QqcDeviceRequest {

    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    QqcDeviceRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QqcDeviceRequest fromValue(String v) {
        for (QqcDeviceRequest c: QqcDeviceRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
