
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for manual_validations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manual_validations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validation_points" type="{http://www.westernunion.com/schema/xrsi}validation_points" minOccurs="0"/>
 *         &lt;element name="verified" type="{http://www.westernunion.com/schema/xrsi}verified" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manual_validations", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "validationPoints",
    "verified"
})
public class ManualValidations {

    @XmlElement(name = "validation_points")
    protected ValidationPoints validationPoints;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verified;

    /**
     * Gets the value of the validationPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationPoints }
     *     
     */
    public ValidationPoints getValidationPoints() {
        return validationPoints;
    }

    /**
     * Sets the value of the validationPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationPoints }
     *     
     */
    public void setValidationPoints(ValidationPoints value) {
        this.validationPoints = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerified(XMLGregorianCalendar value) {
        this.verified = value;
    }

}
