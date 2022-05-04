
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancel-send-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancel-send-reply">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}reply_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="overflow_queue_count" type="{http://www.westernunion.com/schema/xrsi}count" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="error_queue_count" type="{http://www.westernunion.com/schema/xrsi}count" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="acr_queue_count" type="{http://www.westernunion.com/schema/xrsi}count" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="qqc_redelivery_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="cuba_queue_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="authorization_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="high_dollar_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="bank_validation_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="ofac_queue_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         &lt;element name="foreign_remote_system" type="{http://www.westernunion.com/schema/xrsi}foreign_remote_system" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancel-send-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "overflowQueueCount",
    "errorQueueCount",
    "acrQueueCount",
    "qqcRedeliveryCount",
    "cubaQueueCount",
    "authorizationCount",
    "highDollarCount",
    "bankValidationCount",
    "ofacQueueCount",
    "foreignRemoteSystem"
})
public class CancelSendReply
    extends ReplyTransactionBase
{

    @XmlElement(name = "overflow_queue_count")
    protected List<BigInteger> overflowQueueCount;
    @XmlElement(name = "error_queue_count")
    protected List<BigInteger> errorQueueCount;
    @XmlElement(name = "acr_queue_count")
    protected List<BigInteger> acrQueueCount;
    @XmlElement(name = "qqc_redelivery_count")
    protected BigInteger qqcRedeliveryCount;
    @XmlElement(name = "cuba_queue_count")
    protected BigInteger cubaQueueCount;
    @XmlElement(name = "authorization_count")
    protected BigInteger authorizationCount;
    @XmlElement(name = "high_dollar_count")
    protected BigInteger highDollarCount;
    @XmlElement(name = "bank_validation_count")
    protected BigInteger bankValidationCount;
    @XmlElement(name = "ofac_queue_count")
    protected BigInteger ofacQueueCount;
    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;

    /**
     * Gets the value of the overflowQueueCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overflowQueueCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverflowQueueCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getOverflowQueueCount() {
        if (overflowQueueCount == null) {
            overflowQueueCount = new ArrayList<BigInteger>();
        }
        return this.overflowQueueCount;
    }

    /**
     * Gets the value of the errorQueueCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorQueueCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorQueueCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getErrorQueueCount() {
        if (errorQueueCount == null) {
            errorQueueCount = new ArrayList<BigInteger>();
        }
        return this.errorQueueCount;
    }

    /**
     * Gets the value of the acrQueueCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acrQueueCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcrQueueCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getAcrQueueCount() {
        if (acrQueueCount == null) {
            acrQueueCount = new ArrayList<BigInteger>();
        }
        return this.acrQueueCount;
    }

    /**
     * Gets the value of the qqcRedeliveryCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQqcRedeliveryCount() {
        return qqcRedeliveryCount;
    }

    /**
     * Sets the value of the qqcRedeliveryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQqcRedeliveryCount(BigInteger value) {
        this.qqcRedeliveryCount = value;
    }

    /**
     * Gets the value of the cubaQueueCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubaQueueCount() {
        return cubaQueueCount;
    }

    /**
     * Sets the value of the cubaQueueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubaQueueCount(BigInteger value) {
        this.cubaQueueCount = value;
    }

    /**
     * Gets the value of the authorizationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorizationCount() {
        return authorizationCount;
    }

    /**
     * Sets the value of the authorizationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorizationCount(BigInteger value) {
        this.authorizationCount = value;
    }

    /**
     * Gets the value of the highDollarCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighDollarCount() {
        return highDollarCount;
    }

    /**
     * Sets the value of the highDollarCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighDollarCount(BigInteger value) {
        this.highDollarCount = value;
    }

    /**
     * Gets the value of the bankValidationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBankValidationCount() {
        return bankValidationCount;
    }

    /**
     * Sets the value of the bankValidationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBankValidationCount(BigInteger value) {
        this.bankValidationCount = value;
    }

    /**
     * Gets the value of the ofacQueueCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfacQueueCount() {
        return ofacQueueCount;
    }

    /**
     * Sets the value of the ofacQueueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfacQueueCount(BigInteger value) {
        this.ofacQueueCount = value;
    }

    /**
     * Gets the value of the foreignRemoteSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public ForeignRemoteSystem getForeignRemoteSystem() {
        return foreignRemoteSystem;
    }

    /**
     * Sets the value of the foreignRemoteSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public void setForeignRemoteSystem(ForeignRemoteSystem value) {
        this.foreignRemoteSystem = value;
    }

}
