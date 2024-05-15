package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;

public interface AlbumActivityPort {
    AlbumActivity save(AlbumActivity albumActivity, Long artistId);
}
