package rub.de.propro.chatclient;

public class ChatTest {

    public static void main(String[] args) {
        ChatClient c = new ChatClient();

        Anzeige anzeige = new Anzeige();
        c.registriereBeobachter(anzeige);

        LogWriter logWriter = new LogWriter();
        c.registriereBeobachter(logWriter);

        c.schreibeNachricht("Hallo Welt", "Patrick", "Markus");
        c.schreibeNachricht("Hallo selbst", "Markus", "Patrick");
    }
}
