package org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertSpringDataJpaRepository extends JpaRepository<ConcertJpaEntity, Long> {
}
