package org.skydream.blommingprojectprototype.global.exception.artist;

public class ArtistNotFoundException extends RuntimeException {
    public ArtistNotFoundException() {
        super("없는 아티스트 입니다.");
    }

    public ArtistNotFoundException(String errorMsg) {
        super(errorMsg);
    }
}
