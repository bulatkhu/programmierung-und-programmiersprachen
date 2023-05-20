package übung5;

public class PayPalStrategie implements Zahlungsstrategie {
    public String email;
    public String password;

    public void zahle(int preis) {
        // Implement the payment process here
        System.out.println("Payment made with PayPal. Amount: " + preis);
    }
}
