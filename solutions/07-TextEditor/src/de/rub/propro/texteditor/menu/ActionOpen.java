package de.rub.propro.texteditor.menu;

public class ActionOpen implements ActionListenerCommand {

    private Document document;

    public ActionOpen(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.Open();
    }

    @Override
    public String getCmdDescription() {
        return "Open de.rub.propro.texteditor.menu.Document";
    }
}
