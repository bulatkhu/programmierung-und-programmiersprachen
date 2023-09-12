package übung5;

public class KreditkartenStrategie implements Zahlungsstrategie {
    public String name;
    public String nummer;
    public String cvv;
    public String ablaufdatum;

    public KreditkartenStrategie(String name, String nummer, String cvv, String ablaufdatum) {
        this.name = name;
        this.nummer = nummer;
        this.cvv = cvv;
        this.ablaufdatum = ablaufdatum;
    }

    public void zahle(int preis) {
        System.out.println("Payment made with credit card. Amount: " + preis);
    }
}
