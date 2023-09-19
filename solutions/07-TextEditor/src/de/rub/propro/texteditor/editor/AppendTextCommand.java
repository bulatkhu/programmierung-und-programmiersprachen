package de.rub.propro.texteditor.editor;

public class AppendTextCommand implements EditorCommand{
    private String textAlt, textToAppend;
    private TextEditor textEditor;

    public AppendTextCommand(String textToAppend, TextEditor textEditor) {
        this.textToAppend = textToAppend;
        this.textEditor = textEditor;
    }


    @Override
    public void execute() {
        textAlt = textEditor.getText();
        String neuerText = textAlt + textToAppend;
        textEditor.aendereText(neuerText);
    }

    @Override
    public void undo() {
        textEditor.aendereText(textAlt);
    }
}
