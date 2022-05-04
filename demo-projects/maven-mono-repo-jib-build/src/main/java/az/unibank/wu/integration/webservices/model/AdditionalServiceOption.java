
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_service_option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additional_service_option">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ds_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="ds_description" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="surcharge" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="discount_charge" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="discount_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="promo_code" type="{http://www.westernunion.com/schema/xrsi}promo_code" minOccurs="0"/>
 *         &lt;element name="discount_reason" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_service_option", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "dsCode",
    "dsDescription",
    "surcharge",
    "discountCharge",
    "discountAmount",
    "promoCode",
    "discountReason"
})
public class AdditionalServiceOption {

    @XmlElement(name = "ds_code")
    protected String dsCode;
    @XmlElement(name = "ds_description")
    protected String dsDescription;
    protected Long surcharge;
    @XmlElement(name = "discount_charge")
    protected Long discountCharge;
    @XmlElement(name = "discount_amount")
    protected Long discountAmount;
    @XmlElement(name = "promo_code")
    protected String promoCode;
    @XmlElement(name = "discount_reason")
    protected String discountReason;

    /**
     * Gets the value of the dsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCode() {
        return dsCode;
    }

    /**
     * Sets the value of the dsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCode(String value) {
        this.dsCode = value;
    }

    /**
     * Gets the value of the dsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDescription() {
        return dsDescription;
    }

    /**
     * Sets the value of the dsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDescription(String value) {
        this.dsDescription = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSurcharge(Long value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the discountCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountCharge() {
        return discountCharge;
    }

    /**
     * Sets the value of the discountCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountCharge(Long value) {
        this.discountCharge = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountAmount(Long value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the discountReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * Sets the value of the discountReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReason(String value) {
        this.discountReason = value;
    }

}
