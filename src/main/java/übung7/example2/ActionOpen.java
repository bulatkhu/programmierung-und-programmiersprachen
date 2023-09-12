package übung7.example2;

public class ActionOpen implements ActionListenerCommand {
    private final Document document;

    public ActionOpen(Document doc) {
        document = doc;
    }

    @Override
    public void execute() {
        document.Open();
    }
}
