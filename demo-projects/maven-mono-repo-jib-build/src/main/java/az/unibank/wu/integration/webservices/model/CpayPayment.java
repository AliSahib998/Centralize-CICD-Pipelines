
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cpay_payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="cash_payment" type="{http://www.westernunion.com/schema/xrsi}cash_payment" minOccurs="0"/>
 *         &lt;element name="draft_check_payment" type="{http://www.westernunion.com/schema/xrsi}draft_check_payment" minOccurs="0"/>
 *         &lt;element name="paper_check_payment" type="{http://www.westernunion.com/schema/xrsi}paper_check_payment" minOccurs="0"/>
 *         &lt;element name="gift_coupon_payment" type="{http://www.westernunion.com/schema/xrsi}cash_payment" minOccurs="0"/>
 *         &lt;element name="tc_mo_payment" type="{http://www.westernunion.com/schema/xrsi}cash_payment" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_payment", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "cashPayment",
    "draftCheckPayment",
    "paperCheckPayment",
    "giftCouponPayment",
    "tcMoPayment"
})
public class CpayPayment {

    @XmlElement(name = "cash_payment")
    protected CashPayment cashPayment;
    @XmlElement(name = "draft_check_payment")
    protected DraftCheckPayment draftCheckPayment;
    @XmlElement(name = "paper_check_payment")
    protected PaperCheckPayment paperCheckPayment;
    @XmlElement(name = "gift_coupon_payment")
    protected CashPayment giftCouponPayment;
    @XmlElement(name = "tc_mo_payment")
    protected CashPayment tcMoPayment;

    /**
     * Gets the value of the cashPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayment }
     *     
     */
    public CashPayment getCashPayment() {
        return cashPayment;
    }

    /**
     * Sets the value of the cashPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayment }
     *     
     */
    public void setCashPayment(CashPayment value) {
        this.cashPayment = value;
    }

    /**
     * Gets the value of the draftCheckPayment property.
     * 
     * @return
     *     possible object is
     *     {@link DraftCheckPayment }
     *     
     */
    public DraftCheckPayment getDraftCheckPayment() {
        return draftCheckPayment;
    }

    /**
     * Sets the value of the draftCheckPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftCheckPayment }
     *     
     */
    public void setDraftCheckPayment(DraftCheckPayment value) {
        this.draftCheckPayment = value;
    }

    /**
     * Gets the value of the paperCheckPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCheckPayment }
     *     
     */
    public PaperCheckPayment getPaperCheckPayment() {
        return paperCheckPayment;
    }

    /**
     * Sets the value of the paperCheckPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCheckPayment }
     *     
     */
    public void setPaperCheckPayment(PaperCheckPayment value) {
        this.paperCheckPayment = value;
    }

    /**
     * Gets the value of the giftCouponPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayment }
     *     
     */
    public CashPayment getGiftCouponPayment() {
        return giftCouponPayment;
    }

    /**
     * Sets the value of the giftCouponPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayment }
     *     
     */
    public void setGiftCouponPayment(CashPayment value) {
        this.giftCouponPayment = value;
    }

    /**
     * Gets the value of the tcMoPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayment }
     *     
     */
    public CashPayment getTcMoPayment() {
        return tcMoPayment;
    }

    /**
     * Sets the value of the tcMoPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayment }
     *     
     */
    public void setTcMoPayment(CashPayment value) {
        this.tcMoPayment = value;
    }

}
