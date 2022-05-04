
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refund_amount_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refund_amount_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refund_amount" type="{http://www.westernunion.com/schema/xrsi}refund_amount" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund_amount_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "refundAmount"
})
public class RefundAmountDetails {

    @XmlElement(name = "refund_amount")
    protected List<String> refundAmount;

    /**
     * Gets the value of the refundAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefundAmount() {
        if (refundAmount == null) {
            refundAmount = new ArrayList<String>();
        }
        return this.refundAmount;
    }

}
