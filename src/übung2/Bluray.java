package übung2;

public class Bluray extends DVD {
    public Bluray(String titel, double preis, long barcode, String regisseur, int erscheinungsjahr) {
        super(titel, preis, barcode, regisseur, erscheinungsjahr);
    }

    protected String getBeschreibung() {
        return String.format(
                "Bluray[Titel: %s, Preis: %s, Barcode: %s, Regisseur: %s, Erscheinungsjahr: %s]",
                titel, preis, barcode, regisseur, erscheinungsjahr
        );
    }
}
