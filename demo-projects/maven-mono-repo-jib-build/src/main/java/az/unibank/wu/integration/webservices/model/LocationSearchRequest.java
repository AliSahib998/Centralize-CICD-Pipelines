
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchCriteria" type="{http://www.westernunion.com/schema/xrsi}searchCriteria"/>
 *         &lt;element name="businessSpecification" type="{http://www.westernunion.com/schema/xrsi}businessSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="distanceUnit" default="MILE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="KM"/>
 *             &lt;enumeration value="MILE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSearchRequest", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "searchCriteria",
    "businessSpecification"
})
public class LocationSearchRequest {

    @XmlElement(required = true)
    protected SearchCriteria searchCriteria;
    protected List<BusinessSpecification> businessSpecification;
    @XmlAttribute(name = "distanceUnit")
    protected String distanceUnit;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the businessSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSpecification }
     * 
     * 
     */
    public List<BusinessSpecification> getBusinessSpecification() {
        if (businessSpecification == null) {
            businessSpecification = new ArrayList<BusinessSpecification>();
        }
        return this.businessSpecification;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        if (distanceUnit == null) {
            return "MILE";
        } else {
            return distanceUnit;
        }
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

}
