package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TopologicalSort {
    public static void kahnsAlgorithm(int [][]adjMatrix, int []indegree, boolean []visited){
        Queue<Integer> queue = new LinkedList<>();
        // Add All Vertices with Indegree 0 in the queue
        for(int i=0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
                visited[i] = true;
            }
        }
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for(int j=0; j<adjMatrix.length; j++){
                if(adjMatrix[currentVertex][j] == 1 && !visited[j]){
                    // j is Unvisited Neighbour of current Vertex
                    // reduce indegree of j
                    indegree[j]--;
                    queue.add(j);
                    visited[j] = true;
                }
            }
        }
    }

    public static void kahnsAlgorithm(int [][]adjMatrix, int []indegree){
        kahnsAlgorithm(adjMatrix, indegree, new boolean[adjMatrix.length]);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        int []indegree = new int[n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            indegree[v2]++;
            adjMatrix[v1][v2] = 1;
        }

        // Display the graph
        System.out.println("Graph is: ");
        for(int []arr : adjMatrix){
            System.out.println(Arrays.toString(arr));
        }

        kahnsAlgorithm(adjMatrix, indegree);
    }
}
