
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency_database complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currency_database">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="currency_code" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         &lt;element name="database" type="{http://www.westernunion.com/schema/xrsi}database" maxOccurs="12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currency_database", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "currencyCode",
    "database"
})
public class CurrencyDatabase
    extends CollectionBase
{

    @XmlElement(name = "currency_code")
    protected CountryCurrencyInfo currencyCode;
    protected List<Database> database;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCurrencyCode(CountryCurrencyInfo value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the database property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Database }
     * 
     * 
     */
    public List<Database> getDatabase() {
        if (database == null) {
            database = new ArrayList<Database>();
        }
        return this.database;
    }

}
