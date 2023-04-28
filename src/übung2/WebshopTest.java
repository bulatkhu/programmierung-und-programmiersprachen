package übung2;

public class WebshopTest {
    public static void main(String[] args) {
        Buch b1 = new Buch("UML 2.0", 9.8, 9783897215214L,
                139, "Dan Pilone", 2);
        System.out.println(b1.getBeschreibung());
        System.out.println("Preis: " + b1.getPreis() + " Euro");
        System.out.println("Barcode: " + b1.getBarcode());


        Buch b2 = new Buch("UML 3.0", 12, 9783897215214L,
                139, "Dan Pilone", 2);

        String MostExpenciveBookDescription = b1.getPreis() < b2.getPreis()
            ? b2.getBeschreibung()
            : b1.getBeschreibung();

        System.out.printf("The more expensive book is: %s%n", MostExpenciveBookDescription);

        CD cd1 = new CD("UML 3.0", 21, 9783197215214L,
                231, "Komponist");

        System.out.println(cd1.getBeschreibung());
    }
}
