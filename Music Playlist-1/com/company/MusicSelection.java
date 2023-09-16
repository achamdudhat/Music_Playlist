package com.company;
import java.util.Scanner;
class MusicSelection {
    MusicSelection();
private String genre, artist, title, album;
    private int date;

    public MusicSelection(String genre, String artist, String title, String album,  date) {
        this.genre = genre;
        this.artist = artist;
        this.title = title;
        this.album = album;
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
