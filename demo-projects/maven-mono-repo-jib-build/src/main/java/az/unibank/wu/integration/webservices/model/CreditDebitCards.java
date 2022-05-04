
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credit_debit_cards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="credit_debit_cards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credit_debit_card" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_debit_cards", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "creditDebitCard"
})
public class CreditDebitCards {

    @XmlElement(name = "credit_debit_card", required = true)
    protected List<CreditDebitCard> creditDebitCard;

    /**
     * Gets the value of the creditDebitCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditDebitCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditDebitCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditDebitCard }
     * 
     * 
     */
    public List<CreditDebitCard> getCreditDebitCard() {
        if (creditDebitCard == null) {
            creditDebitCard = new ArrayList<CreditDebitCard>();
        }
        return this.creditDebitCard;
    }

}
