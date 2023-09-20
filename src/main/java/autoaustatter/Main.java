package autoaustatter;

public class Main {
    public static void main(String[] args) {
        Auto opelAstra = new OpelAstra();
        Auto opelAstraMitAllWetterReifen = new Allwetterreifen(opelAstra);
        Auto opelAstraMitAllWetterReifenUndKlimaAnlage = new Klimaanlage(opelAstraMitAllWetterReifen);

        opelAstraMitAllWetterReifenUndKlimaAnlage.zeigePreis();
    }
}

interface Auto {
    double getPreis();
    void zeigePreis();
}

abstract class AusstattungsDecorator implements Auto {
    protected Auto auto;

    public AusstattungsDecorator(Auto auto) {
        this.auto = auto;
    }

    public void zeigePreis() {
        auto.zeigePreis();
    }
}

class Allwetterreifen extends AusstattungsDecorator {
    public Allwetterreifen(Auto auto) {
        super(auto);
    }

    public double getPreis() {
        return this.auto.getPreis() + 725;
    }

    public void zeigePreis() {
        super.zeigePreis();
        System.out.printf("Plus AllWetterReifen will cost %s Euro%n", getPreis());
    }
}

class Klimaanlage extends AusstattungsDecorator {
    public Klimaanlage(Auto auto) {
        super(auto);
    }

    public double getPreis() {
        return this.auto.getPreis() + 550;
    }

    public void zeigePreis() {
        super.zeigePreis();
        System.out.printf("Plus Klimaanlage will cost %s Euro%n", getPreis());
    }
}

class Ledersitze extends AusstattungsDecorator {
    public Ledersitze(Auto auto) {
        super(auto);
    }

    public double getPreis() {
        return this.auto.getPreis() + 144.99;
    }
}

class OpelAstra implements Auto {
    public OpelAstra() {}

    public double getPreis() {
        return 7500;
    }

    @Override
    public void zeigePreis() {
        System.out.printf("Basic version of %s costs %s Euro%n", getClass().getSimpleName(), getPreis());
    }
}

class FordFiesta implements Auto {
    public FordFiesta() {}

    public double getPreis() {
        return 3500;
    }

    @Override
    public void zeigePreis() {
        System.out.printf("Basic version of %s costs %s Euro%n", getClass().getSimpleName(), getPreis());
    }
}