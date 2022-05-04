
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current_IP_address" type="{http://www.westernunion.com/schema/xrsi}IP_address" minOccurs="0"/>
 *         &lt;element name="historical_IP1" type="{http://www.westernunion.com/schema/xrsi}IP_address" minOccurs="0"/>
 *         &lt;element name="historical_IP2" type="{http://www.westernunion.com/schema/xrsi}IP_address" minOccurs="0"/>
 *         &lt;element name="historical_IP3" type="{http://www.westernunion.com/schema/xrsi}IP_address" minOccurs="0"/>
 *         &lt;element name="historical_IP4" type="{http://www.westernunion.com/schema/xrsi}IP_address" minOccurs="0"/>
 *         &lt;element name="black_box_buffer" type="{http://www.westernunion.com/schema/xrsi}black_box_buffer" minOccurs="0"/>
 *         &lt;element name="bank_OOBA_result" type="{http://www.westernunion.com/schema/xrsi}bank_OOBA_result" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_info", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "currentIPAddress",
    "historicalIP1",
    "historicalIP2",
    "historicalIP3",
    "historicalIP4",
    "blackBoxBuffer",
    "bankOOBAResult"
})
public class TransactionInfo {

    @XmlElement(name = "current_IP_address")
    protected String currentIPAddress;
    @XmlElement(name = "historical_IP1")
    protected String historicalIP1;
    @XmlElement(name = "historical_IP2")
    protected String historicalIP2;
    @XmlElement(name = "historical_IP3")
    protected String historicalIP3;
    @XmlElement(name = "historical_IP4")
    protected String historicalIP4;
    @XmlElement(name = "black_box_buffer")
    protected String blackBoxBuffer;
    @XmlElement(name = "bank_OOBA_result")
    @XmlSchemaType(name = "string")
    protected BankOOBAResult bankOOBAResult;

    /**
     * Gets the value of the currentIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPAddress() {
        return currentIPAddress;
    }

    /**
     * Sets the value of the currentIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPAddress(String value) {
        this.currentIPAddress = value;
    }

    /**
     * Gets the value of the historicalIP1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalIP1() {
        return historicalIP1;
    }

    /**
     * Sets the value of the historicalIP1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalIP1(String value) {
        this.historicalIP1 = value;
    }

    /**
     * Gets the value of the historicalIP2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalIP2() {
        return historicalIP2;
    }

    /**
     * Sets the value of the historicalIP2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalIP2(String value) {
        this.historicalIP2 = value;
    }

    /**
     * Gets the value of the historicalIP3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalIP3() {
        return historicalIP3;
    }

    /**
     * Sets the value of the historicalIP3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalIP3(String value) {
        this.historicalIP3 = value;
    }

    /**
     * Gets the value of the historicalIP4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalIP4() {
        return historicalIP4;
    }

    /**
     * Sets the value of the historicalIP4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalIP4(String value) {
        this.historicalIP4 = value;
    }

    /**
     * Gets the value of the blackBoxBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackBoxBuffer() {
        return blackBoxBuffer;
    }

    /**
     * Sets the value of the blackBoxBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackBoxBuffer(String value) {
        this.blackBoxBuffer = value;
    }

    /**
     * Gets the value of the bankOOBAResult property.
     * 
     * @return
     *     possible object is
     *     {@link BankOOBAResult }
     *     
     */
    public BankOOBAResult getBankOOBAResult() {
        return bankOOBAResult;
    }

    /**
     * Sets the value of the bankOOBAResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankOOBAResult }
     *     
     */
    public void setBankOOBAResult(BankOOBAResult value) {
        this.bankOOBAResult = value;
    }

}
