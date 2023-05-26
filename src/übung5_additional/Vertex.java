package übung5_additional;

//import lombok.Data;
//import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//@Data
public class Vertex<T> {
    private final T data;
    private boolean visited = false;
//    @ToString.Exclude
    private List<Vertex<T>> neighbors = new ArrayList<>();

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }
}
