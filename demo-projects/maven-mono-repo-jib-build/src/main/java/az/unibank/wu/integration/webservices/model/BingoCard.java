
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bingo_card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bingo_card">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="coordinates_a_thru_p" type="{http://www.westernunion.com/schema/xrsi}bingo_coordinates" minOccurs="0"/>
 *         &lt;element name="coordinates_1_thru_15" type="{http://www.westernunion.com/schema/xrsi}bingo_coordinates" minOccurs="0"/>
 *         &lt;element name="bingo_number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="override" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         &lt;element name="ani" type="{http://www.westernunion.com/schema/xrsi}received_ani" minOccurs="0"/>
 *         &lt;element name="stuff_vru_conn_id" type="{http://www.westernunion.com/schema/xrsi}stuff_vru_conn_id" minOccurs="0"/>
 *         &lt;element name="sin" type="{http://www.westernunion.com/schema/xrsi}sin" minOccurs="0"/>
 *         &lt;element name="code_word" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commercial_authorized_sender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
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
@XmlType(name = "bingo_card", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "number",
    "coordinatesAThruP",
    "coordinates1Thru15",
    "bingoNumber",
    "override",
    "ani",
    "stuffVruConnId",
    "sin",
    "codeWord",
    "commercialAuthorizedSender"
})
public class BingoCard {

    protected String number;
    @XmlElement(name = "coordinates_a_thru_p")
    protected String coordinatesAThruP;
    @XmlElement(name = "coordinates_1_thru_15")
    protected String coordinates1Thru15;
    @XmlElement(name = "bingo_number")
    protected String bingoNumber;
    @XmlSchemaType(name = "string")
    protected YesNo override;
    protected String ani;
    @XmlElement(name = "stuff_vru_conn_id")
    protected String stuffVruConnId;
    protected String sin;
    @XmlElement(name = "code_word")
    protected String codeWord;
    @XmlElement(name = "commercial_authorized_sender")
    protected String commercialAuthorizedSender;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the coordinatesAThruP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesAThruP() {
        return coordinatesAThruP;
    }

    /**
     * Sets the value of the coordinatesAThruP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesAThruP(String value) {
        this.coordinatesAThruP = value;
    }

    /**
     * Gets the value of the coordinates1Thru15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinates1Thru15() {
        return coordinates1Thru15;
    }

    /**
     * Sets the value of the coordinates1Thru15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinates1Thru15(String value) {
        this.coordinates1Thru15 = value;
    }

    /**
     * Gets the value of the bingoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoNumber() {
        return bingoNumber;
    }

    /**
     * Sets the value of the bingoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoNumber(String value) {
        this.bingoNumber = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setOverride(YesNo value) {
        this.override = value;
    }

    /**
     * Gets the value of the ani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAni() {
        return ani;
    }

    /**
     * Sets the value of the ani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAni(String value) {
        this.ani = value;
    }

    /**
     * Gets the value of the stuffVruConnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffVruConnId() {
        return stuffVruConnId;
    }

    /**
     * Sets the value of the stuffVruConnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffVruConnId(String value) {
        this.stuffVruConnId = value;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSin(String value) {
        this.sin = value;
    }

    /**
     * Gets the value of the codeWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeWord() {
        return codeWord;
    }

    /**
     * Sets the value of the codeWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeWord(String value) {
        this.codeWord = value;
    }

    /**
     * Gets the value of the commercialAuthorizedSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAuthorizedSender() {
        return commercialAuthorizedSender;
    }

    /**
     * Sets the value of the commercialAuthorizedSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAuthorizedSender(String value) {
        this.commercialAuthorizedSender = value;
    }

}
