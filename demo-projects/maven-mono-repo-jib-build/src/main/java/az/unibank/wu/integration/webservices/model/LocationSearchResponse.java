
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="map" type="{http://www.westernunion.com/schema/xrsi}map" minOccurs="0"/>
 *         &lt;element name="matchedAddress" type="{http://www.westernunion.com/schema/xrsi}matchedAddress" minOccurs="0"/>
 *         &lt;element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.westernunion.com/schema/xrsi}group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessData" type="{http://www.westernunion.com/schema/xrsi}businessData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="candidates" type="{http://www.westernunion.com/schema/xrsi}candidates" minOccurs="0"/>
 *         &lt;element name="stateUrl" type="{http://www.westernunion.com/schema/xrsi}stateUrl" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.westernunion.com/schema/xrsi}errorMessage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LocationSearchResponse", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "map",
    "matchedAddress",
    "resultCount",
    "pageCount",
    "group",
    "businessData",
    "candidates",
    "stateUrl",
    "errorMessage"
})
public class LocationSearchResponse {

    protected Map map;
    protected MatchedAddress matchedAddress;
    protected BigInteger resultCount;
    protected BigInteger pageCount;
    protected List<Group> group;
    protected List<BusinessData> businessData;
    protected Candidates candidates;
    protected StateUrl stateUrl;
    protected List<ErrorMessage> errorMessage;
    @XmlAttribute(name = "distanceUnit")
    protected String distanceUnit;

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Gets the value of the matchedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MatchedAddress }
     *     
     */
    public MatchedAddress getMatchedAddress() {
        return matchedAddress;
    }

    /**
     * Sets the value of the matchedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchedAddress }
     *     
     */
    public void setMatchedAddress(MatchedAddress value) {
        this.matchedAddress = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCount(BigInteger value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

    /**
     * Gets the value of the businessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessData }
     * 
     * 
     */
    public List<BusinessData> getBusinessData() {
        if (businessData == null) {
            businessData = new ArrayList<BusinessData>();
        }
        return this.businessData;
    }

    /**
     * Gets the value of the candidates property.
     * 
     * @return
     *     possible object is
     *     {@link Candidates }
     *     
     */
    public Candidates getCandidates() {
        return candidates;
    }

    /**
     * Sets the value of the candidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Candidates }
     *     
     */
    public void setCandidates(Candidates value) {
        this.candidates = value;
    }

    /**
     * Gets the value of the stateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link StateUrl }
     *     
     */
    public StateUrl getStateUrl() {
        return stateUrl;
    }

    /**
     * Sets the value of the stateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateUrl }
     *     
     */
    public void setStateUrl(StateUrl value) {
        this.stateUrl = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessage }
     * 
     * 
     */
    public List<ErrorMessage> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessage>();
        }
        return this.errorMessage;
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
