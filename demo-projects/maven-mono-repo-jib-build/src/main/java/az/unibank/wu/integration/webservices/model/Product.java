
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="product">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETAIL"/>
 *     &lt;enumeration value="FSS"/>
 *     &lt;enumeration value="KIOSK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "product", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum Product {

    RETAIL,
    FSS,
    KIOSK;

    public String value() {
        return name();
    }

    public static Product fromValue(String v) {
        return valueOf(v);
    }

}
