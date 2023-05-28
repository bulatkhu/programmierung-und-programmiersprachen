package übung7_example;

public class Light {
    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void switchLights() {
        switchedOn = !switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
