package übung6;

import java.util.Date;

public class Nachricht {
    private final Date uhrzeit;
    private final String text;
    private final String empfaenger;
    private final String sender;

    public Nachricht(String text, String sender, String empfaenger) {
        this.text = text;
        this.sender = sender;
        this.empfaenger = empfaenger;
        this.uhrzeit = new Date();
    }

    Date getUhrzeit() {
        return uhrzeit;
    }

    String getText() {
        return text;
    }

    String getEmpfaenger() {
        return empfaenger;
    }

    String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return getEmpfaenger() + " hat die Nachricht " + getText() + " von " + getSender() + " am " + getUhrzeit() + " erhalten.";
    }
}
