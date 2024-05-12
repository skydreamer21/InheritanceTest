package org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;

@Entity
@Table(name = "album_activity")
@DiscriminatorValue("album_activity")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AlbumActivityJpaEntity extends ProjectJpaEntity {

    @Column(nullable = false)
    private String albumName;

    @Column(nullable = false)
    private Integer productionPeriod;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private ArtistJpaEntity artist;

    @Builder
    public AlbumActivityJpaEntity(Long id, String name, Long fundingAmount, Long targetAmount,
                                  String description, String posterImgUrl, boolean deleted, String albumName, Integer productionPeriod, ArtistJpaEntity artist) {
        super(id, name, fundingAmount, targetAmount, description, posterImgUrl, deleted);
        this.albumName = albumName;
        this.productionPeriod = productionPeriod;
        this.artist = artist;
    }
}
