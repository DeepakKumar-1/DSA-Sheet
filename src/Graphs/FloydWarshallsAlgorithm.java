package Graphs;

import java.util.Arrays;
public class FloydWarshallsAlgorithm {
    static int INF = 9999;
    public static int [][]floydWarshallsAlgorithm(int [][]adjMatrix){
        int v = adjMatrix.length;
        int [][]dist = new int[v][v];
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                dist[i][j] = adjMatrix[i][j];
            }
        }
        // Phases, in kth phase we include vertices (1,2, .... k) as intermediate Vertex
        for(int k=0; k<v; k++){
            // Iterate Over 2D distance Matrix
            for(int i=0; i<v; i++){
                for(int j=0; j<v; j++){
                    // if Vertex k is included, and we can minimize the dist?
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        return dist;
    }

    public static void main(String []args){
        int[][] dist = {{0, INF, -2, INF},
                {4, 0, 3, INF},
                {INF, INF, 0, 2},
                {INF, -1, INF, 0}};

        int [][]shortestPaths = floydWarshallsAlgorithm(dist);
        for(int []row : shortestPaths){
            System.out.println(Arrays.toString(row));
        }
    }
}
