package übung2;

public class CD extends Artikel implements Abspielbar {
    int laufzeit;
    String komponist;
    int abspieldauer;

    public CD(String titel, double preis, long barcode, int laufzeit, String komponist, int abspieldauer) {
        super(titel, preis, barcode);
        this.laufzeit = laufzeit;
        this.komponist = komponist;
        this.abspieldauer = abspieldauer;
    }

    public String getBeschreibung() {
        return String.format(
            "CD[Titel: %s, Preis: %s, Barcode: %s, Laufzeit: %s, Komponist: %s]",
            titel, preis, barcode, laufzeit, komponist
        );
    }

    public int umtauschfrist() {
        return 14;
    }

    public int getAbspieldauer() {
        return 0;
    }

    public void spieleAb() {
        System.out.println(titel + " wird abgespielt...");
    }
}
