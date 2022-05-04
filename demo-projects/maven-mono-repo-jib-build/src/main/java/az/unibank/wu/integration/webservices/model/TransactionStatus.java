
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transaction_status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transaction_status", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlEnum
public enum TransactionStatus {


    /**
     * Transaction successfully cancelled/suspended/resumed
     * 
     */
    SUCCESS,

    /**
     * Failure while canceling/suspending/resuming Transaction 
     * 
     */
    FAILURE;

    public String value() {
        return name();
    }

    public static TransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
