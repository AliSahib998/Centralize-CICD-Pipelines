
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reply_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reply_transaction_base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}transaction_base">
 *       &lt;sequence>
 *         &lt;element name="terminal" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *         &lt;element name="advisory_text" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reply_transaction_base", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "terminal",
    "advisoryText"
})
@XmlSeeAlso({
    ModifySendMoneyReply.class
})
public class ReplyTransactionBase
    extends TransactionBase
{

    protected Terminal terminal;
    @XmlElement(name = "advisory_text")
    protected String advisoryText;

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
     * Gets the value of the advisoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryText() {
        return advisoryText;
    }

    /**
     * Sets the value of the advisoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryText(String value) {
        this.advisoryText = value;
    }

}
