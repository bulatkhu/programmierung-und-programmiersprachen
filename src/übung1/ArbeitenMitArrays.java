package übung1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArbeitenMitArrays {
    public void defaultMethod() {
        // Anlegen und Fuellen von x
        String[] x = new String[4];

        System.out.println("x: " + Arrays.toString(x));

        x[0] = "a";
        x[1] = "b";
        x[2] = "c";

        System.out.println("x: " + Arrays.toString(x));

        // Aendern und Loeschen eines Eintrags
        x[2] = "d";
        x[1] = null;

        System.out.println("x: " + Arrays.toString(x));

        // Alle Eintraege ausgeben
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);

        // einen Eintrag suchen
        String suchtext = "d";
        int nr = -1;
        for (int i = 0; i < x.length; i++)
            if (suchtext.equals(x[i]))
                nr = i;
        System.out.println("Position von " + suchtext + ": " + nr);
    }

    public static void main(String[] args) {
        Quader quader1 = new Quader(10, 10, 10, 3);
        Quader quader2 = new Quader(10, 10, 10, 1233);
        Quader quader3 = new Quader(10, 10, 10, 321);
        Quader quader4 = new Quader(10, 10, 10, 21);
        Quader quader5 = new Quader(10, 10, 10, 12312);

        ArrayList<Quader> quaders = new ArrayList<>();

        quaders.add(quader1);
        quaders.add(quader2);
        quaders.add(quader3);
        quaders.add(quader4);
        quaders.add(quader5);

        double gesamtGewicht = 0;

        for (int i = 0; i < quaders.size(); i++) {
            Quader quader = quaders.get(i);

            double gewicht = quader.berechneGewicht();
            gesamtGewicht = gesamtGewicht + gewicht;

            if (gewicht > 5000) {
                quaders.remove(i);
            }

        }

        System.out.println(gesamtGewicht);
    }
}