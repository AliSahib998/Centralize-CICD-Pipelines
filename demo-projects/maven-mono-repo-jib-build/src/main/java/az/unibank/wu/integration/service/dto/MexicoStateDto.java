package az.unibank.wu.integration.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MexicoStateDto {

    private String stateName;
    private String stateCode;
    private List<String> cities = new ArrayList<>();
}
