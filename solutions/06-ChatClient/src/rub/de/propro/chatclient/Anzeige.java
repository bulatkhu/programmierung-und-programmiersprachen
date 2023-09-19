package rub.de.propro.chatclient;

import java.time.format.DateTimeFormatter;

public class Anzeige implements IChatBeobachter{
    @Override
    public void aktualisieren(Nachricht nachricht) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String uhrzeit = dtf.format(nachricht.getUhrzeit());
        System.out.println(uhrzeit + ": (" +
                nachricht.getSender() + " -> " +
                nachricht.getEmpfaenger() + "): " +
                nachricht.getText());
    }
}
