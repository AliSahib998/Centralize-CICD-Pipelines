
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiver_id_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiver_id_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_type" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         &lt;element name="id_number" type="{http://www.westernunion.com/schema/xrsi}receiver_id_number" minOccurs="0"/>
 *         &lt;element name="id_issuer" type="{http://www.westernunion.com/schema/xrsi}id_country_of_issue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiver_id_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "idType",
    "idNumber",
    "idIssuer"
})
public class ReceiverIdDetails {

    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_number")
    protected String idNumber;
    @XmlElement(name = "id_issuer")
    protected String idIssuer;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIssuer() {
        return idIssuer;
    }

    /**
     * Sets the value of the idIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIssuer(String value) {
        this.idIssuer = value;
    }

}
