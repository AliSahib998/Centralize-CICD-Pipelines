package az.unibank.wu.integration.service.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class ModifyRequestDto {

    private String receiverFirstname;

    private String receiverLastname;

    private String receiverMiddlename;

    @Valid
    @NotNull
    private SearchRequestDto details;

}
