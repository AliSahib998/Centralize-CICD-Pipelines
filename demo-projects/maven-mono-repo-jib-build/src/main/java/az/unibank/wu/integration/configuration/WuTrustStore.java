package az.unibank.wu.integration.configuration;

import lombok.Data;

@Data
public class WuTrustStore {

    private String trustStore;
    private String trustStorePassword;
    private String trustStoreAlias;

}
