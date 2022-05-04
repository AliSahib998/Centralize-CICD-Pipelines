
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pay-status-inquiry-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pay-status-inquiry-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="payment_transactions" type="{http://www.westernunion.com/schema/xrsi}payment_transactions" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="number_matches" type="{http://www.westernunion.com/schema/xrsi}number_matches" minOccurs="0"/>
 *         &lt;element name="current_page_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="last_page_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay-status-inquiry-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "paymentTransactions",
    "foreignRemoteSystem",
    "numberMatches",
    "currentPageNumber",
    "lastPageNumber"
})
public class PayStatusInquiryReply
    extends ReplyTransactionBase
{

    @XmlElement(name = "payment_transactions")
    protected PaymentTransactions paymentTransactions;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "number_matches")
    protected BigInteger numberMatches;
    @XmlElement(name = "current_page_number")
    protected BigInteger currentPageNumber;
    @XmlElement(name = "last_page_number")
    protected BigInteger lastPageNumber;

    /**
     * Gets the value of the paymentTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactions }
     *     
     */
    public PaymentTransactions getPaymentTransactions() {
        return paymentTransactions;
    }

    /**
     * Sets the value of the paymentTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactions }
     *     
     */
    public void setPaymentTransactions(PaymentTransactions value) {
        this.paymentTransactions = value;
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

    /**
     * Gets the value of the numberMatches property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberMatches() {
        return numberMatches;
    }

    /**
     * Sets the value of the numberMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberMatches(BigInteger value) {
        this.numberMatches = value;
    }

    /**
     * Gets the value of the currentPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentPageNumber() {
        return currentPageNumber;
    }

    /**
     * Sets the value of the currentPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentPageNumber(BigInteger value) {
        this.currentPageNumber = value;
    }

    /**
     * Gets the value of the lastPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastPageNumber() {
        return lastPageNumber;
    }

    /**
     * Sets the value of the lastPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastPageNumber(BigInteger value) {
        this.lastPageNumber = value;
    }

}
