
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLLVersions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DLLVersions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="SequenceNumber" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         &lt;element name="RecIndex" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLLVersions", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sequenceNumberAndRecIndex"
})
public class DLLVersions {

    @XmlElementRefs({
        @XmlElementRef(name = "SequenceNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RecIndex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> sequenceNumberAndRecIndex;

    /**
     * Gets the value of the sequenceNumberAndRecIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceNumberAndRecIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceNumberAndRecIndex().add(newItem);
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
    public List<JAXBElement<String>> getSequenceNumberAndRecIndex() {
        if (sequenceNumberAndRecIndex == null) {
            sequenceNumberAndRecIndex = new ArrayList<JAXBElement<String>>();
        }
        return this.sequenceNumberAndRecIndex;
    }

}
