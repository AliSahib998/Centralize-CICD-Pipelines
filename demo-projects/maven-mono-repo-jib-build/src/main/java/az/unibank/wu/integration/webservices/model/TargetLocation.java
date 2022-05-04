
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for targetLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="targetLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.westernunion.com/schema/xrsi}alr_address" minOccurs="0"/>
 *         &lt;element name="coordinate" type="{http://www.westernunion.com/schema/xrsi}coordinate" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetLocation", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "address",
    "coordinate",
    "id",
    "featureNumber"
})
public class TargetLocation {

    protected AlrAddress address;
    protected Coordinate coordinate;
    protected String id;
    protected String featureNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AlrAddress }
     *     
     */
    public AlrAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlrAddress }
     *     
     */
    public void setAddress(AlrAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the value of the coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setCoordinate(Coordinate value) {
        this.coordinate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the featureNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureNumber() {
        return featureNumber;
    }

    /**
     * Sets the value of the featureNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureNumber(String value) {
        this.featureNumber = value;
    }

}
