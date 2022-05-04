
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fee_inquiry_flags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fee_inquiry_flags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_delivery_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="test_question_flag" type="{http://www.westernunion.com/schema/xrsi}test_question_flag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fee_inquiry_flags", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "phoneDeliveryFlag",
    "testQuestionFlag"
})
public class FeeInquiryFlags {

    @XmlElement(name = "phone_delivery_flag")
    protected Boolean phoneDeliveryFlag;
    @XmlElement(name = "test_question_flag")
    protected String testQuestionFlag;

    /**
     * Gets the value of the phoneDeliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneDeliveryFlag() {
        return phoneDeliveryFlag;
    }

    /**
     * Sets the value of the phoneDeliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneDeliveryFlag(Boolean value) {
        this.phoneDeliveryFlag = value;
    }

    /**
     * Gets the value of the testQuestionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestionFlag() {
        return testQuestionFlag;
    }

    /**
     * Sets the value of the testQuestionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestionFlag(String value) {
        this.testQuestionFlag = value;
    }

}
