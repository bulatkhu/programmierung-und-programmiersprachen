package rub.de.propro.chatclient;

import java.util.ArrayList;

public class ChatClient {
    private ArrayList<IChatBeobachter> beobachterListe = new ArrayList<>();

    public void registriereBeobachter(IChatBeobachter beobachter) {
        if(beobachter == null)
            return;
        if(!beobachterListe.contains(beobachter))
            beobachterListe.add(beobachter);
    }

    public void entferneBeobachter(IChatBeobachter beobachter) {
        beobachterListe.remove(beobachter);
    }

    public void benachrichtigeBeobachter(Nachricht nachricht) {
        if(nachricht == null)
            return;

        for (IChatBeobachter beobachter:
             beobachterListe) {
            beobachter.aktualisieren(nachricht);
        }
    }

    public void schreibeNachricht(String text, String sender, String empfaenger) {
        Nachricht nachricht = new Nachricht(text, sender, empfaenger);
        benachrichtigeBeobachter(nachricht);
    }

}
