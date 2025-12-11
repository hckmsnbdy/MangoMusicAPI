package com.mangomusic.model;

public class AlbumPlayCount {
    private int albumId;
    private String albumTitle;
    private String artistName;
    private long playCount;

    public AlbumPlayCount(int albumId, String albumTitle, String artistName, long playCount) {
        this.albumId = albumId;
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.playCount = playCount;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public long getPlayCount() {
        return playCount;
    }
}

