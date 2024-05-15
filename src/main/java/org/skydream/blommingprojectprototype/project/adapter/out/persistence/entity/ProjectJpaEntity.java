package org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
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

    public ProjectJpaEntity(ProjectJpaEntityBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fundingAmount = builder.fundingAmount;
        this.targetAmount = builder.targetAmount;
        this.description = builder.description;
        this.posterImgUrl = builder.posterImgUrl;
        this.deleted = builder.deleted;
    }

    public static ProjectJpaEntityBuilder getBuilder() {
        return new ProjectJpaEntityBuilder();
    }

    public static class ProjectJpaEntityBuilder {

        private Long id;
        private String name;
        private Long fundingAmount;
        private Long targetAmount;
        private String description;
        private String posterImgUrl;
        private boolean deleted;

        public ProjectJpaEntityBuilder() {
        }

        public ProjectJpaEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProjectJpaEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProjectJpaEntityBuilder fundingAmount(Long fundingAmount) {
            this.fundingAmount = fundingAmount;
            return this;
        }

        public ProjectJpaEntityBuilder targetAmount(Long targetAmount) {
            this.targetAmount = targetAmount;
            return this;
        }

        public ProjectJpaEntityBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProjectJpaEntityBuilder posterImgUrl(String posterImgUrl) {
            this.posterImgUrl = posterImgUrl;
            return this;
        }

        public ProjectJpaEntityBuilder deleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public ProjectJpaEntity build() {
            return new ProjectJpaEntity(this);
        }
    }
}
