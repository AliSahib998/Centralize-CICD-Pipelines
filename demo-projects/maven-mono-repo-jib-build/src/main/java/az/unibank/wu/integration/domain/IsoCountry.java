package az.unibank.wu.integration.domain;

import az.unibank.wu.integration.service.dto.IsoCountryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

@ToString
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "iso_country")
@NamedEntityGraph(name = "IsoCountry.dasIsoCountries",
        attributeNodes = @NamedAttributeNode("dasIsoCountries")
)
public class IsoCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "iso_generator")
    @SequenceGenerator(name = "iso_generator", sequenceName = "iso_country_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String lang;

    @CreationTimestamp
    private LocalDateTime createDate;

    @Enumerated(EnumType.STRING)
    private IsoCountryType type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isoCountry", orphanRemoval = true)
    private List<DasIsoCountry> dasIsoCountries = new ArrayList<>();

}
