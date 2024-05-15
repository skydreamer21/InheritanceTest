package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.application.port.out.ArtistPort;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.in.ConcertUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.ConcertPort;
import org.skydream.blommingprojectprototype.project.domain.Concert;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConcertService implements ConcertUseCase {

    private final ConcertPort concertPort;

    @Override
    public ConcertJpaEntity addConcert(Concert concert, Long artistId) {
        return concertPort.save(concert, artistId);
    }
}
