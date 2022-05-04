
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASSupplyItemInfo</b> object contains the Supply Order Item info 
 *             				for one item
 *             				e.g. everything between <GETSUPPLYORDERLIST>...</GETSUPPLYORDERLIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUPPLYORDER_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASSupplyItemInfo {

    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemCode;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemName;
    @XmlElement(name = "Q_DESCRIPTION", required = true)
    protected String itemDescription;

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
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

}
