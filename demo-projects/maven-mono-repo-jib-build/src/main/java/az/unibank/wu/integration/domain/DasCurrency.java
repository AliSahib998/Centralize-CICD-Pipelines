package az.unibank.wu.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
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

@Setter
@Getter
@Entity
@ToString(exclude = "dasCountry")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "DAS_CURRENCY")
public class DasCurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAS_CURRENCY_GENERATOR")
    @SequenceGenerator(name = "DAS_CURRENCY_GENERATOR", sequenceName = "DAS_CURRENCY_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    private String prefixFormat;
    private String displayCurrency;
    private String format;
    private String suffixFormat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    private DasCountry dasCountry;
}
