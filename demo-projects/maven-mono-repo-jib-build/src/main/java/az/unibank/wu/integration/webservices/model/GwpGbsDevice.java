
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gwp_gbs_device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}gwp_gbs_device_type" minOccurs="0"/>
 *         &lt;element name="device_alias" type="{http://www.westernunion.com/schema/xrsi}device_alias" minOccurs="0"/>
 *         &lt;element name="cust_entry_device" type="{http://www.westernunion.com/schema/xrsi}cust_entry_device" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gwp_gbs_device", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "id",
    "type",
    "deviceAlias",
    "custEntryDevice"
})
public class GwpGbsDevice {

    protected String id;
    @XmlSchemaType(name = "string")
    protected GwpGbsDeviceType type;
    @XmlElement(name = "device_alias")
    protected String deviceAlias;
    @XmlElement(name = "cust_entry_device")
    @XmlSchemaType(name = "string")
    protected CustEntryDevice custEntryDevice;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GwpGbsDeviceType }
     *     
     */
    public GwpGbsDeviceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GwpGbsDeviceType }
     *     
     */
    public void setType(GwpGbsDeviceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the deviceAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceAlias() {
        return deviceAlias;
    }

    /**
     * Sets the value of the deviceAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceAlias(String value) {
        this.deviceAlias = value;
    }

    /**
     * Gets the value of the custEntryDevice property.
     * 
     * @return
     *     possible object is
     *     {@link CustEntryDevice }
     *     
     */
    public CustEntryDevice getCustEntryDevice() {
        return custEntryDevice;
    }

    /**
     * Sets the value of the custEntryDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustEntryDevice }
     *     
     */
    public void setCustEntryDevice(CustEntryDevice value) {
        this.custEntryDevice = value;
    }

}
