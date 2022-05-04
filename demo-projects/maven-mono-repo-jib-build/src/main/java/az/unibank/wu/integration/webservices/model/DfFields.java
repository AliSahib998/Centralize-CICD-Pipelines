
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for df_fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="df_fields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pds_required_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="df_transaction_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="reprint_more_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="partner_marketing_languages" type="{http://www.westernunion.com/schema/xrsi}locale_info" minOccurs="0"/>
 *         &lt;element name="customer_preferrred_language" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="consumer_bureau_info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="federal" type="{http://www.westernunion.com/schema/xrsi}bureau_info_federal" minOccurs="0"/>
 *                   &lt;element name="state" type="{http://www.westernunion.com/schema/xrsi}bureau_info_state" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pay_side_tax" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="pay_side_charges" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="amount_to_receiver" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="available_for_pickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delivery_service_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="available_for_pickup_est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delay_hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qcc_consumer_fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qcc_transfer_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qcc_total_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qcc_attention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payout_amount_LRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payout_amount_USD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchange_rate_LRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchange_rate_USD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="df_buffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "df_fields", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DfFields {

    @XmlElement(name = "pds_required_flag")
    @XmlSchemaType(name = "string")
    protected YesNo pdsRequiredFlag;
    @XmlElement(name = "df_transaction_flag")
    @XmlSchemaType(name = "string")
    protected YesNo dfTransactionFlag;
    @XmlElement(name = "reprint_more_flag")
    @XmlSchemaType(name = "string")
    protected YesNo reprintMoreFlag;
    @XmlElement(name = "partner_marketing_languages")
    protected LocaleInfo partnerMarketingLanguages;
    @XmlElement(name = "customer_preferrred_language")
    protected String customerPreferrredLanguage;
    @XmlElement(name = "consumer_bureau_info")
    protected DfFields.ConsumerBureauInfo consumerBureauInfo;
    @XmlElement(name = "pay_side_tax")
    protected Double paySideTax;
    @XmlElement(name = "pay_side_charges")
    protected Double paySideCharges;
    @XmlElement(name = "amount_to_receiver")
    protected Double amountToReceiver;
    @XmlElement(name = "available_for_pickup")
    protected String availableForPickup;
    @XmlElement(name = "delivery_service_name")
    protected String deliveryServiceName;
    @XmlElement(name = "available_for_pickup_est")
    protected String availableForPickupEst;
    @XmlElement(name = "delay_hours")
    protected String delayHours;
    @XmlElement(name = "time_available")
    protected String timeAvailable;
    @XmlElement(name = "country_timezone")
    protected String countryTimezone;
    @XmlElement(name = "qcc_consumer_fee")
    protected String qccConsumerFee;
    @XmlElement(name = "qcc_transfer_tax")
    protected String qccTransferTax;
    @XmlElement(name = "qcc_total_amount")
    protected String qccTotalAmount;
    @XmlElement(name = "qcc_attention")
    protected String qccAttention;
    @XmlElement(name = "reference_number")
    protected String referenceNumber;
    @XmlElement(name = "payout_amount_LRD")
    protected String payoutAmountLRD;
    @XmlElement(name = "payout_amount_USD")
    protected String payoutAmountUSD;
    @XmlElement(name = "exchange_rate_LRD")
    protected String exchangeRateLRD;
    @XmlElement(name = "exchange_rate_USD")
    protected String exchangeRateUSD;
    @XmlElement(name = "df_buffer")
    protected String dfBuffer;

    /**
     * Gets the value of the pdsRequiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPdsRequiredFlag() {
        return pdsRequiredFlag;
    }

    /**
     * Sets the value of the pdsRequiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPdsRequiredFlag(YesNo value) {
        this.pdsRequiredFlag = value;
    }

    /**
     * Gets the value of the dfTransactionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDfTransactionFlag() {
        return dfTransactionFlag;
    }

    /**
     * Sets the value of the dfTransactionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDfTransactionFlag(YesNo value) {
        this.dfTransactionFlag = value;
    }

    /**
     * Gets the value of the reprintMoreFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getReprintMoreFlag() {
        return reprintMoreFlag;
    }

    /**
     * Sets the value of the reprintMoreFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setReprintMoreFlag(YesNo value) {
        this.reprintMoreFlag = value;
    }

    /**
     * Gets the value of the partnerMarketingLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleInfo }
     *     
     */
    public LocaleInfo getPartnerMarketingLanguages() {
        return partnerMarketingLanguages;
    }

    /**
     * Sets the value of the partnerMarketingLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleInfo }
     *     
     */
    public void setPartnerMarketingLanguages(LocaleInfo value) {
        this.partnerMarketingLanguages = value;
    }

    /**
     * Gets the value of the customerPreferrredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPreferrredLanguage() {
        return customerPreferrredLanguage;
    }

    /**
     * Sets the value of the customerPreferrredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPreferrredLanguage(String value) {
        this.customerPreferrredLanguage = value;
    }

    /**
     * Gets the value of the consumerBureauInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DfFields.ConsumerBureauInfo }
     *     
     */
    public DfFields.ConsumerBureauInfo getConsumerBureauInfo() {
        return consumerBureauInfo;
    }

    /**
     * Sets the value of the consumerBureauInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfFields.ConsumerBureauInfo }
     *     
     */
    public void setConsumerBureauInfo(DfFields.ConsumerBureauInfo value) {
        this.consumerBureauInfo = value;
    }

    /**
     * Gets the value of the paySideTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaySideTax() {
        return paySideTax;
    }

    /**
     * Sets the value of the paySideTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaySideTax(Double value) {
        this.paySideTax = value;
    }

    /**
     * Gets the value of the paySideCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaySideCharges() {
        return paySideCharges;
    }

    /**
     * Sets the value of the paySideCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaySideCharges(Double value) {
        this.paySideCharges = value;
    }

    /**
     * Gets the value of the amountToReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountToReceiver() {
        return amountToReceiver;
    }

    /**
     * Sets the value of the amountToReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountToReceiver(Double value) {
        this.amountToReceiver = value;
    }

    /**
     * Gets the value of the availableForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForPickup() {
        return availableForPickup;
    }

    /**
     * Sets the value of the availableForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForPickup(String value) {
        this.availableForPickup = value;
    }

    /**
     * Gets the value of the deliveryServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    /**
     * Sets the value of the deliveryServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceName(String value) {
        this.deliveryServiceName = value;
    }

    /**
     * Gets the value of the availableForPickupEst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForPickupEst() {
        return availableForPickupEst;
    }

    /**
     * Sets the value of the availableForPickupEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForPickupEst(String value) {
        this.availableForPickupEst = value;
    }

    /**
     * Gets the value of the delayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayHours() {
        return delayHours;
    }

    /**
     * Sets the value of the delayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayHours(String value) {
        this.delayHours = value;
    }

    /**
     * Gets the value of the timeAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAvailable() {
        return timeAvailable;
    }

    /**
     * Sets the value of the timeAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAvailable(String value) {
        this.timeAvailable = value;
    }

    /**
     * Gets the value of the countryTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTimezone() {
        return countryTimezone;
    }

    /**
     * Sets the value of the countryTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTimezone(String value) {
        this.countryTimezone = value;
    }

    /**
     * Gets the value of the qccConsumerFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQccConsumerFee() {
        return qccConsumerFee;
    }

    /**
     * Sets the value of the qccConsumerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQccConsumerFee(String value) {
        this.qccConsumerFee = value;
    }

    /**
     * Gets the value of the qccTransferTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQccTransferTax() {
        return qccTransferTax;
    }

    /**
     * Sets the value of the qccTransferTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQccTransferTax(String value) {
        this.qccTransferTax = value;
    }

    /**
     * Gets the value of the qccTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQccTotalAmount() {
        return qccTotalAmount;
    }

    /**
     * Sets the value of the qccTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQccTotalAmount(String value) {
        this.qccTotalAmount = value;
    }

    /**
     * Gets the value of the qccAttention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQccAttention() {
        return qccAttention;
    }

    /**
     * Sets the value of the qccAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQccAttention(String value) {
        this.qccAttention = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the payoutAmountLRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAmountLRD() {
        return payoutAmountLRD;
    }

    /**
     * Sets the value of the payoutAmountLRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAmountLRD(String value) {
        this.payoutAmountLRD = value;
    }

    /**
     * Gets the value of the payoutAmountUSD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAmountUSD() {
        return payoutAmountUSD;
    }

    /**
     * Sets the value of the payoutAmountUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAmountUSD(String value) {
        this.payoutAmountUSD = value;
    }

    /**
     * Gets the value of the exchangeRateLRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateLRD() {
        return exchangeRateLRD;
    }

    /**
     * Sets the value of the exchangeRateLRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateLRD(String value) {
        this.exchangeRateLRD = value;
    }

    /**
     * Gets the value of the exchangeRateUSD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateUSD() {
        return exchangeRateUSD;
    }

    /**
     * Sets the value of the exchangeRateUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateUSD(String value) {
        this.exchangeRateUSD = value;
    }

    /**
     * Gets the value of the dfBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfBuffer() {
        return dfBuffer;
    }

    /**
     * Sets the value of the dfBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfBuffer(String value) {
        this.dfBuffer = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="federal" type="{http://www.westernunion.com/schema/xrsi}bureau_info_federal" minOccurs="0"/>
     *         &lt;element name="state" type="{http://www.westernunion.com/schema/xrsi}bureau_info_state" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ConsumerBureauInfo {

        protected BureauInfoFederal federal;
        protected BureauInfoState state;

        /**
         * Gets the value of the federal property.
         * 
         * @return
         *     possible object is
         *     {@link BureauInfoFederal }
         *     
         */
        public BureauInfoFederal getFederal() {
            return federal;
        }

        /**
         * Sets the value of the federal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BureauInfoFederal }
         *     
         */
        public void setFederal(BureauInfoFederal value) {
            this.federal = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link BureauInfoState }
         *     
         */
        public BureauInfoState getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link BureauInfoState }
         *     
         */
        public void setState(BureauInfoState value) {
            this.state = value;
        }

    }

}
