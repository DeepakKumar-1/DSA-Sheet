package Graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;
public class BipartiteGraphCheck {

    private static boolean bipartiteCheck(int[][] adjMatrix, int source) {
        // Assign Colour of All Vertices as -1 to Ensure that All Vertices are UnColored
        int []vertexColor = new int[adjMatrix.length];
        for(int i=0; i<vertexColor.length; i++){
            vertexColor[i] = -1;
        }
        // Assign First Colour to the Source
        vertexColor[source] = 1;
        // DFS CODE BEGINS :
        Queue<Integer> queue = new LinkedList<>();
        // Add Source into the Queue
        queue.add(source);
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            // Return False if there is a Self Loop
            if(adjMatrix[currentVertex][currentVertex] == 1){
                return false;
            }
            // Now Visit all the Neighbours of CurrentVertex which is not Coloured and Colour them as well
            for(int i=0; i< adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && vertexColor[i] == -1){
                    // Assign Alternate Colour to this Vertex
                    vertexColor[i] = 1 - vertexColor[currentVertex]; // we just record two colors {0, 1}
                    queue.add(i);
                } else if(adjMatrix[currentVertex][i] == 1 && vertexColor[currentVertex] == vertexColor[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // Displaying Graph
        for(int []row : adjMatrix){
            System.out.println(Arrays.toString(row));
        }
        System.out.print("Enter Source Vertex: ");
        int src = sc.nextInt();
        System.out.println("Is Bipartite Graph: " + bipartiteCheck(adjMatrix, src));
    }

}

/*
            Enter Number of Vertices: 5
            Enter Number of Edges: 4
            0 2
            3 2
            4 1
            4 2
            [0, 0, 1, 0, 0]
            [0, 0, 0, 0, 1]
            [1, 0, 0, 1, 1]
            [0, 0, 1, 0, 0]
            [0, 1, 1, 0, 0]
            Enter Source Vertex: 3
            Is Bipartite Graph: true

            Enter Number of Vertices: 5
            Enter Number of Edges: 5
            0 2
            3 2
            4 1
            4 2
            3 4
            [0, 0, 1, 0, 0]
            [0, 0, 0, 0, 1]
            [1, 0, 0, 1, 1]
            [0, 0, 1, 0, 1]
            [0, 1, 1, 1, 0]
            Enter Source Vertex: 3
            Is Bipartite Graph: false
 */
