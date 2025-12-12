package com.mangomusic.model;

public class ArtistTopAlbum {
    private int albumId;
    private int artistId;
    private String title;
    private int releaseYear;
    private String artistName;
    private long playCount;

    public ArtistTopAlbum(int albumId, int artistId, String title, int releaseYear, String artistName, long playCount) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.artistName = artistName;
        this.playCount = playCount;
    }

    public int getAlbumId() { return albumId; }
    public int getArtistId() { return artistId; }
    public String getTitle() { return title; }
    public int getReleaseYear() { return releaseYear; }
    public String getArtistName() { return artistName; }
    public long getPlayCount() { return playCount; }
}
