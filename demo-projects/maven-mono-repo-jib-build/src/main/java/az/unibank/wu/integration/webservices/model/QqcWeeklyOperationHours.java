
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_weekly_operation_hours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qqc_weekly_operation_hours">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sunday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="monday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="tuesday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="wednesday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="thursday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="friday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="saturday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         &lt;element name="holiday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_weekly_operation_hours", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "holiday"
})
public class QqcWeeklyOperationHours {

    protected QqcOperationHours sunday;
    protected QqcOperationHours monday;
    protected QqcOperationHours tuesday;
    protected QqcOperationHours wednesday;
    protected QqcOperationHours thursday;
    protected QqcOperationHours friday;
    protected QqcOperationHours saturday;
    protected QqcOperationHours holiday;

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setSunday(QqcOperationHours value) {
        this.sunday = value;
    }

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setMonday(QqcOperationHours value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setTuesday(QqcOperationHours value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setWednesday(QqcOperationHours value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setThursday(QqcOperationHours value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setFriday(QqcOperationHours value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setSaturday(QqcOperationHours value) {
        this.saturday = value;
    }

    /**
     * Gets the value of the holiday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getHoliday() {
        return holiday;
    }

    /**
     * Sets the value of the holiday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setHoliday(QqcOperationHours value) {
        this.holiday = value;
    }

}
