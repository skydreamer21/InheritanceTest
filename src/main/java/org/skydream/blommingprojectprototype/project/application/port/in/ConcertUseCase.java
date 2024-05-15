package org.skydream.blommingprojectprototype.project.application.port.in;

import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Concert;

public interface ConcertUseCase {
    ConcertJpaEntity addConcert(Concert concert, Long artistId);
}
