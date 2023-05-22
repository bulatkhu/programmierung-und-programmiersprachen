package übung4;

public class Initial {
    public static void main(String[] args) {
        BinaryTree<Person> tree = new BinaryTree<>();

        // Create some Person objects
        Person alice = new Person("Alice", 102);
        Person bob = new Person("Bob", 57);
        Person chris = new Person("Chris", 451);
        Person diane = new Person("Diane", 13);
        Person esther = new Person("Esther", 78);
        Person fritz = new Person("Fritz", 255);
        Person gianni = new Person("Gianni", 900);
        Person irene = new Person("Irene", 377);
        Person hannah = new Person("Hannah", 66);

        // Add the Person objects to the binary tree
        tree.add(alice);
        tree.add(bob);
        tree.add(chris);
        tree.add(diane);
        tree.add(esther);
        tree.add(fritz);
        tree.add(gianni);
        tree.add(irene);
        tree.add(hannah);

        Person value = tree.find(alice);

        value.printPerson();

        BTreePrinter.printNode(tree.root);
    }
}
