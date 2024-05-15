package org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectSpringDataJpaRepository extends JpaRepository<ProjectJpaEntity, Long> {
    List<ProjectJpaEntity> findAllByDeletedIsFalse();
}
