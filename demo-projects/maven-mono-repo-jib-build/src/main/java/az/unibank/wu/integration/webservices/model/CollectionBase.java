
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collection_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collection_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="more" type="{http://www.westernunion.com/schema/xrsi}yes_no" />
 *       &lt;attribute name="context" type="{http://www.westernunion.com/schema/xrsi}context" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_base", namespace = "http://www.westernunion.com/schema/xrsi")
@XmlSeeAlso({
    MultipleTransactionRetrieval.class,
    Systems.class,
    WuCards.class,
    CountryInfoMessages.class,
    SpecialHandlingDataDetails.class,
    Checks.class,
    Senders.class,
    QqcDeviceDetails.class,
    OfacMessage.class,
    CurrencyDatabase.class,
    PaymentTransactions.class,
    SenderInfoDetails.class,
    CcmtTransactionDetails.class,
    QpCompanies.class,
    PayComments.class,
    Messages.class,
    GbsPaymentTransactions.class,
    CurrConversions.class,
    AgentReferralDataDetails.class,
    MonthlyRecordDetails.class,
    CommentDetails.class,
    Receivers.class,
    Drafts.class,
    HoldSearchPaymentTransactions.class
})
public class CollectionBase {

    @XmlAttribute(name = "more")
    protected YesNo more;
    @XmlAttribute(name = "context")
    protected String context;

    /**
     * Gets the value of the more property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMore(YesNo value) {
        this.more = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

}
