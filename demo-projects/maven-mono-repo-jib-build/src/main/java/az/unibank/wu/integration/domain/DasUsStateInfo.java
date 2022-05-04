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
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NamedEntityGraph(name = "DasUsStateInfo.usStates",
        attributeNodes = @NamedAttributeNode("usStates")
)
@Table(name = "das_us_state_info")
public class DasUsStateInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "das_us_state_info_generator")
    @SequenceGenerator(name = "das_us_state_info_generator", sequenceName = "das_us_state_info_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String lang;

    @Column(name = "CREATE_DATE")
    @CreationTimestamp
    private LocalDateTime createDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dasUsStateInfo", orphanRemoval = true)
    private List<UsState> usStates = new ArrayList<>();


}
