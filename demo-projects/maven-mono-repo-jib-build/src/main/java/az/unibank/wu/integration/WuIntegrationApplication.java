package az.unibank.wu.integration;

import az.unibank.wu.integration.service.impl.DasSchedule;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "az.unibank.wu.integration.configuration")
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
@EnableScheduling
public class WuIntegrationApplication implements CommandLineRunner {

    private final DasSchedule dasSchedule;

    public WuIntegrationApplication(DasSchedule dasSchedule) {
        this.dasSchedule = dasSchedule;
    }

    public static void main(String[] args) {
        SpringApplication.run(WuIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dasSchedule.scheduleTaskUsingCronIsoCountries();
    }
}
