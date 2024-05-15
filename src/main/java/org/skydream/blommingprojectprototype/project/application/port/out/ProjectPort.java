package org.skydream.blommingprojectprototype.project.application.port.out;

import org.skydream.blommingprojectprototype.project.domain.Project;

import java.util.List;

public interface ProjectPort {
    List<Project> findAll();
}
