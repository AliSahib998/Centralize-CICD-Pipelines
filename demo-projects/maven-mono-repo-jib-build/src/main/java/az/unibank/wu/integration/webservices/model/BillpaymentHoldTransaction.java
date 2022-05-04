
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billpayment_hold_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billpayment_hold_transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="payment_transactions" type="{http://www.westernunion.com/schema/xrsi}hold_search_payment_transactions" minOccurs="0"/>
 *         &lt;element name="misc_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billpayment_hold_transaction", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "paymentTransactions",
    "miscBuffer",
    "dfFields",
    "foreignRemoteSystem"
})
public class BillpaymentHoldTransaction {

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    @XmlElement(name = "payment_transactions")
    protected HoldSearchPaymentTransactions paymentTransactions;
    @XmlElement(name = "misc_buffer")
    protected String miscBuffer;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;

    /**
     * Gets the value of the swbFlaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwbFlaInfo }
     *     
     */
    public SwbFlaInfo getSwbFlaInfo() {
        return swbFlaInfo;
    }

    /**
     * Sets the value of the swbFlaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwbFlaInfo }
     *     
     */
    public void setSwbFlaInfo(SwbFlaInfo value) {
        this.swbFlaInfo = value;
    }

    /**
     * Gets the value of the paymentTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link HoldSearchPaymentTransactions }
     *     
     */
    public HoldSearchPaymentTransactions getPaymentTransactions() {
        return paymentTransactions;
    }

    /**
     * Sets the value of the paymentTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldSearchPaymentTransactions }
     *     
     */
    public void setPaymentTransactions(HoldSearchPaymentTransactions value) {
        this.paymentTransactions = value;
    }

    /**
     * Gets the value of the miscBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscBuffer() {
        return miscBuffer;
    }

    /**
     * Sets the value of the miscBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscBuffer(String value) {
        this.miscBuffer = value;
    }

    /**
     * Gets the value of the dfFields property.
     * 
     * @return
     *     possible object is
     *     {@link DfFields }
     *     
     */
    public DfFields getDfFields() {
        return dfFields;
    }

    /**
     * Sets the value of the dfFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfFields }
     *     
     */
    public void setDfFields(DfFields value) {
        this.dfFields = value;
    }

    /**
     * Gets the value of the foreignRemoteSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public ForeignRemoteSystem getForeignRemoteSystem() {
        return foreignRemoteSystem;
    }

    /**
     * Sets the value of the foreignRemoteSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public void setForeignRemoteSystem(ForeignRemoteSystem value) {
        this.foreignRemoteSystem = value;
    }

}
