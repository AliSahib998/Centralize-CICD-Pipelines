
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gbs_bank_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gbs_bank_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}bank_details">
 *       &lt;sequence>
 *         &lt;element name="pin_verification_time" type="{http://www.westernunion.com/schema/xrsi}pin_verification_time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_bank_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "pinVerificationTime"
})
public class GbsBankDetails
    extends BankDetails
{

    @XmlElement(name = "pin_verification_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pinVerificationTime;

    /**
     * Gets the value of the pinVerificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPinVerificationTime() {
        return pinVerificationTime;
    }

    /**
     * Sets the value of the pinVerificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPinVerificationTime(XMLGregorianCalendar value) {
        this.pinVerificationTime = value;
    }

}
