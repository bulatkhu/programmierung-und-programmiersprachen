package übung2;

public class CD extends Artikel {
    int laufzeit;
    String komponist;

    public CD(String titel, double preis, long barcode, int laufzeit, String komponist) {
        super(titel, preis, barcode);
        this.laufzeit = laufzeit;
        this.komponist = komponist;
    }

    public String getBeschreibung() {
        return String.format(
            "CD[Titel: %s, Preis: %s, Barcode: %s, Laufzeit: %s, Komponist: %s]",
            titel, preis, barcode, laufzeit, komponist
        );
    }
}
