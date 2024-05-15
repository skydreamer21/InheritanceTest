package org.skydream.blommingprojectprototype.project.domain;

import lombok.Builder;
import lombok.Getter;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;

import java.time.LocalDate;

@Getter
public class Concert extends Project {
    private String concertPlace;
    private LocalDate startDate;
    private LocalDate endDate;
    private Artist artist;

    @Builder
    public Concert(Long id,
                   String name,
                   Long fundingAmount,
                   Long targetAmount,
                   String description,
                   String posterImgUrl,
                   AuditTime auditTime,
                   String concertPlace,
                   LocalDate startDate,
                   LocalDate endDate,
                   Artist artist) {
        super(id, name, fundingAmount, targetAmount, description, posterImgUrl, auditTime);
        this.concertPlace = concertPlace;
        this.startDate = startDate;
        this.endDate = endDate;
        this.artist = artist;
    }
}
