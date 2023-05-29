package übung7.example2;

public class ActionSave implements ActionListenerCommand {
    private final Document document;

    public ActionSave(Document doc) {
        document = doc;
    }

    @Override
    public void execute() {
        document.Save();
    }
}
