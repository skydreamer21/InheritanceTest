package org.skydream.blommingprojectprototype.project.application.port;

import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;

public interface ConcertUseCase {
    ConcertJpaEntity addConcert(ConcertWebDto concertWebDto);
}
