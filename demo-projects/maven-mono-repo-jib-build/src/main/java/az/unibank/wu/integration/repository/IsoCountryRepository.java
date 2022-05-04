package az.unibank.wu.integration.repository;

import az.unibank.wu.integration.domain.Delivery;
import az.unibank.wu.integration.domain.IsoCountry;
import az.unibank.wu.integration.service.dto.IsoCountryType;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IsoCountryRepository extends JpaRepository<IsoCountry,Long> {
    @EntityGraph(value = "IsoCountry.dasIsoCountries")
    Optional<IsoCountry> findByLangAndType(String lang, IsoCountryType type);
    void deleteByLang(String lang);
}
