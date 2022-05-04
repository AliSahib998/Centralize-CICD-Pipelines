
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_notification_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_notification_base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobile_partner" type="{http://www.westernunion.com/schema/xrsi}mobile_partner"/>
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
@XmlType(name = "mobile_notification_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "mobilePartner",
    "externalReferenceNo"
})
@XmlSeeAlso({
    MobileReplyNotificationBase.class,
    MobileRequestNotificationBase.class
})
public class MobileNotificationBase {

    @XmlElement(name = "mobile_partner", required = true)
    protected MobilePartner mobilePartner;
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
