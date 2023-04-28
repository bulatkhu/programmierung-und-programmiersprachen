package übung2;

public class DVD extends Artikel implements Abspielbar  {
    String regisseur;
    int erscheinungsjahr;
    int abspieldauer;

    public DVD(
            String titel, double preis, long barcode,
            String regisseur, int erscheinungsjahr, int abspieldauer
    ) {
        super(titel, preis, barcode);
        this.regisseur = regisseur;
        this.erscheinungsjahr = erscheinungsjahr;
        this.abspieldauer = abspieldauer;
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

    public int getAbspieldauer() {
        return abspieldauer;
    }

    public void spieleAb() {
        System.out.println(titel + " wird abgespielt...");
    }
}
