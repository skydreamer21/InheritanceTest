package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.mapper.ArtistMapper;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.repository.ArtistSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.artist.application.port.out.ArtistPort;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.skydream.blommingprojectprototype.global.exception.artist.ArtistNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArtistJpaAdapter implements ArtistPort {

    private final ArtistMapper artistMapper;
    private final ArtistSpringDataJpaRepository artistJpaRepository;

    @Override
    public ArtistJpaEntity save(Artist artist) {
        return artistJpaRepository.save(artistMapper.domainToEntity(artist));
    }

    public ArtistJpaEntity findById(Long artistId) {
        return artistJpaRepository.findById(artistId).orElseThrow(ArtistNotFoundException::new);
    }
}
