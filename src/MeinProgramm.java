public class MeinProgramm {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double radius = 10;

        double umfang = 2 * Math.PI * radius;

        double flaeche = Math.PI * Math.pow(radius, 2);

        System.out.println("Bei einem Radius von " + radius + " beträgt der Umfang " + umfang + " und die Fläche " + flaeche);
    }
};
