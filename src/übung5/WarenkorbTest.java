package übung5;

public class WarenkorbTest {
    public static void main(String[] args) {
        Warenkorb warenkorb1 = new Warenkorb(new KreditkartenStrategie());
        warenkorb1.zahle(100);

        Warenkorb warenkorb2 = new Warenkorb(new PayPalStrategie());
        warenkorb2.zahle(200);
    }
}
