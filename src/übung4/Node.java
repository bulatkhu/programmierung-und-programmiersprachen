package übung4;

public class Node<T extends Printable<T>> {
    public T root;
    public Node<T> left;
    public Node<T> right;

    public Node(T value) {
        this.root = value;
    }
}
