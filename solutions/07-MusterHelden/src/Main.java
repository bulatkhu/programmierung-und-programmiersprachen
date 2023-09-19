public class Main {
    public static void main(String[] args) {
        Charakter drizztdourden = new Waldlaeufer();

        drizztdourden = new TrankDerVitalitaet(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);
        drizztdourden = new TrankDesBarbaren(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);

        showCharacter(drizztdourden);
    }

    private static void showCharacter(Charakter charakter) {
        System.out.printf(charakter.getBezeichnung() +
                " (TP: " + charakter.getTrefferpunkte() +
                ", RW: " + charakter.getRuestungswert() + ")");
    }
}
