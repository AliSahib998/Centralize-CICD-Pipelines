
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for risk_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="risk_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="risk_score" type="{http://www.westernunion.com/schema/xrsi}risk_score" minOccurs="0"/>
 *         &lt;element name="risk_recommendation" type="{http://www.westernunion.com/schema/xrsi}auto_action" minOccurs="0"/>
 *         &lt;element name="risk_decision" type="{http://www.westernunion.com/schema/xrsi}auto_action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "risk_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "riskScore",
    "riskRecommendation",
    "riskDecision"
})
public class RiskInfo {

    @XmlElement(name = "risk_score")
    protected String riskScore;
    @XmlElement(name = "risk_recommendation")
    @XmlSchemaType(name = "string")
    protected AutoAction riskRecommendation;
    @XmlElement(name = "risk_decision")
    @XmlSchemaType(name = "string")
    protected AutoAction riskDecision;

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the riskRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link AutoAction }
     *     
     */
    public AutoAction getRiskRecommendation() {
        return riskRecommendation;
    }

    /**
     * Sets the value of the riskRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoAction }
     *     
     */
    public void setRiskRecommendation(AutoAction value) {
        this.riskRecommendation = value;
    }

    /**
     * Gets the value of the riskDecision property.
     * 
     * @return
     *     possible object is
     *     {@link AutoAction }
     *     
     */
    public AutoAction getRiskDecision() {
        return riskDecision;
    }

    /**
     * Sets the value of the riskDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoAction }
     *     
     */
    public void setRiskDecision(AutoAction value) {
        this.riskDecision = value;
    }

}
