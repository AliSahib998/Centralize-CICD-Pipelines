
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivemoney_hold_transactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivemoney_hold_transactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receivemoney_hold_transaction" type="{http://www.westernunion.com/schema/xrsi}multifind_hold_transaction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivemoney_hold_transactions", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "receivemoneyHoldTransaction"
})
public class ReceivemoneyHoldTransactions {

    @XmlElement(name = "receivemoney_hold_transaction")
    protected List<MultifindHoldTransaction> receivemoneyHoldTransaction;

    /**
     * Gets the value of the receivemoneyHoldTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivemoneyHoldTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivemoneyHoldTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultifindHoldTransaction }
     * 
     * 
     */
    public List<MultifindHoldTransaction> getReceivemoneyHoldTransaction() {
        if (receivemoneyHoldTransaction == null) {
            receivemoneyHoldTransaction = new ArrayList<MultifindHoldTransaction>();
        }
        return this.receivemoneyHoldTransaction;
    }

}
