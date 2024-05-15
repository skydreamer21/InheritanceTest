package org.skydream.blommingprojectprototype.global.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AuditTime {

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public AuditTime(LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
