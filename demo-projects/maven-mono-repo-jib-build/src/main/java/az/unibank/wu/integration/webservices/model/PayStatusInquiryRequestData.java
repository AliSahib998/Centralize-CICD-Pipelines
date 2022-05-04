
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pay-status-inquiry-request-data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pay-status-inquiry-request-data">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="mtcn_flag" type="{http://www.westernunion.com/schema/xrsi}mtcn_flag" minOccurs="0"/>
 *         &lt;element name="detailed_status_indicator" type="{http://www.westernunion.com/schema/xrsi}detailed_status_indicator" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="context" type="{http://www.westernunion.com/schema/xrsi}context" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay-status-inquiry-request-data", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "paymentDetails",
    "mtcn",
    "mtcnFlag",
    "detailedStatusIndicator",
    "foreignRemoteSystem",
    "context"
})
@XmlRootElement(name = "pay-status-inquiry-request-data")
public class PayStatusInquiryRequestData
    extends RequestTransactionBase
{

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected String mtcn;
    @XmlElement(name = "mtcn_flag")
    protected String mtcnFlag;
    @XmlElement(name = "detailed_status_indicator")
    @XmlSchemaType(name = "string")
    protected DetailedStatusIndicator detailedStatusIndicator;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    protected String context;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
    }

    /**
     * Gets the value of the mtcnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcnFlag() {
        return mtcnFlag;
    }

    /**
     * Sets the value of the mtcnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcnFlag(String value) {
        this.mtcnFlag = value;
    }

    /**
     * Gets the value of the detailedStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedStatusIndicator }
     *     
     */
    public DetailedStatusIndicator getDetailedStatusIndicator() {
        return detailedStatusIndicator;
    }

    /**
     * Sets the value of the detailedStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedStatusIndicator }
     *     
     */
    public void setDetailedStatusIndicator(DetailedStatusIndicator value) {
        this.detailedStatusIndicator = value;
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
