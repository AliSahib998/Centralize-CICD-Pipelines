
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="new_password" type="{http://www.westernunion.com/schema/xrsi}password_long" minOccurs="0"/>
 *         &lt;element name="confirm_password" type="{http://www.westernunion.com/schema/xrsi}password_long" minOccurs="0"/>
 *         &lt;element name="question_answers" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "newPassword",
    "confirmPassword",
    "questionAnswers"
})
public class SecurityDetails {

    @XmlElement(name = "new_password")
    protected String newPassword;
    @XmlElement(name = "confirm_password")
    protected String confirmPassword;
    @XmlElement(name = "question_answers")
    protected IdentificationQuestion questionAnswers;

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the confirmPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Sets the value of the confirmPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmPassword(String value) {
        this.confirmPassword = value;
    }

    /**
     * Gets the value of the questionAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationQuestion }
     *     
     */
    public IdentificationQuestion getQuestionAnswers() {
        return questionAnswers;
    }

    /**
     * Sets the value of the questionAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationQuestion }
     *     
     */
    public void setQuestionAnswers(IdentificationQuestion value) {
        this.questionAnswers = value;
    }

}
