
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request_transaction_base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}transaction_base">
 *       &lt;sequence>
 *         &lt;element name="agent_account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         &lt;element name="terminal" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *         &lt;element name="foreign-system-reference-no" type="{http://www.westernunion.com/schema/xrsi}reference_no" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request_transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "agentAccount",
    "operator",
    "terminal",
    "foreignSystemReferenceNo"
})
@XmlSeeAlso({
    StoreRequestTransactionBase.class,
    XRSIDasRequest.class
})
public class RequestTransactionBase
    extends TransactionBase
{

    @XmlElement(name = "agent_account")
    protected AgentAccount agentAccount;
    protected Operator operator;
    protected Terminal terminal;
    @XmlElement(name = "foreign-system-reference-no")
    protected String foreignSystemReferenceNo;

    /**
     * Gets the value of the agentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAgentAccount() {
        return agentAccount;
    }

    /**
     * Sets the value of the agentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAgentAccount(AgentAccount value) {
        this.agentAccount = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the foreignSystemReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignSystemReferenceNo() {
        return foreignSystemReferenceNo;
    }

    /**
     * Sets the value of the foreignSystemReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignSystemReferenceNo(String value) {
        this.foreignSystemReferenceNo = value;
    }

}
