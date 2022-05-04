package az.unibank.wu.integration.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CustomerDto {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postalCode;
    private String phoneCountryCode;
    private String phoneNumber;

    @NotNull
    private String accountNumber;

    @NotNull
    private String routingNumber;

    @Valid
    @NotNull
    private ComplianceDetailsDto complianceDetails;
}
