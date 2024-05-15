package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.mapper;

import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;
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

    public Artist jpaEntityToDomain(ArtistJpaEntity jpaEntity) {
        return Artist.builder()
                .id(jpaEntity.getId())
                .name(jpaEntity.getName())
                .description(jpaEntity.getDescription())
                .profileImgUrl(jpaEntity.getProfileImgUrl())
                .youtubeUrl(jpaEntity.getYoutubeUrl())
                .auditTime(new AuditTime(jpaEntity.getCreatedAt(), jpaEntity.getUpdatedAt()))
                .build();
    }
}
