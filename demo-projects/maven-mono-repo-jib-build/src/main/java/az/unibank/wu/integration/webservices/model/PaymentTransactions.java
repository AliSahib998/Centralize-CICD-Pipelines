
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_transactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment_transactions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="payment_transaction" type="{http://www.westernunion.com/schema/xrsi}payment_transaction" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_transactions", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "paymentTransaction"
})
public class PaymentTransactions
    extends CollectionBase
{

    @XmlElement(name = "payment_transaction")
    protected List<PaymentTransaction> paymentTransaction;

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction }
     * 
     * 
     */
    public List<PaymentTransaction> getPaymentTransaction() {
        if (paymentTransaction == null) {
            paymentTransaction = new ArrayList<PaymentTransaction>();
        }
        return this.paymentTransaction;
    }

}
