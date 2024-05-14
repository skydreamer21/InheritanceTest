package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ProjectJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.in.ProjectUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.ProjectPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService implements ProjectUseCase {

    private final ProjectPort projectPort;

    @Override
    public List<ProjectJpaEntity> findAllProjects() {
        return projectPort.findAll();
    }
}
