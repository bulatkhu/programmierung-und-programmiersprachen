package übung5;

public class Warenkorb {
    private final Zahlungsstrategie strategie;

    public Warenkorb(Zahlungsstrategie strategie) {
        this.strategie = strategie;
    }

    public void zahle(int preis) {
        strategie.zahle(preis);
    }
}
