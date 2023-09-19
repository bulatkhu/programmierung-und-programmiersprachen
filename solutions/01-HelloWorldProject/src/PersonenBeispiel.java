public class PersonenBeispiel {
    public static void main(String[] a) {
        Person person1 = new Person(20);
        Person person2 = new Person(-10);
        Person person3 = new Person(42);

        System.out.println("Person 1 ist " + person1.getAlter() + " Jahre alt");
        System.out.println("Person 2 ist " + person2.getAlter() + " Jahre alt");
        System.out.println("Person 3 ist " + person3.getAlter() + " Jahre alt");
    }
}
