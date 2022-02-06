package Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class CycleDetectionInDirectedGraphDFS {

    private static boolean cycleCheck(int currentVertex, int[][] adjMatrix, boolean[] visited, boolean[] dfsVisited) {
        visited[currentVertex] = true;
        dfsVisited[currentVertex] = true;
        for (int i=0; i<adjMatrix.length; i++){
            if(!visited[i]){
                if (cycleCheck(i, adjMatrix, visited, dfsVisited)){
                    return true;
                }
            }else if(dfsVisited[i]){
                return true;
            }
        }
        dfsVisited[currentVertex] = false;
        return false;
    }
    public static boolean cycleDetection(int [][]adjMatrix){
        boolean []visited = new boolean[adjMatrix.length];
        boolean []dfsVisited = new boolean[adjMatrix.length];
        for(int i=0; i<adjMatrix.length; i++){
            if(!visited[i]){
                if(cycleCheck(i, adjMatrix, visited, dfsVisited)){
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
        }

        // Display the graph
        System.out.println("Graph is: ");
        for(int []arr : adjMatrix){
            System.out.println(Arrays.toString(arr));
        }

        boolean ans = cycleDetection(adjMatrix);
        System.out.println("Has Cycle: " + ans);
    }
}
