package übung9;

public class FactoryMuster {
    public static void main(String[] args) {
        var PORTrikotFactory = new PORTrikotFactory();
        var PORTrikot = PORTrikotFactory.erstelleTrikot("RONALDO", 7);

        var GERTrikotFactory = new GERTrikotFactory();
        var GERTrikot = GERTrikotFactory.erstelleTrikot("KLOSE", 11);

        PORTrikot.drucke();

        GERTrikot.drucke();
    }
}

interface Produkt {
    public void drucke();
}

abstract class Spielertrikot implements Produkt {
    protected String front;
    protected String back;
    protected String color1;
    protected String color2;

    public void drucke() {
        System.out.printf(
                "RÜCKSEITE               VORDERSEITE%n" +
                        "------___------       ------___------%n" +
                        "|-     %s    -|       |%s|%n" +
                        "---|       |---       ---|       |---%n" +
                        "   |   %s  |             |       |   %n" +
                        "   |       |             |   %s  |   %n" +
                        "   |   %s  |             |       |   %n" +
                        "   |-------|             |-------|%n%n",
                color1, back, front, front, color2
        );
    }
}

abstract class SpielerSchuhe implements Produkt {
    protected String leftSide;
    protected String rightSide;

    public void drucke() {
        System.out.printf("left: %s | right: %s", leftSide, rightSide);
    }
}

abstract class SpielerShorts implements Produkt {
    protected String name;
    protected String color;

    public void drucke() {
        System.out.printf("Shorts: %s | color: %s", name, color);
    }
}

abstract class AbstractTrikotFactory {
    public abstract Produkt erstelleTrikot(String name, int number);
    public abstract Produkt erstelleSchuhe();
    public abstract Produkt erstelleShorts();
}

class PORTrikotFactory extends AbstractTrikotFactory {
    @Override
    public Produkt erstelleTrikot(String name, int number) {
        return new PORTrikot(name, number);
    }

    public Produkt erstelleSchuhe() {
        return new PORSchuhe();
    }

    public Produkt erstelleShorts() {
        return new PORShorts();
    }
}

class PORTrikot extends Spielertrikot {
    public PORTrikot(String name, int number) {
        this.color1 = name;
        this.back = "- # ----- # -";
        this.front = String.valueOf(number);
        this.color2 = "POR";
    }
}

class GERTrikotFactory extends AbstractTrikotFactory {
    @Override
    public Produkt erstelleTrikot(String name, int number) {
        return new GERTrikot(name, number);
    }

    public Produkt erstelleSchuhe() {
        return new GERSchuhe();
    }

    public Produkt erstelleShorts() {
        return new GERShorts();
    }
}

class GERTrikot extends Spielertrikot {
    public GERTrikot(String name, int number) {
        this.color1 = name;
        this.back = "===@=====@===";
        this.front = String.valueOf(number);
        this.color2 = "GER";
    }
}

class GERSchuhe extends SpielerSchuhe {
    public GERSchuhe() {
        this.leftSide = "GER";
        this.rightSide = "===@=====@===";
    }
}

class PORSchuhe extends SpielerSchuhe {
    public PORSchuhe() {
        this.leftSide = "POR";
        this.rightSide = "- # ----- # -";
    }
}

class GERShorts extends SpielerShorts {
    public GERShorts() {
        this.name = "GER";
        this.color = "___+___";
    }
}

class PORShorts extends SpielerShorts {
    public PORShorts() {
        this.name = "POR";
        this.color = "===-===";
    }
}