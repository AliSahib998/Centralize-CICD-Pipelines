
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_transaction_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partner" type="{http://www.westernunion.com/schema/xrsi}cpay_partner"/>
 *         &lt;element name="device" type="{http://www.westernunion.com/schema/xrsi}terminal"/>
 *         &lt;element name="operator" type="{http://www.westernunion.com/schema/xrsi}operator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "partner",
    "device",
    "operator"
})
@XmlSeeAlso({
    CpayRequestTransactionBase.class,
    CpayReplyTransactionBase.class
})
public class CpayTransactionBase {

    @XmlElement(required = true)
    protected CpayPartner partner;
    @XmlElement(required = true)
    protected Terminal device;
    @XmlElement(required = true)
    protected Operator operator;

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link CpayPartner }
     *     
     */
    public CpayPartner getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayPartner }
     *     
     */
    public void setPartner(CpayPartner value) {
        this.partner = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setDevice(Terminal value) {
        this.device = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

}
