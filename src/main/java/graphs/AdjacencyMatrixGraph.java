package graphs;

public class AdjacencyMatrixGraph {

    private int adjMatrix[][];
    private int numVertices;


    public AdjacencyMatrixGraph(int numVertices){
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = 0;
        adjMatrix[j][1] = 0;
    }


    public void addVertices(){
        int[][] newAdjMatrix = new int[numVertices+1][numVertices+1];

        for (int i = 0; i< numVertices; i++){
            for (int j = 0; j< numVertices; j++){
                newAdjMatrix[i][j] = adjMatrix[i][j];
            }
        }

        adjMatrix = newAdjMatrix;
        numVertices++;
    }

    public void removeVertices(int v){
        int[][] newAdjMatrix = new int[numVertices-1][numVertices-1];

        for (int i = 0; i< numVertices; i++){
            for (int j = 0; j< numVertices; j++){
                if (i != v && j != v){
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
            }
        }

        adjMatrix = newAdjMatrix;
        numVertices--;
    }

    public void printGraph(){
        for (int i = 0; i< numVertices; i++){
            for (int j = 0; j< numVertices; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        AdjacencyMatrixGraph g = new AdjacencyMatrixGraph(4);

        g.addEdge(0,1);
        g.addEdge(1,0);

        g.addEdge(0,3);
        g.addEdge(3,0);

        g.addEdge(1,2);
        g.addEdge(2,1);

        g.addEdge(2,3);
        g.addEdge(3,2);


        g.printGraph();

        System.out.println("adding new vertices ");
        g.addVertices();
        g.addEdge(2,4);
        g.addEdge(4,2);
        g.printGraph();


        System.out.println("remove vertices");
        g.removeVertices(4);
        g.printGraph();


    }
}
