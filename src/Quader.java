public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;
    private double dichte;

    public Quader(double laenge, double breite, double hoehe, double dichte) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
        this.dichte = dichte;
    }

    public Quader(double laenge, double breite, double hoehe) {
        this(laenge, breite, hoehe, 0.5);
    }

    public Quader(double laenge) {
        this(laenge, laenge, laenge, 1);
    }

    public double berechneVolumen() {
        return laenge * breite * hoehe;
    }

    public double berechneOberflaeche() {
        return 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;
    }

    public double berechneGewicht() {
        return this.berechneVolumen() * dichte;
    }

    public void printInfo() {
        System.out.println("Volumen: " + this.berechneVolumen() + "m³ Oberflaeche: " + this.berechneOberflaeche() + "m³ Gewicht: " + this.berechneGewicht() + "g");
    }

    public double getLaenge() {
        return this.laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return this.breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return this.hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getDichte() {
        return this.dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
}


//+----------------+
//|     Quader     |
//+----------------+
//|- laenge: double|
//|- breite: double|
//|- hoehe: double |
//|- dichte: double|
//+----------------+
//|+ Quader(l: double, b: double, h: double)          |
//|+ Quader(l: double, b: double, h: double, d: double)|
//|+ Quader(kantenlaenge: double)                     |
//|+ getLaenge(): double                              |
//|+ setLaenge(laenge: double): void                  |
//|+ getBreite(): double                              |
//|+ setBreite(breite: double): void                  |
//|+ getHoehe(): double                               |
//|+ setHoehe(hoehe: double): void                    |
//|+ getDichte(): double                              |
//|+ setDichte(dichte: double): void                  |
//|+ berechneVolumen(): double                        |
//|+ berechneOberflaeche(): double                    |
//|+ berechneGewicht(): double                        |
//+----------------+

