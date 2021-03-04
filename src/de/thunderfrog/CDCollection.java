package de.thunderfrog;

import de.thunderfrog.utils.FancyArray;

public class CDCollection {
    FancyArray CDs;

    // initialisiert das FancyArray
    public CDCollection(){
        CDs = new FancyArray();
    }

    // fügt der Sammlung eine  CD hinzu
    public void addCD (CD cd){

        CDs.add(cd.artist);
        CDs.add(cd.title);

        System.out.println("CD : " + cd.artist + " | " + cd.title  + " hinzugefügt!");
    }

    // spielt die angegebene CD und gibt true zurück
    // gibt false zurück, wenn die CD nicht in der Liste enthalten
    public boolean playCD(String title, String artist){
        if(CDs.indexOf(title) != -1 || CDs.indexOf(artist) != -1){
            System.out.println("Aktuelles Lied: " + title + " von " + artist);
            return true;
        }
        return false;
    }
}
