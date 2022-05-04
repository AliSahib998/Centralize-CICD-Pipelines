package az.unibank.wu.integration.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDTO {
    private int code;
    private String technicalMessage;
    private String userMessage;
    private Calendar timestamp;
}
