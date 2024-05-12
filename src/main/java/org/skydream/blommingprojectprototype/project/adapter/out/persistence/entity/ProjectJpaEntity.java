package org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.skydream.blommingprojectprototype.global.audit.BaseTime;

@Entity
@Table(name = "project")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProjectJpaEntity extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long fundingAmount;

    @Column(nullable = false)
    private Long targetAmount;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String posterImgUrl;

    @Column(nullable = false)
    @ColumnDefault(value = "false")
    private boolean deleted;

    @Builder
    public ProjectJpaEntity(Long id, String name, Long fundingAmount, Long targetAmount,
                            String description, String posterImgUrl, boolean deleted) {
        this.id = id;
        this.name = name;
        this.fundingAmount = fundingAmount;
        this.targetAmount = targetAmount;
        this.description = description;
        this.posterImgUrl = posterImgUrl;
        this.deleted = deleted;
    }
}
