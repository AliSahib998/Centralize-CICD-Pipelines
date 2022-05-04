
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for third_party_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="third_party_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="pay_wo_id_indicator" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.westernunion.com/schema/xrsi}organization" minOccurs="0"/>
 *         &lt;element name="identification_number" type="{http://www.westernunion.com/schema/xrsi}id" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.westernunion.com/schema/xrsi}occupation" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="fx" type="{http://www.westernunion.com/schema/xrsi}fx" minOccurs="0"/>
 *         &lt;element name="flag_pay" type="{http://www.westernunion.com/schema/xrsi}flag_pay" minOccurs="0"/>
 *         &lt;element name="id_details" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://www.westernunion.com/schema/xrsi}relationship" minOccurs="0"/>
 *         &lt;element name="Place_of_Organization" type="{http://www.westernunion.com/schema/xrsi}Place_of_Organization" minOccurs="0"/>
 *         &lt;element name="Date_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Date_of_Birth" minOccurs="0"/>
 *         &lt;element name="Place_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Place_of_Birth" minOccurs="0"/>
 *         &lt;element name="State_of_Birth" type="{http://www.westernunion.com/schema/xrsi}State_of_Birth" minOccurs="0"/>
 *         &lt;element name="Country_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Country_of_Birth" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.westernunion.com/schema/xrsi}nationality" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.westernunion.com/schema/xrsi}Remarks" minOccurs="0"/>
 *         &lt;element name="id_issue_date" type="{http://www.westernunion.com/schema/xrsi}id_issue_date" minOccurs="0"/>
 *         &lt;element name="ID_Expiration_Date" type="{http://www.westernunion.com/schema/xrsi}ID_Expiration_Date" minOccurs="0"/>
 *         &lt;element name="EAS_Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}EAS_Consumer_ID_Key" minOccurs="0"/>
 *         &lt;element name="Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}Consumer_ID_Key" minOccurs="0"/>
 *         &lt;element name="White_List_Key" type="{http://www.westernunion.com/schema/xrsi}White_List_Key" minOccurs="0"/>
 *         &lt;element name="other_occupation" type="{http://www.westernunion.com/schema/xrsi}other_Occupation" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         &lt;element name="country_phone_code" type="{http://www.westernunion.com/schema/xrsi}country_phone_code" minOccurs="0"/>
 *         &lt;element name="telephone_number" type="{http://www.westernunion.com/schema/xrsi}Mobile_Phone_Number" minOccurs="0"/>
 *         &lt;element name="mobile_phone" type="{http://www.westernunion.com/schema/xrsi}compliance_mobile_phone" minOccurs="0"/>
 *         &lt;element name="tax_id" type="{http://www.westernunion.com/schema/xrsi}third_party_tax_id" minOccurs="0"/>
 *         &lt;element name="employment_industry" type="{http://www.westernunion.com/schema/xrsi}Employment_Industry" minOccurs="0"/>
 *         &lt;element name="id_ack_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="auth_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="employment_status" type="{http://www.westernunion.com/schema/xrsi}employer_status" minOccurs="0"/>
 *         &lt;element name="employment_position_level" type="{http://www.westernunion.com/schema/xrsi}employment_position_level" minOccurs="0"/>
 *         &lt;element name="Alias_Name" type="{http://www.westernunion.com/schema/xrsi}Alias_Name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "third_party_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "name",
    "address",
    "payWoIdIndicator",
    "organization",
    "identificationNumber",
    "occupation",
    "amount",
    "fx",
    "flagPay",
    "idDetails",
    "relationship",
    "placeOfOrganization",
    "dateOfBirth",
    "placeOfBirth",
    "stateOfBirth",
    "countryOfBirth",
    "nationality",
    "remarks",
    "idIssueDate",
    "idExpirationDate",
    "easConsumerIDKey",
    "consumerIDKey",
    "whiteListKey",
    "otherOccupation",
    "gender",
    "countryPhoneCode",
    "telephoneNumber",
    "mobilePhone",
    "taxId",
    "employmentIndustry",
    "idAckFlag",
    "authFlag",
    "employmentStatus",
    "employmentPositionLevel",
    "aliasName"
})
public class ThirdPartyDetails {

