package übung7.DecoratorMuster;

public class Magier implements Charakter {
    static int DEFAULT_RW = 3;
    static int DEFAULT_TP = 8;

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
