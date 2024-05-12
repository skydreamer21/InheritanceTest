package org.skydream.blommingprojectprototype.project.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.application.port.ConcertUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/concerts")
@RequiredArgsConstructor
public class ConcertController {

    private final ConcertUseCase concertUseCase;

    @PostMapping
    public ResponseEntity<ConcertWebDto> addConcert(@RequestBody ConcertWebDto concertWebDto) {
        ConcertJpaEntity result = concertUseCase.addConcert(concertWebDto);
        return ResponseEntity.ok(ConcertWebDto.from(result));

    }
}
