
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_service_option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gbs_service_option">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agent_account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.westernunion.com/schema/xrsi}channel" minOccurs="0"/>
 *         &lt;element name="wu_product" type="{http://www.westernunion.com/schema/xrsi}wu_product" minOccurs="0"/>
 *         &lt;element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}gbs_payment_details" minOccurs="0"/>
 *         &lt;element name="additional_service_options" type="{http://www.westernunion.com/schema/xrsi}gbs_additional_service_options" minOccurs="0"/>
 *         &lt;element name="identification_question_indicator" type="{http://www.westernunion.com/schema/xrsi}identification_question_indicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_service_option", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "agentAccount",
    "channel",
    "wuProduct",
    "paymentDetails",
    "additionalServiceOptions",
    "identificationQuestionIndicator"
})
public class GbsServiceOption {

    @XmlElement(name = "agent_account")
    protected AgentAccount agentAccount;
    protected Channel channel;
    @XmlElement(name = "wu_product")
    protected WuProduct wuProduct;
    @XmlElement(name = "payment_details")
    protected GbsPaymentDetails paymentDetails;
    @XmlElement(name = "additional_service_options")
    protected GbsAdditionalServiceOptions additionalServiceOptions;
    @XmlElement(name = "identification_question_indicator")
    protected String identificationQuestionIndicator;

    /**
     * Gets the value of the agentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAgentAccount() {
        return agentAccount;
    }

    /**
     * Sets the value of the agentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAgentAccount(AgentAccount value) {
        this.agentAccount = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the wuProduct property.
     * 
     * @return
     *     possible object is
     *     {@link WuProduct }
     *     
     */
    public WuProduct getWuProduct() {
        return wuProduct;
    }

    /**
     * Sets the value of the wuProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuProduct }
     *     
     */
    public void setWuProduct(WuProduct value) {
        this.wuProduct = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public GbsPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public void setPaymentDetails(GbsPaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the additionalServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link GbsAdditionalServiceOptions }
     *     
     */
    public GbsAdditionalServiceOptions getAdditionalServiceOptions() {
        return additionalServiceOptions;
    }

    /**
     * Sets the value of the additionalServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GbsAdditionalServiceOptions }
     *     
     */
    public void setAdditionalServiceOptions(GbsAdditionalServiceOptions value) {
        this.additionalServiceOptions = value;
    }

    /**
     * Gets the value of the identificationQuestionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationQuestionIndicator() {
        return identificationQuestionIndicator;
    }

    /**
     * Sets the value of the identificationQuestionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationQuestionIndicator(String value) {
        this.identificationQuestionIndicator = value;
    }

}
