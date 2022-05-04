
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreign_remote_system complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreign_remote_system">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="reference_no" type="{http://www.westernunion.com/schema/xrsi}reference_no" minOccurs="0"/>
 *         &lt;element name="counter_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="operator_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreign_remote_system", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "identifier",
    "referenceNo",
    "counterId",
    "operatorId"
})
public class ForeignRemoteSystem {

    protected String identifier;
    @XmlElement(name = "reference_no")
    protected String referenceNo;
    @XmlElement(name = "counter_id")
    protected String counterId;
    @XmlElement(name = "operator_id")
    protected String operatorId;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the counterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterId() {
        return counterId;
    }

    /**
     * Sets the value of the counterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterId(String value) {
        this.counterId = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

}
