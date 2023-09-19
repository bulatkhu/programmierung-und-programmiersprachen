public class TrankDesEisengolems extends TrankEffektDecorator{
    private static final String BEZEICHNUNG = "Trank des Eisengolems";

    public TrankDesEisengolems(Charakter c) {
        super(c, BEZEICHNUNG);
    }

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert() * 2;
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte();
    }
}
