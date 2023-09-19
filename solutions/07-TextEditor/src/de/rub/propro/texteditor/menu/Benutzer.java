package de.rub.propro.texteditor.menu;

public class Benutzer {
    public static void main(String[] args) {
        MenuOptionen menuOptionen = new MenuOptionen();

        Document doc = new Document("dokument.docx");

        ActionListenerCommand openCmd = new ActionOpen(doc);
        ActionListenerCommand saveCmd = new ActionSave(doc);

        menuOptionen.registerCommand(openCmd);
        menuOptionen.registerCommand(saveCmd);

        menuOptionen.showMenu();

        menuOptionen.clickItem(0);
        menuOptionen.clickItem(1);
    }
}
