package graphs.dfs;

import java.util.*;

public class DepthFirstSearch {

    private Map<Integer, List<Integer>> adjacencyList;

    public DepthFirstSearch(){
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
            System.out.print(entry.getKey()+": ");
            for (Integer neighbor: entry.getValue()){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        DepthFirstSearch graph = new DepthFirstSearch();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);


        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(1,4);
        graph.addEdge(3,5);

        graph.printGraph();

        System.out.println("\n--------------DFS--------------\n");
        graph.iterativeDFS(1);
    }

    public  void iterativeDFS(int vertex){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(vertex);

        while (!stack.isEmpty()){

            int currentVertex = stack.pop();
            System.out.print(" -> "+currentVertex);
            visited.add(currentVertex);

            for (int neighbor : adjacencyList.getOrDefault(currentVertex, Collections.emptyList())){
                if (!visited.contains(neighbor)){
                    stack.push(neighbor);
                }
            }
        }
    }

}
