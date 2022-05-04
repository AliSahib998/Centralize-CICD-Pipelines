
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for continuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="continuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="uniqueField" type="{http://www.w3.org/2001/XMLSchema}string" default="ID" />
 *       &lt;attribute name="startAt" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "continuation", namespace = "http://www.westernunion.com/schema/xrsi")
public class Continuation {

    @XmlAttribute(name = "uniqueField")
    protected String uniqueField;
    @XmlAttribute(name = "startAt")
    protected String startAt;

    /**
     * Gets the value of the uniqueField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueField() {
        if (uniqueField == null) {
            return "ID";
        } else {
            return uniqueField;
        }
    }

    /**
     * Sets the value of the uniqueField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueField(String value) {
        this.uniqueField = value;
    }

    /**
     * Gets the value of the startAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAt() {
        if (startAt == null) {
            return "1";
        } else {
            return startAt;
        }
    }

    /**
     * Sets the value of the startAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAt(String value) {
        this.startAt = value;
    }

}
