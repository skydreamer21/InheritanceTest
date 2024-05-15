package org.skydream.blommingprojectprototype.project.application.service;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.application.port.in.ProjectUseCase;
import org.skydream.blommingprojectprototype.project.application.port.out.ProjectPort;
import org.skydream.blommingprojectprototype.project.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService implements ProjectUseCase {

    private final ProjectPort projectPort;

    @Override
    public List<Project> findAllProjects() {
        return projectPort.findAll();
    }
}
