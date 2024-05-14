package org.skydream.blommingprojectprototype.project.application.port.in;

import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.AlbumActivityWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;

public interface AlbumActivityUseCase {
    AlbumActivityJpaEntity addAlbumActivity(AlbumActivityWebDto albumActivityWebDto);
}
