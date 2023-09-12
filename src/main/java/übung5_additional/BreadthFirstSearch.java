package übung5_additional;

import java.util.LinkedList;

public class BreadthFirstSearch<T> {
    public void traverse(Vertex<T> startVertex) {
        LinkedList<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            var current = queue.poll();
            var neighbors = current.getNeighbors();

            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current.getData());
            }

            for (var neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                }
            }
        }

    }
}
