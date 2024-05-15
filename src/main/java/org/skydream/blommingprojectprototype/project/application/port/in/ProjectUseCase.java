package org.skydream.blommingprojectprototype.project.application.port.in;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;
import org.skydream.blommingprojectprototype.project.domain.Project;

import java.util.List;

public interface ProjectUseCase {
    List<Project> findAllProjects();
}
