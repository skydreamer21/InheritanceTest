package org.skydream.blommingprojectprototype.project.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.application.port.in.ConcertUseCase;
import org.skydream.blommingprojectprototype.project.domain.Concert;
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
    public ResponseEntity<Concert> addConcert(@RequestBody ConcertWebDto concertWebDto) {
        Concert result = concertUseCase.addConcert(concertWebDto.toDomain(), concertWebDto.artistId());
        return ResponseEntity.ok(result);

    }
}
