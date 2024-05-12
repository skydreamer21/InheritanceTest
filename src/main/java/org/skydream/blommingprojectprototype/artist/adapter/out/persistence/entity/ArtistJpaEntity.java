package org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.skydream.blommingprojectprototype.global.audit.BaseTime;

@Entity
@Table(name = "artist")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArtistJpaEntity extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column
    private String profileImgUrl;

    @Column
    private String youtubeUrl;

    @Column(nullable = false)
    @ColumnDefault(value = "false")
    private boolean deleted;

    @Builder
    public ArtistJpaEntity(long id, String name, String description, String profileImgUrl,
                           String youtubeUrl, boolean deleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.profileImgUrl = profileImgUrl;
        this.youtubeUrl = youtubeUrl;
        this.deleted = deleted;
    }
}
