package übung7_example1;

public class Room {
    private final Light light;

    public Room() {
        this.light = new Light();
    }

    public void switchLights() {
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
