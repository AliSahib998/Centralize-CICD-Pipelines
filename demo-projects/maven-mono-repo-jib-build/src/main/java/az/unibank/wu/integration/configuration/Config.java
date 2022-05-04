package az.unibank.wu.integration.configuration;

import net.javacrumbs.shedlock.core.LockProvider;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;

import javax.sql.DataSource;

@Configuration
@EnableScheduling
public class Config {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

    @Bean
    public LockProvider lockProvider(DataSource dataSource) {
        return new JdbcTemplateLockProvider(dataSource);
    }
}
