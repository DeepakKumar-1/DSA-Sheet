package Heaps;

import java.util.Scanner;
import java.util.Arrays;
public class PrintKMax {
    public static void printKMax(int []arr, int k){
        for(int i=0; i <= arr.length - k; i++){
            int max = arr[i];
            for(int j=0; j<k; j++){
                max = Math.max(max, arr[i + j]);
            }
            System.out.println(max);
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K (Window Size): ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        printKMax(arr, k);

    }
}
