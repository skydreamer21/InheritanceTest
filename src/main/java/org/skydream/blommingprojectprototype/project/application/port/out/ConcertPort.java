package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Concert;

public interface ConcertPort {
    ConcertJpaEntity save(Concert concert, Long artistId);
}
