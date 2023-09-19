
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double pi = Math.PI;
        double radius = 3;
        double umfang = 2 * pi * radius;
        double flaeche = pi * Math.pow(radius, 2);

        System.out.println(String.format("Radius: %f, Umfang: %f, Fläche: %f", radius, umfang, flaeche));
        if(args.length > 0)
            System.out.println("args: " + args[0]);
    }
}
