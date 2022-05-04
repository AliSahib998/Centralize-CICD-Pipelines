
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fraud_warning_consent_required.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fraud_warning_consent_required">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fraud_warning_consent_required", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum FraudWarningConsentRequired {

    Y,
    N;

    public String value() {
        return name();
    }

    public static FraudWarningConsentRequired fromValue(String v) {
        return valueOf(v);
    }

}
