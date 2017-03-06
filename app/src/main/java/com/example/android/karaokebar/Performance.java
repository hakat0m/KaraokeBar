package com.example.android.karaokebar;

/**
 * Created by Aga on 3/2/2017.
 */

public class Performance {
    private int placeInQueue;
    private String title;
    private String artist;
    private String singer;
    private int imageResourceId;

/*
* Creates new song object
*
* @param pArtistName is name of singer
* @param pTitle is the title of the performed song
*
* */

    public Performance(String pSinger, String pArtist, String pTitle, int pImageResourceId) {
        this.artist = pArtist;
        this.title = pTitle;
        this.singer = pSinger;
        this.imageResourceId = pImageResourceId;
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

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int pImageResourceId) {
        imageResourceId = pImageResourceId;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "placeInQueue=" + placeInQueue +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
