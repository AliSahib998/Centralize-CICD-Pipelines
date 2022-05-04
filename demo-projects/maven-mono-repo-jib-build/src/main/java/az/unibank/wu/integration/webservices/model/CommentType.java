
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comment_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comment_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}comment_lookup_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comment_type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "type"
})
public class CommentType {

    @XmlSchemaType(name = "string")
    protected CommentLookupType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommentLookupType }
     *     
     */
    public CommentLookupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentLookupType }
     *     
     */
    public void setType(CommentLookupType value) {
        this.type = value;
    }

}
