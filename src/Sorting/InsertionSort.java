package Sorting;
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                while(j > 0 && arr[j] < arr[j-1]){
                    // Swap
                    arr[j] = arr[j] + arr[j-1];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j]  - arr[j-1];
                    j--;
                }
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Size of Array
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Declare Array of required Size
        int []arr = new int[n];
        // fill the Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Display Array Before Sorting
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}
