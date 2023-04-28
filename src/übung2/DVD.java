package übung2;

public class DVD extends Artikel implements Umtauschbar {
    String regisseur;
    int erscheinungsjahr;

    public DVD(
            String titel, double preis, long barcode,
            String regisseur, int erscheinungsjahr
    ) {
        super(titel, preis, barcode);
        this.regisseur = regisseur;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    protected String getBeschreibung() {
        return String.format(
                "DVD[Titel: %s, Preis: %s, Barcode: %s, Regisseur: %s, Erscheinungsjahr: %s]",
                titel, preis, barcode, regisseur, erscheinungsjahr
        );
    }

    public int umtauschfrist() {
        return 14;
    }
}
