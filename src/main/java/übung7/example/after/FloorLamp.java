package übung7.example.after;

public class FloorLamp {
    private final Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    public void switchLights() {
        light.switchLights();
    }
}
