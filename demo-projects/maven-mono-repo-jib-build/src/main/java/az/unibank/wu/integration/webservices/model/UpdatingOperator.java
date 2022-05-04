
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updating_operator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updating_operator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="update_flag" type="{http://www.westernunion.com/schema/xrsi}flag_update" minOccurs="0"/>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.westernunion.com/schema/xrsi}password" minOccurs="0"/>
 *         &lt;element name="terminal_id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="4"/>
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
@XmlType(name = "updating_operator", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "updateFlag",
    "id",
    "name",
    "password",
    "terminalId"
})
public class UpdatingOperator {

    @XmlElement(name = "update_flag")
    @XmlSchemaType(name = "string")
    protected FlagUpdate updateFlag;
    protected String id;
    protected String name;
    protected String password;
    @XmlElement(name = "terminal_id")
    protected String terminalId;

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link FlagUpdate }
     *     
     */
    public FlagUpdate getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagUpdate }
     *     
     */
    public void setUpdateFlag(FlagUpdate value) {
        this.updateFlag = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

}
