package übung7.example2;

public class MenuOptionen {
    private final ActionListenerCommand openCommand;
    private final ActionListenerCommand saveCommand;

    MenuOptionen(ActionListenerCommand open, ActionListenerCommand save) {
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
