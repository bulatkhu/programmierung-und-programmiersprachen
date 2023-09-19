package rub.de.propro.chatclient;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class LogWriter implements IChatBeobachter {
    @Override
    public void aktualisieren(Nachricht nachricht) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String uhrzeit = dtf.format(nachricht.getUhrzeit());
        String line = uhrzeit + ": (" +
                nachricht.getSender() + ") " +
                nachricht.getText();

        String filename = nachricht.getEmpfaenger().toLowerCase() + ".txt";
        try(FileWriter fw = new FileWriter(filename, true)) {
            fw.append(line);
            fw.append("\n");
        } catch (IOException e) {
            System.err.println("Can't open file " + filename);
            System.err.println(e.getMessage());
        }
    }
}
