
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bureau_info_federal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bureau_info_federal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="phonenumber1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phonenumber2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="url1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="url2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bureau_info_federal", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class BureauInfoFederal {

    protected String phonenumber1;
    protected String phonenumber2;
    protected String url1;
    protected String url2;

    /**
     * Gets the value of the phonenumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonenumber1() {
        return phonenumber1;
    }

    /**
     * Sets the value of the phonenumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonenumber1(String value) {
        this.phonenumber1 = value;
    }

    /**
     * Gets the value of the phonenumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonenumber2() {
        return phonenumber2;
    }

    /**
     * Sets the value of the phonenumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonenumber2(String value) {
        this.phonenumber2 = value;
    }

    /**
     * Gets the value of the url1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl1() {
        return url1;
    }

    /**
     * Sets the value of the url1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl1(String value) {
        this.url1 = value;
    }

    /**
     * Gets the value of the url2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl2() {
        return url2;
    }

    /**
     * Sets the value of the url2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl2(String value) {
        this.url2 = value;
    }

}
