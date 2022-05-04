
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxes" type="{http://www.westernunion.com/schema/xrsi}taxes" minOccurs="0"/>
 *         &lt;element name="originators_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="destination_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="third_party_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="principal_USD" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="gross_total_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="plus_charges_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="pay_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="principal_dollar_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="surcharge" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="tolls" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="promo_discount_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="originating_currency_principal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.westernunion.com/schema/xrsi}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="principal_in_words" type="{http://www.westernunion.com/schema/xrsi}principal_in_words" minOccurs="0"/>
 *         &lt;element name="canadian_dollar_exchange_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="message_charge" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="incr_message_charge" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="aggregated_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="available_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="sum_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="exchange_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="conversion_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="second_exchange_fee" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="money_transfer_limit" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="transaction_limit" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="daily_limit" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="cumulative_total_for_day" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="addl_services_fees" type="{http://www.westernunion.com/schema/xrsi}addl_services_fees" minOccurs="0"/>
 *         &lt;element name="add_principal" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="speed_of_delivery" type="{http://www.westernunion.com/schema/xrsi}speed_of_delivery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="total_undiscounted_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="total_discount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="total_discounted_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="min_transaction_limit" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="max_transaction_limit" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financials", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "taxes",
    "originatorsPrincipalAmount",
    "destinationPrincipalAmount",
    "thirdPartyAmount",
    "principalUSD",
    "grossTotalAmount",
    "plusChargesAmount",
    "payAmount",
    "principalDollarAmount",
    "principalAmount",
    "surcharge",
    "charges",
    "tolls",
    "promoDiscountAmount",
    "originatingCurrencyPrincipal",
    "principalInWords",
    "canadianDollarExchangeFee",
    "messageCharge",
    "incrMessageCharge",
    "aggregatedAmount",
    "availableAmount",
    "sumCharges",
    "exchangeFee",
    "conversionFee",
    "secondExchangeFee",
    "moneyTransferLimit",
    "transactionLimit",
    "dailyLimit",
    "cumulativeTotalForDay",
    "addlServicesFees",
    "addPrincipal",
    "speedOfDelivery",
    "totalUndiscountedCharges",
    "totalDiscount",
    "totalDiscountedCharges",
    "minTransactionLimit",
    "maxTransactionLimit"
})
public class Financials {

    protected Taxes taxes;
    @XmlElement(name = "originators_principal_amount")
    protected Long originatorsPrincipalAmount;
    @XmlElement(name = "destination_principal_amount")
    protected Long destinationPrincipalAmount;
    @XmlElement(name = "third_party_amount")
    protected Long thirdPartyAmount;
    @XmlElement(name = "principal_USD")
    protected Long principalUSD;
    @XmlElement(name = "gross_total_amount")
    protected Long grossTotalAmount;
    @XmlElement(name = "plus_charges_amount")
    protected Long plusChargesAmount;
    @XmlElement(name = "pay_amount")
    protected Long payAmount;
    @XmlElement(name = "principal_dollar_amount")
    protected Long principalDollarAmount;
    @XmlElement(name = "principal_amount")
    protected Long principalAmount;
    protected String surcharge;
    protected Long charges;
    protected Long tolls;
    @XmlElement(name = "promo_discount_amount")
    protected Long promoDiscountAmount;
    @XmlElement(name = "originating_currency_principal")
    protected String originatingCurrencyPrincipal;
    @XmlElement(name = "principal_in_words")
    protected String principalInWords;
    @XmlElement(name = "canadian_dollar_exchange_fee")
    protected Long canadianDollarExchangeFee;
    @XmlElement(name = "message_charge")
    protected Long messageCharge;
    @XmlElement(name = "incr_message_charge")
    protected Long incrMessageCharge;
    @XmlElement(name = "aggregated_amount")
    protected Long aggregatedAmount;
    @XmlElement(name = "available_amount")
    protected Long availableAmount;
    @XmlElement(name = "sum_charges")
    protected Long sumCharges;
    @XmlElement(name = "exchange_fee")
    protected Long exchangeFee;
    @XmlElement(name = "conversion_fee")
    protected Long conversionFee;
    @XmlElement(name = "second_exchange_fee")
    protected Long secondExchangeFee;
    @XmlElement(name = "money_transfer_limit")
    protected Long moneyTransferLimit;
    @XmlElement(name = "transaction_limit")
    protected Long transactionLimit;
    @XmlElement(name = "daily_limit")
    protected Long dailyLimit;
    @XmlElement(name = "cumulative_total_for_day")
    protected Long cumulativeTotalForDay;
    @XmlElement(name = "addl_services_fees")
    protected AddlServicesFees addlServicesFees;
    @XmlElement(name = "add_principal")
    protected Long addPrincipal;
    @XmlElement(name = "speed_of_delivery")
    protected List<SpeedOfDelivery> speedOfDelivery;
    @XmlElement(name = "total_undiscounted_charges")
    protected Long totalUndiscountedCharges;
    @XmlElement(name = "total_discount")
    protected Long totalDiscount;
    @XmlElement(name = "total_discounted_charges")
    protected Long totalDiscountedCharges;
    @XmlElement(name = "min_transaction_limit")
    protected Long minTransactionLimit;
    @XmlElement(name = "max_transaction_limit")
    protected Long maxTransactionLimit;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the originatorsPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginatorsPrincipalAmount() {
        return originatorsPrincipalAmount;
    }

