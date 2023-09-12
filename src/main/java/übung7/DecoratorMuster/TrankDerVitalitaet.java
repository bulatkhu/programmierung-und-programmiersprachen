package übung7.DecoratorMuster;

public class TrankDerVitalitaet extends TrankEffektDecorator {
    private static final String BEZEICHNUNG = "Trank der Vitalität";

    public TrankDerVitalitaet(Charakter c) {
        super(c, BEZEICHNUNG);
    }

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert();
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte() + 10;
    }
}
