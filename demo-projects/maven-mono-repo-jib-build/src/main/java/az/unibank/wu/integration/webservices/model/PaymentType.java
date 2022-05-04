
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payment_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=""/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="ACH"/>
 *     &lt;enumeration value="DebitCardInterchange"/>
 *     &lt;enumeration value="CashAndCard"/>
 *     &lt;enumeration value="Adjustment"/>
 *     &lt;enumeration value="Reinstate"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="RetailMoney"/>
 *     &lt;enumeration value="Split"/>
 *     &lt;enumeration value="WUPay"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="Iphone"/>
 *     &lt;enumeration value="BPAY"/>
 *     &lt;enumeration value="PinDebit"/>
 *     &lt;enumeration value="Acculynk"/>
 *     &lt;enumeration value="IBP"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="CardFunded"/>
 *     &lt;enumeration value="BankOffline"/>
 *     &lt;enumeration value="BankOnline"/>
 *     &lt;enumeration value="BankAccount"/>
 *     &lt;enumeration value="EWallet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payment_type", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum PaymentType {

    @XmlEnumValue("")
    EMPTY(""),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    ACH("ACH"),
    @XmlEnumValue("DebitCardInterchange")
    DEBIT_CARD_INTERCHANGE("DebitCardInterchange"),
    @XmlEnumValue("CashAndCard")
    CASH_AND_CARD("CashAndCard"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Reinstate")
    REINSTATE("Reinstate"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("RetailMoney")
    RETAIL_MONEY("RetailMoney"),
    @XmlEnumValue("Split")
    SPLIT("Split"),
    @XmlEnumValue("WUPay")
    WU_PAY("WUPay"),
    AC("AC"),
    @XmlEnumValue("Iphone")
    IPHONE("Iphone"),
    BPAY("BPAY"),
    @XmlEnumValue("PinDebit")
    PIN_DEBIT("PinDebit"),
    @XmlEnumValue("Acculynk")
    ACCULYNK("Acculynk"),
    IBP("IBP"),
    ALL("ALL"),
    @XmlEnumValue("CardFunded")
    CARD_FUNDED("CardFunded"),
    @XmlEnumValue("BankOffline")
    BANK_OFFLINE("BankOffline"),
    @XmlEnumValue("BankOnline")
    BANK_ONLINE("BankOnline"),
    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),
    @XmlEnumValue("EWallet")
    E_WALLET("EWallet");
    private final String value;

    PaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentType fromValue(String v) {
        for (PaymentType c: PaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
