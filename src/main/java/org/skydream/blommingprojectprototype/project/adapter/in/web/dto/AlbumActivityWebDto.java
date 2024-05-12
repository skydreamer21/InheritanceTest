package org.skydream.blommingprojectprototype.project.adapter.in.web.dto;

import lombok.Builder;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;

@Builder
public record AlbumActivityWebDto(ProjectWebDto projectWebDto, String albumName, Integer productionPeriod) {

    public static AlbumActivityWebDto from(AlbumActivityJpaEntity jpaEntity) {
        return AlbumActivityWebDto.builder()
                .projectWebDto(ProjectWebDto.from(jpaEntity))
                .albumName(jpaEntity.getAlbumName())
                .productionPeriod(jpaEntity.getProductionPeriod())
                .build();
    }
}
