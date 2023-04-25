package übung1;

import java.util.ArrayList;

public class ArbeitenMitArrays2 {
    public static void main(String[] args) {
        // Anlegen und Fuellen von x
        ArrayList<String> x = new ArrayList<String>();
        x.add("a");
        x.add("b");
        x.add("c");

        // Aendern und Loeschen eines Eintrags
        x.set(2, "d");
        x.remove(1);

        // Alle Eintraege ausgeben
        for (int i = 0; i < x.size(); i++)
            System.out.println(x.get(i));

        // einen Eintrag suchen
        String suchtext = "d";
        System.out.println("Position von " + suchtext + ": " + x.indexOf(suchtext));

    }
}