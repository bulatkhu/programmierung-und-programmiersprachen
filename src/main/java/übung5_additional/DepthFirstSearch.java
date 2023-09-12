package übung5_additional;

public class DepthFirstSearch<T> {
    public void traverse(Vertex<T> startVertex) {
        startVertex.setVisited(true);
        System.out.println(startVertex);

        for (var neighbor: startVertex.getNeighbors()) {
            if (!neighbor.isVisited()) {
                this.traverse(neighbor);
            }
        }
    }
}
