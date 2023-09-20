package navigationssystem;

import navigationssystem.strategy.AutoStrategie;
import navigationssystem.strategy.FahrradStrategie;

public class MainApp {
    public static void main(String[] args) {
        Ort Bochum = new Ort("Bochum", 12, 15);
        Ort Wattenscheid = new Ort("Wattenscheid", 25, 18);
        Ort Essen = new Ort("Essen", 30, 20);
        Ort Muelheim = new Ort("Mülheim", 35, 25);

        Ort[] orte = { Bochum, Wattenscheid, Essen, Muelheim };


        var fahrradStrategie = new FahrradStrategie();
        var fahrradNavigator = new Navigator(fahrradStrategie);
        double fahrradStrategieZeit = fahrradNavigator.berechneZeit(orte);
        System.out.printf("Fahrrad Strategie Zeit: %s \n", fahrradStrategieZeit);


        var autoStrategie = new AutoStrategie();
        var autoNavigator = new Navigator(autoStrategie);
        double autoStrategieZeit = autoNavigator.berechneZeit(orte);
        System.out.printf("Auto Strategie Zeit: %s \n", autoStrategieZeit);


        var autoStrategieMitBaustelle = new AutoStrategie();
        autoStrategieMitBaustelle.addBaustelle(Bochum);
        var autoStrategieMitBaustelleNavigator = new Navigator(autoStrategieMitBaustelle);
        double autoStrategieZeitMitBaustelle = autoStrategieMitBaustelleNavigator.berechneZeit(orte);

        System.out.printf("Auto Strategie Zeit Mit Baustelle: %s \n", autoStrategieZeitMitBaustelle);
    }
}