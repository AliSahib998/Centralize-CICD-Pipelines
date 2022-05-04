
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetReasonOfTransactionList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETREASONOFTRANSACTION>...</GETREASONOFTRANSACTION> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETREASONOFTRANSACTION_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASGetReasonOfTransactionList {

    @XmlElement(name = "REASON_CODE")
    protected String reasoncode;
    @XmlElement(name = "REASON_DESC")
    protected String reasondesc;
    @XmlElement(name = "RECEIPT_DESC")
    protected String receiptdesc;

    /**
     * Gets the value of the reasoncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONCODE() {
        return reasoncode;
    }

    /**
     * Sets the value of the reasoncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONCODE(String value) {
        this.reasoncode = value;
    }

    /**
     * Gets the value of the reasondesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONDESC() {
        return reasondesc;
    }

    /**
     * Sets the value of the reasondesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONDESC(String value) {
        this.reasondesc = value;
    }

    /**
     * Gets the value of the receiptdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIPTDESC() {
        return receiptdesc;
    }

    /**
     * Sets the value of the receiptdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIPTDESC(String value) {
        this.receiptdesc = value;
    }

}
