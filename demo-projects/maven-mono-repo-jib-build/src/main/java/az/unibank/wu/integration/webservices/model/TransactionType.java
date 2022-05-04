
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transaction_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=""/>
 *     &lt;enumeration value="WMN"/>
 *     &lt;enumeration value="MOD"/>
 *     &lt;enumeration value="QQC"/>
 *     &lt;enumeration value="WMF"/>
 *     &lt;enumeration value="EPY"/>
 *     &lt;enumeration value="CCM"/>
 *     &lt;enumeration value="CCMT"/>
 *     &lt;enumeration value="ENR"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="CCQ"/>
 *     &lt;enumeration value="CMN"/>
 *     &lt;enumeration value="CMF"/>
 *     &lt;enumeration value="CMW"/>
 *     &lt;enumeration value="AMO"/>
 *     &lt;enumeration value="TMO"/>
 *     &lt;enumeration value="CCW"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="NTF"/>
 *     &lt;enumeration value="MAL"/>
 *     &lt;enumeration value="TEL"/>
 *     &lt;enumeration value="OVL"/>
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="FAC"/>
 *     &lt;enumeration value="WMO"/>
 *     &lt;enumeration value="CMO"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="CSC"/>
 *     &lt;enumeration value="TRN"/>
 *     &lt;enumeration value="EBM"/>
 *     &lt;enumeration value="CCS"/>
 *     &lt;enumeration value="PSA"/>
 *     &lt;enumeration value="PSU"/>
 *     &lt;enumeration value="OBP"/>
 *     &lt;enumeration value="PRA"/>
 *     &lt;enumeration value="PRM"/>
 *     &lt;enumeration value="PRU"/>
 *     &lt;enumeration value="CNV"/>
 *     &lt;enumeration value="TYP"/>
 *     &lt;enumeration value="PSD"/>
 *     &lt;enumeration value="WMB"/>
 *     &lt;enumeration value="CCF"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transaction_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("")
    EMPTY(""),
    WMN("WMN"),
    MOD("MOD"),
    QQC("QQC"),
    WMF("WMF"),
    EPY("EPY"),
    CCM("CCM"),
    CCMT("CCMT"),
    ENR("ENR"),
    ERN("ERN"),
    CCQ("CCQ"),
    CMN("CMN"),
    CMF("CMF"),
    CMW("CMW"),
    AMO("AMO"),
    TMO("TMO"),
    CCW("CCW"),
    GEN("GEN"),
    NTF("NTF"),
    MAL("MAL"),
    TEL("TEL"),
    OVL("OVL"),
    SEC("SEC"),
    FAC("FAC"),
    WMO("WMO"),
    CMO("CMO"),
    ACM("ACM"),
    PAY("PAY"),
    CSC("CSC"),
    TRN("TRN"),
    EBM("EBM"),
    CCS("CCS"),
    PSA("PSA"),
    PSU("PSU"),
    OBP("OBP"),
    PRA("PRA"),
    PRM("PRM"),
    PRU("PRU"),
    CNV("CNV"),
    TYP("TYP"),
    PSD("PSD"),
    WMB("WMB"),
    CCF("CCF"),
    MOP("MOP"),
    MOR("MOR");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
