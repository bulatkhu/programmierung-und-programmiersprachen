package rub.de.propro.chatclient;

import java.time.LocalDateTime;

public class Nachricht {
    private LocalDateTime uhrzeit;
    private String text, empfaenger, sender;

    public Nachricht(String text, String sender, String empfaenger) {
        this.text = text;
        this.empfaenger = empfaenger;
        this.sender = sender;
        uhrzeit = LocalDateTime.now();
    }

    public LocalDateTime getUhrzeit() {
        return uhrzeit;
    }

    public String getText() {
        return text;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public String getSender() {
        return sender;
    }
}
