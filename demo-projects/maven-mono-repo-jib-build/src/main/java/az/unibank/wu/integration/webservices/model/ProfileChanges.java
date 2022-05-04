
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profile_changes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profile_changes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dormancy_90days" type="{http://www.westernunion.com/schema/xrsi}dormancy_90days" minOccurs="0"/>
 *         &lt;element name="days_changed_firstname" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_firstname" type="{http://www.westernunion.com/schema/xrsi}prior_value_firstname" minOccurs="0"/>
 *         &lt;element name="days_changed_lastname" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_lastname" type="{http://www.westernunion.com/schema/xrsi}prior_value_lastname" minOccurs="0"/>
 *         &lt;element name="days_changed_middlename" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_middlename" type="{http://www.westernunion.com/schema/xrsi}prior_value_middlename" minOccurs="0"/>
 *         &lt;element name="days_changed_address1" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_address1" type="{http://www.westernunion.com/schema/xrsi}prior_value_address1" minOccurs="0"/>
 *         &lt;element name="days_changed_address2" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_address2" type="{http://www.westernunion.com/schema/xrsi}prior_value_address2" minOccurs="0"/>
 *         &lt;element name="days_changed_city" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_city" type="{http://www.westernunion.com/schema/xrsi}prior_value_city" minOccurs="0"/>
 *         &lt;element name="days_changed_state" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_state" type="{http://www.westernunion.com/schema/xrsi}prior_value_state" minOccurs="0"/>
 *         &lt;element name="days_changed_ZIP" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_ZIP" type="{http://www.westernunion.com/schema/xrsi}prior_value_ZIP" minOccurs="0"/>
 *         &lt;element name="days_changed_country" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_country" type="{http://www.westernunion.com/schema/xrsi}prior_value_country" minOccurs="0"/>
 *         &lt;element name="days_changed_mobile_number" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_mobile_number" type="{http://www.westernunion.com/schema/xrsi}prior_value_mobile_number" minOccurs="0"/>
 *         &lt;element name="days_changed_home_phone" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_home_phone" type="{http://www.westernunion.com/schema/xrsi}prior_value_home_phone" minOccurs="0"/>
 *         &lt;element name="days_changed_email" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_value_email" type="{http://www.westernunion.com/schema/xrsi}prior_value_email" minOccurs="0"/>
 *         &lt;element name="days_since_last_KBA" type="{http://www.westernunion.com/schema/xrsi}number_of_days" minOccurs="0"/>
 *         &lt;element name="prior_KBA_results" type="{http://www.westernunion.com/schema/xrsi}prior_KBA_results" minOccurs="0"/>
 *         &lt;element name="negative_file_info" type="{http://www.westernunion.com/schema/xrsi}negative_file_info" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile_changes", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dormancy90Days",
    "daysChangedFirstname",
    "priorValueFirstname",
    "daysChangedLastname",
    "priorValueLastname",
    "daysChangedMiddlename",
    "priorValueMiddlename",
    "daysChangedAddress1",
    "priorValueAddress1",
    "daysChangedAddress2",
    "priorValueAddress2",
    "daysChangedCity",
    "priorValueCity",
    "daysChangedState",
    "priorValueState",
    "daysChangedZIP",
    "priorValueZIP",
    "daysChangedCountry",
    "priorValueCountry",
    "daysChangedMobileNumber",
    "priorValueMobileNumber",
    "daysChangedHomePhone",
    "priorValueHomePhone",
    "daysChangedEmail",
    "priorValueEmail",
    "daysSinceLastKBA",
    "priorKBAResults",
    "negativeFileInfo"
})
public class ProfileChanges {

    @XmlElement(name = "dormancy_90days")
    protected String dormancy90Days;
    @XmlElement(name = "days_changed_firstname")
    protected String daysChangedFirstname;
    @XmlElement(name = "prior_value_firstname")
    protected String priorValueFirstname;
    @XmlElement(name = "days_changed_lastname")
    protected String daysChangedLastname;
    @XmlElement(name = "prior_value_lastname")
    protected String priorValueLastname;
    @XmlElement(name = "days_changed_middlename")
    protected String daysChangedMiddlename;
    @XmlElement(name = "prior_value_middlename")
    protected String priorValueMiddlename;
    @XmlElement(name = "days_changed_address1")
    protected String daysChangedAddress1;
    @XmlElement(name = "prior_value_address1")
    protected String priorValueAddress1;
    @XmlElement(name = "days_changed_address2")
    protected String daysChangedAddress2;
    @XmlElement(name = "prior_value_address2")
    protected String priorValueAddress2;
    @XmlElement(name = "days_changed_city")
    protected String daysChangedCity;
    @XmlElement(name = "prior_value_city")
    protected String priorValueCity;
    @XmlElement(name = "days_changed_state")
    protected String daysChangedState;
    @XmlElement(name = "prior_value_state")
    protected String priorValueState;
    @XmlElement(name = "days_changed_ZIP")
    protected String daysChangedZIP;
    @XmlElement(name = "prior_value_ZIP")
    protected String priorValueZIP;
    @XmlElement(name = "days_changed_country")
    protected String daysChangedCountry;
    @XmlElement(name = "prior_value_country")
    protected String priorValueCountry;
    @XmlElement(name = "days_changed_mobile_number")
    protected String daysChangedMobileNumber;
    @XmlElement(name = "prior_value_mobile_number")
    protected String priorValueMobileNumber;
    @XmlElement(name = "days_changed_home_phone")
    protected String daysChangedHomePhone;
    @XmlElement(name = "prior_value_home_phone")
    protected String priorValueHomePhone;
    @XmlElement(name = "days_changed_email")
    protected String daysChangedEmail;
    @XmlElement(name = "prior_value_email")
    protected String priorValueEmail;
    @XmlElement(name = "days_since_last_KBA")
    protected String daysSinceLastKBA;
    @XmlElement(name = "prior_KBA_results")
    protected String priorKBAResults;
    @XmlElement(name = "negative_file_info")
    protected String negativeFileInfo;

    /**
     * Gets the value of the dormancy90Days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDormancy90Days() {
        return dormancy90Days;
    }

    /**
     * Sets the value of the dormancy90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDormancy90Days(String value) {
        this.dormancy90Days = value;
    }

    /**
     * Gets the value of the daysChangedFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedFirstname() {
        return daysChangedFirstname;
    }

    /**
     * Sets the value of the daysChangedFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedFirstname(String value) {
        this.daysChangedFirstname = value;
    }

    /**
     * Gets the value of the priorValueFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueFirstname() {
        return priorValueFirstname;
    }

    /**
     * Sets the value of the priorValueFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueFirstname(String value) {
        this.priorValueFirstname = value;
    }

    /**
     * Gets the value of the daysChangedLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedLastname() {
        return daysChangedLastname;
    }

    /**
     * Sets the value of the daysChangedLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedLastname(String value) {
        this.daysChangedLastname = value;
    }

    /**
     * Gets the value of the priorValueLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueLastname() {
        return priorValueLastname;
    }

    /**
     * Sets the value of the priorValueLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueLastname(String value) {
        this.priorValueLastname = value;
    }

    /**
     * Gets the value of the daysChangedMiddlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedMiddlename() {
        return daysChangedMiddlename;
    }

    /**
     * Sets the value of the daysChangedMiddlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedMiddlename(String value) {
        this.daysChangedMiddlename = value;
    }

    /**
     * Gets the value of the priorValueMiddlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueMiddlename() {
        return priorValueMiddlename;
    }

    /**
     * Sets the value of the priorValueMiddlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueMiddlename(String value) {
        this.priorValueMiddlename = value;
    }

    /**
     * Gets the value of the daysChangedAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedAddress1() {
        return daysChangedAddress1;
    }

    /**
     * Sets the value of the daysChangedAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedAddress1(String value) {
        this.daysChangedAddress1 = value;
    }

    /**
     * Gets the value of the priorValueAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueAddress1() {
        return priorValueAddress1;
    }

    /**
     * Sets the value of the priorValueAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueAddress1(String value) {
        this.priorValueAddress1 = value;
    }

    /**
     * Gets the value of the daysChangedAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedAddress2() {
        return daysChangedAddress2;
    }

    /**
     * Sets the value of the daysChangedAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedAddress2(String value) {
        this.daysChangedAddress2 = value;
    }

    /**
     * Gets the value of the priorValueAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueAddress2() {
        return priorValueAddress2;
    }

    /**
     * Sets the value of the priorValueAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueAddress2(String value) {
        this.priorValueAddress2 = value;
    }

    /**
     * Gets the value of the daysChangedCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedCity() {
        return daysChangedCity;
    }

    /**
     * Sets the value of the daysChangedCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedCity(String value) {
        this.daysChangedCity = value;
    }

    /**
     * Gets the value of the priorValueCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueCity() {
        return priorValueCity;
    }

    /**
     * Sets the value of the priorValueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueCity(String value) {
        this.priorValueCity = value;
    }

    /**
     * Gets the value of the daysChangedState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedState() {
        return daysChangedState;
    }

    /**
     * Sets the value of the daysChangedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedState(String value) {
        this.daysChangedState = value;
    }

    /**
     * Gets the value of the priorValueState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueState() {
        return priorValueState;
    }

    /**
     * Sets the value of the priorValueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueState(String value) {
        this.priorValueState = value;
    }

    /**
     * Gets the value of the daysChangedZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedZIP() {
        return daysChangedZIP;
    }

    /**
     * Sets the value of the daysChangedZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedZIP(String value) {
        this.daysChangedZIP = value;
    }

    /**
     * Gets the value of the priorValueZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueZIP() {
        return priorValueZIP;
    }

    /**
     * Sets the value of the priorValueZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueZIP(String value) {
        this.priorValueZIP = value;
    }

    /**
     * Gets the value of the daysChangedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedCountry() {
        return daysChangedCountry;
    }

    /**
     * Sets the value of the daysChangedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedCountry(String value) {
        this.daysChangedCountry = value;
    }

    /**
     * Gets the value of the priorValueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueCountry() {
        return priorValueCountry;
    }

    /**
     * Sets the value of the priorValueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueCountry(String value) {
        this.priorValueCountry = value;
    }

    /**
     * Gets the value of the daysChangedMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedMobileNumber() {
        return daysChangedMobileNumber;
    }

    /**
     * Sets the value of the daysChangedMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedMobileNumber(String value) {
        this.daysChangedMobileNumber = value;
    }

    /**
     * Gets the value of the priorValueMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueMobileNumber() {
        return priorValueMobileNumber;
    }

    /**
     * Sets the value of the priorValueMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueMobileNumber(String value) {
        this.priorValueMobileNumber = value;
    }

    /**
     * Gets the value of the daysChangedHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedHomePhone() {
        return daysChangedHomePhone;
    }

    /**
     * Sets the value of the daysChangedHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedHomePhone(String value) {
        this.daysChangedHomePhone = value;
    }

    /**
     * Gets the value of the priorValueHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueHomePhone() {
        return priorValueHomePhone;
    }

    /**
     * Sets the value of the priorValueHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueHomePhone(String value) {
        this.priorValueHomePhone = value;
    }

    /**
     * Gets the value of the daysChangedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysChangedEmail() {
        return daysChangedEmail;
    }

    /**
     * Sets the value of the daysChangedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysChangedEmail(String value) {
        this.daysChangedEmail = value;
    }

    /**
     * Gets the value of the priorValueEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorValueEmail() {
        return priorValueEmail;
    }

    /**
     * Sets the value of the priorValueEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorValueEmail(String value) {
        this.priorValueEmail = value;
    }

    /**
     * Gets the value of the daysSinceLastKBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysSinceLastKBA() {
        return daysSinceLastKBA;
    }

    /**
     * Sets the value of the daysSinceLastKBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysSinceLastKBA(String value) {
        this.daysSinceLastKBA = value;
    }

    /**
     * Gets the value of the priorKBAResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorKBAResults() {
        return priorKBAResults;
    }

    /**
     * Sets the value of the priorKBAResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorKBAResults(String value) {
        this.priorKBAResults = value;
    }

    /**
     * Gets the value of the negativeFileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeFileInfo() {
        return negativeFileInfo;
    }

    /**
     * Sets the value of the negativeFileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeFileInfo(String value) {
        this.negativeFileInfo = value;
    }

}
