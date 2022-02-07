package Graphs;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixTreeAlgorithm {
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
            adjMatrix[v1][v2] = -1;
            adjMatrix[v2][v1] = -1;
        }
        for(int i=0; i<adjMatrix.length; i++){
            for(int j=0; j< adjMatrix[0].length; j++){
                if(i == j){
                    int degree = 0;
                    for(int row = 0; row< adjMatrix.length; row++){
                        if(adjMatrix[row][i] == -1){
                            degree++;
                        }
                    }
                    adjMatrix[i][j] = degree;
                }
            }
        }

        for(int []arr : adjMatrix){
            System.out.println(Arrays.toString(arr));
        }
        // TO DO:
        // Step 2: Delete any one Row and one Column and find the Determinant
    }
}
