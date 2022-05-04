
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_limit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_limit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}limit_type" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="min_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="max_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="new_user_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_limit", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type",
    "limit",
    "minLimit",
    "maxLimit",
    "newUserLimit"
})
public class TransactionLimit {

    protected String type;
    protected Double limit;
    @XmlElement(name = "min_limit")
    protected Double minLimit;
    @XmlElement(name = "max_limit")
    protected Double maxLimit;
    @XmlElement(name = "new_user_limit")
    protected Double newUserLimit;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimit(Double value) {
        this.limit = value;
    }

    /**
     * Gets the value of the minLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinLimit() {
        return minLimit;
    }

    /**
     * Sets the value of the minLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinLimit(Double value) {
        this.minLimit = value;
    }

    /**
     * Gets the value of the maxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxLimit(Double value) {
        this.maxLimit = value;
    }

    /**
     * Gets the value of the newUserLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNewUserLimit() {
        return newUserLimit;
    }

    /**
     * Sets the value of the newUserLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNewUserLimit(Double value) {
        this.newUserLimit = value;
    }

}
