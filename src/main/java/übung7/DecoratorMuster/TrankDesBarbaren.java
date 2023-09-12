package übung7.DecoratorMuster;

public class TrankDesBarbaren extends TrankEffektDecorator {
    private static final String BEZEICHNUNG = "Trank des Barbaren";

    public TrankDesBarbaren(Charakter c) {
        super(c, BEZEICHNUNG);
    }

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert() - 5;
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte() + 5;
    }
}
