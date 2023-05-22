package übung5_additional;

import java.util.Arrays;

public class DFSTest {
    public static void main(String[] args) {
        var v0 = new Vertex<>(0);
        var v1 = new Vertex<>(1);
        var v2 = new Vertex<>(2);
        var v3 = new Vertex<>(3);
        var v4 = new Vertex<>(4);
        var v5 = new Vertex<>(5);
        var v6 = new Vertex<>(6);

        v0.setNeighbors(Arrays.asList(v1, v5, v6));
        v1.setNeighbors(Arrays.asList(v3, v4, v5));
        v4.setNeighbors(Arrays.asList(v2, v6));
        v6.setNeighbors(Arrays.asList(v0));

        var dfs = new DepthFirstSearch<Integer>();
        dfs.traverse(v0);
    }
}
