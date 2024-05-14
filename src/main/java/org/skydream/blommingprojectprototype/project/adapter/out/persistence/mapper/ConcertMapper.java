package org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.repository.ArtistSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.global.exception.artist.ArtistNotFoundException;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConcertMapper {

    private final ArtistSpringDataJpaRepository artistJpaRepository;

    public ConcertJpaEntity webDtoToJpaEntity(ConcertWebDto concertWebDto) {
        ArtistJpaEntity artistJpaEntity = artistJpaRepository.findById(concertWebDto.artistId())
                .orElseThrow(ArtistNotFoundException::new);

        return ConcertJpaEntity.builder()
                .name(concertWebDto.getName())
                .fundingAmount(concertWebDto.getFundingAmount())
                .targetAmount(concertWebDto.getTargetAmount())
                .description(concertWebDto.getDescription())
                .posterImgUrl(concertWebDto.getPosterImgUrl())
                .concertPlace(concertWebDto.concertPlace())
                .startDate(concertWebDto.startDate())
                .endDate(concertWebDto.endDate())
                .artist(artistJpaEntity)
                .build();

    }
}
