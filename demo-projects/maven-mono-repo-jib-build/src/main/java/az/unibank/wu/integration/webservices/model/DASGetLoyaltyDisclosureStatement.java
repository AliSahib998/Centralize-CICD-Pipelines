
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetLoyaltyDisclosureStatement</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETLOYALTYDISCLOSURESTATEMENT_Type>...</GETLOYALTYDISCLOSURESTATEMENT_Type> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETLOYALTYDISCLOSURESTATEMENT_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASGetLoyaltyDisclosureStatement {

    @XmlElement(name = "DESCRIPTION")
    protected String loyaltydescription;

    /**
     * Gets the value of the loyaltydescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOYALTYDESCRIPTION() {
        return loyaltydescription;
    }

    /**
     * Sets the value of the loyaltydescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOYALTYDESCRIPTION(String value) {
        this.loyaltydescription = value;
    }

}
