package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.AlbumActivityWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.in.AlbumActivityUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.AlbumActivityPort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumActivityService implements AlbumActivityUseCase {

    private final AlbumActivityPort albumActivityPort;
    @Override
    public AlbumActivityJpaEntity addAlbumActivity(AlbumActivityWebDto albumActivityWebDto) {
        return albumActivityPort.save(albumActivityWebDto);
    }
}
