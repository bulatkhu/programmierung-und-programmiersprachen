package navigationssystem.strategy;

import navigationssystem.Ort;

public class FahrradStrategie implements ReiseStrategie {
    private final double GESCHWINDIGKEIT = 10.0;

    @Override
    public double berechneZeit(Ort[] route) {
        double strecke = 0.0;
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
        }

        return (strecke / GESCHWINDIGKEIT) * 60;
    }
}
