
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.westernunion.com/schema/xrsi}alr_location" minOccurs="0"/>
 *         &lt;element name="coordinate" type="{http://www.westernunion.com/schema/xrsi}coordinate" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidate", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "location",
    "coordinate",
    "id"
})
public class Candidate {

    protected AlrLocation location;
    protected Coordinate coordinate;
    protected String id;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link AlrLocation }
     *     
     */
    public AlrLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlrLocation }
     *     
     */
    public void setLocation(AlrLocation value) {
        this.location = value;
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

}
