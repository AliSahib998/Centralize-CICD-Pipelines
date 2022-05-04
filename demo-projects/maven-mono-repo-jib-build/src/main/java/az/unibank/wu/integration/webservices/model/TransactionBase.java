
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}gbs_request_transaction_base">
 *       &lt;sequence>
 *         &lt;element name="channel" type="{http://www.westernunion.com/schema/xrsi}channel" minOccurs="0"/>
 *         &lt;element name="security" type="{http://www.westernunion.com/schema/xrsi}security" minOccurs="0"/>
 *         &lt;element name="instant_notification" type="{http://www.westernunion.com/schema/xrsi}instant_notification" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.westernunion.com/schema/xrsi}domain" minOccurs="0"/>
 *         &lt;element name="wallet_reference_no" type="{http://www.westernunion.com/schema/xrsi}wallet_reference_no" minOccurs="0"/>
 *         &lt;element name="session_digest" type="{http://www.westernunion.com/schema/xrsi}session_digest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "channel",
    "security",
    "instantNotification",
    "domain",
    "walletReferenceNo",
    "sessionDigest"
})
@XmlSeeAlso({
    ReplyTransactionBase.class,
    RequestTransactionBase.class
})
public class TransactionBase
    extends GbsRequestTransactionBase
{

    protected Channel channel;
    protected Security security;
    @XmlElement(name = "instant_notification")
    protected InstantNotification instantNotification;
    protected String domain;
    @XmlElement(name = "wallet_reference_no")
    protected String walletReferenceNo;
    @XmlElement(name = "session_digest")
    protected SessionDigest sessionDigest;

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
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the instantNotification property.
     * 
     * @return
     *     possible object is
     *     {@link InstantNotification }
     *     
     */
    public InstantNotification getInstantNotification() {
        return instantNotification;
    }

    /**
     * Sets the value of the instantNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantNotification }
     *     
     */
    public void setInstantNotification(InstantNotification value) {
        this.instantNotification = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the walletReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReferenceNo() {
        return walletReferenceNo;
    }

    /**
     * Sets the value of the walletReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReferenceNo(String value) {
        this.walletReferenceNo = value;
    }

    /**
     * Gets the value of the sessionDigest property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDigest }
     *     
     */
    public SessionDigest getSessionDigest() {
        return sessionDigest;
    }

    /**
     * Sets the value of the sessionDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDigest }
     *     
     */
    public void setSessionDigest(SessionDigest value) {
        this.sessionDigest = value;
    }

}
