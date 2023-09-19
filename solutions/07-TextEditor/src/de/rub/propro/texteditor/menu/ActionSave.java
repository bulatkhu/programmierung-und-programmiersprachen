package de.rub.propro.texteditor.menu;

public class ActionSave implements ActionListenerCommand{
    private Document document; //Receiver

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.Save();
    }

    @Override
    public String getCmdDescription() {
        return "Save de.rub.propro.texteditor.menu.Document";
    }
}
