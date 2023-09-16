package com.company;
public class MusicSelection {

    private String genre, artist, title, album, date;
    public MusicSelection()
    {
    genre=null;
    artist=null;
    title=null;
    album=null;
    date=null;
    }
    public MusicSelection(String genre, String artist, String title, String album, String date) {
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

    @Override
    public String toString() {
        return  "Genre=        " + genre + '\n' +
                "Artist=       " + artist + '\n' +
                "Title=        " + title + '\n' +
                "Album=        " + album + '\n' +
                "Release Date= " + date + '\n';
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
