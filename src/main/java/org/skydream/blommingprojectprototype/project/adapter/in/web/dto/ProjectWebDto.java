package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.project.domain.Project;

@Builder
public record ProjectWebDto(Long id,
                            String name,
                            Long fundingAmount,
                            Long targetAmount,
                            String description,
                            String posterImgUrl) {

    public static ProjectWebDto from (Project project) {
        return ProjectWebDto.builder()
                .id(project.getId())
                .name(project.getName())
                .fundingAmount(project.getFundingAmount())
                .targetAmount(project.getTargetAmount())
                .description(project.getDescription())
                .posterImgUrl(project.getPosterImgUrl())
                .build();
    }

    public Project toDomain() {
        return Project.builder()
                .name(name)
                .fundingAmount(fundingAmount)
                .targetAmount(targetAmount)
                .description(description)
                .posterImgUrl(posterImgUrl)
                .build();
    }
}
