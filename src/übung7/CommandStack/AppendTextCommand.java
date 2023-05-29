package übung7.CommandStack;

public class AppendTextCommand implements EditorCommand {
    private String textAlt;
    private final String textToAppend;
    private final TextEditor textEditor;

    public AppendTextCommand(TextEditor editor, String text) {
        textEditor = editor;
        textAlt = editor.getText();
        textToAppend = text;
    }

    @Override
    public void execute() {
        textAlt = textEditor.getText();
        textEditor.aendereText(textEditor.getText() + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.aendereText(textAlt);
    }
}
