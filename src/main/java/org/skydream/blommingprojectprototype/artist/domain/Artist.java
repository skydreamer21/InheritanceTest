package org.skydream.blommingprojectprototype.artist.domain;

import lombok.Builder;
import lombok.Getter;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;

import java.time.LocalDateTime;

@Getter
public class Artist {

    private long id;
    private String name;
    private String description;
    private String profileImgUrl;
    private String youtubeUrl;
    private AuditTime auditTime;

    @Builder
    public Artist(long id, String name, String description, String profileImgUrl, String youtubeUrl, AuditTime auditTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.profileImgUrl = profileImgUrl;
        this.youtubeUrl = youtubeUrl;
        this.auditTime = auditTime;
    }
}
