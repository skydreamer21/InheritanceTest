package org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper;

import org.skydream.blommingprojectprototype.global.domain.AuditTime;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Project;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper {

    public ProjectJpaEntity domainToJpaEntity(Project project) {
        return ProjectJpaEntity.getBuilder()
                .name(project.getName())
                .fundingAmount(project.getFundingAmount())
                .targetAmount(project.getTargetAmount())
                .description(project.getDescription())
                .posterImgUrl(project.getPosterImgUrl())
                .build();
    }

    public Project jpaEntityToDomain(ProjectJpaEntity jpaEntity) {
        return Project.getBuilder()
                .id(jpaEntity.getId())
                .name(jpaEntity.getName())
                .fundingAmount(jpaEntity.getFundingAmount())
                .targetAmount(jpaEntity.getTargetAmount())
                .description(jpaEntity.getDescription())
                .posterImgUrl(jpaEntity.getPosterImgUrl())
                .auditTime(new AuditTime(jpaEntity.getCreatedAt(), jpaEntity.getUpdatedAt()))
                .build();
    }
}
