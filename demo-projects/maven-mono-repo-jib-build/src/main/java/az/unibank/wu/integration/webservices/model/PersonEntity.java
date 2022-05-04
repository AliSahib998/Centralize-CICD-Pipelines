
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_entity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="person_entity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "person_entity", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PersonEntity {

    P,
    E;

    public String value() {
        return name();
    }

    public static PersonEntity fromValue(String v) {
        return valueOf(v);
    }

}
