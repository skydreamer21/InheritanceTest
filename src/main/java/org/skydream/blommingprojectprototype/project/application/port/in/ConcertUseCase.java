package org.skydream.blommingprojectprototype.project.application.port.in;

import org.skydream.blommingprojectprototype.project.domain.Concert;

public interface ConcertUseCase {
    Concert addConcert(Concert concert, Long artistId);
}
