package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import lombok.Getter;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Concert;
import org.skydream.blommingprojectprototype.project.domain.Project;

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

    // without artist -> 여러 도메인 의존성 줄이기
    public Concert toDomain() {
        Concert.builder()
                .name(projectWebDto().name())
                .fundingAmount(projectWebDto().fundingAmount())
                .targetAmount(projectWebDto().targetAmount())
                .description(projectWebDto.description())
                .posterImgUrl(projectWebDto.posterImgUrl())
                .concertPlace(concertPlace)
                .startDate(startDate)
                .endDate(endDate)
                .build();

    }

}
