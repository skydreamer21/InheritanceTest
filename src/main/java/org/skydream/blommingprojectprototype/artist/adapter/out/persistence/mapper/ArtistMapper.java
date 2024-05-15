package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.mapper;

import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper {
    public ArtistJpaEntity domainToEntity(Artist artist) {
        return ArtistJpaEntity.builder()
                .name(artist.getName())
                .description(artist.getDescription())
                .profileImgUrl(artist.getProfileImgUrl())
                .youtubeUrl(artist.getYoutubeUrl())
                .build();
    }
}
