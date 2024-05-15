package org.skydream.blommingprojectprototype.project.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ProjectWebDto;
import org.skydream.blommingprojectprototype.project.application.port.in.ProjectUseCase;
import org.skydream.blommingprojectprototype.project.domain.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectUseCase projectUseCase;

    @GetMapping
    public ResponseEntity<List<Project>> projectList() {
        List<Project> results = projectUseCase.findAllProjects();
        return ResponseEntity.ok(results);
    }
}
