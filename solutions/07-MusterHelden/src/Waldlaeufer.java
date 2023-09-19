public class Waldlaeufer implements Charakter {
    static final int DEFAULT_TP = 20;
    static final int DEFAULT_RW = 10;

    @Override
    public int getRuestungswert() {
        return DEFAULT_RW;
    }

    @Override
    public int getTrefferpunkte() {
        return DEFAULT_TP;
    }

    @Override
    public String getBezeichnung() {
        return "Waldläufer";
    }
}
