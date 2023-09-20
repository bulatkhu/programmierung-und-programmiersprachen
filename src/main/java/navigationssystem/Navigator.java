package navigationssystem;

import navigationssystem.strategy.ReiseStrategie;

public class Navigator {
    private ReiseStrategie reiseStrategie;

    public Navigator(ReiseStrategie reiseStrategie) {
        this.reiseStrategie = reiseStrategie;
    }

    public double berechneZeit(Ort[] orte) {
        return reiseStrategie.berechneZeit(orte);
    }
}
