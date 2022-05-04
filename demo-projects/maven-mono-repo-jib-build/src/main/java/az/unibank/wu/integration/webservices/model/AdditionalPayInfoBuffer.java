
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_pay_info_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additional_pay_info_buffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buffer_data" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *         &lt;element name="payment_info" type="{http://www.westernunion.com/schema/xrsi}payment_info" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_pay_info_buffer", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "bufferData",
    "paymentInfo"
})
public class AdditionalPayInfoBuffer {

    @XmlElement(name = "buffer_data")
    protected String bufferData;
    @XmlElement(name = "payment_info")
    protected List<PaymentInfo> paymentInfo;

    /**
     * Gets the value of the bufferData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferData() {
        return bufferData;
    }

    /**
     * Sets the value of the bufferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferData(String value) {
        this.bufferData = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfo }
     * 
     * 
     */
    public List<PaymentInfo> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<PaymentInfo>();
        }
        return this.paymentInfo;
    }

}
