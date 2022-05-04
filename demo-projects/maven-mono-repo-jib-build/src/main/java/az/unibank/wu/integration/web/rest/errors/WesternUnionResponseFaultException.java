package az.unibank.wu.integration.web.rest.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class WesternUnionResponseFaultException extends RuntimeException {

    private final FaultResponseVm faultReasonVm;

    public WesternUnionResponseFaultException(String responseBody, String faultReason) {
        super(responseBody);
        this.faultReasonVm = new FaultResponseVm(responseBody, faultReason);
    }
}

@Getter
@AllArgsConstructor
class FaultResponseVm {
    private String message;
    private String title;
}
