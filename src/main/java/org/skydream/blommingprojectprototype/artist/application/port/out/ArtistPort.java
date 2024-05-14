package org.skydream.blommingprojectprototype.artist.application.port.out;

import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;

public interface ArtistPort {
    ArtistJpaEntity save(ArtistWebDto artistWebDto);
}
