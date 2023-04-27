package übung4;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> node;

    public void add(T value) {
        this.add(node, value);
    }

    public Node<T> add(Node<T> node, T value) {
        if (node == null) {
            node = new Node<>(value);
        } else if (value.compareTo(node.root) < 0) {
            node.left = add(node.left, value);
        } else if (value.compareTo(node.root) > 0) {
            node.right = add(node.right, value);
        }
        return node;
    }

    public T find(T value) {
        Node<T> node = find(this.node, value);
        if (node == null) {
            return null;
        }
        return node.root;
    }

    public Node<T> find(Node<T> node, T value) {
        if (node == null) {
            return null;
        }
        var nodeOrder = value.compareTo(node.root);
        if (nodeOrder == 0) {
            return node;
        }
        if (nodeOrder < 0) {
            return find(node.left, value);
        }
        return find(node.right, value);
    }

    private static class Node<T> {
        private T root;
        private Node<T> left;
        private Node<T> right;

        public Node(T value) {
            this.root = value;
        }
    }
}

