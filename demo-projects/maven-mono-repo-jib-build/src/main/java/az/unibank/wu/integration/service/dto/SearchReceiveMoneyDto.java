package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.service.enumeration.ReceiveCurrency;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SearchReceiveMoneyDto {

    @NotNull
    private String referenceNumber;

    @NotNull
    private String mtcn;

    @NotNull
    private ReceiveCurrency currency;

}
