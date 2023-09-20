package navigationssystem.strategy;

import navigationssystem.Ort;

public interface ReiseStrategie {
    double berechneZeit(Ort[] orte);
}
