package Graphs;

import java.util.Scanner;
public class PathMoreThanKLengthFromSource {

    private static boolean pathMoreThanK(Edge []edges, int k){
        boolean []visited = new boolean[edges.length];
        return dfs(edges, visited, k, 0);
    }
    private static boolean dfs(Edge []edges, boolean []visited, int k, int source){
        visited[source] = true;
        if(k <= 0){
            return true;
        }
        for(Edge edge : edges){
            int u = edge.v1;
            int weight = edge.weight;
            if(!visited[u] && weight >= k){
                return true;
            }
            if(dfs(edges, visited, k-weight, u)){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Number of Vertices
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        // Take Number of Edges
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        Edge []edges = new Edge[e];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }
        // Graph is:
        for(Edge edge : edges){
            int u = edge.v1;
            int v = edge.v2;
            int w = edge.weight;
            System.out.format("(%d, %d, %d)", u, v, w);
        }
        System.out.println();
        System.out.print("Enter Value of K: ");
        int k = sc.nextInt();
        System.out.print("Path More than " + k + " Exists: " + pathMoreThanK(edges, k));
    }
}

/*
            Enter Number of Vertices: 10
            Enter Number of Edges: 11
            1 2 1
            2 5 5
            5 6 2
            2 3 2
            3 4 2
            4 7 3
            6 7 1
            7 0 2
            0 9 1
            9 8 5
            8 4 4
            (1, 2, 1)(2, 5, 5)(5, 6, 2)(2, 3, 2)(3, 4, 2)(4, 7, 3)(6, 7, 1)(7, 0, 2)(0, 9, 1)(9, 8, 5)(8, 4, 4)
            Enter Value of K: 23
            Path More than 23 Exists: true
 */