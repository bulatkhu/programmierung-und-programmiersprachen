package de.rub.propro.texteditor.editor;

public interface EditorCommand {
    void execute();
    void undo();
}
