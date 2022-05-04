package az.unibank.wu.integration.service.dto;

import az.unibank.wu.integration.webservices.model.GeneralName;
import az.unibank.wu.integration.webservices.model.YesNoFlag;
import lombok.Data;

@Data
public class ReceiverDto extends CustomerDto {

    private GeneralName name;
    private YesNoFlag isaResident;

}
