package az.unibank.wu.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "delivery")
@NamedEntityGraph(name = "Delivery.dasDeliveries",
        attributeNodes = @NamedAttributeNode("dasDeliveries")
)
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "delivery_generator")
    @SequenceGenerator(name="delivery_generator", sequenceName = "delivery_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    public Long id;
    private String desCountry;
    private String desCurrency;
    private String orgCurrency;

    @CreationTimestamp
    private LocalDateTime createDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    private List<DASDelivery> dasDeliveries = new ArrayList<>();

}
