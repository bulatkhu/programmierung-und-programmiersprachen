public class Magier implements Charakter{
    static final int DEFAULT_TP = 8;
    static final int DEFAULT_RW = 3;

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
        return "Magier";
    }
}
