
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_transaction_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobile_partner" type="{http://www.westernunion.com/schema/xrsi}mobile_partner"/>
 *         &lt;element name="mobile_wallet" type="{http://www.westernunion.com/schema/xrsi}mobile_wallet"/>
 *         &lt;element name="external_reference_no" type="{http://www.westernunion.com/schema/xrsi}external_reference_no" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "mobilePartner",
    "mobileWallet",
    "externalReferenceNo"
})
@XmlSeeAlso({
    MobileRequestTransactionBase.class,
    MobileReplyTransactionBase.class
})
public class MobileTransactionBase {

    @XmlElement(name = "mobile_partner", required = true)
    protected MobilePartner mobilePartner;
    @XmlElement(name = "mobile_wallet", required = true)
    protected MobileWallet mobileWallet;
    @XmlElement(name = "external_reference_no")
    protected String externalReferenceNo;

    /**
     * Gets the value of the mobilePartner property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePartner }
     *     
     */
    public MobilePartner getMobilePartner() {
        return mobilePartner;
    }

    /**
     * Sets the value of the mobilePartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePartner }
     *     
     */
    public void setMobilePartner(MobilePartner value) {
        this.mobilePartner = value;
    }

    /**
     * Gets the value of the mobileWallet property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWallet }
     *     
     */
    public MobileWallet getMobileWallet() {
        return mobileWallet;
    }

    /**
     * Sets the value of the mobileWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWallet }
     *     
     */
    public void setMobileWallet(MobileWallet value) {
        this.mobileWallet = value;
    }

    /**
     * Gets the value of the externalReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceNo() {
        return externalReferenceNo;
    }

    /**
     * Sets the value of the externalReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceNo(String value) {
        this.externalReferenceNo = value;
    }

}
