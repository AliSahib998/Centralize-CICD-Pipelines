
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_expected_payout_amount_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="picklist_expected_payout_amount_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expected_payout_amount" type="{http://www.westernunion.com/schema/xrsi}amount" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_expected_payout_amount_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "expectedPayoutAmount"
})
public class PicklistExpectedPayoutAmountOptions {

    @XmlElement(name = "expected_payout_amount", type = Long.class)
    protected List<Long> expectedPayoutAmount;

    /**
     * Gets the value of the expectedPayoutAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedPayoutAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedPayoutAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getExpectedPayoutAmount() {
        if (expectedPayoutAmount == null) {
            expectedPayoutAmount = new ArrayList<Long>();
        }
        return this.expectedPayoutAmount;
    }

}
