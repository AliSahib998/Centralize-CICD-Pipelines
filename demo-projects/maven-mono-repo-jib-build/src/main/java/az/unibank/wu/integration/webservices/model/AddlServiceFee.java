
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addl_service_fee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addl_service_fee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addl_service_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         &lt;element name="addl_service_name" type="{http://www.westernunion.com/schema/xrsi}addl_service_information" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *         &lt;element name="original_fee" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *         &lt;element name="discount_code" type="{http://www.westernunion.com/schema/xrsi}discount_code" minOccurs="0"/>
 *         &lt;element name="discount_amount" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *         &lt;element name="discount_percentage" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addl_service_fee", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "addlServiceCode",
    "addlServiceName",
    "fee",
    "originalFee",
    "discountCode",
    "discountAmount",
    "discountPercentage"
})
public class AddlServiceFee {

    @XmlElement(name = "addl_service_code")
    protected String addlServiceCode;
    @XmlElement(name = "addl_service_name")
    protected String addlServiceName;
    protected String fee;
    @XmlElement(name = "original_fee")
    protected String originalFee;
    @XmlElement(name = "discount_code")
    protected String discountCode;
    @XmlElement(name = "discount_amount")
    protected String discountAmount;
    @XmlElement(name = "discount_percentage")
    protected String discountPercentage;

    /**
     * Gets the value of the addlServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceCode() {
        return addlServiceCode;
    }

    /**
     * Sets the value of the addlServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceCode(String value) {
        this.addlServiceCode = value;
    }

    /**
     * Gets the value of the addlServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceName() {
        return addlServiceName;
    }

    /**
     * Sets the value of the addlServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceName(String value) {
        this.addlServiceName = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Gets the value of the originalFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFee() {
        return originalFee;
    }

    /**
     * Sets the value of the originalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFee(String value) {
        this.originalFee = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentage(String value) {
        this.discountPercentage = value;
    }

}
