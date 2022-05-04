
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qqc_device_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="device_detail" type="{http://www.westernunion.com/schema/xrsi}qqc_device_detail" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_device_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "deviceDetail"
})
public class QqcDeviceDetails
    extends CollectionBase
{

    @XmlElement(name = "device_detail")
    protected List<QqcDeviceDetail> deviceDetail;

    /**
     * Gets the value of the deviceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QqcDeviceDetail }
     * 
     * 
     */
    public List<QqcDeviceDetail> getDeviceDetail() {
        if (deviceDetail == null) {
            deviceDetail = new ArrayList<QqcDeviceDetail>();
        }
        return this.deviceDetail;
    }

}
