package org.skydream.blommingprojectprototype.project.domain;

import lombok.Getter;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;

@Getter
public class Project {

    private Long id;
    private String name;
    private Long fundingAmount;
    private Long targetAmount;
    private String description;
    private String posterImgUrl;
    private AuditTime auditTime;

    public Project(Long id, String name, Long fundingAmount, Long targetAmount, String description, String posterImgUrl, AuditTime auditTime) {
        this.id = id;
        this.name = name;
        this.fundingAmount = fundingAmount;
        this.targetAmount = targetAmount;
        this.description = description;
        this.posterImgUrl = posterImgUrl;
        this.auditTime = auditTime;
    }

    public Project(ProjectBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fundingAmount = builder.fundingAmount;
        this.targetAmount = builder.targetAmount;
        this.description = builder.description;
        this.posterImgUrl = builder.posterImgUrl;
        this.auditTime = builder.auditTime;
    }

    public static ProjectBuilder getBuilder() {
        return new ProjectBuilder();
    }

    public static class ProjectBuilder {

        private Long id;
        private String name;
        private Long fundingAmount;
        private Long targetAmount;
        private String description;
        private String posterImgUrl;
        private AuditTime auditTime;

        public ProjectBuilder() {
        }

        public ProjectBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProjectBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProjectBuilder fundingAmount(Long fundingAmount) {
            this.fundingAmount = fundingAmount;
            return this;
        }

        public ProjectBuilder targetAmount(Long targetAmount) {
            this.targetAmount = targetAmount;
            return this;
        }

        public ProjectBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProjectBuilder posterImgUrl(String posterImgUrl) {
            this.posterImgUrl = posterImgUrl;
            return this;
        }

        public ProjectBuilder auditTime(AuditTime auditTime) {
            this.auditTime = auditTime;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }
}
