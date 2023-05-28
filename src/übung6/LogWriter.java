package übung6;

import java.io.*;

public class LogWriter implements IChatBeobachter {
    @Override
    public void aktualisieren(Nachricht nachricht) {
        try {
            FileWriter fileWriter = new FileWriter("logs_" + nachricht.getEmpfaenger() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(nachricht);
            printWriter.close();
        } catch (IOException exception) {
            System.out.println("Something went wrong while writing to logs");
        }
    }
}
