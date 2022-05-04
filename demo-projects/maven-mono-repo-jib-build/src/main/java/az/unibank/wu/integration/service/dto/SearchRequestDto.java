package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.OriginatingCurrency;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SearchRequestDto {

    @NotNull
    private String mtcn;

    @NotNull
    private OriginatingCurrency originatingCurrency;

    @NotNull
    private String referenceNumber;

}
