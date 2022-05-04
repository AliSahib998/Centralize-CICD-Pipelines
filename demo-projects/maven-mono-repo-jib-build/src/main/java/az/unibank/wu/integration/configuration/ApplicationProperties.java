package az.unibank.wu.integration.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    private final String wuUrl;

    private final String identifier;

    private final String counterId;

}
