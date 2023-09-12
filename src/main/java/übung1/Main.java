package übung1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
        }


        Sphere s1 = new Sphere(1, 1, 1);
        Sphere s2 = new Sphere(1, 1, 1);
        System.out.println(s1 == s2); // False!
        System.out.println(s1.equals(s2)); // True!
        Sphere s3 = s1;
        System.out.println(s1 == s3); // True!
        System.out.println(s1.equals(s3)); // True!
    }
}