
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_currency_iso_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="picklist_currency_iso_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency_iso_code" type="{http://www.westernunion.com/schema/xrsi}currency_iso_code" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_currency_iso_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "currencyIsoCode"
})
public class PicklistCurrencyIsoOptions {

    @XmlElement(name = "currency_iso_code", required = true)
    protected List<String> currencyIsoCode;

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyIsoCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyIsoCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurrencyIsoCode() {
        if (currencyIsoCode == null) {
            currencyIsoCode = new ArrayList<String>();
        }
        return this.currencyIsoCode;
    }

}
