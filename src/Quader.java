public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader() {
        this.laenge = 0;
        this.breite = 0;
        this.hoehe = 0;
    }

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double berechneVolumen() {
        return laenge * breite * hoehe;
    }

    public double berechneOberflaeche() {
        return 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;
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

}
