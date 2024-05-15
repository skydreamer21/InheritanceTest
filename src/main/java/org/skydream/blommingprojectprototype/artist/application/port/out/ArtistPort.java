package org.skydream.blommingprojectprototype.artist.application.port.out;

import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.domain.Artist;

public interface ArtistPort {
    ArtistJpaEntity save(Artist artist);
}
