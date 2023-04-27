package übung4;

public class Initial {
    public static void main(String[] args) {
        Person person1 = new Person("Bulat", 1);
        Person person2 = new Person("Alex", 2);
        Person person3 = new Person("Phill", 3);
        Person person4 = new Person("Grem", 4);

        var tree = new BinaryTree<Person>();

        tree.add(person1);
        tree.add(person2);
        tree.add(person3);
        tree.add(person4);

        System.out.print(tree);
    }
}
