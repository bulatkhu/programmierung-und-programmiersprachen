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

        CD cd1 = new CD("UML 3.0", 21, 9783197215214L,231, "Komponist");
        CD cd2 = new CD("Thriller", 14.99, 731453190625L, 42, "Michael Jackson");
        CD cd3 = new CD("Nevermind", 12.99, 720642442523L, 50, "Nirvana");
        CD cd4 = new CD("The Joshua Tree", 11.99, 602517229374L, 50, "U2");

        DVD dvd1 = new DVD("The Godfather", 15.99, 9780800120L, "Francis Ford Coppola", 1972);
        DVD dvd2 = new DVD("Star Wars: Episode IV - A New Hope", 12.99, 9780790731523L, "George Lucas", 1977);
        DVD dvd3 = new DVD("The Lord of the Rings: The Fellowship of the Ring", 19.99, 794043547121L, "Peter Jackson", 2001);

        Bluray bluray1 = new Bluray("Interstellar", 24.99, 5051892198894L, "Christopher Nolan", 2014);
        Bluray bluray2 = new Bluray("The Dark Knight", 19.99, 883929096048L, "Christopher Nolan", 2008);
        Bluray bluray3 = new Bluray("Inception", 17.99, 5051892028709L, "Christopher Nolan", 2010);

        Artikel[] liste = new Artikel[]{b1, b2, cd1, dvd1, dvd2, dvd3, bluray1, bluray2, bluray3, cd2, cd3, cd4};

        double sum = 0;
        double priceSumDVD = 0;

        for (Artikel artikel : liste) {
            sum += artikel.getPreis();
            if (artikel instanceof Buch) {
                Buch b = (Buch) artikel;
                System.out.println(String.format("Barcode: %s | Author: %s", b.getBarcode(), b.getAuthor()));
            }
            if (artikel instanceof DVD & !(artikel instanceof Bluray)) {
                priceSumDVD += artikel.getPreis();
            }
        }

        System.out.println("Sum    : " + sum);
        System.out.println("DVD sum: " + priceSumDVD);
    }
}
