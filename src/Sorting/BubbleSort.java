package Sorting;
import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int []arr){
        for(int i=0; i<arr.length; i++){
            boolean isSorted = true;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap both
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        // Fill the Array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Display Array Before Sorting
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        // Display Array After Sorting
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}
