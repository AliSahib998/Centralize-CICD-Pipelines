
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_transaction_history complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobile_transaction_history">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recording" type="{http://www.westernunion.com/schema/xrsi}mobile_agent_action" minOccurs="0"/>
 *         &lt;element name="payout" type="{http://www.westernunion.com/schema/xrsi}mobile_agent_action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_transaction_history", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "recording",
    "payout"
})
public class MobileTransactionHistory {

    protected MobileAgentAction recording;
    protected MobileAgentAction payout;

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link MobileAgentAction }
     *     
     */
    public MobileAgentAction getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAgentAction }
     *     
     */
    public void setRecording(MobileAgentAction value) {
        this.recording = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     * @return
     *     possible object is
     *     {@link MobileAgentAction }
     *     
     */
    public MobileAgentAction getPayout() {
        return payout;
    }

    /**
     * Sets the value of the payout property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAgentAction }
     *     
     */
    public void setPayout(MobileAgentAction value) {
        this.payout = value;
    }

}
