
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comment_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comment_data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator_id" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         &lt;element name="site_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="term_id" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comment_data", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "itemNbr",
    "stat",
    "dtime",
    "operatorId",
    "siteId",
    "termId"
})
public class CommentData {

    @XmlElement(name = "item_nbr")
    protected String itemNbr;
    protected String stat;
    protected String dtime;
    @XmlElement(name = "operator_id")
    protected Operator operatorId;
    @XmlElement(name = "site_id")
    protected String siteId;
    @XmlElement(name = "term_id")
    protected Terminal termId;

    /**
     * Gets the value of the itemNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNbr() {
        return itemNbr;
    }

    /**
     * Sets the value of the itemNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNbr(String value) {
        this.itemNbr = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the dtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtime() {
        return dtime;
    }

    /**
     * Sets the value of the dtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtime(String value) {
        this.dtime = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperatorId(Operator value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTermId(Terminal value) {
        this.termId = value;
    }

}
