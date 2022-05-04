
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for check_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="check_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.westernunion.com/schema/xrsi}check_acct_no" minOccurs="0"/>
 *         &lt;element name="account_number" type="{http://www.westernunion.com/schema/xrsi}check_acct_no" minOccurs="0"/>
 *         &lt;element name="routing_number" type="{http://www.westernunion.com/schema/xrsi}routing_number" minOccurs="0"/>
 *         &lt;element name="micr" type="{http://www.westernunion.com/schema/xrsi}micr_data" minOccurs="0"/>
 *         &lt;element name="cashed_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "check_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "number",
    "accountNumber",
    "routingNumber",
    "micr",
    "cashedFlag"
})
@XmlSeeAlso({
    PaperCheckDetails.class
})
public class CheckDetails {

    protected String number;
    @XmlElement(name = "account_number")
    protected String accountNumber;
    @XmlElement(name = "routing_number")
    protected String routingNumber;
    protected String micr;
    @XmlElement(name = "cashed_flag")
    @XmlSchemaType(name = "string")
    protected YesNo cashedFlag;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

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
     * Gets the value of the micr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicr() {
        return micr;
    }

    /**
     * Sets the value of the micr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicr(String value) {
        this.micr = value;
    }

    /**
     * Gets the value of the cashedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCashedFlag() {
        return cashedFlag;
    }

    /**
     * Sets the value of the cashedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCashedFlag(YesNo value) {
        this.cashedFlag = value;
    }

}
