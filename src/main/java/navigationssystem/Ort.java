package navigationssystem;

public class Ort {
    private double x;
    private double y;
    private String name;

    public Ort(String name, double x, double y) {
        setName(name);
        setX(x);
        setY(y);
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }
}
