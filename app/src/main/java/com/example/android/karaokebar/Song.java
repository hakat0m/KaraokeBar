package com.example.android.karaokebar;

/**
 * Created by Aga on 3/2/2017.
 */

public class Song {
    private int placeInQueue;
    private String title;
    private String artist;
    private String singer;

/*
* Creates new song object
*
* @param pArtistName is name of singer
* @param pTitle is the title of the performed song
*
* */

    public Song(String pSinger, String pArtist, String pTitle) {
        this.artist = pArtist;
        this.title = pTitle;
        this.singer = pSinger;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String pTitle) {
        title = pTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String pArtist) {
        artist = pArtist;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String pSinger) {
        singer = pSinger;
    }

    @Override
    public String toString() {
        return "Song{" +
                "placeInQueue=" + placeInQueue +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
