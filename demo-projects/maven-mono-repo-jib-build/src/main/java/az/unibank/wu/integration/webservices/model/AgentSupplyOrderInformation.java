
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_supply_order_information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent_supply_order_information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="item_name" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         &lt;element name="quantity_description" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_supply_order_information", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "itemCode",
    "itemName",
    "quantityDescription",
    "units"
})
public class AgentSupplyOrderInformation {

    @XmlElement(name = "item_code")
    protected String itemCode;
    @XmlElement(name = "item_name")
    protected String itemName;
    @XmlElement(name = "quantity_description")
    protected String quantityDescription;
    protected String units;

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the quantityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityDescription() {
        return quantityDescription;
    }

    /**
     * Sets the value of the quantityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityDescription(String value) {
        this.quantityDescription = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
