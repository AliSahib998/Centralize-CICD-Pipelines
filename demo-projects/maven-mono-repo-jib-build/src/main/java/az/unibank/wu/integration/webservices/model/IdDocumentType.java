
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_document_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="id_document_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSPORT"/>
 *     &lt;enumeration value="DRIVER_LICENSE"/>
 *     &lt;enumeration value="NATIONAL_ID"/>
 *     &lt;enumeration value="ALIEN_ID"/>
 *     &lt;enumeration value="STATE_ID"/>
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="PRC_ID"/>
 *     &lt;enumeration value="IBP_ID"/>
 *     &lt;enumeration value="NBI_CLEARANCE"/>
 *     &lt;enumeration value="POLICE_CLEARANCE_CERTIFICATE"/>
 *     &lt;enumeration value="POSTAL_ID"/>
 *     &lt;enumeration value="VOTERS_ID"/>
 *     &lt;enumeration value="GSIS_E_CARD"/>
 *     &lt;enumeration value="SSS_CARD"/>
 *     &lt;enumeration value="SENIOR_CITIZEN_CARD"/>
 *     &lt;enumeration value="OWWA_ID"/>
 *     &lt;enumeration value="OFW_ID"/>
 *     &lt;enumeration value="SEAMANS_BOOK"/>
 *     &lt;enumeration value="FIRE_ARM_LICENSE"/>
 *     &lt;enumeration value="EMPLOYMENT_ID"/>
 *     &lt;enumeration value="STUDENT_ID"/>
 *     &lt;enumeration value="OTHER_GOVERNMENT_ID"/>
 *     &lt;enumeration value="OTHER_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "id_document_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum IdDocumentType {

    PASSPORT,
    DRIVER_LICENSE,
    NATIONAL_ID,
    ALIEN_ID,
    STATE_ID,
    SSN,
    PRC_ID,
    IBP_ID,
    NBI_CLEARANCE,
    POLICE_CLEARANCE_CERTIFICATE,
    POSTAL_ID,
    VOTERS_ID,
    GSIS_E_CARD,
    SSS_CARD,
    SENIOR_CITIZEN_CARD,
    OWWA_ID,
    OFW_ID,
    SEAMANS_BOOK,
    FIRE_ARM_LICENSE,
    EMPLOYMENT_ID,
    STUDENT_ID,
    OTHER_GOVERNMENT_ID,
    OTHER_ID;

    public String value() {
        return name();
    }

    public static IdDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
