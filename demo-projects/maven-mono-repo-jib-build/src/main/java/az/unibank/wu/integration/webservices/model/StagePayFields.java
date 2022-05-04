
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stage_pay_fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stage_pay_fields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snp_indicator" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="O"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="efl_subregion_type" type="{http://www.westernunion.com/schema/xrsi}efl_subregion_type" minOccurs="0"/>
 *         &lt;element name="efl_subregion" type="{http://www.westernunion.com/schema/xrsi}efl_subregion" minOccurs="0"/>
 *         &lt;element name="efl_zipcode" type="{http://www.westernunion.com/schema/xrsi}efl_zipcode" minOccurs="0"/>
 *         &lt;element name="staging_profile_account" type="{http://www.westernunion.com/schema/xrsi}staging_profile_account" minOccurs="0"/>
 *         &lt;element name="staging_buffer" type="{http://www.westernunion.com/schema/xrsi}staging_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stage_pay_fields", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "snpIndicator",
    "eflSubregionType",
    "eflSubregion",
    "eflZipcode",
    "stagingProfileAccount",
    "stagingBuffer"
})
public class StagePayFields {

    @XmlElement(name = "snp_indicator")
    protected String snpIndicator;
    @XmlElement(name = "efl_subregion_type")
    protected String eflSubregionType;
    @XmlElement(name = "efl_subregion")
    protected String eflSubregion;
    @XmlElement(name = "efl_zipcode")
    protected String eflZipcode;
    @XmlElement(name = "staging_profile_account")
    protected String stagingProfileAccount;
    @XmlElement(name = "staging_buffer")
    protected String stagingBuffer;

    /**
     * Gets the value of the snpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnpIndicator() {
        return snpIndicator;
    }

    /**
     * Sets the value of the snpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnpIndicator(String value) {
        this.snpIndicator = value;
    }

    /**
     * Gets the value of the eflSubregionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEflSubregionType() {
        return eflSubregionType;
    }

    /**
     * Sets the value of the eflSubregionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEflSubregionType(String value) {
        this.eflSubregionType = value;
    }

    /**
     * Gets the value of the eflSubregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEflSubregion() {
        return eflSubregion;
    }

    /**
     * Sets the value of the eflSubregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEflSubregion(String value) {
        this.eflSubregion = value;
    }

    /**
     * Gets the value of the eflZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEflZipcode() {
        return eflZipcode;
    }

    /**
     * Sets the value of the eflZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEflZipcode(String value) {
        this.eflZipcode = value;
    }

    /**
     * Gets the value of the stagingProfileAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStagingProfileAccount() {
        return stagingProfileAccount;
    }

    /**
     * Sets the value of the stagingProfileAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStagingProfileAccount(String value) {
        this.stagingProfileAccount = value;
    }

    /**
     * Gets the value of the stagingBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStagingBuffer() {
        return stagingBuffer;
    }

    /**
     * Sets the value of the stagingBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStagingBuffer(String value) {
        this.stagingBuffer = value;
    }

}
