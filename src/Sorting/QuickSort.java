package Sorting;
import java.util.*;

public class QuickSort {
    public static int partition(int []arr, int start, int end){
        // initialize pivot Element
        int pivot = arr[start];
        int i = start+1;
        int j = end;
        do {
            // find element Greater than or equal to pivot from left side
            while (i <= end && pivot >= arr[i]) {
                i++;
            }
            // find element less than pivot from right side
            while (j >= start && pivot < arr[j]) {
                j--;
            }
            if (i < j) {
                // swap element i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<=j);


        // Now swap pivot and arr[j]
        int temp = pivot;
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int []arr, int start, int end){
        if(start < end){
            // get Partition Index
            int partitionIndex = partition(arr, start, end);
            // Apply quickSort on first half
            quickSort(arr, start, partitionIndex-1);
            // Apply quickSort on second half
            quickSort(arr, partitionIndex+1, end);
        }
    }
    public static void quickSort(int []arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Size of Array
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Declare Array of required Size
        int []arr = new int[n];
        // Fill the Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Display Array Before Sorting
        System.out.println("Array Before Sorting is: " + Arrays.toString(arr));
        quickSort(arr);
        // Display Array After Sorting
        System.out.println("Array After Sorting is: " + Arrays.toString(arr));
    }
}
