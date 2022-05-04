
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_documents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="id_documents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_document" type="{http://www.westernunion.com/schema/xrsi}id_document" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id_documents", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "idDocument"
})
public class IdDocuments {

    @XmlElement(name = "id_document", required = true)
    protected List<IdDocument> idDocument;

    /**
     * Gets the value of the idDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdDocument }
     * 
     * 
     */
    public List<IdDocument> getIdDocument() {
        if (idDocument == null) {
            idDocument = new ArrayList<IdDocument>();
        }
        return this.idDocument;
    }

}
