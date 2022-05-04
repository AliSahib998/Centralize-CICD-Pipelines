
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for service_option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service_option">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         &lt;element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}payment_details" minOccurs="0"/>
 *         &lt;element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *         &lt;element name="additional_service_options" type="{http://www.westernunion.com/schema/xrsi}additional_service_options" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_option", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "deliveryServices",
    "financials",
    "promotions",
    "paymentDetails",
    "dfFields",
    "additionalServiceOptions"
})
public class ServiceOption {

    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    protected Financials financials;
    protected Promotions promotions;
    @XmlElement(name = "payment_details")
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;
    @XmlElement(name = "additional_service_options")
    protected AdditionalServiceOptions additionalServiceOptions;

    /**
     * Gets the value of the deliveryServices property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServices }
     *     
     */
    public DeliveryServices getDeliveryServices() {
        return deliveryServices;
    }

    /**
     * Sets the value of the deliveryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServices }
     *     
     */
    public void setDeliveryServices(DeliveryServices value) {
        this.deliveryServices = value;
    }

    /**
     * Gets the value of the financials property.
     * 
     * @return
     *     possible object is
     *     {@link Financials }
     *     
     */
    public Financials getFinancials() {
        return financials;
    }

    /**
     * Sets the value of the financials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financials }
     *     
     */
    public void setFinancials(Financials value) {
        this.financials = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the dfFields property.
     * 
     * @return
     *     possible object is
     *     {@link DfFields }
     *     
     */
    public DfFields getDfFields() {
        return dfFields;
    }

    /**
     * Sets the value of the dfFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfFields }
     *     
     */
    public void setDfFields(DfFields value) {
        this.dfFields = value;
    }

    /**
     * Gets the value of the additionalServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceOptions }
     *     
     */
    public AdditionalServiceOptions getAdditionalServiceOptions() {
        return additionalServiceOptions;
    }

    /**
     * Sets the value of the additionalServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceOptions }
     *     
     */
    public void setAdditionalServiceOptions(AdditionalServiceOptions value) {
        this.additionalServiceOptions = value;
    }

}
