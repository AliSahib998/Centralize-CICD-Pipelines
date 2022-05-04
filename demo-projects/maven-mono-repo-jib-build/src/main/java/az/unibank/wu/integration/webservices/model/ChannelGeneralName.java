
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_general_name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel_general_name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name_prefix" type="{http://www.westernunion.com/schema/xrsi}name_prefix" minOccurs="0"/>
 *         &lt;group ref="{http://www.westernunion.com/schema/xrsi}individual_name" minOccurs="0"/>
 *         &lt;element name="name_suffix" type="{http://www.westernunion.com/schema/xrsi}name_suffix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_general_name", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "namePrefix",
    "firstName",
    "middleName",
    "lastName",
    "nameSuffix"
})
@XmlSeeAlso({
    GbsGeneralName.class,
    MobileGeneralName.class,
    GatewayGeneralName.class
})
public class ChannelGeneralName {

    @XmlElement(name = "name_prefix")
    @XmlSchemaType(name = "string")
    protected NamePrefix namePrefix;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "middle_name")
    protected String middleName;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "name_suffix")
    @XmlSchemaType(name = "string")
    protected NameSuffix nameSuffix;

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix }
     *     
     */
    public NamePrefix getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix }
     *     
     */
    public void setNamePrefix(NamePrefix value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setNameSuffix(NameSuffix value) {
        this.nameSuffix = value;
    }

}
