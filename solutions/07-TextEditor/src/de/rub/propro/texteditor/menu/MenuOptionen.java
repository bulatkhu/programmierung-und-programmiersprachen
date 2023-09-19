package de.rub.propro.texteditor.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuOptionen {
    private List<ActionListenerCommand> commands = new ArrayList<>();

    public void registerCommand(ActionListenerCommand cmd) {
        commands.add(cmd);
    }

    public void clickItem(int index) {
        if(index < commands.size())
            commands.get(index).execute();
    }

    public void showMenu() {
        for (int i = 0; i < commands.size(); i++) {
            ActionListenerCommand cmd = commands.get(i);
            System.out.println("(" + i + "): " + cmd.getCmdDescription());
        }
    }
}