    protected GeneralName name;
    protected ComplianceAddress address;
    @XmlElement(name = "pay_wo_id_indicator")
    @XmlSchemaType(name = "string")
    protected YesNo payWoIdIndicator;
    protected String organization;
    @XmlElement(name = "identification_number")
    protected String identificationNumber;
    protected String occupation;
    protected Long amount;
    protected String fx;
    @XmlElement(name = "flag_pay")
    protected String flagPay;
    @XmlElement(name = "id_details")
    protected IdDetails idDetails;
    protected String relationship;
    @XmlElement(name = "Place_of_Organization")
    protected String placeOfOrganization;
    @XmlElement(name = "Date_of_Birth")
    protected String dateOfBirth;
    @XmlElement(name = "Place_of_Birth")
    protected String placeOfBirth;
    @XmlElement(name = "State_of_Birth")
    protected String stateOfBirth;
    @XmlElement(name = "Country_of_Birth")
    protected String countryOfBirth;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "id_issue_date")
    protected String idIssueDate;
    @XmlElement(name = "ID_Expiration_Date")
    protected String idExpirationDate;
    @XmlElement(name = "EAS_Consumer_ID_Key")
    protected String easConsumerIDKey;
    @XmlElement(name = "Consumer_ID_Key")
    protected String consumerIDKey;
    @XmlElement(name = "White_List_Key")
    protected String whiteListKey;
    @XmlElement(name = "other_occupation")
    protected String otherOccupation;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "country_phone_code")
    protected String countryPhoneCode;
    @XmlElement(name = "telephone_number")
    protected String telephoneNumber;
    @XmlElement(name = "mobile_phone")
    protected ComplianceMobilePhone mobilePhone;
    @XmlElement(name = "tax_id")
    protected String taxId;
    @XmlElement(name = "employment_industry")
    protected String employmentIndustry;
    @XmlElement(name = "id_ack_flag")
    protected String idAckFlag;
    @XmlElement(name = "auth_flag")
    protected String authFlag;
    @XmlElement(name = "employment_status")
    protected String employmentStatus;
    @XmlElement(name = "employment_position_level")
    protected String employmentPositionLevel;
    @XmlElement(name = "Alias_Name")
    protected String aliasName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setName(GeneralName value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setAddress(ComplianceAddress value) {
        this.address = value;
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
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFx() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFx(String value) {
        this.fx = value;
    }

    /**
     * Gets the value of the flagPay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPay() {
        return flagPay;
    }

    /**
     * Sets the value of the flagPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPay(String value) {
        this.flagPay = value;
    }

    /**
     * Gets the value of the idDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getIdDetails() {
        return idDetails;
    }

    /**
     * Sets the value of the idDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setIdDetails(IdDetails value) {
        this.idDetails = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the placeOfOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfOrganization() {
        return placeOfOrganization;
    }

    /**
     * Sets the value of the placeOfOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfOrganization(String value) {
        this.placeOfOrganization = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the stateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfBirth() {
        return stateOfBirth;
    }

    /**
     * Sets the value of the stateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfBirth(String value) {
        this.stateOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the idIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIssueDate() {
        return idIssueDate;
    }

    /**
     * Sets the value of the idIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIssueDate(String value) {
        this.idIssueDate = value;
    }

    /**
     * Gets the value of the idExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDExpirationDate() {
        return idExpirationDate;
    }

    /**
     * Sets the value of the idExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDExpirationDate(String value) {
        this.idExpirationDate = value;
    }

    /**
     * Gets the value of the easConsumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASConsumerIDKey() {
        return easConsumerIDKey;
    }

    /**
     * Sets the value of the easConsumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASConsumerIDKey(String value) {
        this.easConsumerIDKey = value;
    }

    /**
     * Gets the value of the consumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerIDKey() {
        return consumerIDKey;
    }

    /**
     * Sets the value of the consumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerIDKey(String value) {
        this.consumerIDKey = value;
    }

    /**
     * Gets the value of the whiteListKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteListKey() {
        return whiteListKey;
    }

    /**
     * Sets the value of the whiteListKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteListKey(String value) {
        this.whiteListKey = value;
    }

    /**
     * Gets the value of the otherOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOccupation() {
        return otherOccupation;
    }

    /**
     * Sets the value of the otherOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOccupation(String value) {
        this.otherOccupation = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the countryPhoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryPhoneCode() {
        return countryPhoneCode;
    }

    /**
     * Sets the value of the countryPhoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryPhoneCode(String value) {
        this.countryPhoneCode = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceMobilePhone }
     *     
     */
    public ComplianceMobilePhone getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceMobilePhone }
     *     
     */
    public void setMobilePhone(ComplianceMobilePhone value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the employmentIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentIndustry() {
        return employmentIndustry;
    }

    /**
     * Sets the value of the employmentIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentIndustry(String value) {
        this.employmentIndustry = value;
    }

    /**
     * Gets the value of the idAckFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAckFlag() {
        return idAckFlag;
    }

    /**
     * Sets the value of the idAckFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAckFlag(String value) {
        this.idAckFlag = value;
    }

    /**
     * Gets the value of the authFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFlag() {
        return authFlag;
    }

    /**
     * Sets the value of the authFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFlag(String value) {
        this.authFlag = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the employmentPositionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentPositionLevel() {
        return employmentPositionLevel;
    }

    /**
     * Sets the value of the employmentPositionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentPositionLevel(String value) {
        this.employmentPositionLevel = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasName(String value) {
        this.aliasName = value;
    }

}
