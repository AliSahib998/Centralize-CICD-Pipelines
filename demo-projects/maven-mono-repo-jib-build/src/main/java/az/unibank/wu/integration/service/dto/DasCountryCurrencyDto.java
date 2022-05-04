package az.unibank.wu.integration.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class DasCountryCurrencyDto {
    private String countryName;
    private String isoCountryNumCd;
    private String equivalanceEnglish;
    private List<DasCurrencyDto> dasCurrencyDtos = new ArrayList<>();
}
