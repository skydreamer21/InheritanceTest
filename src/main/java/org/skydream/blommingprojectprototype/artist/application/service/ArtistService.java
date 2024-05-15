package org.skydream.blommingprojectprototype.artist.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.application.port.in.ArtistUseCase;
import org.skydream.blommingprojectprototype.artist.application.port.out.ArtistPort;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtistService implements ArtistUseCase {

    private final ArtistPort artistPort;

    @Override
    public ArtistJpaEntity addArtist(Artist artist) {
        // 받은 artist를 db에 추가한다.
        return artistPort.save(artist);
    }
}
