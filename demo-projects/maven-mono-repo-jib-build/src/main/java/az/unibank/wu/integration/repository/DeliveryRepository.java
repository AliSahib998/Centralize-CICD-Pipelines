package az.unibank.wu.integration.repository;

import az.unibank.wu.integration.domain.Delivery;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Long> {

    @EntityGraph(value = "Delivery.dasDeliveries")
    Optional<Delivery> findFirstByDesCountryAndDesCurrencyAndOrgCurrencyAndCreateDateBetween(String desCountry,
                                                                                        String desCurrency,
                                                                                        String orgCurrency,
                                                                                        LocalDateTime start,LocalDateTime end);

}
