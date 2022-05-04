package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.OriginatingCurrency;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class DlvrOptTmpDto {

    @NotNull
    private String referenceNumber;

    @NotNull
    @Size(max = 2, min = 2)
    private String originatingCountryCode;

    @NotNull
    private OriginatingCurrency originatingCurrency;

    @NotNull
    private String templateCode;

}
