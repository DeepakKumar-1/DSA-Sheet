package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MColoringProblem {

    private static boolean isSafe(int node, List<Integer>[] Graph, int[] color, int n, int col) {
        for(int x : Graph[node]){
            if(color[x] == col){
                return false;
            }
        }
        return true;
    }

    private static boolean solve(int node, List<Integer>[] Graph, int[] color, int n, int m) {
        if(node == n){
            return true;
        }
        for(int i=0; i<=m; i++){
            if(isSafe(node, Graph, color, n, i)) {
                color[node] = i;
                if(solve(node+1, Graph, color, n, m)){
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }


    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m) {
        int n = G.length;
        if(solve(0, G, color, n, m)){
            return true;
        }
        return false;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of Colors: ");
        int c = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        List<Integer>[] G = new ArrayList[V];
        for(int i=0; i<V; i++){
            G[i] = new ArrayList<>();
        }

        for(int i=0; i<e; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            G[u].add(v);
            G[v].add(u);
        }
        int []color = new int[V];

        System.out.println(graphColoring(G, color, 0, c) ? 1 : 0);

    }
}
