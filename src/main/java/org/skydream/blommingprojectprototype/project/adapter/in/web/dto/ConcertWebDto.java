package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import lombok.Getter;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;

import java.time.LocalDate;

@Builder
public record ConcertWebDto(ProjectWebDto projectWebDto, String concertPlace, LocalDate startDate, LocalDate endDate, Long artistId) {

    public static ConcertWebDto from(ConcertJpaEntity jpaEntity) {
        return ConcertWebDto.builder()
                .projectWebDto(ProjectWebDto.from(jpaEntity))
                .concertPlace(jpaEntity.getConcertPlace())
                .startDate(jpaEntity.getStartDate())
                .endDate(jpaEntity.getEndDate())
                .artistId(jpaEntity.getArtist().getId())
                .build();
    }

    public Long getId() {
        return projectWebDto().id();
    }

    public String getName() {
        return projectWebDto().name();
    }

    public Long getFundingAmount() {
        return projectWebDto().fundingAmount();
    }

    public Long getTargetAmount() {
        return projectWebDto().targetAmount();
    }

    public String getDescription() {
        return projectWebDto().description();
    }

    public String getPosterImgUrl() {
        return projectWebDto().posterImgUrl();
    }

}
