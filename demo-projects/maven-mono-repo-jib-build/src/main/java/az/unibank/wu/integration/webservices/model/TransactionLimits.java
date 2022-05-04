
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_limits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_limits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaction_limit" type="{http://www.westernunion.com/schema/xrsi}transaction_limit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_limits", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "transactionLimit"
})
public class TransactionLimits {

    @XmlElement(name = "transaction_limit")
    protected List<TransactionLimit> transactionLimit;

    /**
     * Gets the value of the transactionLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLimit }
     * 
     * 
     */
    public List<TransactionLimit> getTransactionLimit() {
        if (transactionLimit == null) {
            transactionLimit = new ArrayList<TransactionLimit>();
        }
        return this.transactionLimit;
    }

}
