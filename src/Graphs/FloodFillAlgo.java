package Graphs;
import java.util.Scanner;
import java.util.Arrays;
public class FloodFillAlgo {
    public static void dfs(int [][]image, int r, int c, boolean [][]visited, int newColor, int oldColor){
        if(!visited[r][c] && image[r][c] == oldColor){
            visited[r][c] = true;
            image[r][c] = newColor;
            // Call DFS for up
            if(r > 0){
                dfs(image, r-1, c, visited, newColor, oldColor);
            }
            // Call DFS for Down
            if(r < image.length-1){
                dfs(image, r+1, c, visited, newColor, oldColor);
            }
            // Call DFS for left
            if(c > 0){
                dfs(image, r, c-1, visited, newColor, oldColor);
            }
            // Call DFS for right
            if(c < image[0].length-1){
                dfs(image, r, c+1, visited, newColor, oldColor);
            }
        }
    }
    public static void floodFill(int [][]image, int sr, int sc, int newColor){
        int oldColor = image[sr][sc];
        boolean [][]visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, visited, newColor, oldColor);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]image = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                image[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Start Row and Start Column: ");
        int sRow = sc.nextInt();
        int sCol = sc.nextInt();
        System.out.print("Enter New Colour: ");
        int newColor = sc.nextInt();
        // Display the Image
        for(int []arr : image){
            System.out.println(Arrays.toString(arr));
        }
        floodFill(image, sRow, sCol, newColor);
        System.out.println("Final Image is: ");
        for(int []arr : image){
            System.out.println(Arrays.toString(arr));
        }
    }
}
