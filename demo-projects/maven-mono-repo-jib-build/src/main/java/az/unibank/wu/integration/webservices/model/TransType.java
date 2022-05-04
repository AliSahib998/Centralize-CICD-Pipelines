
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trans_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trans_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEND"/>
 *     &lt;enumeration value="PAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "trans_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum TransType {

    SEND,
    PAY;

    public String value() {
        return name();
    }

    public static TransType fromValue(String v) {
        return valueOf(v);
    }

}
