
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fx_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fx_options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payer_fx_delivery" type="{http://www.westernunion.com/schema/xrsi}payer_fx_delivery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_options", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "payerFxDelivery"
})
public class FxOptions {

    @XmlElement(name = "payer_fx_delivery")
    protected List<PayerFxDelivery> payerFxDelivery;

    /**
     * Gets the value of the payerFxDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerFxDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerFxDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayerFxDelivery }
     * 
     * 
     */
    public List<PayerFxDelivery> getPayerFxDelivery() {
        if (payerFxDelivery == null) {
            payerFxDelivery = new ArrayList<PayerFxDelivery>();
        }
        return this.payerFxDelivery;
    }

}
