package übung1;

public class QuaderTest {
    public static void main(String[] args) {
        double dichte = 0.5;

        Quader q1 = new Quader(10, 4, 5, dichte);
        q1.printInfo();

        Quader wuerfel = new Quader(5, 5, 5, dichte);
        wuerfel.printInfo();

        double laengeMittelWert = (q1.getLaenge() + wuerfel.getLaenge()) / 2;
        double breiteMittelWert = (q1.getBreite() + wuerfel.getBreite()) / 2;
        double hoeheMittelWert = (q1.getHoehe() + wuerfel.getHoehe()) / 2;

        Quader q3 = new Quader(laengeMittelWert, breiteMittelWert, hoeheMittelWert, dichte);
        q3.printInfo();
    }
}