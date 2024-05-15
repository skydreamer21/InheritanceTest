package org.skydream.blommingprojectprototype.project.domain;

import lombok.Builder;
import lombok.Getter;
import org.skydream.blommingprojectprototype.artist.domain.Artist;
import org.skydream.blommingprojectprototype.global.domain.AuditTime;

@Getter
public class AlbumActivity extends Project {
    private String albumName;
    private Integer productionPeriod;
    private Artist artist;

    @Builder
    public AlbumActivity(Long id,
                         String name,
                         Long fundingAmount,
                         Long targetAmount,
                         String description,
                         String posterImgUrl,
                         AuditTime auditTime,
                         String albumName,
                         Integer productionPeriod,
                         Artist artist) {
        super(id, name, fundingAmount, targetAmount, description, posterImgUrl, auditTime);
        this.albumName = albumName;
        this.productionPeriod = productionPeriod;
        this.artist = artist;
    }
}
