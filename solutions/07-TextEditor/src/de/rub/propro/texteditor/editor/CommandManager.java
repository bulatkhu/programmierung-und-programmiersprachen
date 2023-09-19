package de.rub.propro.texteditor.editor;

import java.util.Stack;

public class CommandManager {

    private Stack<EditorCommand> undoStack = new Stack<>();
    public void executeCommand(EditorCommand cmd) {
        cmd.execute();
        undoStack.push(cmd);
    }

    public void undo() {
        if(undoStack.size() > 0) {
            EditorCommand undoCommand = undoStack.pop();
            undoCommand.undo();
        }
    }
}
