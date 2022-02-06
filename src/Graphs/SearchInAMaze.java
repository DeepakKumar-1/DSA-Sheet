package Graphs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SearchInAMaze {
    public static ArrayList<String> solveMaze(String path, int [][]maze, int row, int col){
        if(row == maze.length-1 && col == maze.length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(maze[row][col] == 0){
            return list;
        }
        maze[row][col] = 0;

        // Go Up
        if(row > 0){
            list.addAll(solveMaze(path+'U', maze, row-1, col));
        }
        // Go Down
        if(row < maze.length-1){
            list.addAll(solveMaze(path+'D', maze, row+1, col));
        }
        // Go Left
        if(col > 0){
            list.addAll(solveMaze(path+'L', maze, row, col-1));
        }
        // Go Right
        if(col < maze.length-1){
            list.addAll(solveMaze(path+'R', maze, row, col+1));
        }

        maze[row][col] = 1;
        return list;
    }
    public static ArrayList<String> solveMaze(int [][]maze){
        if(maze[maze.length - 1][maze.length - 1] == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("-1");
            return list;
        }
        return solveMaze("", maze, 0, 0);
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
        System.out.println("All Possible Paths: " + solveMaze(maze));
    }
}
