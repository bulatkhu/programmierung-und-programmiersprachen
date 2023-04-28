package übung2;

public abstract class Artikel {
    protected String titel;
    protected double preis;
    protected long barcode;

    protected Artikel(String titel, double preis, long barcode) {
        this.titel = titel;
        this.preis = preis;
        this.barcode = barcode;
    }

    protected double getPreis() {
        return preis;
    }

    protected long getBarcode() {
        return barcode;
    }

    protected String getTitel() {
        return titel;
    }

    protected abstract String getBeschreibung();
}
