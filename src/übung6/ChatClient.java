package übung6;

import java.util.ArrayList;

public class ChatClient {
    private final ArrayList<IChatBeobachter> beobachters = new ArrayList<>();

    public void registriereBeobachter(IChatBeobachter beo) {
        if (beobachters.contains(beo)) {
            return;
        }
        beobachters.add(beo);
    }

    public void entferneBeobachter(IChatBeobachter beo) {
        beobachters.remove(beo);
    }

    public void benachrichtigeBeobachter(Nachricht nachricht) {
        for (var beo: beobachters) {
            beo.aktualisieren(nachricht);
        }
    }

    public void schreibeNachricht(String text, String sender, String empfaenger) {
        var nachricht = new Nachricht(text, sender, empfaenger);
        benachrichtigeBeobachter(nachricht);
    }
}
