
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASErrorTranslation</b> object contains error message information.<br>
 *             				e.g. everything between <GETERRORTRANSLATIONS>...</GETERRORTRANSLATIONS> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETERRORTRANSLATIONS_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
public class DASErrorTranslation {

    @XmlElement(name = "ERR_CODE")
    protected String errorDCode;
    @XmlElement(name = "HOST_ERR")
    protected String hostError;
    @XmlElement(name = "ENG_MESSAGE")
    protected String englishMessage;
    @XmlElement(name = "ERR_MESSAGE")
    protected String errorMessage;

    /**
     * Gets the value of the errorDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDCode() {
        return errorDCode;
    }

    /**
     * Sets the value of the errorDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDCode(String value) {
        this.errorDCode = value;
    }

    /**
     * Gets the value of the hostError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostError() {
        return hostError;
    }

    /**
     * Sets the value of the hostError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostError(String value) {
        this.hostError = value;
    }

    /**
     * Gets the value of the englishMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishMessage() {
        return englishMessage;
    }

    /**
     * Sets the value of the englishMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishMessage(String value) {
        this.englishMessage = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
