package org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumActivitySpringDataJpaRepository extends JpaRepository<AlbumActivityJpaEntity, Long> {
}
