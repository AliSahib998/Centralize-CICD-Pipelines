
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="map">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.westernunion.com/schema/xrsi}url"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "map", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "url"
})
public class Map {

    @XmlElement(required = true)
    protected Url url;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    public void setUrl(Url value) {
        this.url = value;
    }

}
