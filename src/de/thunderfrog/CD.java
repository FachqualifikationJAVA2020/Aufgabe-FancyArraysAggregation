package de.thunderfrog;

public class CD{
    String artist, title;

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

    public CD(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Spiele " + artist + ", " + title);
    }


}
