package org.skydream.blommingprojectprototype.project.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.adapter.ArtistJpaAdapter;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper.ConcertMapper;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository.ConcertSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.project.application.port.out.ConcertPort;
import org.skydream.blommingprojectprototype.project.domain.Concert;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ConcertJpaAdapter implements ConcertPort {

    private final ConcertMapper concertMapper;
    private final ConcertSpringDataJpaRepository concertJpaRepository;
    private final ArtistJpaAdapter artistJpaAdapter;

    @Override
    public ConcertJpaEntity save(Concert concert, Long artistId) {
        ArtistJpaEntity artistJpaEntity = artistJpaAdapter.findById(artistId);
        return concertJpaRepository.save(concertMapper.domainToJpaEntity(concert, artistJpaEntity));
    }
}
