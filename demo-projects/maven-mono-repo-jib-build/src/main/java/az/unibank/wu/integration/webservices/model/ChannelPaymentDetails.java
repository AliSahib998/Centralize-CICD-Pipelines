
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_payment_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origination" type="{http://www.westernunion.com/schema/xrsi}origination" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.westernunion.com/schema/xrsi}destination" minOccurs="0"/>
 *         &lt;element name="promotion" type="{http://www.westernunion.com/schema/xrsi}channel_promotion" minOccurs="0"/>
 *         &lt;element name="taxes" type="{http://www.westernunion.com/schema/xrsi}channel_taxes" minOccurs="0"/>
 *         &lt;element name="fees" type="{http://www.westernunion.com/schema/xrsi}channel_fees" minOccurs="0"/>
 *         &lt;element name="message_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="min_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="max_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="payment_type" type="{http://www.westernunion.com/schema/xrsi}payment_type" minOccurs="0"/>
 *         &lt;element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         &lt;element name="payment_digest" type="{http://www.westernunion.com/schema/xrsi}fee_survey_pricing_digest" minOccurs="0"/>
 *         &lt;element name="pay_wo_id_indicator" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="credit_debit_card_details" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card" minOccurs="0"/>
 *         &lt;element name="acs_verification_id" type="{http://www.westernunion.com/schema/xrsi}acs_verification_id" minOccurs="0"/>
 *         &lt;element name="conv_session_cookie" type="{http://www.westernunion.com/schema/xrsi}convenience_cookie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_payment_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "origination",
    "destination",
    "promotion",
    "taxes",
    "fees",
    "messageCharges",
    "exchangeRate",
    "minAmount",
    "maxAmount",
    "paymentType",
    "identificationQuestion",
    "paymentDigest",
    "payWoIdIndicator",
    "creditDebitCardDetails",
    "acsVerificationId",
    "convSessionCookie"
})
@XmlSeeAlso({
    MobilePaymentDetails.class,
    GbsGwpPaymentDetails.class
})
public class ChannelPaymentDetails {

    protected Origination origination;
    protected Destination destination;
    protected ChannelPromotion promotion;
    protected ChannelTaxes taxes;
    protected ChannelFees fees;
    @XmlElement(name = "message_charges")
    protected Long messageCharges;
    @XmlElement(name = "exchange_rate")
    protected Double exchangeRate;
    @XmlElement(name = "min_amount")
    protected Double minAmount;
    @XmlElement(name = "max_amount")
    protected Double maxAmount;
    @XmlElement(name = "payment_type")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    @XmlElement(name = "payment_digest")
    protected String paymentDigest;
    @XmlElement(name = "pay_wo_id_indicator")
    @XmlSchemaType(name = "string")
    protected YesNo payWoIdIndicator;
    @XmlElement(name = "credit_debit_card_details")
    protected CreditDebitCard creditDebitCardDetails;
    @XmlElement(name = "acs_verification_id")
    protected String acsVerificationId;
    @XmlElement(name = "conv_session_cookie")
    protected String convSessionCookie;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link Origination }
     *     
     */
    public Origination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Origination }
     *     
     */
    public void setOrigination(Origination value) {
        this.origination = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelPromotion }
     *     
     */
    public ChannelPromotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelPromotion }
     *     
     */
    public void setPromotion(ChannelPromotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelTaxes }
     *     
     */
    public ChannelTaxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTaxes }
     *     
     */
    public void setTaxes(ChannelTaxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelFees }
     *     
     */
    public ChannelFees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelFees }
     *     
     */
    public void setFees(ChannelFees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the messageCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageCharges() {
        return messageCharges;
    }

    /**
     * Sets the value of the messageCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageCharges(Long value) {
        this.messageCharges = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAmount(Double value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAmount(Double value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the identificationQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationQuestion }
     *     
     */
    public IdentificationQuestion getIdentificationQuestion() {
        return identificationQuestion;
    }

    /**
     * Sets the value of the identificationQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationQuestion }
     *     
     */
    public void setIdentificationQuestion(IdentificationQuestion value) {
        this.identificationQuestion = value;
    }

    /**
     * Gets the value of the paymentDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDigest() {
        return paymentDigest;
    }

    /**
     * Sets the value of the paymentDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDigest(String value) {
        this.paymentDigest = value;
    }

    /**
     * Gets the value of the payWoIdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPayWoIdIndicator() {
        return payWoIdIndicator;
    }

    /**
     * Sets the value of the payWoIdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPayWoIdIndicator(YesNo value) {
        this.payWoIdIndicator = value;
    }

    /**
     * Gets the value of the creditDebitCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCard }
     *     
     */
    public CreditDebitCard getCreditDebitCardDetails() {
        return creditDebitCardDetails;
    }

    /**
     * Sets the value of the creditDebitCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCard }
     *     
     */
    public void setCreditDebitCardDetails(CreditDebitCard value) {
        this.creditDebitCardDetails = value;
    }

    /**
     * Gets the value of the acsVerificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsVerificationId() {
        return acsVerificationId;
    }

    /**
     * Sets the value of the acsVerificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsVerificationId(String value) {
        this.acsVerificationId = value;
    }

    /**
     * Gets the value of the convSessionCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSessionCookie() {
        return convSessionCookie;
    }

    /**
     * Sets the value of the convSessionCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSessionCookie(String value) {
        this.convSessionCookie = value;
    }

}
