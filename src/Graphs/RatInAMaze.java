package Graphs;

import java.util.Scanner;
import java.util.Arrays;
public class RatInAMaze {
    public static void solveMaze(String path, int [][]maze, int row, int col){
        if(row == maze.length-1 && col == maze.length-1){
            System.out.print(path + " ");
            return;
        }
        if(maze[row][col] == 0){
            return;
        }
        maze[row][col] = 0;
        // Go Up
        if(row > 0){
            solveMaze(path+'U', maze, row-1, col);
        }
        // Go Down
        if(row < maze.length-1){
            solveMaze(path+'D', maze, row+1, col);
        }
        // Go Left
        if(col > 0){
            solveMaze(path+'L', maze, row, col-1);
        }
        // Go Right
        if(col < maze.length-1){
            solveMaze(path+'R', maze, row, col+1);
        }

        maze[row][col] = 1;
    }
    public static void solveMaze(int [][]maze){
        solveMaze("", maze, 0, 0);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Maze: ");
        int n = sc.nextInt();
        int [][]maze = new int[n][n];
        System.out.print("Enter Elements in Row Wise: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        // Display Maze
        for(int []arr : maze){
            System.out.println(Arrays.toString(arr));
        }
        // Display All Possible Paths
        solveMaze(maze);
    }
}


/*
           `Enter Size of Maze: 4
            Enter Elements in Row Wise:  1 0 0 0
            1 1 0 1
            1 1 0 0
            0 1 1 1
            [1, 0, 0, 0]
            [1, 1, 0, 1]
            [1, 1, 0, 0]
            [0, 1, 1, 11]
            DDRDRR DRDDRR `
 */