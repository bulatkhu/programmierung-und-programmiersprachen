package übung5;

public class WarenkorbTest {
    public static void main(String[] args) {
        Warenkorb wk = new Warenkorb(new PayPalStrategie("myemail@example.com", "mypwd"));
        wk.zahle(500);

        Warenkorb wk2 = new Warenkorb(new KreditkartenStrategie("Max Mustermann", "1234567890123456", "786", "12/15"));
        wk2.zahle(1500);
    }
}
