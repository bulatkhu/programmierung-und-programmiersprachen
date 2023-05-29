package übung7.CommandStack;

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
