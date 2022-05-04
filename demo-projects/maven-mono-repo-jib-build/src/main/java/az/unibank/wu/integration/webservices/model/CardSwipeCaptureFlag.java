
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Card_Swipe_Capture_Flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Card_Swipe_Capture_Flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Card_Swipe_Capture_Flag", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CardSwipeCaptureFlag {

    Y,
    N;

    public String value() {
        return name();
    }

    public static CardSwipeCaptureFlag fromValue(String v) {
        return valueOf(v);
    }

}
