package az.unibank.wu.integration.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CountryInfoDto {


    @NotNull
    private String referenceNumber;

    @NotNull
    @Size(max = 2, min = 2)
    private String countryCode;

    @NotNull
    private String currencyCode;


}
