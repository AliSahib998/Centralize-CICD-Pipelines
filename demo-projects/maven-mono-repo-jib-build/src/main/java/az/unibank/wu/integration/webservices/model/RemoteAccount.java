
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remote_account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remote_account">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}agent_account">
 *       &lt;sequence>
 *         &lt;element name="bingo_card" type="{http://www.westernunion.com/schema/xrsi}bingo_card" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remote_account", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "bingoCard"
})
public class RemoteAccount
    extends AgentAccount
{

    @XmlElement(name = "bingo_card")
    protected BingoCard bingoCard;

    /**
     * Gets the value of the bingoCard property.
     * 
     * @return
     *     possible object is
     *     {@link BingoCard }
     *     
     */
    public BingoCard getBingoCard() {
        return bingoCard;
    }

    /**
     * Sets the value of the bingoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BingoCard }
     *     
     */
    public void setBingoCard(BingoCard value) {
        this.bingoCard = value;
    }

}
