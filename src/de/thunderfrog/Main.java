package de.thunderfrog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            CDCollection collection=new CDCollection();
            collection.addCD(new CD("Wonderwall","Oasis"));
            collection.addCD(new CD("Galvanize","Chemical Brothers"));

            Scanner keyboard= new Scanner(System.in);

            String title=keyboard.nextLine(), artist=keyboard.nextLine();

            if (collection.playCD(title,artist)==false) {
                System.out.println("Diese CD Ist nicht in der Sammlung enthalten");
            }
    }

}
