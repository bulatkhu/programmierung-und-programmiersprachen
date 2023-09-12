package übung6_example;

public class Testklasse {
    public static void main(String[] args) {
        ZeitungsVerlag elsevier = new ZeitungsVerlag();
        IAbonnent infBI = new Abonnent("Lehrstuhl fuer Informatik im Bauwesen");
        IAbonnent max = new Abonnent("Max Mustermann");
        elsevier.registriereBeobachter(infBI);
        elsevier.registriereBeobachter(max);
        elsevier.verteileZeitung("Java Design Patterns");
    }
}
