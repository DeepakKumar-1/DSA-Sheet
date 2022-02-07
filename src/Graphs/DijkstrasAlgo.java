package Graphs;

import java.util.Scanner;

public class DijkstrasAlgo {
    public static void dijkstra(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        distance[0] = 0;
        for (int i = 1; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n - 1; i++) {
            int minVertex = findMinVertex(visited, distance);
            // mark minimum Vertex as true and Explore its neighbours
            visited[minVertex] = true;
            for (int j = 0; j < n; j++) {
                if (adjMatrix[minVertex][j] > 0 && !visited[j] && adjMatrix[minVertex][j] < Integer.MAX_VALUE) {
                    // Unvisited Neighbour of min Vertex
                    // Calculate Distance to Reach j via minVertex
                    int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }
        // Printing Distance Values for All Vertices
        for(int i=0; i<n; i++){
            System.out.println(i + " " + + distance[i]);
        }
    }

    private static int findMinVertex(boolean[] visited, int[] distance) {
        int minVertex = -1;
        for(int i=0; i<distance.length; i++){
            if(!visited[i] && (minVertex == -1 || (distance[i] < distance[minVertex]))){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight; // Assuming that Graph is Undirected
        }
        dijkstra(adjMatrix);
    }
}
