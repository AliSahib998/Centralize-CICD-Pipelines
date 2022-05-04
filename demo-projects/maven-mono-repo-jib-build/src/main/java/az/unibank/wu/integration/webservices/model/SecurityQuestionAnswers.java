
package az.unibank.wu.integration.webservices.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_question_answers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security_question_answers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question_answer" type="{http://www.westernunion.com/schema/xrsi}security_question_answer" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_question_answers", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "questionAnswer"
})
public class SecurityQuestionAnswers {

    @XmlElement(name = "question_answer")
    protected List<SecurityQuestionAnswer> questionAnswer;

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityQuestionAnswer }
     * 
     * 
     */
    public List<SecurityQuestionAnswer> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<SecurityQuestionAnswer>();
        }
        return this.questionAnswer;
    }

}
