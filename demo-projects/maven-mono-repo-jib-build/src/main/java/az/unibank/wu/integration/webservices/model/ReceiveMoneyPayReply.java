
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receive-money-pay-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receive-money-pay-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_points_earned" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="paid_date_time" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         &lt;element name="pin_text" type="{http://www.westernunion.com/schema/xrsi}pin_text" minOccurs="0"/>
 *         &lt;element name="promo_text" type="{http://www.westernunion.com/schema/xrsi}promo_text" minOccurs="0"/>
 *         &lt;element name="phone_pin" type="{http://www.westernunion.com/schema/xrsi}pin" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="number_matches" type="{http://www.westernunion.com/schema/xrsi}number_matches" minOccurs="0"/>
 *         &lt;element name="preferred_customer" type="{http://www.westernunion.com/schema/xrsi}preferred_customer" minOccurs="0"/>
 *         &lt;element name="host_message_set1" type="{http://www.westernunion.com/schema/xrsi}host_message_set1" minOccurs="0"/>
 *         &lt;element name="host_message_set2" type="{http://www.westernunion.com/schema/xrsi}host_message_set2" minOccurs="0"/>
 *         &lt;element name="host_message_set3" type="{http://www.westernunion.com/schema/xrsi}host_message_set3" minOccurs="0"/>
 *         &lt;element name="Partner_data" type="{http://www.westernunion.com/schema/xrsi}partner_data" minOccurs="0"/>
 *         &lt;element name="splitpay_charges_buffer" type="{http://www.westernunion.com/schema/xrsi}additional_buffer_charges_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer_details" type="{http://www.westernunion.com/schema/xrsi}misc_buffer_type" minOccurs="0"/>
 *         &lt;element name="misc_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="partner_security_token" type="{http://www.westernunion.com/schema/xrsi}partner_security_token" minOccurs="0"/>
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
@XmlType(name = "receive-money-pay-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "receiver",
    "paymentDetails",
    "mtcn",
    "newMtcn",
    "newPointsEarned",
    "paidDateTime",
    "pinText",
    "promoText",
    "phonePin",
    "foreignRemoteSystem",
    "numberMatches",
    "preferredCustomer",
    "hostMessageSet1",
    "hostMessageSet2",
    "hostMessageSet3",
    "partnerData",
    "splitpayChargesBuffer",
    "miscBufferDetails",
    "miscBuffer",
    "partnerSecurityToken",
    "partnerInfoBuffer"
})
public class ReceiveMoneyPayReply
    extends ReplyTransactionBase
{

    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "new_points_earned")
    protected BigInteger newPointsEarned;
    @XmlElement(name = "paid_date_time")
    protected String paidDateTime;
    @XmlElement(name = "pin_text")
    protected String pinText;
    @XmlElement(name = "promo_text")
    protected String promoText;
    @XmlElement(name = "phone_pin")
    protected String phonePin;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "number_matches")
    protected BigInteger numberMatches;
    @XmlElement(name = "preferred_customer")
    protected PreferredCustomer preferredCustomer;
    @XmlElement(name = "host_message_set1")
    protected String hostMessageSet1;
    @XmlElement(name = "host_message_set2")
    protected String hostMessageSet2;
    @XmlElement(name = "host_message_set3")
    protected String hostMessageSet3;
    @XmlElement(name = "Partner_data")
    protected String partnerData;
    @XmlElement(name = "splitpay_charges_buffer")
    protected AdditionalBufferChargesType splitpayChargesBuffer;
    @XmlElement(name = "misc_buffer_details")
    protected MiscBufferType miscBufferDetails;
    @XmlElement(name = "misc_buffer")
    protected String miscBuffer;
    @XmlElement(name = "partner_security_token")
    protected String partnerSecurityToken;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;

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
     * Gets the value of the newMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMtcn() {
        return newMtcn;
    }

    /**
     * Sets the value of the newMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMtcn(String value) {
        this.newMtcn = value;
    }

    /**
     * Gets the value of the newPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewPointsEarned() {
        return newPointsEarned;
    }

    /**
     * Sets the value of the newPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewPointsEarned(BigInteger value) {
        this.newPointsEarned = value;
    }

    /**
     * Gets the value of the paidDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDateTime() {
        return paidDateTime;
    }

    /**
     * Sets the value of the paidDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDateTime(String value) {
        this.paidDateTime = value;
    }

    /**
     * Gets the value of the pinText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinText() {
        return pinText;
    }

    /**
     * Sets the value of the pinText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinText(String value) {
        this.pinText = value;
    }

    /**
     * Gets the value of the promoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoText() {
        return promoText;
    }

    /**
     * Sets the value of the promoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoText(String value) {
        this.promoText = value;
    }

    /**
     * Gets the value of the phonePin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePin() {
        return phonePin;
    }

    /**
     * Sets the value of the phonePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePin(String value) {
        this.phonePin = value;
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
     * Gets the value of the preferredCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCustomer }
     *     
     */
    public PreferredCustomer getPreferredCustomer() {
        return preferredCustomer;
    }

    /**
     * Sets the value of the preferredCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCustomer }
     *     
     */
    public void setPreferredCustomer(PreferredCustomer value) {
        this.preferredCustomer = value;
    }

    /**
     * Gets the value of the hostMessageSet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMessageSet1() {
        return hostMessageSet1;
    }

    /**
     * Sets the value of the hostMessageSet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMessageSet1(String value) {
        this.hostMessageSet1 = value;
    }

    /**
     * Gets the value of the hostMessageSet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMessageSet2() {
        return hostMessageSet2;
    }

    /**
     * Sets the value of the hostMessageSet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMessageSet2(String value) {
        this.hostMessageSet2 = value;
    }

    /**
     * Gets the value of the hostMessageSet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMessageSet3() {
        return hostMessageSet3;
    }

    /**
     * Sets the value of the hostMessageSet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMessageSet3(String value) {
        this.hostMessageSet3 = value;
    }

    /**
     * Gets the value of the partnerData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerData() {
        return partnerData;
    }

    /**
     * Sets the value of the partnerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerData(String value) {
        this.partnerData = value;
    }

    /**
     * Gets the value of the splitpayChargesBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBufferChargesType }
     *     
     */
    public AdditionalBufferChargesType getSplitpayChargesBuffer() {
        return splitpayChargesBuffer;
    }

    /**
     * Sets the value of the splitpayChargesBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBufferChargesType }
     *     
     */
    public void setSplitpayChargesBuffer(AdditionalBufferChargesType value) {
        this.splitpayChargesBuffer = value;
    }

    /**
     * Gets the value of the miscBufferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscBufferType }
     *     
     */
    public MiscBufferType getMiscBufferDetails() {
        return miscBufferDetails;
    }

    /**
     * Sets the value of the miscBufferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscBufferType }
     *     
     */
    public void setMiscBufferDetails(MiscBufferType value) {
        this.miscBufferDetails = value;
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
     * Gets the value of the partnerSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSecurityToken() {
        return partnerSecurityToken;
    }

    /**
     * Sets the value of the partnerSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSecurityToken(String value) {
        this.partnerSecurityToken = value;
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
