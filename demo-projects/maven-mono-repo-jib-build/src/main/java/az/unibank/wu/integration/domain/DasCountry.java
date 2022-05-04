package az.unibank.wu.integration.domain;

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

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DAS_COUNTRY")
@NamedEntityGraph(name = "DasCountry.dasCurrencies",
        attributeNodes = @NamedAttributeNode("dasCurrencies")
)
public class DasCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAS_COUNTRY_GENERATOR")
    @SequenceGenerator(name="DAS_COUNTRY_GENERATOR", sequenceName = "DAS_COUNTRY_SEQ", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;
    private String lang;


    @CreationTimestamp
    private LocalDateTime createDate;

    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "ISO_COUNTRY_NUM_CD")
    private String isoCountryNumCd;
    @Column(name = "EQUIVALANCE_ENGLISH")
    private String equivalanceEnglish;

    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "dasCountry")
    private List<DasCurrency> dasCurrencies = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasCountry that = (DasCountry) o;
        return Objects.equals(lang, that.lang) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(isoCountryNumCd, that.isoCountryNumCd) &&
                Objects.equals(equivalanceEnglish, that.equivalanceEnglish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lang, countryName, isoCountryNumCd, equivalanceEnglish);
    }

}
