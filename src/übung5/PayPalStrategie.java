package übung5;

public class PayPalStrategie implements Zahlungsstrategie {
    public String email;
    public String password;

    public PayPalStrategie(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void zahle(int preis) {
        // Implement the payment process here
        System.out.println(preis + " bezahlt mit Paypal. Email Adresse: " + email);
    }
}
