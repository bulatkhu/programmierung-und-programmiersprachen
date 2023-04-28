package übung2;


public class CD {
    String titel;
    double preis;
    long barcode;
    int laufzeit;
    String komponist;

    public CD(String titel, double preis, long barcode, int laufzeit, String komponist) {
        this.titel = titel;
        this.preis = preis;
        this.barcode = barcode;
        this.laufzeit = laufzeit;
        this.komponist = komponist;
    }

    public long getBarcode() {
        return barcode;
    }

    public double getPreis() {
        return preis;
    }

    public String getBeschreibung() {
        return String.format(
            "CD[Titel: %s, Preis: %s, Barcode: %s, Laufzeit: %s, Komponist: %s]",
            titel, preis, barcode, laufzeit, komponist
        );
    }
}
