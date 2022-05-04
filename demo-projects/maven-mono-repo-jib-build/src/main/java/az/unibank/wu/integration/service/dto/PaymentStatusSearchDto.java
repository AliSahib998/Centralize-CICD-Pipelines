package az.unibank.wu.integration.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PaymentStatusSearchDto {

    @NotNull
    private String mtcn;

    @NotNull
    private String originatingCurrency;

    @NotNull
    private String referenceNumber;

}
