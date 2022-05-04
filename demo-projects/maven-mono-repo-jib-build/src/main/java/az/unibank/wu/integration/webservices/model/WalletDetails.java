
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wallet_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wallet_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wallet_account_number" type="{http://www.westernunion.com/schema/xrsi}bank_account_number" minOccurs="0"/>
 *         &lt;element name="service_provider_name" type="{http://www.westernunion.com/schema/xrsi}bank_name" minOccurs="0"/>
 *         &lt;element name="service_provider_code" type="{http://www.westernunion.com/schema/xrsi}bank_code" minOccurs="0"/>
 *         &lt;element name="service_provider_type" type="{http://www.westernunion.com/schema/xrsi}bank_account_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wallet_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "walletAccountNumber",
    "serviceProviderName",
    "serviceProviderCode",
    "serviceProviderType"
})
public class WalletDetails {

    @XmlElement(name = "wallet_account_number")
    protected String walletAccountNumber;
    @XmlElement(name = "service_provider_name")
    protected String serviceProviderName;
    @XmlElement(name = "service_provider_code")
    protected String serviceProviderCode;
    @XmlElement(name = "service_provider_type")
    protected String serviceProviderType;

    /**
     * Gets the value of the walletAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletAccountNumber() {
        return walletAccountNumber;
    }

    /**
     * Sets the value of the walletAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletAccountNumber(String value) {
        this.walletAccountNumber = value;
    }

    /**
     * Gets the value of the serviceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * Sets the value of the serviceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderName(String value) {
        this.serviceProviderName = value;
    }

    /**
     * Gets the value of the serviceProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderCode() {
        return serviceProviderCode;
    }

    /**
     * Sets the value of the serviceProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderCode(String value) {
        this.serviceProviderCode = value;
    }

    /**
     * Gets the value of the serviceProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderType() {
        return serviceProviderType;
    }

    /**
     * Sets the value of the serviceProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderType(String value) {
        this.serviceProviderType = value;
    }

}
