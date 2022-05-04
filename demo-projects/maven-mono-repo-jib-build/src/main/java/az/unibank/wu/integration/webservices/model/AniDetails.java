
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ani_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ani_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ani_info" type="{http://www.westernunion.com/schema/xrsi}ani_info" maxOccurs="15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ani_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "aniInfo"
})
public class AniDetails {

    @XmlElement(name = "ani_info")
    protected List<AniInfo> aniInfo;

    /**
     * Gets the value of the aniInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aniInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAniInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AniInfo }
     * 
     * 
     */
    public List<AniInfo> getAniInfo() {
        if (aniInfo == null) {
            aniInfo = new ArrayList<AniInfo>();
        }
        return this.aniInfo;
    }

}
