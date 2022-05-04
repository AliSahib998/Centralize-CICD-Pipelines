
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for swb_fla_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swb_fla_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swb_operator_id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="wu_operator_id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fla_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.westernunion.com/schema/xrsi}password_long" minOccurs="0"/>
 *         &lt;element name="read_privacynotice_flag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fla_certification_flag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
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
@XmlType(name = "swb_fla_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "swbOperatorId",
    "wuOperatorId",
    "flaName",
    "password",
    "readPrivacynoticeFlag",
    "flaCertificationFlag"
})
public class SwbFlaInfo {

    @XmlElement(name = "swb_operator_id")
    protected String swbOperatorId;
    @XmlElement(name = "wu_operator_id")
    protected String wuOperatorId;
    @XmlElement(name = "fla_name")
    protected GeneralName flaName;
    protected String password;
    @XmlElement(name = "read_privacynotice_flag")
    protected String readPrivacynoticeFlag;
    @XmlElement(name = "fla_certification_flag")
    protected String flaCertificationFlag;

    /**
     * Gets the value of the swbOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwbOperatorId() {
        return swbOperatorId;
    }

    /**
     * Sets the value of the swbOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwbOperatorId(String value) {
        this.swbOperatorId = value;
    }

    /**
     * Gets the value of the wuOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuOperatorId() {
        return wuOperatorId;
    }

    /**
     * Sets the value of the wuOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuOperatorId(String value) {
        this.wuOperatorId = value;
    }

    /**
     * Gets the value of the flaName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getFlaName() {
        return flaName;
    }

    /**
     * Sets the value of the flaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setFlaName(GeneralName value) {
        this.flaName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the readPrivacynoticeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadPrivacynoticeFlag() {
        return readPrivacynoticeFlag;
    }

    /**
     * Sets the value of the readPrivacynoticeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadPrivacynoticeFlag(String value) {
        this.readPrivacynoticeFlag = value;
    }

    /**
     * Gets the value of the flaCertificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaCertificationFlag() {
        return flaCertificationFlag;
    }

    /**
     * Sets the value of the flaCertificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaCertificationFlag(String value) {
        this.flaCertificationFlag = value;
    }

}
