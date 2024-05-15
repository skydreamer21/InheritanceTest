package org.skydream.blommingprojectprototype.artist.application.port.out;

import org.skydream.blommingprojectprototype.artist.domain.Artist;

public interface ArtistPort {
    Artist save(Artist artist);
}
