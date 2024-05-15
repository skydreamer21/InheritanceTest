package org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AlbumActivityMapper {
    public AlbumActivityJpaEntity domainToJpaEntity(AlbumActivity albumActivity, ArtistJpaEntity artistJpaEntity) {
        return AlbumActivityJpaEntity.builder()
                .name(albumActivity.getName())
                .fundingAmount(albumActivity.getFundingAmount())
                .targetAmount(albumActivity.getTargetAmount())
                .description(albumActivity.getDescription())
                .posterImgUrl(albumActivity.getPosterImgUrl())
                .albumName(albumActivity.getAlbumName())
                .productionPeriod(albumActivity.getProductionPeriod())
                .artist(artistJpaEntity)
                .build();
    }
}
