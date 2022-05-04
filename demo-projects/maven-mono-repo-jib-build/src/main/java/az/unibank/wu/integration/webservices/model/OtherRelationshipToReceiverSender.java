
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Other_Relationship_to_Receiver_Sender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Other_Relationship_to_Receiver_Sender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="0"/>
 *     &lt;maxLength value="50"/>
 *     &lt;enumeration value="Spouse"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="Brother"/>
 *     &lt;enumeration value="Sister"/>
 *     &lt;enumeration value="Son"/>
 *     &lt;enumeration value="Daughter"/>
 *     &lt;enumeration value="Business Partner"/>
 *     &lt;enumeration value="Supplier"/>
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="Friend"/>
 *     &lt;enumeration value="Others"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Other_Relationship_to_Receiver_Sender", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum OtherRelationshipToReceiverSender {

    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Brother")
    BROTHER("Brother"),
    @XmlEnumValue("Sister")
    SISTER("Sister"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("Business Partner")
    BUSINESS_PARTNER("Business Partner"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    OtherRelationshipToReceiverSender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherRelationshipToReceiverSender fromValue(String v) {
        for (OtherRelationshipToReceiverSender c: OtherRelationshipToReceiverSender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
