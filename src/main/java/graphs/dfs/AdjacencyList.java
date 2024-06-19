package graphs.dfs;

import java.util.*;

public class AdjacencyList {
    private Map<String, List<String>> adjacencyList;

    public AdjacencyList(){
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex){
        adjacencyList.put(vertex,new LinkedList<>());
    }

    public void removeVertex(String vertex){
        adjacencyList.remove(vertex);
        for (List<String> neighbor: adjacencyList.values()){
            neighbor.remove(vertex);
        }
    }

    public void addEdge(String source, String destination){
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void removeEdge(String source, String destination){
        adjacencyList.get(source).remove(destination);
        adjacencyList.get(destination).remove(source);
    }

    public void printGraph(){
        for (Map.Entry<String,List<String>> entry: adjacencyList.entrySet()){
            System.out.print(entry.getKey()+" : ");
            for (String neighbor: entry.getValue()){
                System.out.print(neighbor+" -> ");
            }
            System.out.println();
        }
    }

    public void DFSIterative(String vertex){
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        visited.add(vertex);
        stack.add(vertex);

        while (!stack.isEmpty()){

            String visitedNode = stack.pop();
            System.out.print(visitedNode+" ");

            for (String neighbor: adjacencyList.getOrDefault(visitedNode,Collections.emptyList())){
                if (!visited.contains(neighbor)){
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
