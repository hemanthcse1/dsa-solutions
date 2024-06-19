package graphs.dfs;

public class DFSImplementation {

    public static void main(String[] args){

        AdjacencyList graph = new AdjacencyList();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");


        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","D");
        graph.addEdge("B","E");
        graph.addEdge("C","D");
        graph.addEdge("C","F");
        graph.addEdge("D","E");
        graph.addEdge("D","F");

        graph.printGraph();

        System.out.println("\n------------------------\n");
        graph.DFSIterative("A");
    }
}
