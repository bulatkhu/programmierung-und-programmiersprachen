package übung6;

public class ChatTest {
    public static void main(String[] args) {
        var chat = new ChatClient();

        var anzeige1 = new Anzeige();
        var anzeige2 = new Anzeige();
        var logger1 = new LogWriter();

        chat.registriereBeobachter(anzeige1);
        chat.registriereBeobachter(anzeige2);
        chat.registriereBeobachter(logger1);

        var nachricht1 = new Nachricht("Nachrict 1", "sender 1", "anzeige1");
        var nachricht2 = new Nachricht("Nachrict 1", "sender 1", "anzeige2");
        var nachricht3 = new Nachricht("Nachrict 1", "sender 1", "logger1");
        chat.benachrichtigeBeobachter(nachricht1);
        chat.benachrichtigeBeobachter(nachricht2);
        chat.benachrichtigeBeobachter(nachricht3);
    }
}
