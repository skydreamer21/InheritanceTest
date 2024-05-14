package org.skydream.blommingprojectprototype.project.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.AlbumActivityWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.AlbumActivityJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.in.AlbumActivityUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/album-activities")
@RequiredArgsConstructor
public class AlbumActivityController {

    private final AlbumActivityUseCase albumActivityUseCase;

    @PostMapping
    public ResponseEntity<AlbumActivityWebDto> addAlbumActivity(@RequestBody AlbumActivityWebDto albumActivityWebDto) {
        AlbumActivityJpaEntity result = albumActivityUseCase.addAlbumActivity(albumActivityWebDto);
        return ResponseEntity.ok(AlbumActivityWebDto.from(result));

    }
}
