public class QuaderTest {
    public static void main(String[] args) {
        Quader q1 = new Quader(10,4,5);
        System.out.println("Volumen: " + q1.berechneVolumen() + "m³ Oberflaeche: " + q1.berechneOberflaeche() + "m³");

        Quader wuerfel = new Quader(5, 5, 5);
        System.out.println("Volumen: " + wuerfel.berechneVolumen() + "m³ Oberflaeche: " + wuerfel.berechneOberflaeche() + "m³");

        double laengeMittelWert = (q1.getLaenge() + wuerfel.getLaenge()) / 2;
        double breiteMittelWert = (q1.getBreite() + wuerfel.getBreite()) / 2;
        double hoeheMittelWert = (q1.getHoehe() + wuerfel.getHoehe()) / 2;

        Quader q3 = new Quader(laengeMittelWert, breiteMittelWert, hoeheMittelWert);
        System.out.println("Volumen: " + q3.berechneVolumen() + "m³ Oberflaeche: " + q3.berechneOberflaeche() + "m³");
    }
}