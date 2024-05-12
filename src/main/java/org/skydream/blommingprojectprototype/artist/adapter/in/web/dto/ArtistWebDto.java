package org.skydream.blommingprojectprototype.artist.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;

@Builder
public record ArtistWebDto(Long id, String name, String description, String profileImgUrl, String youtubeUrl) {

    public static ArtistWebDto from(ArtistJpaEntity artistJpaEntity) {
        return ArtistWebDto.builder()
                .id(artistJpaEntity.getId())
                .name(artistJpaEntity.getName())
                .description(artistJpaEntity.getDescription())
                .profileImgUrl(artistJpaEntity.getProfileImgUrl())
                .youtubeUrl(artistJpaEntity.getYoutubeUrl())
                .build();
    }
}
