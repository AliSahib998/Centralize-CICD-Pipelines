package az.unibank.wu.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MEXICO_STATE")
@NamedEntityGraph(name = "MexicoState.cities",
        attributeNodes = @NamedAttributeNode("cities")
)
public class MexicoState {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_generator")
    @SequenceGenerator(name = "state_generator", sequenceName = "mexico_state_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String name;
    private String stateCode;

    @Column(name = "CREATE_DATE")
    @CreationTimestamp
    private LocalDateTime createDate;

    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "mexicoState")
    private List<City> cities = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MexicoState that = (MexicoState) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
