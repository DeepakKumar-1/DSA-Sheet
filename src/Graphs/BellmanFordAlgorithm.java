package Graphs;

import java.util.Scanner;
import java.util.Arrays;
public class BellmanFordAlgorithm {
    static int v;
    private static void bellmanFord(Edge []edges, int source){
        int []distance = new int[v];
        distance[source] = 0;
        for(int i=0; i<v; i++){
            if(i != source){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i < v-1; i++){
            for(int j=0; j<edges.length; j++){
                int u = edges[j].v1;
                int v = edges[j].v2;
                int weight = edges[j].weight;
                if(distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]){
                    distance[v] = distance[u] + weight;
                }
            }
        }

        // check for negative-weight cycles.
        for(int i=0; i < edges.length; i++){
            int u = edges[i].v1;
            int v = edges[i].v2;
            int weight = edges[i].weight;
            if(distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]){
                System.out.println("Negative Cycle is Present");
            }
        }

        System.out.println(Arrays.toString(distance));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        v = sc.nextInt();
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
        bellmanFord(edges, 0);
    }
}


/*
                    Enter Number of Vertices: 8
                    Enter Number of Edges: 16
                    0 2 2
                    2 0 5
                    2 3 4
                    0 3 7
                    6 2 6
                    2 6 3
                    6 3 3
                    0 1 8
                    1 5 16
                    4 5 5
                    7 5 2
                    4 7 8
                    7 6 5
                    6 4 4
                    3 4 9
                    4 0 4
                    [0, 8, 2, 6, 9, 14, 5, 17]
 */