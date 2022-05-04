
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccmt_transaction_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccmt_transaction_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="ccmt_transaction" type="{http://www.westernunion.com/schema/xrsi}ccmt_transaction" maxOccurs="13"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccmt_transaction_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "ccmtTransaction"
})
public class CcmtTransactionDetails
    extends CollectionBase
{

    @XmlElement(name = "ccmt_transaction", required = true)
    protected List<CcmtTransaction> ccmtTransaction;

    /**
     * Gets the value of the ccmtTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccmtTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcmtTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcmtTransaction }
     * 
     * 
     */
    public List<CcmtTransaction> getCcmtTransaction() {
        if (ccmtTransaction == null) {
            ccmtTransaction = new ArrayList<CcmtTransaction>();
        }
        return this.ccmtTransaction;
    }

}
