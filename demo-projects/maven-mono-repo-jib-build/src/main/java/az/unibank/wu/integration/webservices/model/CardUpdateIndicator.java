
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for card_update_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="card_update_indicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EnrollWuCard"/>
 *     &lt;enumeration value="DeleteWuCard"/>
 *     &lt;enumeration value="UpdateWuCard"/>
 *     &lt;enumeration value="LookUp"/>
 *     &lt;enumeration value="AddAssociate"/>
 *     &lt;enumeration value="UpdateAssociate"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="UpdateSenderAssociate"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "card_update_indicator", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum CardUpdateIndicator {

    @XmlEnumValue("EnrollWuCard")
    ENROLL_WU_CARD("EnrollWuCard"),
    @XmlEnumValue("DeleteWuCard")
    DELETE_WU_CARD("DeleteWuCard"),
    @XmlEnumValue("UpdateWuCard")
    UPDATE_WU_CARD("UpdateWuCard"),
    @XmlEnumValue("LookUp")
    LOOK_UP("LookUp"),
    @XmlEnumValue("AddAssociate")
    ADD_ASSOCIATE("AddAssociate"),
    @XmlEnumValue("UpdateAssociate")
    UPDATE_ASSOCIATE("UpdateAssociate"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("UpdateSenderAssociate")
    UPDATE_SENDER_ASSOCIATE("UpdateSenderAssociate"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    CardUpdateIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardUpdateIndicator fromValue(String v) {
        for (CardUpdateIndicator c: CardUpdateIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
