package übung2;

public class Buch {
    String title;
    double preis;
    long barcode;
    int seiten;
    String author;
    int auflage;

    public Buch(String title, double preis, long barcode, int seiten, String author, int auflage) {
        this.title = title;
        this.preis = preis;
        this.barcode = barcode;
        this.seiten = seiten;
        this.author = author;
        this.auflage = auflage;
    }

    public String getBeschreibung() {
        return String.format("Buch: \"%s\" von %s, %s. Auflage, %s Seiten", title, author, auflage, seiten);
    }


    public String getTitle() {
        return title;
    }

    public double getPreis() {
        return preis;
    }

    public long getBarcode() {
        return barcode;
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
