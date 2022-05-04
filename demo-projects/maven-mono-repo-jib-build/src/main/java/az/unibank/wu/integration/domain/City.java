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
@ToString(exclude = "mexicoState")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CITYS")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_generator")
    @SequenceGenerator(name = "city_generator", sequenceName = "city_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private MexicoState mexicoState;

}
