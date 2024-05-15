package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.application.port.in.AlbumActivityUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.AlbumActivityPort;
import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumActivityService implements AlbumActivityUseCase {

    private final AlbumActivityPort albumActivityPort;
    @Override
    public AlbumActivity addAlbumActivity(AlbumActivity albumActivity, Long artistId) {
        return albumActivityPort.save(albumActivity, artistId);
    }
}
