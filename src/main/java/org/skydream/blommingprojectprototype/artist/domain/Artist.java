package org.skydream.blommingprojectprototype.artist.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Artist {

    private long id;
    private String name;
    private String description;
    private String profileImgUrl;
    private String youtubeUrl;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Builder
    public Artist(long id, String name, String description, String profileImgUrl, String youtubeUrl, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.profileImgUrl = profileImgUrl;
        this.youtubeUrl = youtubeUrl;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
