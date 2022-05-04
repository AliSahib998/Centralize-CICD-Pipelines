
package az.unibank.wu.integration.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for error-reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="error-reply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="galactic_id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="account_nbr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mywu_number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="compliance_details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="second_id_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prmt_proof_of_addr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temp_proof_of_addr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="emp_status_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="purpose_of_txn_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source_of_fund_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="relationship_to_sndr_rcvr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mtcn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mtcn_digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document_digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profile_digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error-reply", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "terminal",
    "error",
    "externalReferenceNumber",
    "partnerID",
    "galacticId",
    "accountNbr",
    "mywuNumber",
    "complianceDetails",
    "mtcn",
    "mtcnDigest",
    "documentDigest",
    "profileDigest"
})
public class ErrorReply {

    protected ErrorReply.Terminal terminal;
    @XmlElement(required = true)
    protected String error;
    @XmlElement(name = "ExternalReferenceNumber")
    protected BigInteger externalReferenceNumber;
    @XmlElement(name = "PartnerID")
    protected String partnerID;
    @XmlElement(name = "galactic_id")
    protected String galacticId;
    @XmlElement(name = "account_nbr")
    protected String accountNbr;
    @XmlElement(name = "mywu_number")
    protected String mywuNumber;
    @XmlElement(name = "compliance_details")
    protected ErrorReply.ComplianceDetails complianceDetails;
    protected String mtcn;
    @XmlElement(name = "mtcn_digest")
    protected String mtcnDigest;
    @XmlElement(name = "document_digest")
    protected String documentDigest;
    @XmlElement(name = "profile_digest")
    protected String profileDigest;

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorReply.Terminal }
     *     
     */
    public ErrorReply.Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorReply.Terminal }
     *     
     */
    public void setTerminal(ErrorReply.Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the externalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    /**
     * Sets the value of the externalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalReferenceNumber(BigInteger value) {
        this.externalReferenceNumber = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the galacticId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalacticId() {
        return galacticId;
    }

    /**
     * Sets the value of the galacticId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalacticId(String value) {
        this.galacticId = value;
    }

    /**
     * Gets the value of the accountNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNbr() {
        return accountNbr;
    }

    /**
     * Sets the value of the accountNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNbr(String value) {
        this.accountNbr = value;
    }

    /**
     * Gets the value of the mywuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMywuNumber() {
        return mywuNumber;
    }

    /**
     * Sets the value of the mywuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMywuNumber(String value) {
        this.mywuNumber = value;
    }

    /**
     * Gets the value of the complianceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorReply.ComplianceDetails }
     *     
     */
    public ErrorReply.ComplianceDetails getComplianceDetails() {
        return complianceDetails;
    }

    /**
     * Sets the value of the complianceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorReply.ComplianceDetails }
     *     
     */
    public void setComplianceDetails(ErrorReply.ComplianceDetails value) {
        this.complianceDetails = value;
    }

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
    }

    /**
     * Gets the value of the mtcnDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcnDigest() {
        return mtcnDigest;
    }

    /**
     * Sets the value of the mtcnDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcnDigest(String value) {
        this.mtcnDigest = value;
    }

    /**
     * Gets the value of the documentDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDigest() {
        return documentDigest;
    }

    /**
     * Sets the value of the documentDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDigest(String value) {
        this.documentDigest = value;
    }

    /**
     * Gets the value of the profileDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileDigest() {
        return profileDigest;
    }

    /**
     * Sets the value of the profileDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileDigest(String value) {
        this.profileDigest = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="second_id_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prmt_proof_of_addr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temp_proof_of_addr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="emp_status_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="purpose_of_txn_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source_of_fund_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="relationship_to_sndr_rcvr_doc_control_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idDocControlNumber",
        "secondIdDocControlNumber",
        "prmtProofOfAddrDocControlNumber",
        "tempProofOfAddrDocControlNumber",
        "empStatusDocControlNumber",
        "purposeOfTxnDocControlNumber",
        "sourceOfFundDocControlNumber",
        "relationshipToSndrRcvrDocControlNumber"
    })
    public static class ComplianceDetails {

        @XmlElement(name = "id_doc_control_number")
        protected String idDocControlNumber;
        @XmlElement(name = "second_id_doc_control_number")
        protected String secondIdDocControlNumber;
        @XmlElement(name = "prmt_proof_of_addr_doc_control_number")
        protected String prmtProofOfAddrDocControlNumber;
        @XmlElement(name = "temp_proof_of_addr_doc_control_number")
        protected String tempProofOfAddrDocControlNumber;
        @XmlElement(name = "emp_status_doc_control_number")
        protected String empStatusDocControlNumber;
        @XmlElement(name = "purpose_of_txn_doc_control_number")
        protected String purposeOfTxnDocControlNumber;
        @XmlElement(name = "source_of_fund_doc_control_number")
        protected String sourceOfFundDocControlNumber;
        @XmlElement(name = "relationship_to_sndr_rcvr_doc_control_number")
        protected String relationshipToSndrRcvrDocControlNumber;

        /**
         * Gets the value of the idDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdDocControlNumber() {
            return idDocControlNumber;
        }

        /**
         * Sets the value of the idDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdDocControlNumber(String value) {
            this.idDocControlNumber = value;
        }

        /**
         * Gets the value of the secondIdDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondIdDocControlNumber() {
            return secondIdDocControlNumber;
        }

        /**
         * Sets the value of the secondIdDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondIdDocControlNumber(String value) {
            this.secondIdDocControlNumber = value;
        }

        /**
         * Gets the value of the prmtProofOfAddrDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrmtProofOfAddrDocControlNumber() {
            return prmtProofOfAddrDocControlNumber;
        }

        /**
         * Sets the value of the prmtProofOfAddrDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrmtProofOfAddrDocControlNumber(String value) {
            this.prmtProofOfAddrDocControlNumber = value;
        }

        /**
         * Gets the value of the tempProofOfAddrDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempProofOfAddrDocControlNumber() {
            return tempProofOfAddrDocControlNumber;
        }

        /**
         * Sets the value of the tempProofOfAddrDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempProofOfAddrDocControlNumber(String value) {
            this.tempProofOfAddrDocControlNumber = value;
        }

        /**
         * Gets the value of the empStatusDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmpStatusDocControlNumber() {
            return empStatusDocControlNumber;
        }

        /**
         * Sets the value of the empStatusDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmpStatusDocControlNumber(String value) {
            this.empStatusDocControlNumber = value;
        }

        /**
         * Gets the value of the purposeOfTxnDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurposeOfTxnDocControlNumber() {
            return purposeOfTxnDocControlNumber;
        }

        /**
         * Sets the value of the purposeOfTxnDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurposeOfTxnDocControlNumber(String value) {
            this.purposeOfTxnDocControlNumber = value;
        }

        /**
         * Gets the value of the sourceOfFundDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceOfFundDocControlNumber() {
            return sourceOfFundDocControlNumber;
        }

        /**
         * Sets the value of the sourceOfFundDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceOfFundDocControlNumber(String value) {
            this.sourceOfFundDocControlNumber = value;
        }

        /**
         * Gets the value of the relationshipToSndrRcvrDocControlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationshipToSndrRcvrDocControlNumber() {
            return relationshipToSndrRcvrDocControlNumber;
        }

        /**
         * Sets the value of the relationshipToSndrRcvrDocControlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelationshipToSndrRcvrDocControlNumber(String value) {
            this.relationshipToSndrRcvrDocControlNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class Terminal {

        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
