package de.thunderfrog;

public class CD{
    String artist, title;

    public CD(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Spiele " + artist + ", " + title);
    }
}
