package org.skydream.blommingprojectprototype.project.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper.ProjectMapper;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository.ProjectSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.project.application.port.out.ProjectPort;
import org.skydream.blommingprojectprototype.project.domain.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProjectJpaAdapter implements ProjectPort {

    private final ProjectSpringDataJpaRepository projectJpaRepository;
    private final ProjectMapper projectMapper;
    @Override
    public List<Project> findAll() {
        List<ProjectJpaEntity> projectJpaEntities = projectJpaRepository.findAllByDeletedIsFalse();
        return projectJpaEntities.stream().map(projectMapper::jpaEntityToDomain).toList();
    }
}
