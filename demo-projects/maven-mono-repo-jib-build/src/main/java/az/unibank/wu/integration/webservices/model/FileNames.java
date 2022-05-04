
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file_names complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file_names">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ddl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="error_code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mexican_db" minOccurs="0">
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
@XmlType(name = "file_names", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "ddl",
    "errorCode",
    "mexicanDb"
})
public class FileNames {

    protected String ddl;
    @XmlElement(name = "error_code")
    protected String errorCode;
    @XmlElement(name = "mexican_db")
    protected String mexicanDb;

    /**
     * Gets the value of the ddl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdl() {
        return ddl;
    }

    /**
     * Sets the value of the ddl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdl(String value) {
        this.ddl = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the mexicanDb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMexicanDb() {
        return mexicanDb;
    }

    /**
     * Sets the value of the mexicanDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMexicanDb(String value) {
        this.mexicanDb = value;
    }

}
