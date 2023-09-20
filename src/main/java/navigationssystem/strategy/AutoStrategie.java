package navigationssystem.strategy;

import navigationssystem.Ort;

import java.util.ArrayList;

public class AutoStrategie implements ReiseStrategie {
    private final double GESCHWINDIGKEIT = 30.5;
    private ArrayList<Ort> baustellen = new ArrayList<>();

    @Override
    public double berechneZeit(Ort[] route) {
        double strecke = 0.0;
        double zeitFuerBaustellen = 0.0;
        Ort vorgaenger = null;

        for (Ort ort: route) {
            if (vorgaenger != null) {
                strecke = Math.sqrt(
                    Math.pow(vorgaenger.getX() - ort.getX(), 2)
                        +
                    Math.pow(vorgaenger.getY() - ort.getY(), 2)
                );
            }
            vorgaenger = ort;

            if (baustellen.contains(ort)) {
                zeitFuerBaustellen += 15;
            }
        }

        return (strecke / GESCHWINDIGKEIT) * 60 + zeitFuerBaustellen;
    }

    public void addBaustelle(Ort ort) {
        baustellen.add(ort);
    }
}
