
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_principal_amount_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="picklist_principal_amount_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_principal_amount_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "principalAmount"
})
public class PicklistPrincipalAmountOptions {

    @XmlElement(name = "principal_amount", type = Long.class)
    protected List<Long> principalAmount;

    /**
     * Gets the value of the principalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getPrincipalAmount() {
        if (principalAmount == null) {
            principalAmount = new ArrayList<Long>();
        }
        return this.principalAmount;
    }

}
