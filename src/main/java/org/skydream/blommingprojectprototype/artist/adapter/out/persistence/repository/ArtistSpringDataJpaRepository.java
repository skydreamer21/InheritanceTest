package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.repository;

import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistSpringDataJpaRepository extends JpaRepository<ArtistJpaEntity, Long> {
}
