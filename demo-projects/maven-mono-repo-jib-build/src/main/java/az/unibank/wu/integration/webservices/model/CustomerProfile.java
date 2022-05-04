
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer_profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer_profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer_name" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         &lt;element name="name_type" type="{http://www.westernunion.com/schema/xrsi}name_type" minOccurs="0"/>
 *         &lt;element name="cust_acct_no" type="{http://www.westernunion.com/schema/xrsi}pcp_qqc_account_number" minOccurs="0"/>
 *         &lt;element name="sender_universal_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         &lt;element name="customer_affidavit_number" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit_number" minOccurs="0"/>
 *         &lt;element name="customer_affidavit" type="{http://www.westernunion.com/schema/xrsi}customer_affidavit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer_profile", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "customerName",
    "nameType",
    "custAcctNo",
    "senderUniversalBuffer",
    "customerAffidavitNumber",
    "customerAffidavit"
})
public class CustomerProfile {

    @XmlElement(name = "customer_name")
    protected String customerName;
    @XmlElement(name = "name_type")
    @XmlSchemaType(name = "string")
    protected NameType nameType;
    @XmlElement(name = "cust_acct_no")
    protected String custAcctNo;
    @XmlElement(name = "sender_universal_buffer")
    protected String senderUniversalBuffer;
    @XmlElement(name = "customer_affidavit_number")
    protected String customerAffidavitNumber;
    @XmlElement(name = "customer_affidavit")
    protected String customerAffidavit;

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameType(NameType value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the custAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctNo() {
        return custAcctNo;
    }

    /**
     * Sets the value of the custAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctNo(String value) {
        this.custAcctNo = value;
    }

    /**
     * Gets the value of the senderUniversalBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderUniversalBuffer() {
        return senderUniversalBuffer;
    }

    /**
     * Sets the value of the senderUniversalBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderUniversalBuffer(String value) {
        this.senderUniversalBuffer = value;
    }

    /**
     * Gets the value of the customerAffidavitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAffidavitNumber() {
        return customerAffidavitNumber;
    }

    /**
     * Sets the value of the customerAffidavitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAffidavitNumber(String value) {
        this.customerAffidavitNumber = value;
    }

    /**
     * Gets the value of the customerAffidavit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAffidavit() {
        return customerAffidavit;
    }

    /**
     * Sets the value of the customerAffidavit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAffidavit(String value) {
        this.customerAffidavit = value;
    }

}
