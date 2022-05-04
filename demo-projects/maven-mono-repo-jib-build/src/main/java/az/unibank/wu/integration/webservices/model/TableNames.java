
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for table_names complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table_names">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="template" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="delivery_service" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="country_info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="country" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ckw" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="qqc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table_names", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "template",
    "deliveryService",
    "countryInfo",
    "country",
    "ckw",
    "qqc",
    "sup"
})
public class TableNames {

    protected String template;
    @XmlElement(name = "delivery_service")
    protected String deliveryService;
    @XmlElement(name = "country_info")
    protected String countryInfo;
    protected String country;
    protected String ckw;
    protected String qqc;
    protected String sup;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the deliveryService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryService() {
        return deliveryService;
    }

    /**
     * Sets the value of the deliveryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryService(String value) {
        this.deliveryService = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryInfo(String value) {
        this.countryInfo = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the ckw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkw() {
        return ckw;
    }

    /**
     * Sets the value of the ckw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkw(String value) {
        this.ckw = value;
    }

    /**
     * Gets the value of the qqc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqc() {
        return qqc;
    }

    /**
     * Sets the value of the qqc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqc(String value) {
        this.qqc = value;
    }

    /**
     * Gets the value of the sup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSup() {
        return sup;
    }

    /**
     * Sets the value of the sup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSup(String value) {
        this.sup = value;
    }

}
