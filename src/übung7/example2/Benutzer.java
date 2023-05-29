package übung7.example2;

public class Benutzer {
    public static void main(String[] args) {



        var currentPath = "file.txt";
        var document1 = new Document(currentPath);

        var actionOpen = new ActionOpen(document1);
        var actionSave = new ActionSave(document1);


        var menu = new MenuOptionen(actionOpen, actionSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
