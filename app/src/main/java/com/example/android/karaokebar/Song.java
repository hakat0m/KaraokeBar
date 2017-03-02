package com.example.android.karaokebar;

/**
 * Created by Aga on 3/2/2017.
 */

public class Song {
    private int placeInQueue;
    private String title;
    private String artistName;

/*
* Creates new song object
*
* @param pArtistName is name of singer
* @param pTitle is the title of the performed song
*
* */

    public Song(String pArtistName, String pTitle) {
        this.artistName = pArtistName;
        this.title = pTitle;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String pTitle) {
        title = pTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String pArtistName) {
        artistName = pArtistName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "placeInQueue=" + placeInQueue +
                ", title='" + title + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
