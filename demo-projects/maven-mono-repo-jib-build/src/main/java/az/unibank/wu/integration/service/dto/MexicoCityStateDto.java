package az.unibank.wu.integration.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MexicoCityStateDto {

    @NotNull
    private String referenceNumber;

    private String state;

    private String city;

}
