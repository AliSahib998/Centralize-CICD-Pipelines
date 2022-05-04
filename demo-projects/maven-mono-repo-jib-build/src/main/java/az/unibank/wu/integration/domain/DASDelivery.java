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
import java.math.BigDecimal;

@Setter
@Getter
@ToString(exclude = "delivery")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "das_delivery")
public class DASDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "das_delivery_generator")
    @SequenceGenerator(name="das_delivery_generator", sequenceName = "das_delivery_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String destinationCode;
    private String serviceCode;
    private String serviceName;
    private String route;
    private String banner;
    private String description;
    private String templateKey;
    private String countryFilter;
    private String exclusionFlags;
    private BigDecimal sourceMinCurrency;
    private BigDecimal sourceMaxCurrency;
    private BigDecimal sourceIncrCurrency;
    private BigDecimal destMinCurrency;
    private BigDecimal destMaxCurrency;
    private BigDecimal destIncrCurrency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;
}
