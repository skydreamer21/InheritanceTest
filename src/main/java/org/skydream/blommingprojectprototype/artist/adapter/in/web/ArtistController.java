package org.skydream.blommingprojectprototype.artist.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;
import org.skydream.blommingprojectprototype.artist.application.port.ArtistUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/artists")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistUseCase artistUseCase;

    @PostMapping
    public ResponseEntity<ArtistWebDto> addArtist(@RequestBody ArtistWebDto artistWebDto) {
        ArtistJpaEntity result = artistUseCase.addArtist(artistWebDto);
        return ResponseEntity.ok(ArtistWebDto.from(result));
    }
}
