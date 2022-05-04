
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						
 * 	            				The <b>DASACHBankData</b> object contains money transfer transaction history information<br>
 * 	            				e.g. everything between <GETTACHACCOUNT>...</GETTACHACCOUNT> tags.
 * 	            			
 * 					
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHBANKDATA_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASACHBankData {

    @XmlElement(name = "BANK_NAME")
    protected String bankName;
    @XmlElement(name = "BANK_ADDRESS")
    protected String bankAddress;
    @XmlElement(name = "BANK_CITY")
    protected String bankCity;
    @XmlElement(name = "BANK_STATE")
    protected String bankState;
    @XmlElement(name = "BANK_ZIP")
    protected String bankZip;
    @XmlElement(name = "BANK_PHONE_NUMBER")
    protected String bankPhoneNumber;
    @XmlElement(name = "ACH_STATUS")
    protected String achStatus;

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * Sets the value of the bankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAddress(String value) {
        this.bankAddress = value;
    }

    /**
     * Gets the value of the bankCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * Sets the value of the bankCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCity(String value) {
        this.bankCity = value;
    }

    /**
     * Gets the value of the bankState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankState() {
        return bankState;
    }

    /**
     * Sets the value of the bankState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankState(String value) {
        this.bankState = value;
    }

    /**
     * Gets the value of the bankZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankZip() {
        return bankZip;
    }

    /**
     * Sets the value of the bankZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankZip(String value) {
        this.bankZip = value;
    }

    /**
     * Gets the value of the bankPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPhoneNumber() {
        return bankPhoneNumber;
    }

    /**
     * Sets the value of the bankPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPhoneNumber(String value) {
        this.bankPhoneNumber = value;
    }

    /**
     * Gets the value of the achStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchStatus() {
        return achStatus;
    }

    /**
     * Sets the value of the achStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchStatus(String value) {
        this.achStatus = value;
    }

}
