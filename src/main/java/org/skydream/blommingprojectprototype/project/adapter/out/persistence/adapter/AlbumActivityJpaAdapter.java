package org.skydream.blommingprojectprototype.project.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.adapter.ArtistJpaAdapter;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper.AlbumActivityMapper;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository.AlbumActivitySpringDataJpaRepository;
import org.skydream.blommingprojectprototype.project.application.port.out.AlbumActivityPort;
import org.skydream.blommingprojectprototype.project.domain.AlbumActivity;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AlbumActivityJpaAdapter implements AlbumActivityPort {

    private final ArtistJpaAdapter artistJpaAdapter;
    private final AlbumActivitySpringDataJpaRepository albumActivityJpaRepository;
    private final AlbumActivityMapper albumActivityMapper;
    @Override
    public AlbumActivityJpaEntity save(AlbumActivity albumActivity, Long artistId) {
        ArtistJpaEntity artistJpaEntity = artistJpaAdapter.findById(artistId);
        return albumActivityJpaRepository.save(albumActivityMapper.domainToJpaEntity(albumActivity, artistJpaEntity));
    }
}
