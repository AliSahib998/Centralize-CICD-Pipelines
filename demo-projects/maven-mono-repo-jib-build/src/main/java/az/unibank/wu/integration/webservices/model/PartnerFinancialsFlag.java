
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_financials_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="partner_financials_flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "partner_financials_flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PartnerFinancialsFlag {

    Y,
    N;

    public String value() {
        return name();
    }

    public static PartnerFinancialsFlag fromValue(String v) {
        return valueOf(v);
    }

}
