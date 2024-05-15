package org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.mapper.ArtistMapper;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Concert;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConcertMapper {

    private final ArtistMapper artistMapper;

    public ConcertJpaEntity domainToJpaEntity(Concert concert, ArtistJpaEntity artistJpaEntity) {
        return ConcertJpaEntity.builder()
                .name(concert.getName())
                .fundingAmount(concert.getFundingAmount())
                .targetAmount(concert.getTargetAmount())
                .description(concert.getDescription())
                .posterImgUrl(concert.getPosterImgUrl())
                .concertPlace(concert.getConcertPlace())
                .startDate(concert.getStartDate())
                .endDate(concert.getEndDate())
                .artist(artistJpaEntity)
                .build();

    }

    public Concert jpaEntityToDomain(ConcertJpaEntity jpaEntity) {
        return Concert.builder()
                .id(jpaEntity.getId())
                .name(jpaEntity.getName())
                .fundingAmount(jpaEntity.getFundingAmount())
                .targetAmount(jpaEntity.getTargetAmount())
                .description(jpaEntity.getDescription())
                .posterImgUrl(jpaEntity.getPosterImgUrl())
                .auditTime(new AuditTime(jpaEntity.getCreatedAt(), jpaEntity.getModifiedAt()))
                .concertPlace(jpaEntity.getConcertPlace())
                .startDate(jpaEntity.getStartDate())
                .endDate(jpaEntity.getEndDate())
                .artist(artistMapper.jpaEntityToDomain(jpaEntity.getArtist()))
                .build();

    }
}
