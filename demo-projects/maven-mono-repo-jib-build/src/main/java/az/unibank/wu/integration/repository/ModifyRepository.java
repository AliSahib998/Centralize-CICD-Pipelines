package az.unibank.wu.integration.repository;

import az.unibank.wu.integration.domain.Modify;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface ModifyRepository extends JpaRepository<Modify,Long> {

    Optional<Modify> findByReferanceNumberAndCreateDateIsAfter(String referanceNumber, LocalDateTime date);

    void deleteByReferanceNumber(String referanceNumber);

}
