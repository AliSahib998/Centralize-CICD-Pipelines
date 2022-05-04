package az.unibank.wu.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Setter
@Getter
@ToString(exclude = "isoCountry")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "das_iso_country")
public class DasIsoCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "das_iso_generator")
    @SequenceGenerator(name = "das_iso_generator", sequenceName = "das_iso_country_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String isoCountryCode;
    private String nameLong;
    private String serviceFlags;
    private String doNotUseThisField;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iso_country_id")
    private IsoCountry isoCountry;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasIsoCountry that = (DasIsoCountry) o;
        return Objects.equals(isoCountryCode, that.isoCountryCode) &&
                Objects.equals(nameLong, that.nameLong) &&
                Objects.equals(serviceFlags, that.serviceFlags) &&
                Objects.equals(doNotUseThisField, that.doNotUseThisField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isoCountryCode, nameLong, serviceFlags, doNotUseThisField);
    }
}
