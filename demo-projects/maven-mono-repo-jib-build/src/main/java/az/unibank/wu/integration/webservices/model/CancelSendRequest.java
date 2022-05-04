
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancel-send-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancel-send-request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="swb_fla_info" type="{http://www.westernunion.com/schema/xrsi}swb_fla_info" minOccurs="0"/>
 *         &lt;element name="reason_for_redelivery" type="{http://www.westernunion.com/schema/xrsi}reason_for_redelivery" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="database_key" type="{http://www.westernunion.com/schema/xrsi}database_key" minOccurs="0"/>
 *         &lt;element name="comments_data" type="{http://www.westernunion.com/schema/xrsi}comments" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="disallow_traffic_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="authorization_code" type="{http://www.westernunion.com/schema/xrsi}authorization_code" minOccurs="0"/>
 *         &lt;element name="payment_transaction" type="{http://www.westernunion.com/schema/xrsi}payment_transaction" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="refund_cancel_flag" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="partner_info_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_info_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancel-send-request", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbFlaInfo",
    "reasonForRedelivery",
    "mtcn",
    "databaseKey",
    "commentsData",
    "disallowTrafficFlag",
    "authorizationCode",
    "paymentTransaction",
    "foreignRemoteSystem",
    "refundCancelFlag",
    "partnerInfoBuffer"
})
@XmlRootElement(name = "cancel-send-request")
public class CancelSendRequest
    extends RequestTransactionBase
{

    @XmlElement(name = "swb_fla_info")
    protected SwbFlaInfo swbFlaInfo;
    @XmlElement(name = "reason_for_redelivery")
    protected String reasonForRedelivery;
    protected String mtcn;
    @XmlElement(name = "database_key")
    protected String databaseKey;
    @XmlElement(name = "comments_data")
    protected List<String> commentsData;
    @XmlElement(name = "disallow_traffic_flag")
    @XmlSchemaType(name = "string")
    protected YesNo disallowTrafficFlag;
    @XmlElement(name = "authorization_code")
    protected String authorizationCode;
    @XmlElement(name = "payment_transaction")
    protected PaymentTransaction paymentTransaction;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "refund_cancel_flag")
    protected String refundCancelFlag;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;

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
     * Gets the value of the reasonForRedelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForRedelivery() {
        return reasonForRedelivery;
    }

    /**
     * Sets the value of the reasonForRedelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForRedelivery(String value) {
        this.reasonForRedelivery = value;
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
     * Gets the value of the databaseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseKey() {
        return databaseKey;
    }

    /**
     * Sets the value of the databaseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseKey(String value) {
        this.databaseKey = value;
    }

    /**
     * Gets the value of the commentsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommentsData() {
        if (commentsData == null) {
            commentsData = new ArrayList<String>();
        }
        return this.commentsData;
    }

    /**
     * Gets the value of the disallowTrafficFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDisallowTrafficFlag() {
        return disallowTrafficFlag;
    }

    /**
     * Sets the value of the disallowTrafficFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDisallowTrafficFlag(YesNo value) {
        this.disallowTrafficFlag = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction }
     *     
     */
    public PaymentTransaction getPaymentTransaction() {
        return paymentTransaction;
    }

    /**
     * Sets the value of the paymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction }
     *     
     */
    public void setPaymentTransaction(PaymentTransaction value) {
        this.paymentTransaction = value;
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
     * Gets the value of the refundCancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundCancelFlag() {
        return refundCancelFlag;
    }

    /**
     * Sets the value of the refundCancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundCancelFlag(String value) {
        this.refundCancelFlag = value;
    }

    /**
     * Gets the value of the partnerInfoBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInfoBuffer }
     *     
     */
    public PartnerInfoBuffer getPartnerInfoBuffer() {
        return partnerInfoBuffer;
    }

    /**
     * Sets the value of the partnerInfoBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInfoBuffer }
     *     
     */
    public void setPartnerInfoBuffer(PartnerInfoBuffer value) {
        this.partnerInfoBuffer = value;
    }

}
