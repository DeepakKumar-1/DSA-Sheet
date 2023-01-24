package Sorting;
import java.util.*;

public class SelectionSort {
    public static int findMin(int []arr, int start){
        int res = start;
        for(int i=start+1; i<arr.length; i++){
            if(arr[res] > arr[i]){
                res = i;
            }
        }
        return res;
    }
    public static void selectionSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            // Find minimum Element Index in rest of the Array
            int minIndex = findMin(arr, i+1);
            // Swap the Current Element with the minIndex Element
            // if this is smaller
            if(arr[minIndex] < arr[i]) {
                arr[minIndex] = arr[minIndex] + arr[i];
                arr[i] = arr[minIndex] - arr[i];
                arr[minIndex] = arr[minIndex] - arr[i];
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Declare Array of given Size
        int []arr = new int[n];
        // Fill the Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Display Array Before Sorting
        System.out.println("Array Before Sorting is: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array After Sorting is: " + Arrays.toString(arr));
    }
}
