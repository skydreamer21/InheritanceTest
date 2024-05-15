package org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper;

import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Concert;
import org.springframework.stereotype.Component;

@Component
public class ConcertMapper {

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
}
