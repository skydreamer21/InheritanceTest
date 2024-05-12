package org.skydream.blommingprojectprototype.project.application.port;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;

import java.util.List;

public interface ProjectUseCase {
    List<ProjectJpaEntity> findAllProjects();
}
