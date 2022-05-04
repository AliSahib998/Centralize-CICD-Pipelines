
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hold_search_payment_transactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hold_search_payment_transactions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="payment_transaction" type="{http://www.westernunion.com/schema/xrsi}payment_transaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hold_search_payment_transactions", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "paymentTransaction"
})
public class HoldSearchPaymentTransactions
    extends CollectionBase
{

    @XmlElement(name = "payment_transaction")
    protected PaymentTransaction paymentTransaction;

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction }
     *     
     */
    public PaymentTransaction getPaymentTransaction() {
        return paymentTransaction;
    }

    /**
     * Sets the value of the paymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction }
     *     
     */
    public void setPaymentTransaction(PaymentTransaction value) {
        this.paymentTransaction = value;
    }

}
