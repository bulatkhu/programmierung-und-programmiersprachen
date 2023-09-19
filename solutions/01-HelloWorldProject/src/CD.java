public class CD extends Artikel{
    private double laufzeit;

    public double getLaufzeit() {
        return laufzeit;
    }

    public void setLaufzeit(double laufzeit) {
        this.laufzeit = laufzeit;
    }

    @Override
    public String getBeschreibung() {
        return "CD: " + getTitel() + " (Runtime: " + getLaufzeit() + " minutes)";
    }
}
