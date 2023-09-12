package übung6_example;

public class Abonnent implements IAbonnent {
    private final String name;

    public Abonnent(String name) {
        this.name = name;
    }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(this.name + " hat die Zeitung " + zeitung.getTitel() + " am " + zeitung.getDatum() + " erhalten.");
    }
}
