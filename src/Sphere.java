public class Sphere {
    private double l, w, h;

    public Sphere(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public boolean equals(Object o) {
        if (o instanceof Sphere) {
            Sphere s = (Sphere) o;
            return (l == s.l && w == s.w && h == s.h);
        } else {
            return false;
        }
    }
}
