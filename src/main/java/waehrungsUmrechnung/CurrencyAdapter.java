package waehrungsUmrechnung;

interface ICurrency {
    String getName();
    double getValue();
    double getValueInUSD();
}


interface Waehrung {
    String getTyp();
    double getWert();
    double getWertInEUR();
}

class ConverterFunctions {
    public static double USDtoEUR(double usd) {
        return usd * 0.9;
    }

    public static double EURtoUSD(double usd) {
        return usd * 1.1;
    }

    public static double CADtoUSD(double cad) {
        return cad * 0.75;
    }
}

public class CurrencyAdapter implements Waehrung {
    private final ICurrency currency;

    public CurrencyAdapter(ICurrency currency) {
        this.currency = currency;
    }

    @Override
    public String getTyp() {
        return this.currency.getName();
    }

    @Override
    public double getWert() {
        return currency.getValue();
    }

    @Override
    public double getWertInEUR() {
        return ConverterFunctions.USDtoEUR(currency.getValueInUSD());
    }
}
