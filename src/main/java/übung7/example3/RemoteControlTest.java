package übung7.example3;

interface Command {
    public void execute();
}

class Light {
    public Light() {}
    public void on() {}
    public void off() {}
}

class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void execute() {
        slot.execute();
    }
}

class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class NoCommand implements Command {
    public void execute() {}
}

class RemoteControl {
    Command[][] commands;

    public RemoteControl(int n) {
        this.commands = new Command[n][2];

        Command noCommand = new NoCommand();
        for (int i = 0; i < n; i++) {
            this.commands[i][0] = noCommand;
            this.commands[i][1] = noCommand;
        }
    }
}

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.execute();
    }
}