
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumer_fraud_prompts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumer_fraud_prompts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question1" type="{http://www.westernunion.com/schema/xrsi}question1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumer_fraud_prompts", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "question1"
})
public class ConsumerFraudPrompts {

    protected String question1;

    /**
     * Gets the value of the question1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * Sets the value of the question1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion1(String value) {
        this.question1 = value;
    }

}