    /**
     * Sets the value of the originatorsPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginatorsPrincipalAmount(Long value) {
        this.originatorsPrincipalAmount = value;
    }

    /**
     * Gets the value of the destinationPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationPrincipalAmount() {
        return destinationPrincipalAmount;
    }

    /**
     * Sets the value of the destinationPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationPrincipalAmount(Long value) {
        this.destinationPrincipalAmount = value;
    }

    /**
     * Gets the value of the thirdPartyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdPartyAmount() {
        return thirdPartyAmount;
    }

    /**
     * Sets the value of the thirdPartyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdPartyAmount(Long value) {
        this.thirdPartyAmount = value;
    }

    /**
     * Gets the value of the principalUSD property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrincipalUSD() {
        return principalUSD;
    }

    /**
     * Sets the value of the principalUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrincipalUSD(Long value) {
        this.principalUSD = value;
    }

    /**
     * Gets the value of the grossTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossTotalAmount() {
        return grossTotalAmount;
    }

    /**
     * Sets the value of the grossTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossTotalAmount(Long value) {
        this.grossTotalAmount = value;
    }

    /**
     * Gets the value of the plusChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlusChargesAmount() {
        return plusChargesAmount;
    }

    /**
     * Sets the value of the plusChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlusChargesAmount(Long value) {
        this.plusChargesAmount = value;
    }

    /**
     * Gets the value of the payAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayAmount() {
        return payAmount;
    }

    /**
     * Sets the value of the payAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayAmount(Long value) {
        this.payAmount = value;
    }

    /**
     * Gets the value of the principalDollarAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrincipalDollarAmount() {
        return principalDollarAmount;
    }

    /**
     * Sets the value of the principalDollarAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrincipalDollarAmount(Long value) {
        this.principalDollarAmount = value;
    }

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrincipalAmount(Long value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharges(Long value) {
        this.charges = value;
    }

    /**
     * Gets the value of the tolls property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTolls() {
        return tolls;
    }

    /**
     * Sets the value of the tolls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTolls(Long value) {
        this.tolls = value;
    }

    /**
     * Gets the value of the promoDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromoDiscountAmount() {
        return promoDiscountAmount;
    }

    /**
     * Sets the value of the promoDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromoDiscountAmount(Long value) {
        this.promoDiscountAmount = value;
    }

    /**
     * Gets the value of the originatingCurrencyPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingCurrencyPrincipal() {
        return originatingCurrencyPrincipal;
    }

    /**
     * Sets the value of the originatingCurrencyPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingCurrencyPrincipal(String value) {
        this.originatingCurrencyPrincipal = value;
    }

    /**
     * Gets the value of the principalInWords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInWords() {
        return principalInWords;
    }

    /**
     * Sets the value of the principalInWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInWords(String value) {
        this.principalInWords = value;
    }

    /**
     * Gets the value of the canadianDollarExchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCanadianDollarExchangeFee() {
        return canadianDollarExchangeFee;
    }

    /**
     * Sets the value of the canadianDollarExchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCanadianDollarExchangeFee(Long value) {
        this.canadianDollarExchangeFee = value;
    }

    /**
     * Gets the value of the messageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageCharge() {
        return messageCharge;
    }

    /**
     * Sets the value of the messageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageCharge(Long value) {
        this.messageCharge = value;
    }

    /**
     * Gets the value of the incrMessageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncrMessageCharge() {
        return incrMessageCharge;
    }

    /**
     * Sets the value of the incrMessageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncrMessageCharge(Long value) {
        this.incrMessageCharge = value;
    }

    /**
     * Gets the value of the aggregatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAggregatedAmount() {
        return aggregatedAmount;
    }

    /**
     * Sets the value of the aggregatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAggregatedAmount(Long value) {
        this.aggregatedAmount = value;
    }

    /**
     * Gets the value of the availableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Sets the value of the availableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableAmount(Long value) {
        this.availableAmount = value;
    }

    /**
     * Gets the value of the sumCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSumCharges() {
        return sumCharges;
    }

    /**
     * Sets the value of the sumCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSumCharges(Long value) {
        this.sumCharges = value;
    }

    /**
     * Gets the value of the exchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeFee() {
        return exchangeFee;
    }

    /**
     * Sets the value of the exchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeFee(Long value) {
        this.exchangeFee = value;
    }

    /**
     * Gets the value of the conversionFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionFee() {
        return conversionFee;
    }

    /**
     * Sets the value of the conversionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionFee(Long value) {
        this.conversionFee = value;
    }

    /**
     * Gets the value of the secondExchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondExchangeFee() {
        return secondExchangeFee;
    }

    /**
     * Sets the value of the secondExchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondExchangeFee(Long value) {
        this.secondExchangeFee = value;
    }

    /**
     * Gets the value of the moneyTransferLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMoneyTransferLimit() {
        return moneyTransferLimit;
    }

    /**
     * Sets the value of the moneyTransferLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoneyTransferLimit(Long value) {
        this.moneyTransferLimit = value;
    }

    /**
     * Gets the value of the transactionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionLimit() {
        return transactionLimit;
    }

    /**
     * Sets the value of the transactionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionLimit(Long value) {
        this.transactionLimit = value;
    }

    /**
     * Gets the value of the dailyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailyLimit() {
        return dailyLimit;
    }

    /**
     * Sets the value of the dailyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailyLimit(Long value) {
        this.dailyLimit = value;
    }

    /**
     * Gets the value of the cumulativeTotalForDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCumulativeTotalForDay() {
        return cumulativeTotalForDay;
    }

    /**
     * Sets the value of the cumulativeTotalForDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCumulativeTotalForDay(Long value) {
        this.cumulativeTotalForDay = value;
    }

    /**
     * Gets the value of the addlServicesFees property.
     * 
     * @return
     *     possible object is
     *     {@link AddlServicesFees }
     *     
     */
    public AddlServicesFees getAddlServicesFees() {
        return addlServicesFees;
    }

