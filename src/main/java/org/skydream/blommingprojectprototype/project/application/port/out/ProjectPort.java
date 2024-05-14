package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;

import java.util.List;

public interface ProjectPort {
    List<ProjectJpaEntity> findAll();
}
