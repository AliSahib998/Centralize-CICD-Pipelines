
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthly_record_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monthly_record_details">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       &lt;sequence>
 *         &lt;element name="monthly_record" type="{http://www.westernunion.com/schema/xrsi}monthly_record" maxOccurs="13"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monthly_record_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "monthlyRecord"
})
public class MonthlyRecordDetails
    extends CollectionBase
{

    @XmlElement(name = "monthly_record", required = true)
    protected List<MonthlyRecord> monthlyRecord;

    /**
     * Gets the value of the monthlyRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyRecord }
     * 
     * 
     */
    public List<MonthlyRecord> getMonthlyRecord() {
        if (monthlyRecord == null) {
            monthlyRecord = new ArrayList<MonthlyRecord>();
        }
        return this.monthlyRecord;
    }

}
