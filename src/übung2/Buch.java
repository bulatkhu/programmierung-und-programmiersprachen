package übung2;

public class Buch extends Artikel {
    int seiten;
    String author;
    int auflage;

    public Buch(String title, double preis, long barcode, int seiten, String author, int auflage) {
        super(title, preis, barcode);
        this.seiten = seiten;
        this.author = author;
        this.auflage = auflage;
    }

    public String getBeschreibung() {
        return String.format(
                "Buch: \"%s\" von %s, %s. Auflage, %s Seiten",
                titel, author, auflage, seiten
        );
    }

    public int getSeiten() {
        return seiten;
    }

    public String getAuthor() {
        return author;
    }

    public int getAuflage() {
        return auflage;
    }
}
