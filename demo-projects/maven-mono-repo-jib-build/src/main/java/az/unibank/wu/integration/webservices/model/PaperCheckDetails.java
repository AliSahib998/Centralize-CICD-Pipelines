
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paper_check_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paper_check_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}check_details">
 *       &lt;sequence>
 *         &lt;element name="exception_code" type="{http://www.westernunion.com/schema/xrsi}exception_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paper_check_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "exceptionCode"
})
public class PaperCheckDetails
    extends CheckDetails
{

    @XmlElement(name = "exception_code")
    protected String exceptionCode;

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

}
