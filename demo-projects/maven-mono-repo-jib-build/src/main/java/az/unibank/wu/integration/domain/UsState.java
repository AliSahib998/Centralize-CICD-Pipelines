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

@ToString(exclude = "dasUsStateInfo")
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "us_state")
public class UsState {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "us_state_generator")
    @SequenceGenerator(name = "us_state_generator", sequenceName = "us_state_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String stateCode;
    private String stateName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "us_state_id")
    private DasUsStateInfo dasUsStateInfo;

}
