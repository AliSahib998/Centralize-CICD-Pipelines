package az.unibank.wu.integration.repository;

import az.unibank.wu.integration.domain.MexicoState;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MexicoStateRepository extends JpaRepository<MexicoState, Long> {

    @EntityGraph(value = "MexicoState.cities")
    List<MexicoState> findAll();


}
