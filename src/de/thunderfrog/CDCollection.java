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
        CDs.add(cd);
    }

    // spielt die angegebene CD und gibt true zurück
    // gibt false zurück, wenn die CD nicht in der Liste enthalten
    public boolean playCD(String title, String artist) {

        // Alle CDs im FancyArray durchgehen
        for (int i = 0; i < CDs.size(); i++) {
            CD cd = (CD) CDs.get(i);
            if (cd.getArtist().equals(artist) && cd.getTitle().equals(title)) {
                cd.play();
                return true;
            }
        }
        return false;
    }
}
