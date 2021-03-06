
package az.unibank.wu.integration.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compliance_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compliance_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="template_id" type="{http://www.westernunion.com/schema/xrsi}id" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.westernunion.com/schema/xrsi}version" minOccurs="0"/>
 *         &lt;element name="id_details" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         &lt;element name="second_id" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         &lt;element name="third_id" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         &lt;element name="third_party_details" type="{http://www.westernunion.com/schema/xrsi}third_party_details" minOccurs="0"/>
 *         &lt;element name="third_id_number" type="{http://www.westernunion.com/schema/xrsi}id_number" minOccurs="0"/>
 *         &lt;element name="compliance_flags_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_flags_buffer" minOccurs="0"/>
 *         &lt;element name="compliance_data_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *         &lt;element name="id_issue_date" type="{http://www.westernunion.com/schema/xrsi}id_issue_date" minOccurs="0"/>
 *         &lt;element name="id_expiration_date" type="{http://www.westernunion.com/schema/xrsi}id_expiration_date" minOccurs="0"/>
 *         &lt;element name="date_of_birth" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.westernunion.com/schema/xrsi}occupation" minOccurs="0"/>
 *         &lt;element name="compliance_comments" type="{http://www.westernunion.com/schema/xrsi}compliance_comments" minOccurs="0"/>
 *         &lt;element name="country_of_residence" type="{http://www.westernunion.com/schema/xrsi}country_of_residence" minOccurs="0"/>
 *         &lt;element name="transaction_reason" type="{http://www.westernunion.com/schema/xrsi}transaction_reason" minOccurs="0"/>
 *         &lt;element name="Is_a_citizen" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Is_a_Nordic_citizen" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Current_address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="contact_phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         &lt;element name="Country_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Country_of_Birth" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.westernunion.com/schema/xrsi}nationality" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         &lt;element name="Customer_type_Alpha_code" type="{http://www.westernunion.com/schema/xrsi}Customer_type_Alpha_code" minOccurs="0"/>
 *         &lt;element name="Customer_type_Numeric_code" type="{http://www.westernunion.com/schema/xrsi}Customer_type_Numeric_code" minOccurs="0"/>
 *         &lt;element name="Is_a_resident" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.westernunion.com/schema/xrsi}Location" minOccurs="0"/>
 *         &lt;element name="Valuta_code" type="{http://www.westernunion.com/schema/xrsi}Valuta_code" minOccurs="0"/>
 *         &lt;element name="Valuta_Amount" type="{http://www.westernunion.com/schema/xrsi}Valuta_Amount" minOccurs="0"/>
 *         &lt;element name="Source_of_Funds" type="{http://www.westernunion.com/schema/xrsi}Source_of_Funds" minOccurs="0"/>
 *         &lt;element name="Send_Money_Form_Serial_Number" type="{http://www.westernunion.com/schema/xrsi}Send_Money_Form_Serial_Number" minOccurs="0"/>
 *         &lt;element name="address_validation" type="{http://www.westernunion.com/schema/xrsi}compl_addr_validation" minOccurs="0"/>
 *         &lt;element name="ID_Description_code" type="{http://www.westernunion.com/schema/xrsi}ID_Description_code" minOccurs="0"/>
 *         &lt;element name="Identity_type" type="{http://www.westernunion.com/schema/xrsi}Identity_type" minOccurs="0"/>
 *         &lt;element name="Fathers_Name" type="{http://www.westernunion.com/schema/xrsi}Fathers_Name" minOccurs="0"/>
 *         &lt;element name="Member_or_Associate_to_Government" type="{http://www.westernunion.com/schema/xrsi}Member_or_Associate_to_Government" minOccurs="0"/>
 *         &lt;element name="Money_Transfer_Category" type="{http://www.westernunion.com/schema/xrsi}Money_Transfer_Category" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.westernunion.com/schema/xrsi}Other" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.westernunion.com/schema/xrsi}Province" minOccurs="0"/>
 *         &lt;element name="fiscal_code" type="{http://www.westernunion.com/schema/xrsi}fiscal_code" minOccurs="0"/>
 *         &lt;element name="Permanent_address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="Name_of_Employer_Business" type="{http://www.westernunion.com/schema/xrsi}Name_of_Employer_Business" minOccurs="0"/>
 *         &lt;element name="Nature_of_Work_Business" type="{http://www.westernunion.com/schema/xrsi}Nature_of_Work_Business" minOccurs="0"/>
 *         &lt;element name="Is_txn_Individual_or_Organization" type="{http://www.westernunion.com/schema/xrsi}indv_org_flag" minOccurs="0"/>
 *         &lt;element name="Relationship_to_Receiver_Sender" type="{http://www.westernunion.com/schema/xrsi}Relationship_to_Receiver_Sender" minOccurs="0"/>
 *         &lt;element name="Is_this_for_Commercial_Purposes" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="RFC" type="{http://www.westernunion.com/schema/xrsi}RFC" minOccurs="0"/>
 *         &lt;element name="CURP" type="{http://www.westernunion.com/schema/xrsi}CURP" minOccurs="0"/>
 *         &lt;element name="Does_the_ID_have_an_expiration_date" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Is_remittance_a_trade_related_transaction" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Does_receiver_have_a_phone_number" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Does_the_sender_have_ID" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Address_verification_document_type" type="{http://www.westernunion.com/schema/xrsi}Address_verification_document_type" minOccurs="0"/>
 *         &lt;element name="Address_verification_document_number" type="{http://www.westernunion.com/schema/xrsi}Address_verification_document_number" minOccurs="0"/>
 *         &lt;element name="City_of_Birth" type="{http://www.westernunion.com/schema/xrsi}City_of_Birth" minOccurs="0"/>
 *         &lt;element name="Personal_Identification_Number" type="{http://www.westernunion.com/schema/xrsi}Personal_Identification_Number" minOccurs="0"/>
 *         &lt;element name="Tax_payers_registration_number" type="{http://www.westernunion.com/schema/xrsi}Tax_payers_registration_number" minOccurs="0"/>
 *         &lt;element name="I_act_on_My_Behalf" type="{http://www.westernunion.com/schema/xrsi}I_act_on_My_Behalf" minOccurs="0"/>
 *         &lt;element name="Classifier_of_the_Purpose_of_MT_number" type="{http://www.westernunion.com/schema/xrsi}Classifier_of_the_Purpose_of_MT_number" minOccurs="0"/>
 *         &lt;element name="User_Equipment_ID_Type" type="{http://www.westernunion.com/schema/xrsi}User_Equipment_ID_Type" minOccurs="0"/>
 *         &lt;element name="User_Equipment_ID_Data" type="{http://www.westernunion.com/schema/xrsi}User_Equipment_ID_Data" minOccurs="0"/>
 *         &lt;element name="EAS_Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}EAS_Consumer_ID_Key" minOccurs="0"/>
 *         &lt;element name="Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}Consumer_ID_Key" minOccurs="0"/>
 *         &lt;element name="White_List_Key" type="{http://www.westernunion.com/schema/xrsi}White_List_Key" minOccurs="0"/>
 *         &lt;element name="ack_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="Reason_For_Alternate_Id" type="{http://www.westernunion.com/schema/xrsi}Reason_For_Alternate_Id" minOccurs="0"/>
 *         &lt;element name="Address_Verification_Document_Issue_Date" type="{http://www.westernunion.com/schema/xrsi}Address_Verification_Document_Issue_Date" minOccurs="0"/>
 *         &lt;element name="International_Bank_Account_Number" type="{http://www.westernunion.com/schema/xrsi}International_Bank_Account_Number" minOccurs="0"/>
 *         &lt;element name="Routing_code" type="{http://www.westernunion.com/schema/xrsi}Routing_code" minOccurs="0"/>
 *         &lt;element name="Residence_Permit_Type" type="{http://www.westernunion.com/schema/xrsi}Residence_Permit_Type" minOccurs="0"/>
 *         &lt;element name="Residence_Permit_Series_And_Number" type="{http://www.westernunion.com/schema/xrsi}Residence_Permit_Series_And_Number" minOccurs="0"/>
 *         &lt;element name="Residence_Permit_Issue_Date" type="{http://www.westernunion.com/schema/xrsi}Residence_Permit_Issue_Date" minOccurs="0"/>
 *         &lt;element name="Residence_Permit_Expiration_Date" type="{http://www.westernunion.com/schema/xrsi}Residence_Permit_Expiration_Date" minOccurs="0"/>
 *         &lt;element name="Migration_Card_Number" type="{http://www.westernunion.com/schema/xrsi}Migration_Card_Number" minOccurs="0"/>
 *         &lt;element name="Migration_Card_Issue_Date" type="{http://www.westernunion.com/schema/xrsi}Migration_Card_Issue_Date" minOccurs="0"/>
 *         &lt;element name="Migration_Card_Expiration_Date" type="{http://www.westernunion.com/schema/xrsi}Migration_Card_Expiration_Date" minOccurs="0"/>
 *         &lt;element name="Funds_Sender_Code" type="{http://www.westernunion.com/schema/xrsi}Funds_Sender_Code" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Code" type="{http://www.westernunion.com/schema/xrsi}Beneficiary_Code" minOccurs="0"/>
 *         &lt;element name="GEN_III_Indicator" type="{http://www.westernunion.com/schema/xrsi}GEN_III_Indicator" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Profession" type="{http://www.westernunion.com/schema/xrsi}Beneficiary_Profession" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Nationality" type="{http://www.westernunion.com/schema/xrsi}Beneficiary_Nationality" minOccurs="0"/>
 *         &lt;element name="Other_Occupation" type="{http://www.westernunion.com/schema/xrsi}other_Occupation" minOccurs="0"/>
 *         &lt;element name="Was_A_Proof_Of_EU_Citizenship_Provided" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Was_A_Resident_Permit_Provided" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="STD_Phone_Number_Code" type="{http://www.westernunion.com/schema/xrsi}STD_Phone_Number_Code" minOccurs="0"/>
 *         &lt;element name="mobile_country_code" type="{http://www.westernunion.com/schema/xrsi}mobile_country_code" minOccurs="0"/>
 *         &lt;element name="Mobile_Phone_Number" type="{http://www.westernunion.com/schema/xrsi}Mobile_Phone_Number" minOccurs="0"/>
 *         &lt;element name="Marital_Status" type="{http://www.westernunion.com/schema/xrsi}Marital_Status" minOccurs="0"/>
 *         &lt;element name="Country_Code" type="{http://www.westernunion.com/schema/xrsi}Country_Code" minOccurs="0"/>
 *         &lt;element name="Other_Purpose_of_Transaction" type="{http://www.westernunion.com/schema/xrsi}Other_Purpose_of_Transaction" minOccurs="0"/>
 *         &lt;element name="WU_COM_Electronic_Validation" type="{http://www.westernunion.com/schema/xrsi}WU_COM_Electronic_Validation" minOccurs="0"/>
 *         &lt;element name="Other_Party_SorR_Address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="Other_Relationship_to_Receiver_Sender" type="{http://www.westernunion.com/schema/xrsi}Other_Relationship_to_Receiver_Sender" minOccurs="0"/>
 *         &lt;element name="citizenship_type" type="{http://www.westernunion.com/schema/xrsi}citizenship_type" minOccurs="0"/>
 *         &lt;element name="third_id_type_or_proof_of_address_document_type" type="{http://www.westernunion.com/schema/xrsi}third_id_type_or_proof_of_address_document_type" minOccurs="0"/>
 *         &lt;element name="non_gregorian_date_of_birth" type="{http://www.westernunion.com/schema/xrsi}date_type" minOccurs="0"/>
 *         &lt;element name="non_gregorian_first_id_expiration_date" type="{http://www.westernunion.com/schema/xrsi}date_type" minOccurs="0"/>
 *         &lt;element name="third_id_issuer" type="{http://www.westernunion.com/schema/xrsi}third_id_issuer" minOccurs="0"/>
 *         &lt;element name="second_id_issue_date" type="{http://www.westernunion.com/schema/xrsi}date_type" minOccurs="0"/>
 *         &lt;element name="second_id_expiration_date" type="{http://www.westernunion.com/schema/xrsi}date_type" minOccurs="0"/>
 *         &lt;element name="maiden_name" type="{http://www.westernunion.com/schema/xrsi}maiden_name" minOccurs="0"/>
 *         &lt;element name="other_source_of_funds" type="{http://www.westernunion.com/schema/xrsi}other_source_of_funds" minOccurs="0"/>
 *         &lt;element name="address_verification_issuer" type="{http://www.westernunion.com/schema/xrsi}address_verification_issuer" minOccurs="0"/>
 *         &lt;element name="state_of_birth" type="{http://www.westernunion.com/schema/xrsi}state_of_birth" minOccurs="0"/>
 *         &lt;element name="place_of_birth" type="{http://www.westernunion.com/schema/xrsi}state_of_birth" minOccurs="0"/>
 *         &lt;element name="place_or_state_or_province_of_birth" type="{http://www.westernunion.com/schema/xrsi}place_or_state_or_province_of_birth" minOccurs="0"/>
 *         &lt;element name="is_fiscal_code_available" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="is_there_a_benificial_owner" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="are_you_a_politically_exposed_person" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="customer_identification_number" type="{http://www.westernunion.com/schema/xrsi}customer_identification_number" minOccurs="0"/>
 *         &lt;element name="employee_id" type="{http://www.westernunion.com/schema/xrsi}employee_id" minOccurs="0"/>
 *         &lt;element name="is_copy_of_customer_id_obtained" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="receiver_id_details" type="{http://www.westernunion.com/schema/xrsi}receiver_id_details" minOccurs="0"/>
 *         &lt;element name="other_title_nature_of_work_business" type="{http://www.westernunion.com/schema/xrsi}other_nature_of_work_Business" minOccurs="0"/>
 *         &lt;element name="employer_address1" type="{http://www.westernunion.com/schema/xrsi}address_line_short" minOccurs="0"/>
 *         &lt;element name="employer_address2" type="{http://www.westernunion.com/schema/xrsi}address_line_short" minOccurs="0"/>
 *         &lt;element name="qc_payout_indicator" type="{http://www.westernunion.com/schema/xrsi}operation" minOccurs="0"/>
 *         &lt;element name="special_authorization_number" type="{http://www.westernunion.com/schema/xrsi}special_authorization_number" minOccurs="0"/>
 *         &lt;element name="is_addr_diff" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="person_or_entity" type="{http://www.westernunion.com/schema/xrsi}person_entity" minOccurs="0"/>
 *         &lt;element name="category_code" type="{http://www.westernunion.com/schema/xrsi}category_code" minOccurs="0"/>
 *         &lt;element name="permit_approval_type" type="{http://www.westernunion.com/schema/xrsi}permit_approval_type_number" minOccurs="0"/>
 *         &lt;element name="permit_approval_number" type="{http://www.westernunion.com/schema/xrsi}permit_approval_type_number" minOccurs="0"/>
 *         &lt;element name="business_phone_no" type="{http://www.westernunion.com/schema/xrsi}business_phone_no" minOccurs="0"/>
 *         &lt;element name="are_you_a_PEP_relative_or_friend" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="annual_income" type="{http://www.westernunion.com/schema/xrsi}annual_income" minOccurs="0"/>
 *         &lt;element name="employer_status" type="{http://www.westernunion.com/schema/xrsi}employer_status" minOccurs="0"/>
 *         &lt;element name="is_transfer_noncommercial_and_personal" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="id_image_status" type="{http://www.westernunion.com/schema/xrsi}id_image_status" minOccurs="0"/>
 *         &lt;element name="id_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}id_doc_control_number" minOccurs="0"/>
 *         &lt;element name="fla_signature_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}signature_ref_number" minOccurs="0"/>
 *         &lt;element name="customer_consent_signature_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}signature_ref_number" minOccurs="0"/>
 *         &lt;element name="customer_signature_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}signature_ref_number" minOccurs="0"/>
 *         &lt;element name="temporary_address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="does_the_ID_have_an_issue_date" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="cust_relationship_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="second_id_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}second_id_doc_control_number" minOccurs="0"/>
 *         &lt;element name="prmt_proof_of_addr_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}prmt_proof_of_addr_doc_control_number" minOccurs="0"/>
 *         &lt;element name="temp_proof_of_addr_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}temp_proof_of_addr_doc_control_number" minOccurs="0"/>
 *         &lt;element name="emp_status_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}emp_status_doc_control_number" minOccurs="0"/>
 *         &lt;element name="purpose_of_txn_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}purpose_of_txn_doc_control_number" minOccurs="0"/>
 *         &lt;element name="source_of_fund_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}source_of_fund_doc_control_number" minOccurs="0"/>
 *         &lt;element name="relationship_to_sndr_rcvr_doc_control_number" type="{http://www.westernunion.com/schema/xrsi}relationship_to_sndr_rcvr_doc_control_number" minOccurs="0"/>
 *         &lt;element name="galactic_id" type="{http://www.westernunion.com/schema/xrsi}galactic_id" minOccurs="0"/>
 *         &lt;element name="multi_error_supported" type="{http://www.westernunion.com/schema/xrsi}multi_error_supported" minOccurs="0"/>
 *         &lt;element name="funds_source_documented" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="biometric_txn_ref_no" type="{http://www.westernunion.com/schema/xrsi}biometric_txn_ref_no" minOccurs="0"/>
 *         &lt;element name="biometric_ack_status" type="{http://www.westernunion.com/schema/xrsi}biometric_ack_status" minOccurs="0"/>
 *         &lt;element name="compliance_validation_flag" type="{http://www.westernunion.com/schema/xrsi}compliance_validation_flag" minOccurs="0"/>
 *         &lt;element name="is_current_and_permanent_addr_same" type="{http://www.westernunion.com/schema/xrsi}is_current_and_permanent_addr_same" minOccurs="0"/>
 *         &lt;element name="spouse_name" type="{http://www.westernunion.com/schema/xrsi}spouse_name" minOccurs="0"/>
 *         &lt;element name="spouse_date_of_birth" type="{http://www.westernunion.com/schema/xrsi}Date_of_Birth" minOccurs="0"/>
 *         &lt;element name="employer_email_address" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *         &lt;element name="business_phone_country_code" type="{http://www.westernunion.com/schema/xrsi}country_phone_code" minOccurs="0"/>
 *         &lt;element name="bank_approval_ack_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="bank_approval_doc_number" type="{http://www.westernunion.com/schema/xrsi}bank_approval_doc_number" minOccurs="0"/>
 *         &lt;element name="bank_approval_issue_date" type="{http://www.westernunion.com/schema/xrsi}id_issue_date" minOccurs="0"/>
 *         &lt;element name="employment_position_level" type="{http://www.westernunion.com/schema/xrsi}employment_position_level" minOccurs="0"/>
 *         &lt;element name="Confirmation_of_Employment" type="{http://www.westernunion.com/schema/xrsi}Confirmation_of_Employment" minOccurs="0"/>
 *         &lt;element name="Reference_Document_Id_Type" type="{http://www.westernunion.com/schema/xrsi}Reference_Document_Id_Type" minOccurs="0"/>
 *         &lt;element name="Reference_Document_Id_Number" type="{http://www.westernunion.com/schema/xrsi}Reference_Document_Id_Number" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         &lt;element name="PEP_Category" type="{http://www.westernunion.com/schema/xrsi}PEP_Category" minOccurs="0"/>
 *         &lt;element name="Mother_Maiden_Name" type="{http://www.westernunion.com/schema/xrsi}mothers_name" minOccurs="0"/>
 *         &lt;element name="FirstName_Upon_Birth" type="{http://www.westernunion.com/schema/xrsi}FirstName_Upon_Birth" minOccurs="0"/>
 *         &lt;element name="Monthly_Income" type="{http://www.westernunion.com/schema/xrsi}Monthly_Income" minOccurs="0"/>
 *         &lt;element name="Monthly_Expenses" type="{http://www.westernunion.com/schema/xrsi}Monthly_Expenses" minOccurs="0"/>
 *         &lt;element name="Total_Assets" type="{http://www.westernunion.com/schema/xrsi}Total_Assets" minOccurs="0"/>
 *         &lt;element name="Total_liabilities" type="{http://www.westernunion.com/schema/xrsi}Total_liabilities" minOccurs="0"/>
 *         &lt;element name="Description_of_Additional_Income" type="{http://www.westernunion.com/schema/xrsi}Description_of_Additional_Income" minOccurs="0"/>
 *         &lt;element name="Employer_Address_Country" type="{http://www.westernunion.com/schema/xrsi}Employer_Address_Country" minOccurs="0"/>
 *         &lt;element name="Employer_Address_City" type="{http://www.westernunion.com/schema/xrsi}Employer_Address_City" minOccurs="0"/>
 *         &lt;element name="Legal_Entity_or_Business_Documents" type="{http://www.westernunion.com/schema/xrsi}Legal_Entity_or_Business_Documents" minOccurs="0"/>
 *         &lt;element name="Digital_Payment_Verfication" type="{http://www.westernunion.com/schema/xrsi}Digital_Payment_Verfication" minOccurs="0"/>
 *         &lt;element name="Evidence_of_Relationship_or_Beneficial" type="{http://www.westernunion.com/schema/xrsi}Evidence_of_Relationship_or_Beneficial" minOccurs="0"/>
 *         &lt;element name="Affidavit_Flag" type="{http://www.westernunion.com/schema/xrsi}Flag" minOccurs="0"/>
 *         &lt;element name="Employer_Address_Postal_Code" type="{http://www.westernunion.com/schema/xrsi}Employer_Address_Postal_Code" minOccurs="0"/>
 *         &lt;element name="Employer_Address_State" type="{http://www.westernunion.com/schema/xrsi}Employer_Address_State" minOccurs="0"/>
 *         &lt;element name="Customer_Opting_ID_Image" type="{http://www.westernunion.com/schema/xrsi}Flag" minOccurs="0"/>
 *         &lt;element name="Reference_Document_Id_Issue_Country" type="{http://www.westernunion.com/schema/xrsi}Reference_Document_Id_Issue_Country" minOccurs="0"/>
 *         &lt;element name="Reference_Document_Issue_Date" type="{http://www.westernunion.com/schema/xrsi}Reference_Document_Issue_Date" minOccurs="0"/>
 *         &lt;element name="Second_Nationality" type="{http://www.westernunion.com/schema/xrsi}Second_Nationality" minOccurs="0"/>
 *         &lt;element name="Does_Consumer_Have_Second_Nationality" type="{http://www.westernunion.com/schema/xrsi}Flag" minOccurs="0"/>
 *         &lt;element name="Evidence_of_Source_of_Funds" type="{http://www.westernunion.com/schema/xrsi}Evidence_of_Source_of_Funds" minOccurs="0"/>
 *         &lt;element name="Start_Date_At_Current_Place_Of_Employment" type="{http://www.westernunion.com/schema/xrsi}id_issue_date" minOccurs="0"/>
 *         &lt;element name="Second_ID_Acknowledgment_Field" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="Agent_Verified_ID_Against_Government_Database" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="Does_Customer_Have_Email_Address" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="Mailing_Address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         &lt;element name="Is_Mailing_Addr_Diff_From_Resident_Addr" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         &lt;element name="Prior_Occupation" type="{http://www.westernunion.com/schema/xrsi}Prior_Occupation" minOccurs="0"/>
 *         &lt;element name="Alias_Name" type="{http://www.westernunion.com/schema/xrsi}Alias_Name" minOccurs="0"/>
 *         &lt;element name="Check_Number" type="{http://www.westernunion.com/schema/xrsi}Check_Number" minOccurs="0"/>
 *         &lt;element name="Does_Trans_Involve_Govt" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="POT_SupportDocs_Collected" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         &lt;element name="Adv_Elec_Sign_Sr_No" type="{http://www.westernunion.com/schema/xrsi}Adv_Elec_Sign_Sr_No" minOccurs="0"/>
 *         &lt;element name="Rcvr_Cntry_Of_Birth" type="{http://www.westernunion.com/schema/xrsi}Country_of_Birth" minOccurs="0"/>
 *         &lt;element name="Rcvr_DOB" type="{http://www.westernunion.com/schema/xrsi}Date_of_Birth" minOccurs="0"/>
 *         &lt;element name="universal_buffer" type="{http://www.westernunion.com/schema/xrsi}compliance_data_buffer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compliance_details", namespace = "http://www.westernunion.com/schema/xrsi", propOrder = {
    "templateId",
    "version",
    "idDetails",
    "secondId",
    "thirdId",
    "thirdPartyDetails",
    "thirdIdNumber",
    "complianceFlagsBuffer",
    "complianceDataBuffer",
    "idIssueDate",
    "idExpirationDate",
    "dateOfBirth",
    "occupation",
    "complianceComments",
    "countryOfResidence",
    "transactionReason",
    "isACitizen",
    "isANordicCitizen",
    "currentAddress",
    "contactPhone",
    "countryOfBirth",
    "nationality",
    "gender",
    "customerTypeAlphaCode",
    "customerTypeNumericCode",
    "isAResident",
    "location",
    "valutaCode",
    "valutaAmount",
    "sourceOfFunds",
    "sendMoneyFormSerialNumber",
    "addressValidation",
    "idDescriptionCode",
    "identityType",
    "fathersName",
    "memberOrAssociateToGovernment",
    "moneyTransferCategory",
    "other",
    "province",
    "fiscalCode",
    "permanentAddress",
    "nameOfEmployerBusiness",
    "natureOfWorkBusiness",
    "isTxnIndividualOrOrganization",
    "relationshipToReceiverSender",
    "isThisForCommercialPurposes",
    "rfc",
    "curp",
    "doesTheIDHaveAnExpirationDate",
    "isRemittanceATradeRelatedTransaction",
    "doesReceiverHaveAPhoneNumber",
    "doesTheSenderHaveID",
    "addressVerificationDocumentType",
    "addressVerificationDocumentNumber",
    "cityOfBirth",
    "personalIdentificationNumber",
    "taxPayersRegistrationNumber",
    "iActOnMyBehalf",
    "classifierOfThePurposeOfMTNumber",
    "userEquipmentIDType",
    "userEquipmentIDData",
    "easConsumerIDKey",
    "consumerIDKey",
    "whiteListKey",
    "ackFlag",
    "reasonForAlternateId",
    "addressVerificationDocumentIssueDate",
    "internationalBankAccountNumber",
    "routingCode",
    "residencePermitType",
    "residencePermitSeriesAndNumber",
    "residencePermitIssueDate",
    "residencePermitExpirationDate",
    "migrationCardNumber",
    "migrationCardIssueDate",
    "migrationCardExpirationDate",
    "fundsSenderCode",
    "beneficiaryCode",
    "geniiiIndicator",
    "beneficiaryProfession",
    "beneficiaryNationality",
    "otherOccupation",
    "wasAProofOfEUCitizenshipProvided",
    "wasAResidentPermitProvided",
    "stdPhoneNumberCode",
    "mobileCountryCode",
    "mobilePhoneNumber",
    "maritalStatus",
    "countryCode",
    "otherPurposeOfTransaction",
    "wucomElectronicValidation",
    "otherPartySorRAddress",
    "otherRelationshipToReceiverSender",
    "citizenshipType",
    "thirdIdTypeOrProofOfAddressDocumentType",
    "nonGregorianDateOfBirth",
    "nonGregorianFirstIdExpirationDate",
    "thirdIdIssuer",
    "secondIdIssueDate",
    "secondIdExpirationDate",
    "maidenName",
    "otherSourceOfFunds",
    "addressVerificationIssuer",
    "stateOfBirth",
    "placeOfBirth",
    "placeOrStateOrProvinceOfBirth",
    "isFiscalCodeAvailable",
    "isThereABenificialOwner",
    "areYouAPoliticallyExposedPerson",
    "customerIdentificationNumber",
    "employeeId",
    "isCopyOfCustomerIdObtained",
    "receiverIdDetails",
    "otherTitleNatureOfWorkBusiness",
    "employerAddress1",
    "employerAddress2",
    "qcPayoutIndicator",
    "specialAuthorizationNumber",
    "isAddrDiff",
    "personOrEntity",
    "categoryCode",
    "permitApprovalType",
    "permitApprovalNumber",
    "businessPhoneNo",
    "areYouAPEPRelativeOrFriend",
    "annualIncome",
    "employerStatus",
    "isTransferNoncommercialAndPersonal",
    "idImageStatus",
    "idDocControlNumber",
    "flaSignatureDocControlNumber",
    "customerConsentSignatureDocControlNumber",
    "customerSignatureDocControlNumber",
    "temporaryAddress",
    "doesTheIDHaveAnIssueDate",
    "custRelationshipFlag",
    "secondIdDocControlNumber",
    "prmtProofOfAddrDocControlNumber",
    "tempProofOfAddrDocControlNumber",
    "empStatusDocControlNumber",
    "purposeOfTxnDocControlNumber",
    "sourceOfFundDocControlNumber",
    "relationshipToSndrRcvrDocControlNumber",
    "galacticId",
    "multiErrorSupported",
    "fundsSourceDocumented",
    "biometricTxnRefNo",
    "biometricAckStatus",
    "complianceValidationFlag",
    "isCurrentAndPermanentAddrSame",
    "spouseName",
    "spouseDateOfBirth",
    "employerEmailAddress",
    "businessPhoneCountryCode",
    "bankApprovalAckFlag",
    "bankApprovalDocNumber",
    "bankApprovalIssueDate",
    "employmentPositionLevel",
    "confirmationOfEmployment",
    "referenceDocumentIdType",
    "referenceDocumentIdNumber",
    "beneficiaryGender",
    "pepCategory",
    "motherMaidenName",
    "firstNameUponBirth",
    "monthlyIncome",
    "monthlyExpenses",
    "totalAssets",
    "totalLiabilities",
    "descriptionOfAdditionalIncome",
    "employerAddressCountry",
    "employerAddressCity",
    "legalEntityOrBusinessDocuments",
    "digitalPaymentVerfication",
    "evidenceOfRelationshipOrBeneficial",
    "affidavitFlag",
    "employerAddressPostalCode",
    "employerAddressState",
    "customerOptingIDImage",
    "referenceDocumentIdIssueCountry",
    "referenceDocumentIssueDate",
    "secondNationality",
    "doesConsumerHaveSecondNationality",
    "evidenceOfSourceOfFunds",
    "startDateAtCurrentPlaceOfEmployment",
    "secondIDAcknowledgmentField",
    "agentVerifiedIDAgainstGovernmentDatabase",
    "doesCustomerHaveEmailAddress",
    "mailingAddress",
    "isMailingAddrDiffFromResidentAddr",
    "priorOccupation",
    "aliasName",
    "checkNumber",
    "doesTransInvolveGovt",
    "potSupportDocsCollected",
    "advElecSignSrNo",
    "rcvrCntryOfBirth",
    "rcvrDOB",
    "universalBuffer"
})
public class ComplianceDetails {

    @XmlElement(name = "template_id")
    protected String templateId;
    protected String version;
    @XmlElement(name = "id_details")
    protected IdDetails idDetails;
    @XmlElement(name = "second_id")
    protected IdDetails secondId;
    @XmlElement(name = "third_id")
    protected IdDetails thirdId;
    @XmlElement(name = "third_party_details")
    protected ThirdPartyDetails thirdPartyDetails;
    @XmlElement(name = "third_id_number")
    protected String thirdIdNumber;
    @XmlElement(name = "compliance_flags_buffer")
    protected String complianceFlagsBuffer;
    @XmlElement(name = "compliance_data_buffer")
    protected String complianceDataBuffer;
    @XmlElement(name = "id_issue_date")
    protected String idIssueDate;
    @XmlElement(name = "id_expiration_date")
    protected String idExpirationDate;
    @XmlElement(name = "date_of_birth")
    protected String dateOfBirth;
    protected String occupation;
    @XmlElement(name = "compliance_comments")
    protected String complianceComments;
    @XmlElement(name = "country_of_residence")
    protected String countryOfResidence;
    @XmlElement(name = "transaction_reason")
    protected String transactionReason;
    @XmlElement(name = "Is_a_citizen")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isACitizen;
    @XmlElement(name = "Is_a_Nordic_citizen")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isANordicCitizen;
    @XmlElement(name = "Current_address")
    protected ComplianceAddress currentAddress;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "Country_of_Birth")
    protected String countryOfBirth;
    protected String nationality;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "Customer_type_Alpha_code")
    protected String customerTypeAlphaCode;
    @XmlElement(name = "Customer_type_Numeric_code")
    protected String customerTypeNumericCode;
    @XmlElement(name = "Is_a_resident")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isAResident;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Valuta_code")
    protected String valutaCode;
    @XmlElement(name = "Valuta_Amount")
    protected String valutaAmount;
    @XmlElement(name = "Source_of_Funds")
    protected String sourceOfFunds;
    @XmlElement(name = "Send_Money_Form_Serial_Number")
    protected String sendMoneyFormSerialNumber;
    @XmlElement(name = "address_validation")
    @XmlSchemaType(name = "string")
    protected ComplAddrValidation addressValidation;
    @XmlElement(name = "ID_Description_code")
    protected String idDescriptionCode;
    @XmlElement(name = "Identity_type")
    protected String identityType;
    @XmlElement(name = "Fathers_Name")
    protected String fathersName;
    @XmlElement(name = "Member_or_Associate_to_Government")
    protected String memberOrAssociateToGovernment;
    @XmlElement(name = "Money_Transfer_Category")
    protected String moneyTransferCategory;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "fiscal_code")
    protected String fiscalCode;
    @XmlElement(name = "Permanent_address")
    protected ComplianceAddress permanentAddress;
    @XmlElement(name = "Name_of_Employer_Business")
    protected String nameOfEmployerBusiness;
    @XmlElement(name = "Nature_of_Work_Business")
    protected String natureOfWorkBusiness;
    @XmlElement(name = "Is_txn_Individual_or_Organization")
    @XmlSchemaType(name = "string")
    protected IndvOrgFlag isTxnIndividualOrOrganization;
    @XmlElement(name = "Relationship_to_Receiver_Sender")
    protected String relationshipToReceiverSender;
    @XmlElement(name = "Is_this_for_Commercial_Purposes")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isThisForCommercialPurposes;
    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "CURP")
    protected String curp;
    @XmlElement(name = "Does_the_ID_have_an_expiration_date")
    @XmlSchemaType(name = "string")
    protected YesNoFlag doesTheIDHaveAnExpirationDate;
    @XmlElement(name = "Is_remittance_a_trade_related_transaction")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isRemittanceATradeRelatedTransaction;
    @XmlElement(name = "Does_receiver_have_a_phone_number")
    @XmlSchemaType(name = "string")
    protected YesNoFlag doesReceiverHaveAPhoneNumber;
    @XmlElement(name = "Does_the_sender_have_ID")
    @XmlSchemaType(name = "string")
    protected YesNoFlag doesTheSenderHaveID;
    @XmlElement(name = "Address_verification_document_type")
    protected String addressVerificationDocumentType;
    @XmlElement(name = "Address_verification_document_number")
    protected String addressVerificationDocumentNumber;
    @XmlElement(name = "City_of_Birth")
    protected String cityOfBirth;
    @XmlElement(name = "Personal_Identification_Number")
    protected String personalIdentificationNumber;
    @XmlElement(name = "Tax_payers_registration_number")
    protected String taxPayersRegistrationNumber;
    @XmlElement(name = "I_act_on_My_Behalf")
    protected String iActOnMyBehalf;
    @XmlElement(name = "Classifier_of_the_Purpose_of_MT_number")
    protected String classifierOfThePurposeOfMTNumber;
    @XmlElement(name = "User_Equipment_ID_Type")
    protected String userEquipmentIDType;
    @XmlElement(name = "User_Equipment_ID_Data")
    protected String userEquipmentIDData;
    @XmlElement(name = "EAS_Consumer_ID_Key")
    protected String easConsumerIDKey;
    @XmlElement(name = "Consumer_ID_Key")
    protected String consumerIDKey;
    @XmlElement(name = "White_List_Key")
    protected String whiteListKey;
    @XmlElement(name = "ack_flag")
    protected String ackFlag;
    @XmlElement(name = "Reason_For_Alternate_Id")
    protected String reasonForAlternateId;
    @XmlElement(name = "Address_Verification_Document_Issue_Date")
    protected String addressVerificationDocumentIssueDate;
    @XmlElement(name = "International_Bank_Account_Number")
    protected String internationalBankAccountNumber;
    @XmlElement(name = "Routing_code")
    protected String routingCode;
    @XmlElement(name = "Residence_Permit_Type")
    protected String residencePermitType;
    @XmlElement(name = "Residence_Permit_Series_And_Number")
    protected String residencePermitSeriesAndNumber;
    @XmlElement(name = "Residence_Permit_Issue_Date")
    protected String residencePermitIssueDate;
    @XmlElement(name = "Residence_Permit_Expiration_Date")
    protected String residencePermitExpirationDate;
    @XmlElement(name = "Migration_Card_Number")
    protected String migrationCardNumber;
    @XmlElement(name = "Migration_Card_Issue_Date")
    protected String migrationCardIssueDate;
    @XmlElement(name = "Migration_Card_Expiration_Date")
    protected String migrationCardExpirationDate;
    @XmlElement(name = "Funds_Sender_Code")
    protected String fundsSenderCode;
    @XmlElement(name = "Beneficiary_Code")
    protected String beneficiaryCode;
    @XmlElement(name = "GEN_III_Indicator")
    protected String geniiiIndicator;
    @XmlElement(name = "Beneficiary_Profession")
    protected String beneficiaryProfession;
    @XmlElement(name = "Beneficiary_Nationality")
    protected String beneficiaryNationality;
    @XmlElement(name = "Other_Occupation")
    protected String otherOccupation;
    @XmlElement(name = "Was_A_Proof_Of_EU_Citizenship_Provided")
    @XmlSchemaType(name = "string")
    protected YesNoFlag wasAProofOfEUCitizenshipProvided;
    @XmlElement(name = "Was_A_Resident_Permit_Provided")
    @XmlSchemaType(name = "string")
    protected YesNoFlag wasAResidentPermitProvided;
    @XmlElement(name = "STD_Phone_Number_Code")
    protected String stdPhoneNumberCode;
    @XmlElement(name = "mobile_country_code")
    protected String mobileCountryCode;
    @XmlElement(name = "Mobile_Phone_Number")
    protected String mobilePhoneNumber;
    @XmlElement(name = "Marital_Status")
    protected String maritalStatus;
    @XmlElement(name = "Country_Code")
    protected String countryCode;
    @XmlElement(name = "Other_Purpose_of_Transaction")
    protected String otherPurposeOfTransaction;
    @XmlElement(name = "WU_COM_Electronic_Validation")
    protected String wucomElectronicValidation;
    @XmlElement(name = "Other_Party_SorR_Address")
    protected ComplianceAddress otherPartySorRAddress;
    @XmlElement(name = "Other_Relationship_to_Receiver_Sender")
    @XmlSchemaType(name = "string")
    protected OtherRelationshipToReceiverSender otherRelationshipToReceiverSender;
    @XmlElement(name = "citizenship_type")
    protected String citizenshipType;
    @XmlElement(name = "third_id_type_or_proof_of_address_document_type")
    protected String thirdIdTypeOrProofOfAddressDocumentType;
    @XmlElement(name = "non_gregorian_date_of_birth")
    protected String nonGregorianDateOfBirth;
    @XmlElement(name = "non_gregorian_first_id_expiration_date")
    protected String nonGregorianFirstIdExpirationDate;
    @XmlElement(name = "third_id_issuer")
    protected String thirdIdIssuer;
    @XmlElement(name = "second_id_issue_date")
    protected String secondIdIssueDate;
    @XmlElement(name = "second_id_expiration_date")
    protected String secondIdExpirationDate;
    @XmlElement(name = "maiden_name")
    protected String maidenName;
    @XmlElement(name = "other_source_of_funds")
    protected String otherSourceOfFunds;
    @XmlElement(name = "address_verification_issuer")
    protected String addressVerificationIssuer;
    @XmlElement(name = "state_of_birth")
    protected String stateOfBirth;
    @XmlElement(name = "place_of_birth")
    protected String placeOfBirth;
    @XmlElement(name = "place_or_state_or_province_of_birth")
    protected String placeOrStateOrProvinceOfBirth;
    @XmlElement(name = "is_fiscal_code_available")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isFiscalCodeAvailable;
    @XmlElement(name = "is_there_a_benificial_owner")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isThereABenificialOwner;
    @XmlElement(name = "are_you_a_politically_exposed_person")
    @XmlSchemaType(name = "string")
    protected YesNoFlag areYouAPoliticallyExposedPerson;
    @XmlElement(name = "customer_identification_number")
    protected String customerIdentificationNumber;
    @XmlElement(name = "employee_id")
    protected String employeeId;
    @XmlElement(name = "is_copy_of_customer_id_obtained")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isCopyOfCustomerIdObtained;
    @XmlElement(name = "receiver_id_details")
    protected ReceiverIdDetails receiverIdDetails;
    @XmlElement(name = "other_title_nature_of_work_business")
    protected String otherTitleNatureOfWorkBusiness;
    @XmlElement(name = "employer_address1")
    protected String employerAddress1;
    @XmlElement(name = "employer_address2")
    protected String employerAddress2;
    @XmlElement(name = "qc_payout_indicator")
    protected String qcPayoutIndicator;
    @XmlElement(name = "special_authorization_number")
    protected String specialAuthorizationNumber;
    @XmlElement(name = "is_addr_diff")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isAddrDiff;
    @XmlElement(name = "person_or_entity")
    @XmlSchemaType(name = "string")
    protected PersonEntity personOrEntity;
    @XmlElement(name = "category_code")
    protected String categoryCode;
    @XmlElement(name = "permit_approval_type")
    protected String permitApprovalType;
    @XmlElement(name = "permit_approval_number")
    protected String permitApprovalNumber;
    @XmlElement(name = "business_phone_no")
    protected String businessPhoneNo;
    @XmlElement(name = "are_you_a_PEP_relative_or_friend")
    @XmlSchemaType(name = "string")
    protected YesNoFlag areYouAPEPRelativeOrFriend;
    @XmlElement(name = "annual_income")
    protected String annualIncome;
    @XmlElement(name = "employer_status")
    protected String employerStatus;
    @XmlElement(name = "is_transfer_noncommercial_and_personal")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isTransferNoncommercialAndPersonal;
    @XmlElement(name = "id_image_status")
    protected String idImageStatus;
    @XmlElement(name = "id_doc_control_number")
    protected String idDocControlNumber;
    @XmlElement(name = "fla_signature_doc_control_number")
    protected String flaSignatureDocControlNumber;
    @XmlElement(name = "customer_consent_signature_doc_control_number")
    protected String customerConsentSignatureDocControlNumber;
    @XmlElement(name = "customer_signature_doc_control_number")
    protected String customerSignatureDocControlNumber;
    @XmlElement(name = "temporary_address")
    protected ComplianceAddress temporaryAddress;
    @XmlElement(name = "does_the_ID_have_an_issue_date")
    @XmlSchemaType(name = "string")
    protected YesNoFlag doesTheIDHaveAnIssueDate;
    @XmlElement(name = "cust_relationship_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag custRelationshipFlag;
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
    @XmlElement(name = "galactic_id")
    protected String galacticId;
    @XmlElement(name = "multi_error_supported")
    @XmlSchemaType(name = "string")
    protected MultiErrorSupported multiErrorSupported;
    @XmlElement(name = "funds_source_documented")
    @XmlSchemaType(name = "string")
    protected YesNoFlag fundsSourceDocumented;
    @XmlElement(name = "biometric_txn_ref_no")
    protected String biometricTxnRefNo;
    @XmlElement(name = "biometric_ack_status")
    protected String biometricAckStatus;
    @XmlElement(name = "compliance_validation_flag")
    protected String complianceValidationFlag;
    @XmlElement(name = "is_current_and_permanent_addr_same")
    @XmlSchemaType(name = "string")
    protected IsCurrentAndPermanentAddrSame isCurrentAndPermanentAddrSame;
    @XmlElement(name = "spouse_name")
    protected String spouseName;
    @XmlElement(name = "spouse_date_of_birth")
    protected String spouseDateOfBirth;
    @XmlElement(name = "employer_email_address")
    protected String employerEmailAddress;
    @XmlElement(name = "business_phone_country_code")
    protected String businessPhoneCountryCode;
    @XmlElement(name = "bank_approval_ack_flag")
    protected String bankApprovalAckFlag;
    @XmlElement(name = "bank_approval_doc_number")
    protected String bankApprovalDocNumber;
    @XmlElement(name = "bank_approval_issue_date")
    protected String bankApprovalIssueDate;
    @XmlElement(name = "employment_position_level")
    protected String employmentPositionLevel;
    @XmlElement(name = "Confirmation_of_Employment")
    protected String confirmationOfEmployment;
    @XmlElement(name = "Reference_Document_Id_Type")
    protected String referenceDocumentIdType;
    @XmlElement(name = "Reference_Document_Id_Number")
    protected String referenceDocumentIdNumber;
    @XmlElement(name = "Beneficiary_Gender")
    @XmlSchemaType(name = "string")
    protected Gender beneficiaryGender;
    @XmlElement(name = "PEP_Category")
    protected String pepCategory;
    @XmlElement(name = "Mother_Maiden_Name")
    protected String motherMaidenName;
    @XmlElement(name = "FirstName_Upon_Birth")
    protected String firstNameUponBirth;
    @XmlElement(name = "Monthly_Income")
    protected String monthlyIncome;
    @XmlElement(name = "Monthly_Expenses")
    protected String monthlyExpenses;
    @XmlElement(name = "Total_Assets")
    protected String totalAssets;
    @XmlElement(name = "Total_liabilities")
    protected String totalLiabilities;
    @XmlElement(name = "Description_of_Additional_Income")
    protected String descriptionOfAdditionalIncome;
    @XmlElement(name = "Employer_Address_Country")
    protected String employerAddressCountry;
    @XmlElement(name = "Employer_Address_City")
    protected String employerAddressCity;
    @XmlElement(name = "Legal_Entity_or_Business_Documents")
    protected String legalEntityOrBusinessDocuments;
    @XmlElement(name = "Digital_Payment_Verfication")
    protected String digitalPaymentVerfication;
    @XmlElement(name = "Evidence_of_Relationship_or_Beneficial")
    protected String evidenceOfRelationshipOrBeneficial;
    @XmlElement(name = "Affidavit_Flag")
    @XmlSchemaType(name = "string")
    protected Flag affidavitFlag;
    @XmlElement(name = "Employer_Address_Postal_Code")
    protected String employerAddressPostalCode;
    @XmlElement(name = "Employer_Address_State")
    protected String employerAddressState;
    @XmlElement(name = "Customer_Opting_ID_Image")
    @XmlSchemaType(name = "string")
    protected Flag customerOptingIDImage;
    @XmlElement(name = "Reference_Document_Id_Issue_Country")
    protected String referenceDocumentIdIssueCountry;
    @XmlElement(name = "Reference_Document_Issue_Date")
    protected String referenceDocumentIssueDate;
    @XmlElement(name = "Second_Nationality")
    protected String secondNationality;
    @XmlElement(name = "Does_Consumer_Have_Second_Nationality")
    @XmlSchemaType(name = "string")
    protected Flag doesConsumerHaveSecondNationality;
    @XmlElement(name = "Evidence_of_Source_of_Funds")
    protected String evidenceOfSourceOfFunds;
    @XmlElement(name = "Start_Date_At_Current_Place_Of_Employment")
    protected String startDateAtCurrentPlaceOfEmployment;
    @XmlElement(name = "Second_ID_Acknowledgment_Field")
    protected String secondIDAcknowledgmentField;
    @XmlElement(name = "Agent_Verified_ID_Against_Government_Database")
    protected String agentVerifiedIDAgainstGovernmentDatabase;
    @XmlElement(name = "Does_Customer_Have_Email_Address")
    protected String doesCustomerHaveEmailAddress;
    @XmlElement(name = "Mailing_Address")
    protected ComplianceAddress mailingAddress;
    @XmlElement(name = "Is_Mailing_Addr_Diff_From_Resident_Addr")
    protected String isMailingAddrDiffFromResidentAddr;
    @XmlElement(name = "Prior_Occupation")
    protected String priorOccupation;
    @XmlElement(name = "Alias_Name")
    protected String aliasName;
    @XmlElement(name = "Check_Number")
    protected String checkNumber;
    @XmlElement(name = "Does_Trans_Involve_Govt")
    @XmlSchemaType(name = "string")
    protected YesNoFlag doesTransInvolveGovt;
    @XmlElement(name = "POT_SupportDocs_Collected")
    @XmlSchemaType(name = "string")
    protected YesNoFlag potSupportDocsCollected;
    @XmlElement(name = "Adv_Elec_Sign_Sr_No")
    protected String advElecSignSrNo;
    @XmlElement(name = "Rcvr_Cntry_Of_Birth")
    protected String rcvrCntryOfBirth;
    @XmlElement(name = "Rcvr_DOB")
    protected String rcvrDOB;
    @XmlElement(name = "universal_buffer")
    protected String universalBuffer;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the idDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getIdDetails() {
        return idDetails;
    }

    /**
     * Sets the value of the idDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setIdDetails(IdDetails value) {
        this.idDetails = value;
    }

    /**
     * Gets the value of the secondId property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getSecondId() {
        return secondId;
    }

    /**
     * Sets the value of the secondId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setSecondId(IdDetails value) {
        this.secondId = value;
    }

    /**
     * Gets the value of the thirdId property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getThirdId() {
        return thirdId;
    }

    /**
     * Sets the value of the thirdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setThirdId(IdDetails value) {
        this.thirdId = value;
    }

    /**
     * Gets the value of the thirdPartyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyDetails }
     *     
     */
    public ThirdPartyDetails getThirdPartyDetails() {
        return thirdPartyDetails;
    }

    /**
     * Sets the value of the thirdPartyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyDetails }
     *     
     */
    public void setThirdPartyDetails(ThirdPartyDetails value) {
        this.thirdPartyDetails = value;
    }

    /**
     * Gets the value of the thirdIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdIdNumber() {
        return thirdIdNumber;
    }

    /**
     * Sets the value of the thirdIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdIdNumber(String value) {
        this.thirdIdNumber = value;
    }

    /**
     * Gets the value of the complianceFlagsBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceFlagsBuffer() {
        return complianceFlagsBuffer;
    }

    /**
     * Sets the value of the complianceFlagsBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceFlagsBuffer(String value) {
        this.complianceFlagsBuffer = value;
    }

    /**
     * Gets the value of the complianceDataBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceDataBuffer() {
        return complianceDataBuffer;
    }

    /**
     * Sets the value of the complianceDataBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceDataBuffer(String value) {
        this.complianceDataBuffer = value;
    }

    /**
     * Gets the value of the idIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIssueDate() {
        return idIssueDate;
    }

    /**
     * Sets the value of the idIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIssueDate(String value) {
        this.idIssueDate = value;
    }

    /**
     * Gets the value of the idExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExpirationDate() {
        return idExpirationDate;
    }

    /**
     * Sets the value of the idExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExpirationDate(String value) {
        this.idExpirationDate = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the complianceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceComments() {
        return complianceComments;
    }

    /**
     * Sets the value of the complianceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceComments(String value) {
        this.complianceComments = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the transactionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReason() {
        return transactionReason;
    }

    /**
     * Sets the value of the transactionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReason(String value) {
        this.transactionReason = value;
    }

    /**
     * Gets the value of the isACitizen property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsACitizen() {
        return isACitizen;
    }

    /**
     * Sets the value of the isACitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsACitizen(YesNoFlag value) {
        this.isACitizen = value;
    }

    /**
     * Gets the value of the isANordicCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsANordicCitizen() {
        return isANordicCitizen;
    }

    /**
     * Sets the value of the isANordicCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsANordicCitizen(YesNoFlag value) {
        this.isANordicCitizen = value;
    }

    /**
     * Gets the value of the currentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getCurrentAddress() {
        return currentAddress;
    }

    /**
     * Sets the value of the currentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setCurrentAddress(ComplianceAddress value) {
        this.currentAddress = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the customerTypeAlphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeAlphaCode() {
        return customerTypeAlphaCode;
    }

    /**
     * Sets the value of the customerTypeAlphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeAlphaCode(String value) {
        this.customerTypeAlphaCode = value;
    }

    /**
     * Gets the value of the customerTypeNumericCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeNumericCode() {
        return customerTypeNumericCode;
    }

    /**
     * Sets the value of the customerTypeNumericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeNumericCode(String value) {
        this.customerTypeNumericCode = value;
    }

    /**
     * Gets the value of the isAResident property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsAResident() {
        return isAResident;
    }

    /**
     * Sets the value of the isAResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsAResident(YesNoFlag value) {
        this.isAResident = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the valutaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValutaCode() {
        return valutaCode;
    }

    /**
     * Sets the value of the valutaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValutaCode(String value) {
        this.valutaCode = value;
    }

    /**
     * Gets the value of the valutaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValutaAmount() {
        return valutaAmount;
    }

    /**
     * Sets the value of the valutaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValutaAmount(String value) {
        this.valutaAmount = value;
    }

    /**
     * Gets the value of the sourceOfFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfFunds() {
        return sourceOfFunds;
    }

    /**
     * Sets the value of the sourceOfFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfFunds(String value) {
        this.sourceOfFunds = value;
    }

    /**
     * Gets the value of the sendMoneyFormSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMoneyFormSerialNumber() {
        return sendMoneyFormSerialNumber;
    }

    /**
     * Sets the value of the sendMoneyFormSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMoneyFormSerialNumber(String value) {
        this.sendMoneyFormSerialNumber = value;
    }

    /**
     * Gets the value of the addressValidation property.
     * 
     * @return
     *     possible object is
     *     {@link ComplAddrValidation }
     *     
     */
    public ComplAddrValidation getAddressValidation() {
        return addressValidation;
    }

    /**
     * Sets the value of the addressValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplAddrValidation }
     *     
     */
    public void setAddressValidation(ComplAddrValidation value) {
        this.addressValidation = value;
    }

    /**
     * Gets the value of the idDescriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDescriptionCode() {
        return idDescriptionCode;
    }

    /**
     * Sets the value of the idDescriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDescriptionCode(String value) {
        this.idDescriptionCode = value;
    }

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the fathersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFathersName() {
        return fathersName;
    }

    /**
     * Sets the value of the fathersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFathersName(String value) {
        this.fathersName = value;
    }

    /**
     * Gets the value of the memberOrAssociateToGovernment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberOrAssociateToGovernment() {
        return memberOrAssociateToGovernment;
    }

    /**
     * Sets the value of the memberOrAssociateToGovernment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberOrAssociateToGovernment(String value) {
        this.memberOrAssociateToGovernment = value;
    }

    /**
     * Gets the value of the moneyTransferCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyTransferCategory() {
        return moneyTransferCategory;
    }

    /**
     * Sets the value of the moneyTransferCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyTransferCategory(String value) {
        this.moneyTransferCategory = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the fiscalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Sets the value of the fiscalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalCode(String value) {
        this.fiscalCode = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setPermanentAddress(ComplianceAddress value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the nameOfEmployerBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfEmployerBusiness() {
        return nameOfEmployerBusiness;
    }

    /**
     * Sets the value of the nameOfEmployerBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfEmployerBusiness(String value) {
        this.nameOfEmployerBusiness = value;
    }

    /**
     * Gets the value of the natureOfWorkBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfWorkBusiness() {
        return natureOfWorkBusiness;
    }

    /**
     * Sets the value of the natureOfWorkBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfWorkBusiness(String value) {
        this.natureOfWorkBusiness = value;
    }

    /**
     * Gets the value of the isTxnIndividualOrOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link IndvOrgFlag }
     *     
     */
    public IndvOrgFlag getIsTxnIndividualOrOrganization() {
        return isTxnIndividualOrOrganization;
    }

    /**
     * Sets the value of the isTxnIndividualOrOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndvOrgFlag }
     *     
     */
    public void setIsTxnIndividualOrOrganization(IndvOrgFlag value) {
        this.isTxnIndividualOrOrganization = value;
    }

    /**
     * Gets the value of the relationshipToReceiverSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToReceiverSender() {
        return relationshipToReceiverSender;
    }

    /**
     * Sets the value of the relationshipToReceiverSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipToReceiverSender(String value) {
        this.relationshipToReceiverSender = value;
    }

    /**
     * Gets the value of the isThisForCommercialPurposes property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsThisForCommercialPurposes() {
        return isThisForCommercialPurposes;
    }

    /**
     * Sets the value of the isThisForCommercialPurposes property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsThisForCommercialPurposes(YesNoFlag value) {
        this.isThisForCommercialPurposes = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the curp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the doesTheIDHaveAnExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getDoesTheIDHaveAnExpirationDate() {
        return doesTheIDHaveAnExpirationDate;
    }

    /**
     * Sets the value of the doesTheIDHaveAnExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setDoesTheIDHaveAnExpirationDate(YesNoFlag value) {
        this.doesTheIDHaveAnExpirationDate = value;
    }

    /**
     * Gets the value of the isRemittanceATradeRelatedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsRemittanceATradeRelatedTransaction() {
        return isRemittanceATradeRelatedTransaction;
    }

    /**
     * Sets the value of the isRemittanceATradeRelatedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsRemittanceATradeRelatedTransaction(YesNoFlag value) {
        this.isRemittanceATradeRelatedTransaction = value;
    }

    /**
     * Gets the value of the doesReceiverHaveAPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getDoesReceiverHaveAPhoneNumber() {
        return doesReceiverHaveAPhoneNumber;
    }

    /**
     * Sets the value of the doesReceiverHaveAPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setDoesReceiverHaveAPhoneNumber(YesNoFlag value) {
        this.doesReceiverHaveAPhoneNumber = value;
    }

    /**
     * Gets the value of the doesTheSenderHaveID property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getDoesTheSenderHaveID() {
        return doesTheSenderHaveID;
    }

    /**
     * Sets the value of the doesTheSenderHaveID property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setDoesTheSenderHaveID(YesNoFlag value) {
        this.doesTheSenderHaveID = value;
    }

    /**
     * Gets the value of the addressVerificationDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationDocumentType() {
        return addressVerificationDocumentType;
    }

    /**
     * Sets the value of the addressVerificationDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationDocumentType(String value) {
        this.addressVerificationDocumentType = value;
    }

    /**
     * Gets the value of the addressVerificationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationDocumentNumber() {
        return addressVerificationDocumentNumber;
    }

    /**
     * Sets the value of the addressVerificationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationDocumentNumber(String value) {
        this.addressVerificationDocumentNumber = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the personalIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    /**
     * Sets the value of the personalIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalIdentificationNumber(String value) {
        this.personalIdentificationNumber = value;
    }

    /**
     * Gets the value of the taxPayersRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPayersRegistrationNumber() {
        return taxPayersRegistrationNumber;
    }

    /**
     * Sets the value of the taxPayersRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPayersRegistrationNumber(String value) {
        this.taxPayersRegistrationNumber = value;
    }

    /**
     * Gets the value of the iActOnMyBehalf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIActOnMyBehalf() {
        return iActOnMyBehalf;
    }

    /**
     * Sets the value of the iActOnMyBehalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIActOnMyBehalf(String value) {
        this.iActOnMyBehalf = value;
    }

    /**
     * Gets the value of the classifierOfThePurposeOfMTNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifierOfThePurposeOfMTNumber() {
        return classifierOfThePurposeOfMTNumber;
    }

    /**
     * Sets the value of the classifierOfThePurposeOfMTNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifierOfThePurposeOfMTNumber(String value) {
        this.classifierOfThePurposeOfMTNumber = value;
    }

    /**
     * Gets the value of the userEquipmentIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEquipmentIDType() {
        return userEquipmentIDType;
    }

    /**
     * Sets the value of the userEquipmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEquipmentIDType(String value) {
        this.userEquipmentIDType = value;
    }

    /**
     * Gets the value of the userEquipmentIDData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEquipmentIDData() {
        return userEquipmentIDData;
    }

    /**
     * Sets the value of the userEquipmentIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEquipmentIDData(String value) {
        this.userEquipmentIDData = value;
    }

    /**
     * Gets the value of the easConsumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASConsumerIDKey() {
        return easConsumerIDKey;
    }

    /**
     * Sets the value of the easConsumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASConsumerIDKey(String value) {
        this.easConsumerIDKey = value;
    }

    /**
     * Gets the value of the consumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerIDKey() {
        return consumerIDKey;
    }

    /**
     * Sets the value of the consumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerIDKey(String value) {
        this.consumerIDKey = value;
    }

    /**
     * Gets the value of the whiteListKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteListKey() {
        return whiteListKey;
    }

    /**
     * Sets the value of the whiteListKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteListKey(String value) {
        this.whiteListKey = value;
    }

    /**
     * Gets the value of the ackFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckFlag() {
        return ackFlag;
    }

    /**
     * Sets the value of the ackFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckFlag(String value) {
        this.ackFlag = value;
    }

    /**
     * Gets the value of the reasonForAlternateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForAlternateId() {
        return reasonForAlternateId;
    }

    /**
     * Sets the value of the reasonForAlternateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForAlternateId(String value) {
        this.reasonForAlternateId = value;
    }

    /**
     * Gets the value of the addressVerificationDocumentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationDocumentIssueDate() {
        return addressVerificationDocumentIssueDate;
    }

    /**
     * Sets the value of the addressVerificationDocumentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationDocumentIssueDate(String value) {
        this.addressVerificationDocumentIssueDate = value;
    }

    /**
     * Gets the value of the internationalBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalBankAccountNumber() {
        return internationalBankAccountNumber;
    }

    /**
     * Sets the value of the internationalBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalBankAccountNumber(String value) {
        this.internationalBankAccountNumber = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the residencePermitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencePermitType() {
        return residencePermitType;
    }

    /**
     * Sets the value of the residencePermitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencePermitType(String value) {
        this.residencePermitType = value;
    }

    /**
     * Gets the value of the residencePermitSeriesAndNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencePermitSeriesAndNumber() {
        return residencePermitSeriesAndNumber;
    }

    /**
     * Sets the value of the residencePermitSeriesAndNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencePermitSeriesAndNumber(String value) {
        this.residencePermitSeriesAndNumber = value;
    }

    /**
     * Gets the value of the residencePermitIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencePermitIssueDate() {
        return residencePermitIssueDate;
    }

    /**
     * Sets the value of the residencePermitIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencePermitIssueDate(String value) {
        this.residencePermitIssueDate = value;
    }

    /**
     * Gets the value of the residencePermitExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencePermitExpirationDate() {
        return residencePermitExpirationDate;
    }

    /**
     * Sets the value of the residencePermitExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencePermitExpirationDate(String value) {
        this.residencePermitExpirationDate = value;
    }

    /**
     * Gets the value of the migrationCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationCardNumber() {
        return migrationCardNumber;
    }

    /**
     * Sets the value of the migrationCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationCardNumber(String value) {
        this.migrationCardNumber = value;
    }

    /**
     * Gets the value of the migrationCardIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationCardIssueDate() {
        return migrationCardIssueDate;
    }

    /**
     * Sets the value of the migrationCardIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationCardIssueDate(String value) {
        this.migrationCardIssueDate = value;
    }

    /**
     * Gets the value of the migrationCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationCardExpirationDate() {
        return migrationCardExpirationDate;
    }

    /**
     * Sets the value of the migrationCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationCardExpirationDate(String value) {
        this.migrationCardExpirationDate = value;
    }

    /**
     * Gets the value of the fundsSenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsSenderCode() {
        return fundsSenderCode;
    }

    /**
     * Sets the value of the fundsSenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsSenderCode(String value) {
        this.fundsSenderCode = value;
    }

    /**
     * Gets the value of the beneficiaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryCode() {
        return beneficiaryCode;
    }

    /**
     * Sets the value of the beneficiaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryCode(String value) {
        this.beneficiaryCode = value;
    }

    /**
     * Gets the value of the geniiiIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENIIIIndicator() {
        return geniiiIndicator;
    }

    /**
     * Sets the value of the geniiiIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENIIIIndicator(String value) {
        this.geniiiIndicator = value;
    }

    /**
     * Gets the value of the beneficiaryProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryProfession() {
        return beneficiaryProfession;
    }

    /**
     * Sets the value of the beneficiaryProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryProfession(String value) {
        this.beneficiaryProfession = value;
    }

    /**
     * Gets the value of the beneficiaryNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryNationality() {
        return beneficiaryNationality;
    }

    /**
     * Sets the value of the beneficiaryNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryNationality(String value) {
        this.beneficiaryNationality = value;
    }

    /**
     * Gets the value of the otherOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOccupation() {
        return otherOccupation;
    }

    /**
     * Sets the value of the otherOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOccupation(String value) {
        this.otherOccupation = value;
    }

    /**
     * Gets the value of the wasAProofOfEUCitizenshipProvided property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getWasAProofOfEUCitizenshipProvided() {
        return wasAProofOfEUCitizenshipProvided;
    }

    /**
     * Sets the value of the wasAProofOfEUCitizenshipProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setWasAProofOfEUCitizenshipProvided(YesNoFlag value) {
        this.wasAProofOfEUCitizenshipProvided = value;
    }

    /**
     * Gets the value of the wasAResidentPermitProvided property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getWasAResidentPermitProvided() {
        return wasAResidentPermitProvided;
    }

    /**
     * Sets the value of the wasAResidentPermitProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setWasAResidentPermitProvided(YesNoFlag value) {
        this.wasAResidentPermitProvided = value;
    }

    /**
     * Gets the value of the stdPhoneNumberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTDPhoneNumberCode() {
        return stdPhoneNumberCode;
    }

    /**
     * Sets the value of the stdPhoneNumberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTDPhoneNumberCode(String value) {
        this.stdPhoneNumberCode = value;
    }

    /**
     * Gets the value of the mobileCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    /**
     * Sets the value of the mobileCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCountryCode(String value) {
        this.mobileCountryCode = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the otherPurposeOfTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPurposeOfTransaction() {
        return otherPurposeOfTransaction;
    }

    /**
     * Sets the value of the otherPurposeOfTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPurposeOfTransaction(String value) {
        this.otherPurposeOfTransaction = value;
    }

    /**
     * Gets the value of the wucomElectronicValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWUCOMElectronicValidation() {
        return wucomElectronicValidation;
    }

    /**
     * Sets the value of the wucomElectronicValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWUCOMElectronicValidation(String value) {
        this.wucomElectronicValidation = value;
    }

    /**
     * Gets the value of the otherPartySorRAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getOtherPartySorRAddress() {
        return otherPartySorRAddress;
    }

    /**
     * Sets the value of the otherPartySorRAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setOtherPartySorRAddress(ComplianceAddress value) {
        this.otherPartySorRAddress = value;
    }

    /**
     * Gets the value of the otherRelationshipToReceiverSender property.
     * 
     * @return
     *     possible object is
     *     {@link OtherRelationshipToReceiverSender }
     *     
     */
    public OtherRelationshipToReceiverSender getOtherRelationshipToReceiverSender() {
        return otherRelationshipToReceiverSender;
    }

    /**
     * Sets the value of the otherRelationshipToReceiverSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherRelationshipToReceiverSender }
     *     
     */
    public void setOtherRelationshipToReceiverSender(OtherRelationshipToReceiverSender value) {
        this.otherRelationshipToReceiverSender = value;
    }

    /**
     * Gets the value of the citizenshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipType() {
        return citizenshipType;
    }

    /**
     * Sets the value of the citizenshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipType(String value) {
        this.citizenshipType = value;
    }

    /**
     * Gets the value of the thirdIdTypeOrProofOfAddressDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdIdTypeOrProofOfAddressDocumentType() {
        return thirdIdTypeOrProofOfAddressDocumentType;
    }

    /**
     * Sets the value of the thirdIdTypeOrProofOfAddressDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdIdTypeOrProofOfAddressDocumentType(String value) {
        this.thirdIdTypeOrProofOfAddressDocumentType = value;
    }

    /**
     * Gets the value of the nonGregorianDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonGregorianDateOfBirth() {
        return nonGregorianDateOfBirth;
    }

    /**
     * Sets the value of the nonGregorianDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonGregorianDateOfBirth(String value) {
        this.nonGregorianDateOfBirth = value;
    }

    /**
     * Gets the value of the nonGregorianFirstIdExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonGregorianFirstIdExpirationDate() {
        return nonGregorianFirstIdExpirationDate;
    }

    /**
     * Sets the value of the nonGregorianFirstIdExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonGregorianFirstIdExpirationDate(String value) {
        this.nonGregorianFirstIdExpirationDate = value;
    }

    /**
     * Gets the value of the thirdIdIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdIdIssuer() {
        return thirdIdIssuer;
    }

    /**
     * Sets the value of the thirdIdIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdIdIssuer(String value) {
        this.thirdIdIssuer = value;
    }

    /**
     * Gets the value of the secondIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondIdIssueDate() {
        return secondIdIssueDate;
    }

    /**
     * Sets the value of the secondIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondIdIssueDate(String value) {
        this.secondIdIssueDate = value;
    }

    /**
     * Gets the value of the secondIdExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondIdExpirationDate() {
        return secondIdExpirationDate;
    }

    /**
     * Sets the value of the secondIdExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondIdExpirationDate(String value) {
        this.secondIdExpirationDate = value;
    }

    /**
     * Gets the value of the maidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Sets the value of the maidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenName(String value) {
        this.maidenName = value;
    }

    /**
     * Gets the value of the otherSourceOfFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSourceOfFunds() {
        return otherSourceOfFunds;
    }

    /**
     * Sets the value of the otherSourceOfFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSourceOfFunds(String value) {
        this.otherSourceOfFunds = value;
    }

    /**
     * Gets the value of the addressVerificationIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerificationIssuer() {
        return addressVerificationIssuer;
    }

    /**
     * Sets the value of the addressVerificationIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerificationIssuer(String value) {
        this.addressVerificationIssuer = value;
    }

    /**
     * Gets the value of the stateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfBirth() {
        return stateOfBirth;
    }

    /**
     * Sets the value of the stateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfBirth(String value) {
        this.stateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the placeOrStateOrProvinceOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOrStateOrProvinceOfBirth() {
        return placeOrStateOrProvinceOfBirth;
    }

    /**
     * Sets the value of the placeOrStateOrProvinceOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOrStateOrProvinceOfBirth(String value) {
        this.placeOrStateOrProvinceOfBirth = value;
    }

    /**
     * Gets the value of the isFiscalCodeAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsFiscalCodeAvailable() {
        return isFiscalCodeAvailable;
    }

    /**
     * Sets the value of the isFiscalCodeAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsFiscalCodeAvailable(YesNoFlag value) {
        this.isFiscalCodeAvailable = value;
    }

    /**
     * Gets the value of the isThereABenificialOwner property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsThereABenificialOwner() {
        return isThereABenificialOwner;
    }

    /**
     * Sets the value of the isThereABenificialOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsThereABenificialOwner(YesNoFlag value) {
        this.isThereABenificialOwner = value;
    }

    /**
     * Gets the value of the areYouAPoliticallyExposedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getAreYouAPoliticallyExposedPerson() {
        return areYouAPoliticallyExposedPerson;
    }

    /**
     * Sets the value of the areYouAPoliticallyExposedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setAreYouAPoliticallyExposedPerson(YesNoFlag value) {
        this.areYouAPoliticallyExposedPerson = value;
    }

    /**
     * Gets the value of the customerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentificationNumber() {
        return customerIdentificationNumber;
    }

    /**
     * Sets the value of the customerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentificationNumber(String value) {
        this.customerIdentificationNumber = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the isCopyOfCustomerIdObtained property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsCopyOfCustomerIdObtained() {
        return isCopyOfCustomerIdObtained;
    }

    /**
     * Sets the value of the isCopyOfCustomerIdObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsCopyOfCustomerIdObtained(YesNoFlag value) {
        this.isCopyOfCustomerIdObtained = value;
    }

    /**
     * Gets the value of the receiverIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverIdDetails }
     *     
     */
    public ReceiverIdDetails getReceiverIdDetails() {
        return receiverIdDetails;
    }

    /**
     * Sets the value of the receiverIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverIdDetails }
     *     
     */
    public void setReceiverIdDetails(ReceiverIdDetails value) {
        this.receiverIdDetails = value;
    }

    /**
     * Gets the value of the otherTitleNatureOfWorkBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTitleNatureOfWorkBusiness() {
        return otherTitleNatureOfWorkBusiness;
    }

    /**
     * Sets the value of the otherTitleNatureOfWorkBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTitleNatureOfWorkBusiness(String value) {
        this.otherTitleNatureOfWorkBusiness = value;
    }

    /**
     * Gets the value of the employerAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddress1() {
        return employerAddress1;
    }

    /**
     * Sets the value of the employerAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddress1(String value) {
        this.employerAddress1 = value;
    }

    /**
     * Gets the value of the employerAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddress2() {
        return employerAddress2;
    }

    /**
     * Sets the value of the employerAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddress2(String value) {
        this.employerAddress2 = value;
    }

    /**
     * Gets the value of the qcPayoutIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcPayoutIndicator() {
        return qcPayoutIndicator;
    }

    /**
     * Sets the value of the qcPayoutIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcPayoutIndicator(String value) {
        this.qcPayoutIndicator = value;
    }

    /**
     * Gets the value of the specialAuthorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialAuthorizationNumber() {
        return specialAuthorizationNumber;
    }

    /**
     * Sets the value of the specialAuthorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialAuthorizationNumber(String value) {
        this.specialAuthorizationNumber = value;
    }

    /**
     * Gets the value of the isAddrDiff property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsAddrDiff() {
        return isAddrDiff;
    }

    /**
     * Sets the value of the isAddrDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsAddrDiff(YesNoFlag value) {
        this.isAddrDiff = value;
    }

    /**
     * Gets the value of the personOrEntity property.
     * 
     * @return
     *     possible object is
     *     {@link PersonEntity }
     *     
     */
    public PersonEntity getPersonOrEntity() {
        return personOrEntity;
    }

    /**
     * Sets the value of the personOrEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEntity }
     *     
     */
    public void setPersonOrEntity(PersonEntity value) {
        this.personOrEntity = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the permitApprovalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitApprovalType() {
        return permitApprovalType;
    }

    /**
     * Sets the value of the permitApprovalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitApprovalType(String value) {
        this.permitApprovalType = value;
    }

    /**
     * Gets the value of the permitApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitApprovalNumber() {
        return permitApprovalNumber;
    }

    /**
     * Sets the value of the permitApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitApprovalNumber(String value) {
        this.permitApprovalNumber = value;
    }

    /**
     * Gets the value of the businessPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNo() {
        return businessPhoneNo;
    }

    /**
     * Sets the value of the businessPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNo(String value) {
        this.businessPhoneNo = value;
    }

    /**
     * Gets the value of the areYouAPEPRelativeOrFriend property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getAreYouAPEPRelativeOrFriend() {
        return areYouAPEPRelativeOrFriend;
    }

    /**
     * Sets the value of the areYouAPEPRelativeOrFriend property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setAreYouAPEPRelativeOrFriend(YesNoFlag value) {
        this.areYouAPEPRelativeOrFriend = value;
    }

    /**
     * Gets the value of the annualIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Sets the value of the annualIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualIncome(String value) {
        this.annualIncome = value;
    }

    /**
     * Gets the value of the employerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerStatus() {
        return employerStatus;
    }

    /**
     * Sets the value of the employerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerStatus(String value) {
        this.employerStatus = value;
    }

    /**
     * Gets the value of the isTransferNoncommercialAndPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsTransferNoncommercialAndPersonal() {
        return isTransferNoncommercialAndPersonal;
    }

    /**
     * Sets the value of the isTransferNoncommercialAndPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsTransferNoncommercialAndPersonal(YesNoFlag value) {
        this.isTransferNoncommercialAndPersonal = value;
    }

    /**
     * Gets the value of the idImageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImageStatus() {
        return idImageStatus;
    }

    /**
     * Sets the value of the idImageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImageStatus(String value) {
        this.idImageStatus = value;
    }

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
     * Gets the value of the flaSignatureDocControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaSignatureDocControlNumber() {
        return flaSignatureDocControlNumber;
    }

    /**
     * Sets the value of the flaSignatureDocControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaSignatureDocControlNumber(String value) {
        this.flaSignatureDocControlNumber = value;
    }

    /**
     * Gets the value of the customerConsentSignatureDocControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerConsentSignatureDocControlNumber() {
        return customerConsentSignatureDocControlNumber;
    }

    /**
     * Sets the value of the customerConsentSignatureDocControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerConsentSignatureDocControlNumber(String value) {
        this.customerConsentSignatureDocControlNumber = value;
    }

    /**
     * Gets the value of the customerSignatureDocControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignatureDocControlNumber() {
        return customerSignatureDocControlNumber;
    }

    /**
     * Sets the value of the customerSignatureDocControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignatureDocControlNumber(String value) {
        this.customerSignatureDocControlNumber = value;
    }

    /**
     * Gets the value of the temporaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getTemporaryAddress() {
        return temporaryAddress;
    }

    /**
     * Sets the value of the temporaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setTemporaryAddress(ComplianceAddress value) {
        this.temporaryAddress = value;
    }

    /**
     * Gets the value of the doesTheIDHaveAnIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getDoesTheIDHaveAnIssueDate() {
        return doesTheIDHaveAnIssueDate;
    }

    /**
     * Sets the value of the doesTheIDHaveAnIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setDoesTheIDHaveAnIssueDate(YesNoFlag value) {
        this.doesTheIDHaveAnIssueDate = value;
    }

    /**
     * Gets the value of the custRelationshipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCustRelationshipFlag() {
        return custRelationshipFlag;
    }

    /**
     * Sets the value of the custRelationshipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCustRelationshipFlag(YesNoFlag value) {
        this.custRelationshipFlag = value;
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
     * Gets the value of the multiErrorSupported property.
     * 
     * @return
     *     possible object is
     *     {@link MultiErrorSupported }
     *     
     */
    public MultiErrorSupported getMultiErrorSupported() {
        return multiErrorSupported;
    }

    /**
     * Sets the value of the multiErrorSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiErrorSupported }
     *     
     */
    public void setMultiErrorSupported(MultiErrorSupported value) {
        this.multiErrorSupported = value;
    }

    /**
     * Gets the value of the fundsSourceDocumented property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getFundsSourceDocumented() {
        return fundsSourceDocumented;
    }

    /**
     * Sets the value of the fundsSourceDocumented property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setFundsSourceDocumented(YesNoFlag value) {
        this.fundsSourceDocumented = value;
    }

    /**
     * Gets the value of the biometricTxnRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiometricTxnRefNo() {
        return biometricTxnRefNo;
    }

    /**
     * Sets the value of the biometricTxnRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiometricTxnRefNo(String value) {
        this.biometricTxnRefNo = value;
    }

    /**
     * Gets the value of the biometricAckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiometricAckStatus() {
        return biometricAckStatus;
    }

    /**
     * Sets the value of the biometricAckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiometricAckStatus(String value) {
        this.biometricAckStatus = value;
    }

    /**
     * Gets the value of the complianceValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceValidationFlag() {
        return complianceValidationFlag;
    }

    /**
     * Sets the value of the complianceValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceValidationFlag(String value) {
        this.complianceValidationFlag = value;
    }

    /**
     * Gets the value of the isCurrentAndPermanentAddrSame property.
     * 
     * @return
     *     possible object is
     *     {@link IsCurrentAndPermanentAddrSame }
     *     
     */
    public IsCurrentAndPermanentAddrSame getIsCurrentAndPermanentAddrSame() {
        return isCurrentAndPermanentAddrSame;
    }

    /**
     * Sets the value of the isCurrentAndPermanentAddrSame property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCurrentAndPermanentAddrSame }
     *     
     */
    public void setIsCurrentAndPermanentAddrSame(IsCurrentAndPermanentAddrSame value) {
        this.isCurrentAndPermanentAddrSame = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the spouseDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseDateOfBirth() {
        return spouseDateOfBirth;
    }

    /**
     * Sets the value of the spouseDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseDateOfBirth(String value) {
        this.spouseDateOfBirth = value;
    }

    /**
     * Gets the value of the employerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerEmailAddress() {
        return employerEmailAddress;
    }

    /**
     * Sets the value of the employerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerEmailAddress(String value) {
        this.employerEmailAddress = value;
    }

    /**
     * Gets the value of the businessPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneCountryCode() {
        return businessPhoneCountryCode;
    }

    /**
     * Sets the value of the businessPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneCountryCode(String value) {
        this.businessPhoneCountryCode = value;
    }

    /**
     * Gets the value of the bankApprovalAckFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankApprovalAckFlag() {
        return bankApprovalAckFlag;
    }

    /**
     * Sets the value of the bankApprovalAckFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankApprovalAckFlag(String value) {
        this.bankApprovalAckFlag = value;
    }

    /**
     * Gets the value of the bankApprovalDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankApprovalDocNumber() {
        return bankApprovalDocNumber;
    }

    /**
     * Sets the value of the bankApprovalDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankApprovalDocNumber(String value) {
        this.bankApprovalDocNumber = value;
    }

    /**
     * Gets the value of the bankApprovalIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankApprovalIssueDate() {
        return bankApprovalIssueDate;
    }

    /**
     * Sets the value of the bankApprovalIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankApprovalIssueDate(String value) {
        this.bankApprovalIssueDate = value;
    }

    /**
     * Gets the value of the employmentPositionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentPositionLevel() {
        return employmentPositionLevel;
    }

    /**
     * Sets the value of the employmentPositionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentPositionLevel(String value) {
        this.employmentPositionLevel = value;
    }

    /**
     * Gets the value of the confirmationOfEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationOfEmployment() {
        return confirmationOfEmployment;
    }

    /**
     * Sets the value of the confirmationOfEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationOfEmployment(String value) {
        this.confirmationOfEmployment = value;
    }

    /**
     * Gets the value of the referenceDocumentIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentIdType() {
        return referenceDocumentIdType;
    }

    /**
     * Sets the value of the referenceDocumentIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentIdType(String value) {
        this.referenceDocumentIdType = value;
    }

    /**
     * Gets the value of the referenceDocumentIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentIdNumber() {
        return referenceDocumentIdNumber;
    }

    /**
     * Sets the value of the referenceDocumentIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentIdNumber(String value) {
        this.referenceDocumentIdNumber = value;
    }

    /**
     * Gets the value of the beneficiaryGender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getBeneficiaryGender() {
        return beneficiaryGender;
    }

    /**
     * Sets the value of the beneficiaryGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setBeneficiaryGender(Gender value) {
        this.beneficiaryGender = value;
    }

    /**
     * Gets the value of the pepCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEPCategory() {
        return pepCategory;
    }

    /**
     * Sets the value of the pepCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEPCategory(String value) {
        this.pepCategory = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the firstNameUponBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameUponBirth() {
        return firstNameUponBirth;
    }

    /**
     * Sets the value of the firstNameUponBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameUponBirth(String value) {
        this.firstNameUponBirth = value;
    }

    /**
     * Gets the value of the monthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Sets the value of the monthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyIncome(String value) {
        this.monthlyIncome = value;
    }

    /**
     * Gets the value of the monthlyExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyExpenses() {
        return monthlyExpenses;
    }

    /**
     * Sets the value of the monthlyExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyExpenses(String value) {
        this.monthlyExpenses = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAssets(String value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLiabilities(String value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the descriptionOfAdditionalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfAdditionalIncome() {
        return descriptionOfAdditionalIncome;
    }

    /**
     * Sets the value of the descriptionOfAdditionalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfAdditionalIncome(String value) {
        this.descriptionOfAdditionalIncome = value;
    }

    /**
     * Gets the value of the employerAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddressCountry() {
        return employerAddressCountry;
    }

    /**
     * Sets the value of the employerAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddressCountry(String value) {
        this.employerAddressCountry = value;
    }

    /**
     * Gets the value of the employerAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddressCity() {
        return employerAddressCity;
    }

    /**
     * Sets the value of the employerAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddressCity(String value) {
        this.employerAddressCity = value;
    }

    /**
     * Gets the value of the legalEntityOrBusinessDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityOrBusinessDocuments() {
        return legalEntityOrBusinessDocuments;
    }

    /**
     * Sets the value of the legalEntityOrBusinessDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityOrBusinessDocuments(String value) {
        this.legalEntityOrBusinessDocuments = value;
    }

    /**
     * Gets the value of the digitalPaymentVerfication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalPaymentVerfication() {
        return digitalPaymentVerfication;
    }

    /**
     * Sets the value of the digitalPaymentVerfication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalPaymentVerfication(String value) {
        this.digitalPaymentVerfication = value;
    }

    /**
     * Gets the value of the evidenceOfRelationshipOrBeneficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceOfRelationshipOrBeneficial() {
        return evidenceOfRelationshipOrBeneficial;
    }

    /**
     * Sets the value of the evidenceOfRelationshipOrBeneficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceOfRelationshipOrBeneficial(String value) {
        this.evidenceOfRelationshipOrBeneficial = value;
    }

    /**
     * Gets the value of the affidavitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getAffidavitFlag() {
        return affidavitFlag;
    }

    /**
     * Sets the value of the affidavitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setAffidavitFlag(Flag value) {
        this.affidavitFlag = value;
    }

    /**
     * Gets the value of the employerAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddressPostalCode() {
        return employerAddressPostalCode;
    }

    /**
     * Sets the value of the employerAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddressPostalCode(String value) {
        this.employerAddressPostalCode = value;
    }

    /**
     * Gets the value of the employerAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerAddressState() {
        return employerAddressState;
    }

    /**
     * Sets the value of the employerAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerAddressState(String value) {
        this.employerAddressState = value;
    }

    /**
     * Gets the value of the customerOptingIDImage property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getCustomerOptingIDImage() {
        return customerOptingIDImage;
    }

    /**
     * Sets the value of the customerOptingIDImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setCustomerOptingIDImage(Flag value) {
        this.customerOptingIDImage = value;
    }

    /**
     * Gets the value of the referenceDocumentIdIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentIdIssueCountry() {
        return referenceDocumentIdIssueCountry;
    }

    /**
     * Sets the value of the referenceDocumentIdIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentIdIssueCountry(String value) {
        this.referenceDocumentIdIssueCountry = value;
    }

    /**
     * Gets the value of the referenceDocumentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentIssueDate() {
        return referenceDocumentIssueDate;
    }

    /**
     * Sets the value of the referenceDocumentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentIssueDate(String value) {
        this.referenceDocumentIssueDate = value;
    }

    /**
     * Gets the value of the secondNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondNationality() {
        return secondNationality;
    }

    /**
     * Sets the value of the secondNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondNationality(String value) {
        this.secondNationality = value;
    }

    /**
     * Gets the value of the doesConsumerHaveSecondNationality property.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getDoesConsumerHaveSecondNationality() {
        return doesConsumerHaveSecondNationality;
    }

    /**
     * Sets the value of the doesConsumerHaveSecondNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setDoesConsumerHaveSecondNationality(Flag value) {
        this.doesConsumerHaveSecondNationality = value;
    }

    /**
     * Gets the value of the evidenceOfSourceOfFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceOfSourceOfFunds() {
        return evidenceOfSourceOfFunds;
    }

    /**
     * Sets the value of the evidenceOfSourceOfFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceOfSourceOfFunds(String value) {
        this.evidenceOfSourceOfFunds = value;
    }

    /**
     * Gets the value of the startDateAtCurrentPlaceOfEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateAtCurrentPlaceOfEmployment() {
        return startDateAtCurrentPlaceOfEmployment;
    }

    /**
     * Sets the value of the startDateAtCurrentPlaceOfEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateAtCurrentPlaceOfEmployment(String value) {
        this.startDateAtCurrentPlaceOfEmployment = value;
    }

    /**
     * Gets the value of the secondIDAcknowledgmentField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondIDAcknowledgmentField() {
        return secondIDAcknowledgmentField;
    }

    /**
     * Sets the value of the secondIDAcknowledgmentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondIDAcknowledgmentField(String value) {
        this.secondIDAcknowledgmentField = value;
    }

    /**
     * Gets the value of the agentVerifiedIDAgainstGovernmentDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentVerifiedIDAgainstGovernmentDatabase() {
        return agentVerifiedIDAgainstGovernmentDatabase;
    }

    /**
     * Sets the value of the agentVerifiedIDAgainstGovernmentDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentVerifiedIDAgainstGovernmentDatabase(String value) {
        this.agentVerifiedIDAgainstGovernmentDatabase = value;
    }

    /**
     * Gets the value of the doesCustomerHaveEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoesCustomerHaveEmailAddress() {
        return doesCustomerHaveEmailAddress;
    }

    /**
     * Sets the value of the doesCustomerHaveEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoesCustomerHaveEmailAddress(String value) {
        this.doesCustomerHaveEmailAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setMailingAddress(ComplianceAddress value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the isMailingAddrDiffFromResidentAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMailingAddrDiffFromResidentAddr() {
        return isMailingAddrDiffFromResidentAddr;
    }

    /**
     * Sets the value of the isMailingAddrDiffFromResidentAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMailingAddrDiffFromResidentAddr(String value) {
        this.isMailingAddrDiffFromResidentAddr = value;
    }

    /**
     * Gets the value of the priorOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorOccupation() {
        return priorOccupation;
    }

    /**
     * Sets the value of the priorOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorOccupation(String value) {
        this.priorOccupation = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasName(String value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the doesTransInvolveGovt property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getDoesTransInvolveGovt() {
        return doesTransInvolveGovt;
    }

    /**
     * Sets the value of the doesTransInvolveGovt property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setDoesTransInvolveGovt(YesNoFlag value) {
        this.doesTransInvolveGovt = value;
    }

    /**
     * Gets the value of the potSupportDocsCollected property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getPOTSupportDocsCollected() {
        return potSupportDocsCollected;
    }

    /**
     * Sets the value of the potSupportDocsCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setPOTSupportDocsCollected(YesNoFlag value) {
        this.potSupportDocsCollected = value;
    }

    /**
     * Gets the value of the advElecSignSrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvElecSignSrNo() {
        return advElecSignSrNo;
    }

    /**
     * Sets the value of the advElecSignSrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvElecSignSrNo(String value) {
        this.advElecSignSrNo = value;
    }

    /**
     * Gets the value of the rcvrCntryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCntryOfBirth() {
        return rcvrCntryOfBirth;
    }

    /**
     * Sets the value of the rcvrCntryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrCntryOfBirth(String value) {
        this.rcvrCntryOfBirth = value;
    }

    /**
     * Gets the value of the rcvrDOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrDOB() {
        return rcvrDOB;
    }

    /**
     * Sets the value of the rcvrDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrDOB(String value) {
        this.rcvrDOB = value;
    }

    /**
     * Gets the value of the universalBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalBuffer() {
        return universalBuffer;
    }

    /**
     * Sets the value of the universalBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalBuffer(String value) {
        this.universalBuffer = value;
    }

}
