package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.in.ConcertUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.ConcertPort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConcertService implements ConcertUseCase {

    private final ConcertPort concertPort;

    @Override
    public ConcertJpaEntity addConcert(ConcertWebDto concertWebDto) {
        return concertPort.save(concertPort);
    }
}
