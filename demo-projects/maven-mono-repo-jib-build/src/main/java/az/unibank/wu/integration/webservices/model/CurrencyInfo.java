
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iso_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="uni_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Iso_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *           &lt;element name="Wu_cpc_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInfo", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "isoCurrCd",
    "uniCurrCd",
    "isoCurrCdAndWuCpcCd"
})
public class CurrencyInfo {

    @XmlElement(name = "iso_curr_cd")
    protected String isoCurrCd;
    @XmlElement(name = "uni_curr_cd")
    protected String uniCurrCd;
    @XmlElementRefs({
        @XmlElementRef(name = "Iso_curr_cd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Wu_cpc_cd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> isoCurrCdAndWuCpcCd;

    /**
     * Gets the value of the isoCurrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrCd() {
        return isoCurrCd;
    }

    /**
     * Sets the value of the isoCurrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrCd(String value) {
        this.isoCurrCd = value;
    }

    /**
     * Gets the value of the uniCurrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniCurrCd() {
        return uniCurrCd;
    }

    /**
     * Sets the value of the uniCurrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniCurrCd(String value) {
        this.uniCurrCd = value;
    }

    /**
     * Gets the value of the isoCurrCdAndWuCpcCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isoCurrCdAndWuCpcCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsoCurrCdAndWuCpcCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getIsoCurrCdAndWuCpcCd() {
        if (isoCurrCdAndWuCpcCd == null) {
            isoCurrCdAndWuCpcCd = new ArrayList<JAXBElement<String>>();
        }
        return this.isoCurrCdAndWuCpcCd;
    }

}
