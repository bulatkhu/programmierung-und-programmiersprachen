public class ArtikelBeispiel {
    public static void main(String[] args) {
        Buch b = new Buch();
        b.setPreis(10);
        b.getPreis();
        b.setTitel("The Shining");
        b.setAutor("Stephen King");
        System.out.println(b.getAutor());


        CD cd = new CD();
        cd.setTitel("Dark Side of The Moon");
        cd.setPreis(15);
        cd.setLaufzeit(90);


        Artikel genericArtikel = b;
        genericArtikel.setPreis(100);


        Artikel[] geschaeft = new Artikel[10];
        geschaeft[0] = b;
        geschaeft[1] = cd;

        System.out.println(geschaeft[0].getBeschreibung());
        System.out.println(geschaeft[1].getBeschreibung());

/*        if(geschaeft[1] instanceof Buch) {
            Buch dasBuch = (Buch) geschaeft[1];
            System.out.println(dasBuch.getBeschreibung());
        } else {
            System.out.println("item is not a book :(");
        }*/

    }
}
