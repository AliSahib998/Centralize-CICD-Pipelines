package az.unibank.wu.integration.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class DeliveryServiceRequestDto {

    @NotNull
    private String referenceNumber;

    @NotNull
    @Size(max = 2, min = 2)
    private String destinationCountryCode;

    @NotNull
    private String destinationCurrency;

    @NotNull
    private String originatingCurrency;

    private String d2b;

}
