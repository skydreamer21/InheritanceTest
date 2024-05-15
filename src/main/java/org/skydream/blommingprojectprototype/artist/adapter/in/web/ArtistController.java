package org.skydream.blommingprojectprototype.artist.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.artist.adapter.in.web.dto.ArtistWebDto;
import org.skydream.blommingprojectprototype.artist.application.port.in.ArtistUseCase;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
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
    public ResponseEntity<Artist> addArtist(@RequestBody ArtistWebDto artistWebDto) {
        Artist result = artistUseCase.addArtist(artistWebDto.toDomain());
        return ResponseEntity.ok(result);
    }
}
