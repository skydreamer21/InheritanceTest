package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.mapper;

import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper {
    public ArtistJpaEntity webDtoToEntity(ArtistWebDto artistWebDto) {
        return ArtistJpaEntity.builder()
                .name(artistWebDto.name())
                .description(artistWebDto.description())
                .profileImgUrl(artistWebDto.profileImgUrl())
                .youtubeUrl(artistWebDto.youtubeUrl())
                .build();
    }
}
