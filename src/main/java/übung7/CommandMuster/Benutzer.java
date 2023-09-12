package übung7.CommandMuster;

public class Benutzer {
    public static void main(String[] args) {
        File file1 = new File("File 1", "C:\\Users\\Bulat\\file1");
//        File file2 = new File("File 2", "C:\\Users\\Bulat\\file2");
//        Document document2 = new Document(file2);

        Document document1 = new Document(file1);

        ActionOpen actionOpen = new ActionOpen(document1);
        ActionSave actionSave = new ActionSave(document1);


        MenuOptionen optionen = new MenuOptionen(actionOpen, actionSave);

        optionen.clickOpen();

        optionen.clickSave();
    }
}

class MenuOptionen {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptionen(ActionListenerCommand open, ActionListenerCommand save) {
        openCommand = open;
        saveCommand = save;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}

interface ActionListenerCommand {
    public void execute();
}

class File {
    private String name;
    private String path;

    public File(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}

class Document {
    private File file;

    public Document(File file) {
        this.file = file;
    }

    public void Open() {
        System.out.printf("Open file: %s%n", file.getName());
    }

    public void Save() {
        System.out.printf("Save file: %s%n", file.getName());
    }

    public String getFilePath() {
        return String.format("File's path: %s", file.getPath());
    }
}

class ActionOpen implements ActionListenerCommand {
    private final Document document;

    public ActionOpen(Document doc) {
        document = doc;
    }

    @Override
    public void execute() {
        document.Open();
    }
}

class ActionSave implements ActionListenerCommand {
    private final Document document;

    public ActionSave(Document doc) {
        document = doc;
    }

    @Override
    public void execute() {
        document.Save();
    }
}