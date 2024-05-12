package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;

@Builder
public record ProjectWebDto(Long id,
                            String name,
                            Long fundingAmount,
                            Long targetAmount,
                            String description,
                            String posterImgUrl) {

    public static ProjectWebDto from (ProjectJpaEntity projectJpaEntity) {
        return ProjectWebDto.builder()
                .id(projectJpaEntity.getId())
                .name(projectJpaEntity.getName())
                .fundingAmount(projectJpaEntity.getFundingAmount())
                .targetAmount(projectJpaEntity.getTargetAmount())
                .description(projectJpaEntity.getDescription())
                .posterImgUrl(projectJpaEntity.getPosterImgUrl())
                .build();
    }
}
