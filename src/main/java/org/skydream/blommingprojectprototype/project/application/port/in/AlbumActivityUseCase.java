package org.skydream.blommingprojectprototype.project.application.port.in;

import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;

public interface AlbumActivityUseCase {
    AlbumActivity addAlbumActivity(AlbumActivity albumActivity, Long artistId);
}
