package az.unibank.wu.integration.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class DasCurrencyDto {
    private String prefixFormat;
    private String displayCurrency;
    private String format;
    private String suffixFormat;
}
