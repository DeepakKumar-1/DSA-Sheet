package Graphs;

import java.util.Scanner;
import java.util.Arrays;
public class CreateAGraph {
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
    }
}
