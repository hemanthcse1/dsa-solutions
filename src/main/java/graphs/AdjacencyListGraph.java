package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph {


    private Map<Integer,List<Integer>> adjacencyList;

    public AdjacencyListGraph(){
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex){
        adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination){
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void removeEdge(int source, int destination){
        adjacencyList.get(source).remove((Integer) destination);
        adjacencyList.get(destination).remove((Integer) source);
    }

    public void removeVertex(int vertex){
        adjacencyList.remove(vertex);

        for (List<Integer> neighbors: adjacencyList.values()){
            neighbors.remove((Integer) vertex);
        }
    }

    public void printGraph(){
        for (Map.Entry<Integer,List<Integer>> entry : adjacencyList.entrySet()){
            System.out.print(entry.getKey() +": ");
            for (Integer neighbor: entry.getValue()){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        AdjacencyListGraph graph = new AdjacencyListGraph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.printGraph();

        System.out.println("--------------------------------------------");
        System.out.println(" add wrong edge 1 to 3");
        graph.addEdge(1,3);

        graph.printGraph();

        System.out.println("--------------------------------------------");
        System.out.println(" remove wrong edge 1 to 3");
        graph.removeEdge(1,3);
        graph.printGraph();


        System.out.println("--------------------------------------------");
        System.out.println(" add new vertex -> 5 & connect 5 from 3");

        graph.addVertex(5);
        graph.addEdge(3,5);
        graph.printGraph();

        System.out.println("--------------------------------------------");
        System.out.println(" remove vertex -> 4");

        graph.removeVertex(4);
        graph.printGraph();

    }

}
