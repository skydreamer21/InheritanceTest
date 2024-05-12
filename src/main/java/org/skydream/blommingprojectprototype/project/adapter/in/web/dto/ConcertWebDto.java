package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;

import java.time.LocalDate;

@Builder
public record ConcertWebDto(ProjectWebDto projectWebDto, String concertPlace, LocalDate startDate, LocalDate endDate) {

    public static ConcertWebDto from(ConcertJpaEntity jpaEntity) {
        return ConcertWebDto.builder()
                .projectWebDto(ProjectWebDto.from(jpaEntity))
                .concertPlace(jpaEntity.getConcertPlace())
                .startDate(jpaEntity.getStartDate())
                .endDate(jpaEntity.getEndDate())
                .build();
    }
}
