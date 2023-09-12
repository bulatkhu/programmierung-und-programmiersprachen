package übung7.DecoratorMusterAgain;

public class Test {
    public static void main(String[] args) {
        Charakter drizztdourden = new Waldlaeufer();
        drizztdourden = new TrankDerVitalitaet(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);
        drizztdourden = new TrankDesBarbaren(drizztdourden);
        drizztdourden = new TrankDesEisengolems(drizztdourden);
        showCharacter(drizztdourden);

        Charakter mag = new TrankDerVitalitaet(new Magier());

        showCharacter(mag);
    }

    private static void showCharacter(Charakter charakter) {
        System.out.printf(charakter.getBezeichnung() +
                " (TP: " + charakter.getTrefferpunkte() +
                ", RW: " + charakter.getRuestungswert() + ")\n");
    }
}

interface Charakter {
    int getRuestungswert();
    int getTrefferpunkte();
    String getBezeichnung();
}

abstract class TrankEffektDecorator implements Charakter {
    protected Charakter c;
    protected String bezeichnung;

    public TrankEffektDecorator(Charakter c, String bezeichnung) {
        this.c = c;
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return this.c.getBezeichnung() + String.format(" + %s%n", bezeichnung);
    }
}

class Waldlaeufer implements Charakter {
    public int getRuestungswert() {
        return 10;
    }

    public int getTrefferpunkte() {
        return 20;
    }

    public String getBezeichnung() {
        return "WaldLäufer";
    }
}

class Magier implements Charakter {
    public int getRuestungswert() {
        return 3;
    }

    public int getTrefferpunkte() {
        return 8;
    }

    public String getBezeichnung() {
        return "Magier";
    }
}

class TrankDerVitalitaet extends TrankEffektDecorator {
    public TrankDerVitalitaet(Charakter c) {
        super(c, "Trank der Vitalität");
    }

    public int getTrefferpunkte() {
        return this.c.getTrefferpunkte() + 10;
    }

    public int getRuestungswert() {
        return this.c.getRuestungswert();
    }
}

class TrankDesEisengolems extends TrankEffektDecorator {
    public TrankDesEisengolems(Charakter c) {
        super(c, "Trank des Eisengolems");
    }

    public int getTrefferpunkte() {
        return this.c.getTrefferpunkte();
    }

    public int getRuestungswert() {
        return this.c.getRuestungswert() * 2;
    }
}

class TrankDesBarbaren extends TrankEffektDecorator {
    public TrankDesBarbaren(Charakter c) {
        super(c, "Trank des Barbaren");
    }

    public int getTrefferpunkte() {
        return this.c.getTrefferpunkte() + 5;
    }

    public int getRuestungswert() {
        return this.c.getRuestungswert() - 5;
    }
}
