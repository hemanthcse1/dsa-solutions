package graphs.weightedgraph;

import java.util.LinkedList;
import java.util.List;

public class WeightedGraph {

    public int vertices;
    public List<GraphEdge>[] adjacencyList;


    public WeightedGraph(int vertices){
        this.vertices = vertices;
        adjacencyList = new List[vertices];

        for (int i = 0; i< vertices; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }


    public void addDirectedEdge(int source, int destination, int weight){
        GraphEdge graphEdge = new GraphEdge(source,destination,weight);

        adjacencyList[source].add(graphEdge);
    }

    public void addUnDirectedEdge(int source, int destination, int weight){
        GraphEdge sourceToDestinationEdge = new GraphEdge(source,destination,weight);
        GraphEdge destinationToSourceEdge = new GraphEdge(destination,source,weight);

        adjacencyList[source].add(sourceToDestinationEdge);
        adjacencyList[destination].add(destinationToSourceEdge);
    }

    public List<GraphEdge>[] getVertices(){
        return adjacencyList;
    }



    public static void main(String[] args){

        WeightedGraph graph = new WeightedGraph(5);

        graph.addDirectedEdge(3,1,7);
        graph.addDirectedEdge(4,2,8);
        graph.addUnDirectedEdge(0,1,4);
        graph.addUnDirectedEdge(0,4,6);
        graph.addUnDirectedEdge(1,4,1);


        List<GraphEdge>[] vertices = graph.getVertices();

        for (int i = 0; i< vertices.length; i++){
            System.out.println("Vertex " + (i+1) + ":");
            for (GraphEdge graphEdge: vertices[i]){
                System.out.println("  "+graphEdge.toString());
            }
        }


    }

}
