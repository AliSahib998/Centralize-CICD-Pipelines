package az.unibank.wu.integration.repository;

import az.unibank.wu.integration.domain.DasUsStateInfo;
import az.unibank.wu.integration.domain.IsoCountry;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DasUsStateInfoRepository extends JpaRepository<DasUsStateInfo,Long> {
    @EntityGraph(value = "DasUsStateInfo.usStates")
    Optional<DasUsStateInfo> findByLang(String lang);

    void deleteByLang(String lang);
}
