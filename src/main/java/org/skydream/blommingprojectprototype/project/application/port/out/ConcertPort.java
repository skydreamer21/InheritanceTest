package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;

public interface ConcertPort {
    ConcertJpaEntity save(ConcertPort concertPort);
}