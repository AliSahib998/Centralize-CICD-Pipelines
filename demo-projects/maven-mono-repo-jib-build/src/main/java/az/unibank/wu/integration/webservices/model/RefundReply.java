
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refund-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refund-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         &lt;element name="filing_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         &lt;element name="filing_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         &lt;element name="pin_text_message_set_2" type="{http://www.westernunion.com/schema/xrsi}pin_text" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="promo_text_message" type="{http://www.westernunion.com/schema/xrsi}promo_text" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="new_points_earned" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="phone_pin" type="{http://www.westernunion.com/schema/xrsi}pin" minOccurs="0"/>
 *         &lt;element name="phone_pin_text" type="{http://www.westernunion.com/schema/xrsi}pin_text" minOccurs="0"/>
 *         &lt;element name="wu_card_pin_text" type="{http://www.westernunion.com/schema/xrsi}pin_text" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="auto_enroll_text" type="{http://www.westernunion.com/schema/xrsi}auto_enroll_text" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="auto_enroll_flag" type="{http://www.westernunion.com/schema/xrsi}auto_enroll_flag" minOccurs="0"/>
 *         &lt;element name="receipt_option" type="{http://www.westernunion.com/schema/xrsi}receipt_option" minOccurs="0"/>
 *         &lt;element name="phone_reward_amount" type="{http://www.westernunion.com/schema/xrsi}phone_reward_amount" minOccurs="0"/>
 *         &lt;element name="phone_reward_currency" type="{http://www.westernunion.com/schema/xrsi}phone_reward_currency" minOccurs="0"/>
 *         &lt;element name="points_earned" type="{http://www.westernunion.com/schema/xrsi}points_earned" minOccurs="0"/>
 *         &lt;element name="wu_card" type="{http://www.westernunion.com/schema/xrsi}wu_card" minOccurs="0"/>
 *         &lt;element name="dc_pin" type="{http://www.westernunion.com/schema/xrsi}dc_pin" minOccurs="0"/>
 *         &lt;element name="status_code" type="{http://www.westernunion.com/schema/xrsi}status_code" minOccurs="0"/>
 *         &lt;element name="address_verification_reply" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="nabanco_auth_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="slot_number" type="{http://www.westernunion.com/schema/xrsi}slot_number" minOccurs="0"/>
 *         &lt;element name="system_trace" type="{http://www.westernunion.com/schema/xrsi}system_trace" minOccurs="0"/>
 *         &lt;element name="validation_queue_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="last_score" type="{http://www.westernunion.com/schema/xrsi}last_score_value" minOccurs="0"/>
 *         &lt;element name="network_exchange_rate" type="{http://www.westernunion.com/schema/xrsi}network_exchange_rate" minOccurs="0"/>
 *         &lt;element name="ips_card_balance" type="{http://www.westernunion.com/schema/xrsi}ips_card_balance" minOccurs="0"/>
 *         &lt;element name="ips_funds_loaded" type="{http://www.westernunion.com/schema/xrsi}ips_funds_loaded" minOccurs="0"/>
 *         &lt;element name="device_id" type="{http://www.westernunion.com/schema/xrsi}device_id" minOccurs="0"/>
 *         &lt;element name="refund_details" type="{http://www.westernunion.com/schema/xrsi}refund_details" minOccurs="0"/>
 *         &lt;element name="unisys_customer_id" type="{http://www.westernunion.com/schema/xrsi}unisys_customer_id" minOccurs="0"/>
 *         &lt;element name="connection_id" type="{http://www.westernunion.com/schema/xrsi}connection_id" minOccurs="0"/>
 *         &lt;element name="ccscan_transaction_id" type="{http://www.westernunion.com/schema/xrsi}ccscan_transaction_id" minOccurs="0"/>
 *         &lt;element name="shared_global" type="{http://www.westernunion.com/schema/xrsi}shared_global" minOccurs="0"/>
 *         &lt;element name="dest_ctry_limit" type="{http://www.westernunion.com/schema/xrsi}limit" minOccurs="0"/>
 *         &lt;element name="dest_ctry_qqc_limit" type="{http://www.westernunion.com/schema/xrsi}limit" minOccurs="0"/>
 *         &lt;element name="customer_limit" type="{http://www.westernunion.com/schema/xrsi}limit" minOccurs="0"/>
 *         &lt;element name="test_question_reqd_flag" type="{http://www.westernunion.com/schema/xrsi}test_question" minOccurs="0"/>
 *         &lt;element name="tmt_staging" type="{http://www.westernunion.com/schema/xrsi}tmt_staging" minOccurs="0"/>
 *         &lt;element name="line_out" type="{http://www.westernunion.com/schema/xrsi}line_out" minOccurs="0"/>
 *         &lt;element name="refund" type="{http://www.westernunion.com/schema/xrsi}refund_details" minOccurs="0"/>
 *         &lt;element name="validation_code" type="{http://www.westernunion.com/schema/xrsi}validation_code" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *         &lt;element name="current_fx" type="{http://www.westernunion.com/schema/xrsi}current_fx" minOccurs="0"/>
 *         &lt;element name="number_matches" type="{http://www.westernunion.com/schema/xrsi}number_matches" minOccurs="0"/>
 *         &lt;element name="delivery_service_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         &lt;element name="fixed_on_send" type="{http://www.westernunion.com/schema/xrsi}fixed_on_send" minOccurs="0"/>
 *         &lt;element name="host_message_set1" type="{http://www.westernunion.com/schema/xrsi}host_message_set1" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="host_message_set3" type="{http://www.westernunion.com/schema/xrsi}host_message_set3" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="pos_message" type="{http://www.westernunion.com/schema/xrsi}pos_message" minOccurs="0"/>
 *         &lt;element name="receipt_text" type="{http://www.westernunion.com/schema/xrsi}receipt_text" maxOccurs="30" minOccurs="0"/>
 *         &lt;element name="Is_convenience_search_flag" type="{http://www.westernunion.com/schema/xrsi}dcc" minOccurs="0"/>
 *         &lt;element name="Is_convenience_suppress_Flag" type="{http://www.westernunion.com/schema/xrsi}dcc" minOccurs="0"/>
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
@XmlType(name = "refund-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sender",
    "receiver",
    "paymentDetails",
    "financials",
    "promotions",
    "mtcn",
    "newMtcn",
    "filingDate",
    "filingTime",
    "pinTextMessageSet2",
    "promoTextMessage",
    "newPointsEarned",
    "phonePin",
    "phonePinText",
    "wuCardPinText",
    "autoEnrollText",
    "autoEnrollFlag",
    "receiptOption",
    "phoneRewardAmount",
    "phoneRewardCurrency",
    "pointsEarned",
    "wuCard",
    "dcPin",
    "statusCode",
    "addressVerificationReply",
    "nabancoAuthFlag",
    "slotNumber",
    "systemTrace",
    "validationQueueFlag",
    "lastScore",
    "networkExchangeRate",
    "ipsCardBalance",
    "ipsFundsLoaded",
    "deviceId",
    "refundDetails",
    "unisysCustomerId",
    "connectionId",
    "ccscanTransactionId",
    "sharedGlobal",
    "destCtryLimit",
    "destCtryQqcLimit",
    "customerLimit",
    "testQuestionReqdFlag",
    "tmtStaging",
    "lineOut",
    "refund",
    "validationCode",
    "foreignRemoteSystem",
    "currentFx",
    "numberMatches",
    "deliveryServiceCode",
    "fixedOnSend",
    "hostMessageSet1",
    "hostMessageSet3",
    "posMessage",
    "receiptText",
    "isConvenienceSearchFlag",
    "isConvenienceSuppressFlag",
    "partnerInfoBuffer"
})
public class RefundReply
    extends ReplyTransactionBase
{

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    protected Financials financials;
    protected Promotions promotions;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "filing_date")
    protected String filingDate;
    @XmlElement(name = "filing_time")
    protected String filingTime;
    @XmlElement(name = "pin_text_message_set_2")
    protected List<String> pinTextMessageSet2;
    @XmlElement(name = "promo_text_message")
    protected List<String> promoTextMessage;
    @XmlElement(name = "new_points_earned")
    protected BigInteger newPointsEarned;
    @XmlElement(name = "phone_pin")
    protected String phonePin;
    @XmlElement(name = "phone_pin_text")
    protected String phonePinText;
    @XmlElement(name = "wu_card_pin_text")
    protected List<String> wuCardPinText;
    @XmlElement(name = "auto_enroll_text")
    protected List<String> autoEnrollText;
    @XmlElement(name = "auto_enroll_flag")
    protected String autoEnrollFlag;
    @XmlElement(name = "receipt_option")
    protected String receiptOption;
    @XmlElement(name = "phone_reward_amount")
    protected String phoneRewardAmount;
    @XmlElement(name = "phone_reward_currency")
    protected String phoneRewardCurrency;
    @XmlElement(name = "points_earned")
    protected BigInteger pointsEarned;
    @XmlElement(name = "wu_card")
    protected WuCard wuCard;
    @XmlElement(name = "dc_pin")
    protected String dcPin;
    @XmlElement(name = "status_code")
    protected String statusCode;
    @XmlElement(name = "address_verification_reply")
    @XmlSchemaType(name = "string")
    protected YesNo addressVerificationReply;
    @XmlElement(name = "nabanco_auth_flag")
    @XmlSchemaType(name = "string")
    protected YesNo nabancoAuthFlag;
    @XmlElement(name = "slot_number")
    protected String slotNumber;
    @XmlElement(name = "system_trace")
    protected String systemTrace;
    @XmlElement(name = "validation_queue_flag")
    @XmlSchemaType(name = "string")
    protected YesNo validationQueueFlag;
    @XmlElement(name = "last_score")
    protected String lastScore;
    @XmlElement(name = "network_exchange_rate")
    protected String networkExchangeRate;
    @XmlElement(name = "ips_card_balance")
    protected String ipsCardBalance;
    @XmlElement(name = "ips_funds_loaded")
    protected String ipsFundsLoaded;
    @XmlElement(name = "device_id")
    @XmlSchemaType(name = "string")
    protected DeviceId deviceId;
    @XmlElement(name = "refund_details")
    protected RefundDetails refundDetails;
    @XmlElement(name = "unisys_customer_id")
    protected String unisysCustomerId;
    @XmlElement(name = "connection_id")
    protected String connectionId;
    @XmlElement(name = "ccscan_transaction_id")
    protected String ccscanTransactionId;
    @XmlElement(name = "shared_global")
    protected SharedGlobal sharedGlobal;
    @XmlElement(name = "dest_ctry_limit")
    protected String destCtryLimit;
    @XmlElement(name = "dest_ctry_qqc_limit")
    protected String destCtryQqcLimit;
    @XmlElement(name = "customer_limit")
    protected String customerLimit;
    @XmlElement(name = "test_question_reqd_flag")
    protected String testQuestionReqdFlag;
    @XmlElement(name = "tmt_staging")
    protected String tmtStaging;
    @XmlElement(name = "line_out")
    protected String lineOut;
    protected RefundDetails refund;
    @XmlElement(name = "validation_code")
    protected String validationCode;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "current_fx")
    protected String currentFx;
    @XmlElement(name = "number_matches")
    protected BigInteger numberMatches;
    @XmlElement(name = "delivery_service_code")
    protected String deliveryServiceCode;
    @XmlElement(name = "fixed_on_send")
    protected String fixedOnSend;
    @XmlElement(name = "host_message_set1")
    protected List<String> hostMessageSet1;
    @XmlElement(name = "host_message_set3")
    protected List<String> hostMessageSet3;
    @XmlElement(name = "pos_message")
    protected String posMessage;
    @XmlElement(name = "receipt_text")
    protected List<String> receiptText;
    @XmlElement(name = "Is_convenience_search_flag")
    protected String isConvenienceSearchFlag;
    @XmlElement(name = "Is_convenience_suppress_Flag")
    protected String isConvenienceSuppressFlag;
    @XmlElement(name = "partner_info_buffer")
    protected PartnerInfoBuffer partnerInfoBuffer;

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
     * Gets the value of the financials property.
     * 
     * @return
     *     possible object is
     *     {@link Financials }
     *     
     */
    public Financials getFinancials() {
        return financials;
    }

    /**
     * Sets the value of the financials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financials }
     *     
     */
    public void setFinancials(Financials value) {
        this.financials = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
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
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDate(String value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the filingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTime() {
        return filingTime;
    }

    /**
     * Sets the value of the filingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTime(String value) {
        this.filingTime = value;
    }

    /**
     * Gets the value of the pinTextMessageSet2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pinTextMessageSet2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinTextMessageSet2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPinTextMessageSet2() {
        if (pinTextMessageSet2 == null) {
            pinTextMessageSet2 = new ArrayList<String>();
        }
        return this.pinTextMessageSet2;
    }

    /**
     * Gets the value of the promoTextMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promoTextMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoTextMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromoTextMessage() {
        if (promoTextMessage == null) {
            promoTextMessage = new ArrayList<String>();
        }
        return this.promoTextMessage;
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
     * Gets the value of the phonePinText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePinText() {
        return phonePinText;
    }

    /**
     * Sets the value of the phonePinText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePinText(String value) {
        this.phonePinText = value;
    }

    /**
     * Gets the value of the wuCardPinText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wuCardPinText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWuCardPinText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWuCardPinText() {
        if (wuCardPinText == null) {
            wuCardPinText = new ArrayList<String>();
        }
        return this.wuCardPinText;
    }

    /**
     * Gets the value of the autoEnrollText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoEnrollText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoEnrollText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutoEnrollText() {
        if (autoEnrollText == null) {
            autoEnrollText = new ArrayList<String>();
        }
        return this.autoEnrollText;
    }

    /**
     * Gets the value of the autoEnrollFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEnrollFlag() {
        return autoEnrollFlag;
    }

    /**
     * Sets the value of the autoEnrollFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEnrollFlag(String value) {
        this.autoEnrollFlag = value;
    }

    /**
     * Gets the value of the receiptOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptOption() {
        return receiptOption;
    }

    /**
     * Sets the value of the receiptOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptOption(String value) {
        this.receiptOption = value;
    }

    /**
     * Gets the value of the phoneRewardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneRewardAmount() {
        return phoneRewardAmount;
    }

    /**
     * Sets the value of the phoneRewardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneRewardAmount(String value) {
        this.phoneRewardAmount = value;
    }

    /**
     * Gets the value of the phoneRewardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneRewardCurrency() {
        return phoneRewardCurrency;
    }

    /**
     * Sets the value of the phoneRewardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneRewardCurrency(String value) {
        this.phoneRewardCurrency = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsEarned(BigInteger value) {
        this.pointsEarned = value;
    }

    /**
     * Gets the value of the wuCard property.
     * 
     * @return
     *     possible object is
     *     {@link WuCard }
     *     
     */
    public WuCard getWuCard() {
        return wuCard;
    }

    /**
     * Sets the value of the wuCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuCard }
     *     
     */
    public void setWuCard(WuCard value) {
        this.wuCard = value;
    }

    /**
     * Gets the value of the dcPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcPin() {
        return dcPin;
    }

    /**
     * Sets the value of the dcPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcPin(String value) {
        this.dcPin = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the addressVerificationReply property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAddressVerificationReply() {
        return addressVerificationReply;
    }

    /**
     * Sets the value of the addressVerificationReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAddressVerificationReply(YesNo value) {
        this.addressVerificationReply = value;
    }

    /**
     * Gets the value of the nabancoAuthFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getNabancoAuthFlag() {
        return nabancoAuthFlag;
    }

    /**
     * Sets the value of the nabancoAuthFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setNabancoAuthFlag(YesNo value) {
        this.nabancoAuthFlag = value;
    }

    /**
     * Gets the value of the slotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotNumber() {
        return slotNumber;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotNumber(String value) {
        this.slotNumber = value;
    }

    /**
     * Gets the value of the systemTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTrace() {
        return systemTrace;
    }

    /**
     * Sets the value of the systemTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTrace(String value) {
        this.systemTrace = value;
    }

    /**
     * Gets the value of the validationQueueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getValidationQueueFlag() {
        return validationQueueFlag;
    }

    /**
     * Sets the value of the validationQueueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setValidationQueueFlag(YesNo value) {
        this.validationQueueFlag = value;
    }

    /**
     * Gets the value of the lastScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastScore() {
        return lastScore;
    }

    /**
     * Sets the value of the lastScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastScore(String value) {
        this.lastScore = value;
    }

    /**
     * Gets the value of the networkExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkExchangeRate() {
        return networkExchangeRate;
    }

    /**
     * Sets the value of the networkExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkExchangeRate(String value) {
        this.networkExchangeRate = value;
    }

    /**
     * Gets the value of the ipsCardBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsCardBalance() {
        return ipsCardBalance;
    }

    /**
     * Sets the value of the ipsCardBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsCardBalance(String value) {
        this.ipsCardBalance = value;
    }

    /**
     * Gets the value of the ipsFundsLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsFundsLoaded() {
        return ipsFundsLoaded;
    }

    /**
     * Sets the value of the ipsFundsLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsFundsLoaded(String value) {
        this.ipsFundsLoaded = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceId }
     *     
     */
    public DeviceId getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceId }
     *     
     */
    public void setDeviceId(DeviceId value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the refundDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RefundDetails }
     *     
     */
    public RefundDetails getRefundDetails() {
        return refundDetails;
    }

    /**
     * Sets the value of the refundDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundDetails }
     *     
     */
    public void setRefundDetails(RefundDetails value) {
        this.refundDetails = value;
    }

    /**
     * Gets the value of the unisysCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnisysCustomerId() {
        return unisysCustomerId;
    }

    /**
     * Sets the value of the unisysCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnisysCustomerId(String value) {
        this.unisysCustomerId = value;
    }

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the ccscanTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcscanTransactionId() {
        return ccscanTransactionId;
    }

    /**
     * Sets the value of the ccscanTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcscanTransactionId(String value) {
        this.ccscanTransactionId = value;
    }

    /**
     * Gets the value of the sharedGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link SharedGlobal }
     *     
     */
    public SharedGlobal getSharedGlobal() {
        return sharedGlobal;
    }

    /**
     * Sets the value of the sharedGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedGlobal }
     *     
     */
    public void setSharedGlobal(SharedGlobal value) {
        this.sharedGlobal = value;
    }

    /**
     * Gets the value of the destCtryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCtryLimit() {
        return destCtryLimit;
    }

    /**
     * Sets the value of the destCtryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCtryLimit(String value) {
        this.destCtryLimit = value;
    }

    /**
     * Gets the value of the destCtryQqcLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCtryQqcLimit() {
        return destCtryQqcLimit;
    }

    /**
     * Sets the value of the destCtryQqcLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCtryQqcLimit(String value) {
        this.destCtryQqcLimit = value;
    }

    /**
     * Gets the value of the customerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLimit() {
        return customerLimit;
    }

    /**
     * Sets the value of the customerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLimit(String value) {
        this.customerLimit = value;
    }

    /**
     * Gets the value of the testQuestionReqdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestionReqdFlag() {
        return testQuestionReqdFlag;
    }

    /**
     * Sets the value of the testQuestionReqdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestionReqdFlag(String value) {
        this.testQuestionReqdFlag = value;
    }

    /**
     * Gets the value of the tmtStaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmtStaging() {
        return tmtStaging;
    }

    /**
     * Sets the value of the tmtStaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmtStaging(String value) {
        this.tmtStaging = value;
    }

    /**
     * Gets the value of the lineOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOut() {
        return lineOut;
    }

    /**
     * Sets the value of the lineOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOut(String value) {
        this.lineOut = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link RefundDetails }
     *     
     */
    public RefundDetails getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundDetails }
     *     
     */
    public void setRefund(RefundDetails value) {
        this.refund = value;
    }

    /**
     * Gets the value of the validationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * Sets the value of the validationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
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
     * Gets the value of the currentFx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFx() {
        return currentFx;
    }

    /**
     * Sets the value of the currentFx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFx(String value) {
        this.currentFx = value;
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
     * Gets the value of the deliveryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceCode() {
        return deliveryServiceCode;
    }

    /**
     * Sets the value of the deliveryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceCode(String value) {
        this.deliveryServiceCode = value;
    }

    /**
     * Gets the value of the fixedOnSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedOnSend() {
        return fixedOnSend;
    }

    /**
     * Sets the value of the fixedOnSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedOnSend(String value) {
        this.fixedOnSend = value;
    }

    /**
     * Gets the value of the hostMessageSet1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMessageSet1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostMessageSet1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHostMessageSet1() {
        if (hostMessageSet1 == null) {
            hostMessageSet1 = new ArrayList<String>();
        }
        return this.hostMessageSet1;
    }

    /**
     * Gets the value of the hostMessageSet3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMessageSet3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostMessageSet3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHostMessageSet3() {
        if (hostMessageSet3 == null) {
            hostMessageSet3 = new ArrayList<String>();
        }
        return this.hostMessageSet3;
    }

    /**
     * Gets the value of the posMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosMessage() {
        return posMessage;
    }

    /**
     * Sets the value of the posMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosMessage(String value) {
        this.posMessage = value;
    }

    /**
     * Gets the value of the receiptText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiptText() {
        if (receiptText == null) {
            receiptText = new ArrayList<String>();
        }
        return this.receiptText;
    }

    /**
     * Gets the value of the isConvenienceSearchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConvenienceSearchFlag() {
        return isConvenienceSearchFlag;
    }

    /**
     * Sets the value of the isConvenienceSearchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConvenienceSearchFlag(String value) {
        this.isConvenienceSearchFlag = value;
    }

    /**
     * Gets the value of the isConvenienceSuppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConvenienceSuppressFlag() {
        return isConvenienceSuppressFlag;
    }

    /**
     * Sets the value of the isConvenienceSuppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConvenienceSuppressFlag(String value) {
        this.isConvenienceSuppressFlag = value;
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
