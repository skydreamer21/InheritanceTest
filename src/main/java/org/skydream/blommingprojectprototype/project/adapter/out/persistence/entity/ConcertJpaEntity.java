package org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.skydream.blommingprojectprototype.artist.adapter.out.persistence.entity.ArtistJpaEntity;

import java.time.LocalDate;

@Entity
@Table(name = "concert")
@DiscriminatorValue("concert")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ConcertJpaEntity extends ProjectJpaEntity {

    @Column(nullable = false)
    private String concertPlace;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private ArtistJpaEntity artist;

    @Builder
    public ConcertJpaEntity(Long id, String name, Long fundingAmount, Long targetAmount, String description, String posterImgUrl, boolean deleted,
                            String concertPlace, LocalDate startDate, LocalDate endDate, ArtistJpaEntity artist) {
        super(id, name, fundingAmount, targetAmount, description, posterImgUrl, deleted);
        this.concertPlace = concertPlace;
        this.startDate = startDate;
        this.endDate = endDate;
        this.artist = artist;
    }
}
