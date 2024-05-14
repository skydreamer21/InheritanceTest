package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.AlbumActivityWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;

public interface AlbumActivityPort {
    AlbumActivityJpaEntity save(AlbumActivityWebDto albumActivityWebDto);
}
