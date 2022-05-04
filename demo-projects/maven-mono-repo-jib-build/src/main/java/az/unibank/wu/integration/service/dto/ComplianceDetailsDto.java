package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.IdType;
import az.unibank.wu.integration.webservices.model.YesNoFlag;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ComplianceDetailsDto {

    @NotNull
    private IdType idType;
    private String idCountryOfIssue;
    private String idPlaceOfIssue;
    private String idNumber;
    private LocalDate idIssueDate;
    private LocalDate idExpirationDate;
    private LocalDate dateOfBirth;
    private String countryOfBirth;
    private YesNoFlag doesTheIdHaveAnExpirationDate;
    private YesNoFlag doesTheSenderHaveID;

}
