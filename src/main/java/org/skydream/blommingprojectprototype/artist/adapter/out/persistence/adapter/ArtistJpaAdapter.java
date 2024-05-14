package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.repository.ArtistSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.artist.application.port.out.ArtistPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArtistJpaAdapter implements ArtistPort {

    private final ArtistSpringDataJpaRepository artistJpaRepository;

    @Override
    public ArtistJpaEntity save(ArtistWebDto artistWebDto) {
        return artistJpaRepository.save();
    }
}
