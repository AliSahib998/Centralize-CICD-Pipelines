
package az.unibank.wu.integration.webservices.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASISOCountry</b> object contains information for one 
 *             				ISO Country.<br>
 *             				e.g. everything between <GETDESTINATIONCOUNTRIES>...</GETDESTINATIONCOUNTRIES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISOCOUNTRY_Type", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {

})
@ToString
public class DASISOCountry {

    @XmlElement(name = "ISO_COUNTRY_CD", required = true)
    protected String isoCountryCode;
    @XmlElement(name = "COUNTRY_LONG", required = true)
    protected String nameLong;
    @XmlElement(name = "SERVICE_FLAGS")
    protected String serviceFlags;
    @XmlElement(name = "COUNTRY_SHORT")
    protected String doNotUseThisField;

    /**
     * Gets the value of the isoCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountryCode() {
        return isoCountryCode;
    }

    /**
     * Sets the value of the isoCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Gets the value of the nameLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLong() {
        return nameLong;
    }

    /**
     * Sets the value of the nameLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLong(String value) {
        this.nameLong = value;
    }

    /**
     * Gets the value of the serviceFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFlags() {
        return serviceFlags;
    }

    /**
     * Sets the value of the serviceFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFlags(String value) {
        this.serviceFlags = value;
    }

    /**
     * Gets the value of the doNotUseThisField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotUseThisField() {
        return doNotUseThisField;
    }

    /**
     * Sets the value of the doNotUseThisField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotUseThisField(String value) {
        this.doNotUseThisField = value;
    }

}
