
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shared_global complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shared_global">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status_code" type="{http://www.westernunion.com/schema/xrsi}status_code" minOccurs="0"/>
 *         &lt;element name="k_response_code" type="{http://www.westernunion.com/schema/xrsi}response_code" minOccurs="0"/>
 *         &lt;element name="o_response_code" type="{http://www.westernunion.com/schema/xrsi}response_code" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.westernunion.com/schema/xrsi}response_code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shared_global", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "statusCode",
    "kResponseCode",
    "oResponseCode",
    "score"
})
public class SharedGlobal {

    @XmlElement(name = "status_code")
    protected String statusCode;
    @XmlElement(name = "k_response_code")
    protected String kResponseCode;
    @XmlElement(name = "o_response_code")
    protected String oResponseCode;
    protected String score;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the kResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKResponseCode() {
        return kResponseCode;
    }

    /**
     * Sets the value of the kResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKResponseCode(String value) {
        this.kResponseCode = value;
    }

    /**
     * Gets the value of the oResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOResponseCode() {
        return oResponseCode;
    }

    /**
     * Sets the value of the oResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOResponseCode(String value) {
        this.oResponseCode = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

}
