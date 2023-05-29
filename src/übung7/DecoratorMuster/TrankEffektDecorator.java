package übung7.DecoratorMuster;

public abstract class TrankEffektDecorator implements Charakter {
    protected Charakter c;
    protected String bezeichnung;

    public TrankEffektDecorator(Charakter c, String bezeichnung) {
        this.c = c;
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return c.getBezeichnung() + ": " + bezeichnung;
    }
}
