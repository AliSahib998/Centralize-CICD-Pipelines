
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abmt_bank_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abmt_bank_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account_number" type="{http://www.westernunion.com/schema/xrsi}fraud_account_number" minOccurs="0"/>
 *         &lt;element name="routing_number" type="{http://www.westernunion.com/schema/xrsi}fraud_routing_number" minOccurs="0"/>
 *         &lt;element name="account_type" type="{http://www.westernunion.com/schema/xrsi}fraud_account_type" minOccurs="0"/>
 *         &lt;element name="open_date" type="{http://www.westernunion.com/schema/xrsi}open_date" minOccurs="0"/>
 *         &lt;element name="avg_daily_bal_30days" type="{http://www.westernunion.com/schema/xrsi}avg_daily_bal" minOccurs="0"/>
 *         &lt;element name="avg_debit_count_30days" type="{http://www.westernunion.com/schema/xrsi}avg_debit_count" minOccurs="0"/>
 *         &lt;element name="avg_daily_bal_3mths" type="{http://www.westernunion.com/schema/xrsi}avg_daily_bal" minOccurs="0"/>
 *         &lt;element name="avg_debit_count_3mths" type="{http://www.westernunion.com/schema/xrsi}avg_debit_count" minOccurs="0"/>
 *         &lt;element name="account_ownership" type="{http://www.westernunion.com/schema/xrsi}acct_ownership" minOccurs="0"/>
 *         &lt;element name="is_debit_capable_account" type="{http://www.westernunion.com/schema/xrsi}is_debit_capable_account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abmt_bank_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "accountNumber",
    "routingNumber",
    "accountType",
    "openDate",
    "avgDailyBal30Days",
    "avgDebitCount30Days",
    "avgDailyBal3Mths",
    "avgDebitCount3Mths",
    "accountOwnership",
    "isDebitCapableAccount"
})
public class AbmtBankInfo {

    @XmlElement(name = "account_number")
    protected String accountNumber;
    @XmlElement(name = "routing_number")
    protected String routingNumber;
    @XmlElement(name = "account_type")
    protected String accountType;
    @XmlElement(name = "open_date")
    protected String openDate;
    @XmlElement(name = "avg_daily_bal_30days")
    protected String avgDailyBal30Days;
    @XmlElement(name = "avg_debit_count_30days")
    protected String avgDebitCount30Days;
    @XmlElement(name = "avg_daily_bal_3mths")
    protected String avgDailyBal3Mths;
    @XmlElement(name = "avg_debit_count_3mths")
    protected String avgDebitCount3Mths;
    @XmlElement(name = "account_ownership")
    @XmlSchemaType(name = "string")
    protected AcctOwnership accountOwnership;
    @XmlElement(name = "is_debit_capable_account")
    @XmlSchemaType(name = "string")
    protected IsDebitCapableAccount isDebitCapableAccount;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDate(String value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the avgDailyBal30Days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgDailyBal30Days() {
        return avgDailyBal30Days;
    }

    /**
     * Sets the value of the avgDailyBal30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgDailyBal30Days(String value) {
        this.avgDailyBal30Days = value;
    }

    /**
     * Gets the value of the avgDebitCount30Days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgDebitCount30Days() {
        return avgDebitCount30Days;
    }

    /**
     * Sets the value of the avgDebitCount30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgDebitCount30Days(String value) {
        this.avgDebitCount30Days = value;
    }

    /**
     * Gets the value of the avgDailyBal3Mths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgDailyBal3Mths() {
        return avgDailyBal3Mths;
    }

    /**
     * Sets the value of the avgDailyBal3Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgDailyBal3Mths(String value) {
        this.avgDailyBal3Mths = value;
    }

    /**
     * Gets the value of the avgDebitCount3Mths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgDebitCount3Mths() {
        return avgDebitCount3Mths;
    }

    /**
     * Sets the value of the avgDebitCount3Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgDebitCount3Mths(String value) {
        this.avgDebitCount3Mths = value;
    }

    /**
     * Gets the value of the accountOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link AcctOwnership }
     *     
     */
    public AcctOwnership getAccountOwnership() {
        return accountOwnership;
    }

    /**
     * Sets the value of the accountOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOwnership }
     *     
     */
    public void setAccountOwnership(AcctOwnership value) {
        this.accountOwnership = value;
    }

    /**
     * Gets the value of the isDebitCapableAccount property.
     * 
     * @return
     *     possible object is
     *     {@link IsDebitCapableAccount }
     *     
     */
    public IsDebitCapableAccount getIsDebitCapableAccount() {
        return isDebitCapableAccount;
    }

    /**
     * Sets the value of the isDebitCapableAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDebitCapableAccount }
     *     
     */
    public void setIsDebitCapableAccount(IsDebitCapableAccount value) {
        this.isDebitCapableAccount = value;
    }

}
