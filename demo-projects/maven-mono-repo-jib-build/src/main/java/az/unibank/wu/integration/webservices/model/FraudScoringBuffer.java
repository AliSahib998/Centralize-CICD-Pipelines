
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fraud_scoring_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraud_scoring_buffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile_changes" type="{http://www.westernunion.com/schema/xrsi}profile_changes" minOccurs="0"/>
 *         &lt;element name="transaction_info" type="{http://www.westernunion.com/schema/xrsi}transaction_info" minOccurs="0"/>
 *         &lt;element name="abmt_bank_info" type="{http://www.westernunion.com/schema/xrsi}abmt_bank_info" minOccurs="0"/>
 *         &lt;element name="risk_info" type="{http://www.westernunion.com/schema/xrsi}risk_info" minOccurs="0"/>
 *         &lt;element name="action_info" type="{http://www.westernunion.com/schema/xrsi}action_info" minOccurs="0"/>
 *         &lt;element name="fraud_scoring_enabled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraud_scoring_buffer", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "profileChanges",
    "transactionInfo",
    "abmtBankInfo",
    "riskInfo",
    "actionInfo",
    "fraudScoringEnabled"
})
public class FraudScoringBuffer {

    @XmlElement(name = "profile_changes")
    protected ProfileChanges profileChanges;
    @XmlElement(name = "transaction_info")
    protected TransactionInfo transactionInfo;
    @XmlElement(name = "abmt_bank_info")
    protected AbmtBankInfo abmtBankInfo;
    @XmlElement(name = "risk_info")
    protected RiskInfo riskInfo;
    @XmlElement(name = "action_info")
    protected ActionInfo actionInfo;
    @XmlElement(name = "fraud_scoring_enabled")
    protected String fraudScoringEnabled;

    /**
     * Gets the value of the profileChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileChanges }
     *     
     */
    public ProfileChanges getProfileChanges() {
        return profileChanges;
    }

    /**
     * Sets the value of the profileChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileChanges }
     *     
     */
    public void setProfileChanges(ProfileChanges value) {
        this.profileChanges = value;
    }

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfo }
     *     
     */
    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfo }
     *     
     */
    public void setTransactionInfo(TransactionInfo value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the abmtBankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AbmtBankInfo }
     *     
     */
    public AbmtBankInfo getAbmtBankInfo() {
        return abmtBankInfo;
    }

    /**
     * Sets the value of the abmtBankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbmtBankInfo }
     *     
     */
    public void setAbmtBankInfo(AbmtBankInfo value) {
        this.abmtBankInfo = value;
    }

    /**
     * Gets the value of the riskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInfo }
     *     
     */
    public RiskInfo getRiskInfo() {
        return riskInfo;
    }

    /**
     * Sets the value of the riskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInfo }
     *     
     */
    public void setRiskInfo(RiskInfo value) {
        this.riskInfo = value;
    }

    /**
     * Gets the value of the actionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionInfo }
     *     
     */
    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    /**
     * Sets the value of the actionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionInfo }
     *     
     */
    public void setActionInfo(ActionInfo value) {
        this.actionInfo = value;
    }

    /**
     * Gets the value of the fraudScoringEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudScoringEnabled() {
        return fraudScoringEnabled;
    }

    /**
     * Sets the value of the fraudScoringEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudScoringEnabled(String value) {
        this.fraudScoringEnabled = value;
    }

}
