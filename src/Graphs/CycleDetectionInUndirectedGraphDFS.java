package Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class CycleDetectionInUndirectedGraphDFS {
    public static boolean detectCycle(int currentVertex, int [][]adjMatrix, int parent, boolean []visited){
        visited[currentVertex] = true;
        for(int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                if(detectCycle(i, adjMatrix, currentVertex, visited)) return true;
            } else if(i != parent){
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(int [][]adjMatrix){
        boolean []visited = new boolean[adjMatrix.length];
        for(int i=0; i<adjMatrix.length; i++){
            if(!visited[i]){
                if(detectCycle(i, adjMatrix, -1, visited)){
                    return true;
                }
            }
        }
        return false;
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

        // Display the graph
        System.out.println("Graph is: ");
        for(int []arr : adjMatrix){
            System.out.println(Arrays.toString(arr));
        }

        boolean ans = hasCycle(adjMatrix);
        System.out.println("Has Cycle: " + ans);
    }
}