    /**
     * Sets the value of the addlServicesFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlServicesFees }
     *     
     */
    public void setAddlServicesFees(AddlServicesFees value) {
        this.addlServicesFees = value;
    }

    /**
     * Gets the value of the addPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddPrincipal() {
        return addPrincipal;
    }

    /**
     * Sets the value of the addPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddPrincipal(Long value) {
        this.addPrincipal = value;
    }

    /**
     * Gets the value of the speedOfDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedOfDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedOfDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeedOfDelivery }
     * 
     * 
     */
    public List<SpeedOfDelivery> getSpeedOfDelivery() {
        if (speedOfDelivery == null) {
            speedOfDelivery = new ArrayList<SpeedOfDelivery>();
        }
        return this.speedOfDelivery;
    }

    /**
     * Gets the value of the totalUndiscountedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalUndiscountedCharges() {
        return totalUndiscountedCharges;
    }

    /**
     * Sets the value of the totalUndiscountedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalUndiscountedCharges(Long value) {
        this.totalUndiscountedCharges = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalDiscount(Long value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the totalDiscountedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalDiscountedCharges() {
        return totalDiscountedCharges;
    }

    /**
     * Sets the value of the totalDiscountedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalDiscountedCharges(Long value) {
        this.totalDiscountedCharges = value;
    }

    /**
     * Gets the value of the minTransactionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinTransactionLimit() {
        return minTransactionLimit;
    }

    /**
     * Sets the value of the minTransactionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinTransactionLimit(Long value) {
        this.minTransactionLimit = value;
    }

    /**
     * Gets the value of the maxTransactionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTransactionLimit() {
        return maxTransactionLimit;
    }

    /**
     * Sets the value of the maxTransactionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTransactionLimit(Long value) {
        this.maxTransactionLimit = value;
    }

}
