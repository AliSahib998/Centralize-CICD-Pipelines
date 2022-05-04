
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compl_addr_validation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compl_addr_validation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "compl_addr_validation", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum ComplAddrValidation {

    Y,
    N,
    P;

    public String value() {
        return name();
    }

    public static ComplAddrValidation fromValue(String v) {
        return valueOf(v);
    }

}
