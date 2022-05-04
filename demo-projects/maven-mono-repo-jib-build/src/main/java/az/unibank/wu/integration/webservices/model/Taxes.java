
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tax_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="tax_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="municipal_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="state_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="county_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.westernunion.com/schema/xrsi}tax_action" minOccurs="0"/>
 *         &lt;element name="tax_worksheet" type="{http://www.westernunion.com/schema/xrsi}tax_worksheet" minOccurs="0"/>
 *         &lt;element name="client_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         &lt;element name="VET" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         &lt;element name="tax_worksheet_details" type="{http://www.westernunion.com/schema/xrsi}tax_worksheet_details" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxes", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "taxAmount",
    "taxRate",
    "municipalTax",
    "stateTax",
    "countyTax",
    "action",
    "taxWorksheet",
    "clientTax",
    "vet",
    "taxWorksheetDetails"
})
public class Taxes {

    @XmlElement(name = "tax_amount")
    protected Long taxAmount;
    @XmlElement(name = "tax_rate")
    protected String taxRate;
    @XmlElement(name = "municipal_tax")
    protected Long municipalTax;
    @XmlElement(name = "state_tax")
    protected Long stateTax;
    @XmlElement(name = "county_tax")
    protected Long countyTax;
    @XmlSchemaType(name = "string")
    protected TaxAction action;
    @XmlElement(name = "tax_worksheet")
    protected String taxWorksheet;
    @XmlElement(name = "client_tax")
    protected Long clientTax;
    @XmlElement(name = "VET")
    protected Double vet;
    @XmlElement(name = "tax_worksheet_details")
    protected TaxWorksheetDetails taxWorksheetDetails;

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the municipalTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMunicipalTax() {
        return municipalTax;
    }

    /**
     * Sets the value of the municipalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMunicipalTax(Long value) {
        this.municipalTax = value;
    }

    /**
     * Gets the value of the stateTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateTax() {
        return stateTax;
    }

    /**
     * Sets the value of the stateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateTax(Long value) {
        this.stateTax = value;
    }

    /**
     * Gets the value of the countyTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountyTax() {
        return countyTax;
    }

    /**
     * Sets the value of the countyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountyTax(Long value) {
        this.countyTax = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAction }
     *     
     */
    public TaxAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAction }
     *     
     */
    public void setAction(TaxAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the taxWorksheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxWorksheet() {
        return taxWorksheet;
    }

    /**
     * Sets the value of the taxWorksheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxWorksheet(String value) {
        this.taxWorksheet = value;
    }

    /**
     * Gets the value of the clientTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientTax() {
        return clientTax;
    }

    /**
     * Sets the value of the clientTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientTax(Long value) {
        this.clientTax = value;
    }

    /**
     * Gets the value of the vet property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVET() {
        return vet;
    }

    /**
     * Sets the value of the vet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVET(Double value) {
        this.vet = value;
    }

    /**
     * Gets the value of the taxWorksheetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWorksheetDetails }
     *     
     */
    public TaxWorksheetDetails getTaxWorksheetDetails() {
        return taxWorksheetDetails;
    }

    /**
     * Sets the value of the taxWorksheetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWorksheetDetails }
     *     
     */
    public void setTaxWorksheetDetails(TaxWorksheetDetails value) {
        this.taxWorksheetDetails = value;
    }

}
