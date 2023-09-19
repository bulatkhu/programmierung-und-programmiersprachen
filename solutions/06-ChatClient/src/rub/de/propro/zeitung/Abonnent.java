package rub.de.propro.zeitung;

public class Abonnent implements IAbonnent {

    private String name;

    public Abonnent(String name) {
        this.name = name;
    }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(this.name + " hat die Zeitung " + zeitung.getTitel() + " am " + zeitung.getDatum() + " erhalten.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
