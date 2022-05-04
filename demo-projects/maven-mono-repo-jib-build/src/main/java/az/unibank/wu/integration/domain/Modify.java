package az.unibank.wu.integration.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MODIFYS")
public class Modify {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MODIFY_GENERATOR")
    @SequenceGenerator(name = "MODIFY_GENERATOR", sequenceName = "MODIFY_SEQ", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "DATA")
    private String data;

    @Column(name = "REFERANCE_NUMBER")
    private String referanceNumber;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @PrePersist
    private void setCreateDate() {
        createDate = LocalDateTime.now();
    }
}
