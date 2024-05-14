package org.skydream.blommingprojectprototype.artist.application.port.in;

import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;

public interface ArtistUseCase {
    ArtistJpaEntity addArtist(ArtistWebDto artistWebDto);
}
