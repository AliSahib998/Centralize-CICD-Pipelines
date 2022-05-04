
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASBankInfo</b> object contains D2B bank information for 
 *             				a destination D2B bank<br>
 *             				e.g. everything between <GETBANKLIST>...</GETBANKLIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2BBANKINFO_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASBankInfo {

    @XmlElement(name = "NAME", required = true)
    protected String bankName;
    @XmlElement(name = "CODE", required = true)
    protected String bankCode;

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

}
