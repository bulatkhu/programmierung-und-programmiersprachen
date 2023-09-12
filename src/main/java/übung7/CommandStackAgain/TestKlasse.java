package übung7.CommandStackAgain;

import java.util.Stack;

public class TestKlasse {
    public static void main(String[] args) {
        var editor = new TextEditor("Some text");
        var cmd1 = new AppendTextCommand(editor, " and some more text.");
        var cmd2 = new AppendTextCommand(editor, " And even more text.");

        CommandManager manager = new CommandManager();
        manager.executeCommand(cmd1);
        manager.executeCommand(cmd2);
        manager.undo();
    }
}

interface EditorCommand {
    void execute();

    void undo();
}

class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void aendereText(String text) {
        this.text = text;
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}

class CommandManager {
    private final Stack<EditorCommand> undoItems = new Stack<>();

    void executeCommand(EditorCommand command) {
        undoItems.push(command);
        command.execute();
    }

    void undo() {
        undoItems.pop().undo();
    }
}

class AppendTextCommand implements EditorCommand {
    String textAlt;
    String textToAppend;
    TextEditor textEditor;

    public AppendTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.textAlt = this.textEditor.getText();
        this.textToAppend = text;
    }

    @Override
    public void execute() {
        textAlt = textEditor.getText();
        var newText = textAlt + textToAppend;
        this.textEditor.aendereText(newText);
    }

    @Override
    public void undo() {
        this.textEditor.aendereText(textAlt);
    }
}
