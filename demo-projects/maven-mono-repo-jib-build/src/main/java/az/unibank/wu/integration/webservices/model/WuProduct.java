
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wu_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wu_product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.westernunion.com/schema/xrsi}wu_product_name" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.westernunion.com/schema/xrsi}wu_product_code" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         &lt;element name="routing_code" type="{http://www.westernunion.com/schema/xrsi}route_designator" minOccurs="0"/>
 *         &lt;element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         &lt;element name="route_code" type="{http://www.westernunion.com/schema/xrsi}route_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wu_product", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "name",
    "code",
    "type",
    "routingCode",
    "identificationQuestion",
    "routeCode"
})
public class WuProduct {

    protected String name;
    protected String code;
    @XmlSchemaType(name = "string")
    protected TransactionType type;
    @XmlElement(name = "routing_code")
    protected String routingCode;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    @XmlElement(name = "route_code")
    protected String routeCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setType(TransactionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the identificationQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationQuestion }
     *     
     */
    public IdentificationQuestion getIdentificationQuestion() {
        return identificationQuestion;
    }

    /**
     * Sets the value of the identificationQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationQuestion }
     *     
     */
    public void setIdentificationQuestion(IdentificationQuestion value) {
        this.identificationQuestion = value;
    }

    /**
     * Gets the value of the routeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteCode(String value) {
        this.routeCode = value;
    }

}
