package de.rub.propro.texteditor.editor;

public class TestKlasse {
    public static void main(String[] args) {
        CommandManager cmdManager = new CommandManager();

        TextEditor editor = new TextEditor("Lorem ipsum dolor sit amet\n");

        cmdManager.executeCommand(new AppendTextCommand("consetetur sadipscing elitr\n", editor));
        cmdManager.executeCommand(new AppendTextCommand("sed diam nonumy eirmod tempor invidunt \n", editor));

        cmdManager.undo();

        cmdManager.executeCommand(new AppendTextCommand("ut labore et dolore magna aliquyam erat\n", editor));

        cmdManager.undo();
        cmdManager.undo();
        cmdManager.executeCommand(new AppendTextCommand("ut labore et dolore magna aliquyam erat\n", editor));
    }
}
