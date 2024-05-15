package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.domain.Concert;

public interface ConcertPort {
    Concert save(Concert concert, Long artistId);
}
