package übung7.example.before;

public class FloorLamp {
    private final Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    public void switchLights() {
        light.switchLights();
    }
}
