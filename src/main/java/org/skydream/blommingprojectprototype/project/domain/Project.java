package org.skydream.blommingprojectprototype.project.domain;

import lombok.Builder;
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

    @Builder
    public Project(Long id, String name, Long fundingAmount, Long targetAmount, String description, String posterImgUrl, AuditTime auditTime) {
        this.id = id;
        this.name = name;
        this.fundingAmount = fundingAmount;
        this.targetAmount = targetAmount;
        this.description = description;
        this.posterImgUrl = posterImgUrl;
        this.auditTime = auditTime;
    }
}
