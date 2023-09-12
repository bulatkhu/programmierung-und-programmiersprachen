package übung6;

public class Anzeige implements IChatBeobachter {
    @Override
    public void aktualisieren(Nachricht nachricht) {
        // uhrzeit text empfaenger sender
        System.out.println(nachricht);
    }
}
