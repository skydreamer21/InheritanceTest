package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;

@Builder
public record AlbumActivityWebDto(ProjectWebDto projectWebDto, String albumName, Integer productionPeriod, Long artistId) {

    public static AlbumActivityWebDto from(AlbumActivityJpaEntity jpaEntity) {
        return AlbumActivityWebDto.builder()
                .projectWebDto(ProjectWebDto.from(jpaEntity))
                .albumName(jpaEntity.getAlbumName())
                .productionPeriod(jpaEntity.getProductionPeriod())
                .artistId(jpaEntity.getArtist().getId())
                .build();
    }

    public AlbumActivity toDomain() {
        return AlbumActivity.builder()
                .name(projectWebDto().name())
                .fundingAmount(projectWebDto().fundingAmount())
                .targetAmount(projectWebDto().targetAmount())
                .description(projectWebDto.description())
                .posterImgUrl(projectWebDto.posterImgUrl())
                .albumName(albumName)
                .productionPeriod(productionPeriod)
                .build();
    }
}
