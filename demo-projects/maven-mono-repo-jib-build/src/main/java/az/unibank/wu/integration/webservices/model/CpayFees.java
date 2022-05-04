
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_fees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_fees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charges" type="{http://www.westernunion.com/schema/xrsi}money"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_fees", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "charges"
})
public class CpayFees {

    @XmlElement(required = true)
    protected Money charges;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCharges(Money value) {
        this.charges = value;
    }

}
